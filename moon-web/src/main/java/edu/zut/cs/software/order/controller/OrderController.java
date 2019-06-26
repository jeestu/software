package edu.zut.cs.software.order.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.order.service.OrderManager;
import edu.zut.cs.software.sun.order.domain.Order;
import edu.zut.cs.software.sun.show.domain.Baby;


@Controller
@RequestMapping("/order")
public class OrderController extends GenericController<Order, Long, OrderManager> {

	@Autowired
	private OrderManager orderManager;

	@Autowired
	public void setSiteManager(OrderManager orderManager) {
		this.orderManager = orderManager;
		this.manager=this.orderManager;
	}
	
	
	@RequestMapping(path = "index")
    public String index(){
        return "main/index";
    }
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public @ResponseBody List<Order> getAll(){
        List<Order> all = this.orderManager.findAll();
        return all;
    }
	
	@RequestMapping("/findorder")
	public String findAllOrder(Model model) {
		List<Order> orderList=this.orderManager.findAll();
		for(Order order:orderList) {
			System.out.println(order);
		}
		//model.addAllAttributes(orderList);
		model.addAttribute("orderList", orderList);
		return "order/findorder";
	}
	@RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")

	 public  @ResponseBody Order  deleteOne(@PathVariable(value = "id") Long id) {
		Order p = this.orderManager.findById(id);
        this.orderManager.deleteById(id);
        return p;
    }
	
	@RequestMapping(path = "save",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public @ResponseBody Order saveOne( Order p){
        this.orderManager.save(p);
        return p;
    }
    
}
