package edu.zut.cs.software.Warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesgoodManager;
import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.Warehouse.domain.Shelvesgoods;


@Controller
@RequestMapping(path="shelvesgoods")
public class WaregoodsController extends GenericController<Shelvesgoods, Long, ShelvesgoodManager> {
	
	@Autowired
    private ShelvesgoodManager shelvesgoodManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "index";
    }



    @RequestMapping(path = "/info/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public @ResponseBody Shelvesgoods getOne(@PathVariable(value = "id") Long id) {
    	Shelvesgoods shelvesgoods = this.shelvesgoodManager.findById(id);
        return shelvesgoods;

    }


    @RequestMapping(path = "info", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
   public @ResponseBody
    List<Shelvesgoods> getAll(){
        List<Shelvesgoods> all = this.shelvesgoodManager.findAll();
        return all;
    }

}
