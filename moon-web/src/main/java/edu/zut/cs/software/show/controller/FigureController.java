package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.show.domain.Figure;
import edu.zut.cs.software.sun.show.service.FigureManager;

@Controller
@RequestMapping(path="figure")
public class FigureController extends GenericController<Figure, Long, FigureManager> {
	
	@Autowired
    private FigureManager figureManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "main/index";
    }
    @RequestMapping("/findfigure")
	public String findAllFigure(Model model) {
		List<Figure> figureList=this.figureManager.findAll();
		for(Figure figure:figureList) {
			System.out.println(figure);
		}
		model.addAttribute("figureList", figureList);
		return "show/figure";
	}

}
