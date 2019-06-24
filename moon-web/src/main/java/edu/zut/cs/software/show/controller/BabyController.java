package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.show.domain.Baby;
import edu.zut.cs.software.sun.show.service.BabyManager;

@Controller
@RequestMapping(path="baby")
public class BabyController extends GenericController<Baby, Long, BabyManager> {
	
	@Autowired
    private BabyManager babyManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "main/index";
    }
    @RequestMapping("/findbaby")
	public String findAllGoods(Model model) {
		List<Baby> babyList=this.babyManager.findAll();
		for(Baby baby:babyList) {
			System.out.println(baby);
		}
		model.addAttribute("babyList", babyList);
		return "show/baby";
	}

}
