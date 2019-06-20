package edu.zut.cs.software.sun.order.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;

import edu.zut.cs.software.sun.order.domain.Customer;
@Rollback(value = false)
public class CustomerDaoTest extends GenericDaoTestCase<Long, Customer, CustomerDao> {
	private static final Logger logger = LogManager.getLogger(CustomerDaoTest.class.getName());
	@Autowired
	CustomerDao customerDao;
	
	@Test
	@Rollback(false)
    public void sava(){
		Customer customer = new Customer();
		customer.setName("yy1");
//		customer.setId((long) 270);
		customer.setDateCreated(null);
		customer.setDateModified(null);
		customer.setDeleted(null);
		customer.setEntityName(null);
		customer.setAddress("henan");
        this.customerDao.save(customer);
    }
	
	@Test
    public void testFind(){
        List<Customer> customers = customerDao.findAll();
        assertNotNull(customers);
        if(logger.isInfoEnabled()){
            logger.info(customers);
        }
    }
}
