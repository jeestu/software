package edu.zut.cs.software.sun.sever.dao;

import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.sever.domain.Message;

@Repository
public interface MessageDao extends GenericDao<Message, Long>{

}
