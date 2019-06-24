package edu.zut.cs.software.sun.show.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.sun.show.dao.BabyDao;
import edu.zut.cs.software.sun.show.domain.Baby;
import edu.zut.cs.software.sun.show.service.BabyManager;

@Service
@Transactional
public class BabyManagerImpl extends GenericManagerImpl<Baby,Long> implements BabyManager{

	  BabyDao  dao;
	
	  @Autowired
	    public void setDao(BabyDao dao){this.dao=dao;}


	    @Override
	    public Baby save(Baby baby){return dao.save(baby);}


		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 dao.deleteById(id);
		}
	
		public Baby findById(Long id){
	        return dao.getOne(id);
	    }
	    
	

}
