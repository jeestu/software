package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.sale.domain.Goods;
import edu.zut.cs.software.sun.show.domain.Advertising;
import edu.zut.cs.software.sun.show.service.ShowManger;

@Controller
@RequestMapping(path="show")
public class ShowController extends GenericController<Advertising, Long, ShowManger>{
	
	@Autowired
	private ShowManger showManger;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "index";
    }
	
	@RequestMapping(path = "/info/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
	public @ResponseBody Advertising GetOne(@PathVariable(value = "id") Long id) {
		Advertising A = this.showManger.findById(id);
		return A;
		
	}
	
	@RequestMapping(path = "info", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	   public @ResponseBody
	    List<Advertising> getAll(){
	        List<Advertising> all = this.showManger.findAll();
	        return all;
	    }

}
