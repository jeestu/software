package edu.zut.cs.software.sun.message.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.order.dao.CustomerDao;
import edu.zut.cs.software.sun.order.dao.OrderDao;
import edu.zut.cs.software.sun.order.dao.OrderDaoTest;
import edu.zut.cs.software.sun.order.domain.Order;
import edu.zut.cs.software.sun.sever.dao.MessageDao;
import edu.zut.cs.software.sun.sever.domain.Message;

public class MessageDaoTest extends GenericDaoTestCase<Long, Message, MessageDao>{
	private static final Logger logger = LogManager.getLogger(MessageDaoTest.class.getName());
	
	@Autowired
	MessageDao messageDao;
	@Autowired
	CustomerDao customerDao;
	
	@Test
	@Rollback(false)
	public void save() {
		
		Message message=new Message();
		message.setCustomerName("张国豪");
		message.setCustomer(customerDao.getOne((long) 671));
		message.setMessage("衣服质量好");
		messageDao.save(message);
	}
	@Test 
	  public void testFind()
	  { 
		List<Message> messages = messageDao.findAll();
	    assertNotNull(messages); 
	    System.out.println(messages);
	  }
	
}
