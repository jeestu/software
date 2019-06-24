package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.show.domain.Dailyuse;
import edu.zut.cs.software.sun.show.service.DailyuseManager;

@Controller
@RequestMapping(path="dailyuse")
public class DailyuseController extends GenericController<Dailyuse, Long, DailyuseManager> {
	
	@Autowired
    private DailyuseManager dailyuseManager;
	
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

}
