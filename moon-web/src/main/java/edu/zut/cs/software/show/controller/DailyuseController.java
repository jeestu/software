package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.show.domain.Clothes;
import edu.zut.cs.software.sun.show.domain.Dailyuse;
import edu.zut.cs.software.sun.show.service.DailyuseManager;

@Controller
@RequestMapping(path="dailyuse")
public class DailyuseController extends GenericController<Dailyuse, Long, DailyuseManager> {
	
	@Autowired
    private DailyuseManager dailyuseManager;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public @ResponseBody List<Dailyuse> getAll(){
        List<Dailyuse> all = this.dailyuseManager.findAll();
        return all;
    }
	
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "main/index";
    }
    @RequestMapping("/finddailyuse")
	public String findAllGoods(Model model) {
		List<Dailyuse> dailyuseList=this.dailyuseManager.findAll();
		for(Dailyuse dailyuse:dailyuseList) {
			System.out.println(dailyuse);
		}
		model.addAttribute("dailyuseList", dailyuseList);
		return "show/dailyuse";
	}

    @RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")
    public  @ResponseBody Dailyuse  deleteOne(@PathVariable(value = "id") Long id) {
    	Dailyuse p = this.dailyuseManager.findById(id);
        this.dailyuseManager.deleteById(id);
        return p;
    }
    
    @RequestMapping(path = "save",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public @ResponseBody Dailyuse saveOne( Dailyuse p){
        this.dailyuseManager.save(p);
        return p;
    }
}
