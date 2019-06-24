package edu.zut.cs.software.sun.show.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;

import edu.zut.cs.software.sun.show.dao.SnacksDao;
import edu.zut.cs.software.sun.show.domain.Snacks;
import edu.zut.cs.software.sun.show.service.SnacksManager;
@Service
@Transactional
public class SnacksManagerImpl extends GenericManagerImpl<Snacks,Long> implements SnacksManager{

	SnacksDao  dao;
	
	  @Autowired
	    public void setDao(SnacksDao dao){this.dao=dao;}


	    @Override
	    public Snacks save(Snacks snacks){return dao.save(snacks);}

	    
	    @Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 dao.deleteById(id);
		}
	
		public Snacks findById(Long id){
	        return dao.getOne(id);
	    }
	    

}
