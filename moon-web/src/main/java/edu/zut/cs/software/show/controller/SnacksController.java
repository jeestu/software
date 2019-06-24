package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
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
    

}
