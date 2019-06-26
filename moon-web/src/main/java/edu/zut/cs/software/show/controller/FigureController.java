package edu.zut.cs.software.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.show.domain.Dailyuse;
import edu.zut.cs.software.sun.show.domain.Figure;
import edu.zut.cs.software.sun.show.service.FigureManager;

@Controller
@RequestMapping(path="figure")
public class FigureController extends GenericController<Figure, Long, FigureManager> {
	
	@Autowired
    private FigureManager figureManager;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public @ResponseBody List<Figure> getAll(){
        List<Figure> all = this.figureManager.findAll();
        return all;
    }
	
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
