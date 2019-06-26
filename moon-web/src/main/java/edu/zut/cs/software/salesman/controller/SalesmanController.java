/**package edu.zut.cs.software.salesman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.salesman.service.SalesmanManager;
import edu.zut.cs.software.sun.salesman.domain.Salesman;


@Controller
@RequestMapping("/salesman")
public class SalesmanController extends GenericController<Salesman, Long, SalesmanManager>{

	
	SalesmanManager salesmanManager;
	
	@Autowired
    public void setSalesmanManager(SalesmanManager salesmanManager) {
        this.salesmanManager = salesmanManager;
        this.manager = this.salesmanManager;
    }
	@RequestMapping("/index")
    public String index() {
        return "salesman/index";
    }



    @ResponseBody
	@RequestMapping(value = "all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public List<Salesman> findAllPlace() {
    	List<Salesman> salesmanList = this.salesmanManager.findAll();
        return salesmanList;
	}
    
    @ResponseBody
	@GetMapping(value = "allex",produces = "application/json;charset=utf-8")
	public List<Salesman> findAllPlaceex(){
		return this.salesmanManager.findAll();
	}

    @ResponseBody
   	@GetMapping(value = "tt",produces = "application/json;charset=utf-8")
   	public List<Salesman> ttasd(){
    	Salesman p = new Salesman();
    	p.setSalesmanName("李四");
    	salesmanManager.save(p);
    	System.out.println("该方法已经被调用");
   		return this.manager.findAll();
   	}
    
    @RequestMapping(path = "save",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public @ResponseBody Salesman saveOne( Salesman p){
        this.salesmanManager.save(p);
        return p;
    }
    

    @RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")
    public  @ResponseBody Salesman  deleteOne(@PathVariable(value = "id") Long id) {
    	Salesman p = this.salesmanManager.findById(id);
        this.salesmanManager.deleteById(id);
        return p;
    }
	
}**/
