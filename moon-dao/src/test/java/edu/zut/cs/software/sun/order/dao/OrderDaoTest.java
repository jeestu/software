package edu.zut.cs.software.sun.order.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.order.domain.Order;

public class OrderDaoTest extends GenericDaoTestCase<Long, Order, OrderDao> {
	private static final Logger logger = LogManager.getLogger(OrderDaoTest.class.getName());

	@Autowired
	OrderDao orderDao;
	@Autowired
	CustomerDao customerDao;
	//@Test
	public void save() {
		
		Order order=new Order();
		order.setOrder_Name("yy-dd");
		order.setCustomer(customerDao.getOne((long) 403));
		orderDao.save(order);
	}
	
	  @Test 
	  public void testFind()
	  { 
		List<Order> orders = orderDao.findAll();
	    assertNotNull(orders); 
	    System.out.println(orders);
	  }
	 
}
