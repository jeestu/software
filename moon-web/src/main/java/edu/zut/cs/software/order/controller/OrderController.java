package edu.zut.cs.software.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.order.service.OrderManager;

import edu.zut.cs.software.sun.order.domain.Order;


@Controller
@RequestMapping(path="order")
public class OrderController extends GenericController<Order, Long, OrderManager> {
	
	@Autowired
    private OrderManager orderManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "index";
    }



    @RequestMapping(path = "/info/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public @ResponseBody Order getOne(@PathVariable(value = "id") Long id) {
        Order order = this.orderManager.findById(id);
        return order;

    }


    @RequestMapping(path = "info", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
   public @ResponseBody
    List<Order> getAll(){
        List<Order> all = this.orderManager.findAll();
        return all;
    }

	
}
