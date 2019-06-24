package edu.zut.cs.software.sun.show.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.sun.show.dao.HomeDao;
import edu.zut.cs.software.sun.show.domain.Home;
import edu.zut.cs.software.sun.show.service.HomeManager;

@Service
@Transactional
public class HomeManagerImpl extends GenericManagerImpl<Home,Long> implements HomeManager{

	  HomeDao  dao;
	 
	  @Autowired
	    public void setDao(HomeDao dao){this.dao=dao;}


	    @Override
	    public Home save(Home home){return dao.save(home);}


		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 dao.deleteById(id);
		}
	
		public Home findById(Long id){
	        return dao.getOne(id);
	    }
	    
	

}
