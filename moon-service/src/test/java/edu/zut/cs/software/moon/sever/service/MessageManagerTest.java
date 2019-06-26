package edu.zut.cs.software.moon.sever.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.message.service.MessageManager;
import edu.zut.cs.software.moon.order.service.CustomerManager;
import edu.zut.cs.software.sun.sever.domain.Message;

public class MessageManagerTest  extends GenericManagerTestCase<Long, Message, MessageManager>{

	private static final Logger logger=LogManager.getLogger(MessageManagerTest.class.getName());

	private MessageManager messageManager;
	public MessageManagerTest() {
		super(Message.class);
	}
	@Autowired
    public void setMessageManager(MessageManager messageManager)
  {this.messageManager=messageManager;}
@Autowired
	CustomerManager customerManager;



@Test
public void save(){
    Message message = new Message();
    
    message.setCustomerName("张国豪1");
    message.setCustomer(customerManager.findById((long) 671));
    messageManager.save(message);
}
@Test public void findAll() { Assert.assertNotNull(messageManager.findAll());
logger.info(messageManager.findAll()); }
}
