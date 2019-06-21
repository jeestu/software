package edu.zut.cs.software.register.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.register.service.PeopleManager;
import edu.zut.cs.software.moon.register.service.impl.PeopleManagerImpl;
import edu.zut.cs.software.sun.Register.domain.People;

@Controller
@RequestMapping(path="people")
public class PeopleController extends GenericController<People, Long, PeopleManager> {
	
	@Autowired
    private PeopleManager peopleManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "index";
    }



    @RequestMapping(path = "/info/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public @ResponseBody People getOne(@PathVariable(value = "id") Long id) {
        People expenditure = (this.peopleManager).findById(id);
        return expenditure;

    }


    @RequestMapping(path = "info", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
   public @ResponseBody
    List<People> getAll(){
        List<People> all = this.peopleManager.findAll();
        return all;
    }

	
}