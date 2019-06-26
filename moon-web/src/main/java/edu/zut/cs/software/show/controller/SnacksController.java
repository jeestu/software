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
import edu.zut.cs.software.sun.order.domain.Order;
import edu.zut.cs.software.sun.sale.domain.Goods;
import edu.zut.cs.software.sun.show.domain.Snacks;
import edu.zut.cs.software.sun.show.service.SnacksManager;

@Controller
@RequestMapping(path="snacks")
public class SnacksController extends GenericController<Snacks, Long, SnacksManager> {
	
	@Autowired
    private SnacksManager snacksManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "main/index";
    }
    @RequestMapping("/findsnacks")
	public String findAllSnacks(Model model) {
		List<Snacks> snacksList=this.snacksManager.findAll();
		for(Snacks snacks:snacksList) {
			System.out.println(snacks);
		}
		model.addAttribute("snacksList", snacksList);
		return "show/snacks";
	}
    
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public @ResponseBody List<Snacks> getAll(){
        List<Snacks> all = this.snacksManager.findAll();
        return all;
    }
    
    @RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")
    public  @ResponseBody Snacks  deleteOne(@PathVariable(value = "id") Long id) {
    	Snacks p = this.snacksManager.findById(id);
        this.snacksManager.deleteById(id);
        return p;
    }
    
    @RequestMapping(path = "save",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public @ResponseBody Snacks saveOne( Snacks p){
        this.snacksManager.save(p);
        return p;
    }
}
