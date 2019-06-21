package edu.zut.cs.software.commodity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.commodity.service.CommodityManager;
import edu.zut.cs.software.sun.commodity.domain.Commodity;

@Controller
@RequestMapping(path="commodity")
public class CommodityController extends GenericController<Commodity, Long, CommodityManager> {
	
	@Autowired
    private CommodityManager commodityManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "index";
    }



    @RequestMapping(path = "/info/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public @ResponseBody Commodity getOne(@PathVariable(value = "id") Long id) {
    	Commodity expenditure = this.commodityManager.findById(id);
        return expenditure;

    }


    @RequestMapping(path = "info", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
   public @ResponseBody
    List<Commodity> getAll(){
        List<Commodity> all = this.commodityManager.findAll();
        return all;
    }


}

