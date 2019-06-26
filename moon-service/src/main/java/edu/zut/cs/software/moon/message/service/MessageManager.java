package edu.zut.cs.software.moon.message.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.sever.domain.Message;

public interface MessageManager extends GenericManager<Message, Long>{
	Message save(Message message);
	Message findById(Long id);
	public void deleteById(Long id);
	List<Message> findAll();

}
