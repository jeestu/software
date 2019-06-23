package edu.zut.cs.software.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesgoodManager;
import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.order.service.OrderManager;
import edu.zut.cs.software.sun.order.domain.Order;


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
        //System.out.println("hello");
        return "main/index";
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
	
	@RequestMapping("/delete")
	public String deleteOrder(Long id) {
		this.orderManager.delete(id);
		return "forward:findorder";
	}
	
	 
    @RequestMapping("/toadd")
    public String toadd(){
        return "order/addorder";
    }
    
    @RequestMapping("/addorder")
    public String Addorder(Order order){
        Order ord=orderManager.save(order);

        ModelAndView s=new ModelAndView();
        s.addObject(ord);
        return "forward:findorder.do";
    }
    
    
}
