package edu.zut.cs.software.moon.message.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.message.service.MessageManager;
import edu.zut.cs.software.sun.sever.dao.MessageDao;
import edu.zut.cs.software.sun.sever.domain.Message;

@Service
@Transactional
public class MessageManagerImpl extends GenericManagerImpl<Message, Long> implements MessageManager {

	@Autowired
	MessageDao messageDao;
	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}
	
	

	
	

	@Override
	public Message save(Message message) {
		// TODO Auto-generated method stub
		
		return messageDao.save(message);
	}

	@Override
	public Message findById(Long id) {
		// TODO Auto-generated method stub
		return messageDao.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

		messageDao.deleteById(id);
	}

	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		return messageDao.findAll();
	}

}
