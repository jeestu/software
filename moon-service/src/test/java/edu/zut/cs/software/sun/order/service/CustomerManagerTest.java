package edu.zut.cs.software.sun.order.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;


import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.order.service.CustomerManager;

import edu.zut.cs.software.sun.Warehouse.service.ShelvesManagerTest;
import edu.zut.cs.software.sun.order.domain.Customer;

public class CustomerManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager> {
	 private static final Logger logger = LogManager.getLogger(ShelvesManagerTest.class.getName());
	 CustomerManager customerManager;
	 
	 public CustomerManagerTest() {
		 super(Customer.class);
	 }
	 @Autowired
	    public void setManger(CustomerManager manger) {
	        this.customerManager = manger;
	    }
	 
	 @Rollback(value = false)
	 @Test
	    public void save() {
		    Customer customer = new Customer();
		    customer.setName("dd-yy");
		    customerManager.save(customer);
	    }
}
