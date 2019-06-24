package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.show.domain.Home;
import edu.zut.cs.software.sun.show.service.HomeManager;

@Controller
@RequestMapping(path="home")
public class HomeController extends GenericController<Home, Long, HomeManager> {
	
	@Autowired
    private HomeManager homeManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "main/index";
    }
    @RequestMapping("/findhome")
	public String findAllHome(Model model) {
		List<Home> homeList=this.homeManager.findAll();
		for(Home home:homeList) {
			System.out.println(home);
		}
		model.addAttribute("homeList", homeList);
		return "show/home";
	}

}

