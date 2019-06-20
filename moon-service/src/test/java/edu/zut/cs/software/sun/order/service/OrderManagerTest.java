package edu.zut.cs.software.sun.order.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;


import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.order.service.CustomerManager;
import edu.zut.cs.software.moon.order.service.OrderManager;

import edu.zut.cs.software.sun.order.domain.Order;
@Rollback(value = false)
public class OrderManagerTest extends GenericManagerTestCase<Long, Order, OrderManager> {

	
	private static final Logger logger=LogManager.getLogger(OrderManagerTest.class.getName());

	private OrderManager orderManager;

	public OrderManagerTest() {
		super(Order.class);
	}
	
	@Autowired
    public void setgoodsManager(OrderManager orderManager)
  {this.orderManager=orderManager;}

	@Autowired
	CustomerManager customerManager;
	@Test
    public void save(){
        Order order = new Order();
        
        order.setOrder_Name("dd");
        order.setCustomer(customerManager.findById((long) 388));
        orderManager.save(order);
    }

	
	
	  @Test public void findAll() { Assert.assertNotNull(orderManager.findAll());
	  logger.info(orderManager.findAll()); }
	 
	 
}
