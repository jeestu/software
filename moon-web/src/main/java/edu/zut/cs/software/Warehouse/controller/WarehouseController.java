package edu.zut.cs.software.Warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesManager;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.Warehouse.domain.Shelves;



@Controller
@RequestMapping(path="war")
public class WarehouseController extends GenericController<Shelves, Long, ShelvesManager> {
	
	@Autowired
    private ShelvesManager shelvesManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "index";
    }



    @RequestMapping(path = "/info/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public @ResponseBody Shelves getOne(@PathVariable(value = "id") Long id) {
    	Shelves shelvesManager = this.shelvesManager.findById(id);
        return shelvesManager;

    }


    @RequestMapping(path = "info", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
   public @ResponseBody
    List<Shelves> getAll(){
        List<Shelves> all = this.shelvesManager.findAll();
        return all;
    }

	
}
