package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.show.domain.Clothes;
import edu.zut.cs.software.sun.show.service.ClothesManager;

@Controller
@RequestMapping(path="clothes")
public class ClothesController extends GenericController<Clothes, Long, ClothesManager>{
	
	@Autowired
    private ClothesManager clothesManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "main/index";
    }
    @RequestMapping("/findclothes")
	public String findAllClothes(Model model) {
		List<Clothes> clothesList=this.clothesManager.findAll();
		for(Clothes clothes:clothesList) {
			System.out.println(clothes);
		}
		model.addAttribute("clothesList", clothesList);
		return "show/clothes";
	}
    
    @RequestMapping("/update")
	public String update(Clothes clothes)
	{
		System.out.println(clothes);
		this.clothesManager.update(clothes);
		return "forward:clothes.do";
	}

	  
}
