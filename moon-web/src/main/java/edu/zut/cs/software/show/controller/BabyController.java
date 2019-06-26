package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.show.domain.Baby;
import edu.zut.cs.software.sun.show.service.BabyManager;

@Controller
@RequestMapping(path="baby")
public class BabyController extends GenericController<Baby, Long, BabyManager> {
	
	//HTTP协议里面，四个表示操作方式的动词：GET、POST、PUT、DELETE，他们分别对应四种基本操作：
	//GET用来获取资源，POST用来新建资源，PUT用来更新资源，DELETE用来删除资源。
	
	@Autowired
    private BabyManager babyManager;
	
	@RequestMapping("/index")
    public String index() {
        return "place/index";
    }

	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public @ResponseBody List<Baby> getAll(){
        List<Baby> all = this.babyManager.findAll();
        return all;
    }

	
	  @ResponseBody
		@GetMapping(value = "allex",produces = "application/json;charset=utf-8")
		public List<Baby> findAllPlaceex(){
			return this.babyManager.findAll();
		}

	    @ResponseBody
	   	@GetMapping(value = "tt",produces = "application/json;charset=utf-8")
	   	public List<Baby> ttasd(){
	    	Baby p = new Baby();
	    	p.setName("纸尿裤");
	    	babyManager.save(p);
	    	System.out.println("该方法已经被调用");
	   		return this.babyManager.findAll();
	   	}

	    @RequestMapping(path = "ve",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	    public @ResponseBody Baby saveOne( Baby p){
	        this.babyManager.save(p);
	        return p;
	    }
	    
	    /**@RequestMapping(path = "/info",method = RequestMethod.PUT,produces = "application/json;charset=utf-8")
	    public @ResponseBody Baby updateOne( Baby p){
	    	Baby p1 =this.babyManager.findById(p.getId());
	        this.babyManager.updateById(p.getId(),p.getName());
	        return p1;
	    }**/

	    @RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")
	    public  @ResponseBody Baby  deleteOne(@PathVariable(value = "id") Long id) {
	    	Baby p = this.babyManager.findById(id);
	        this.babyManager.deleteById(id);
	        return p;
	    }

	    
}
