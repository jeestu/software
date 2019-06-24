package edu.zut.cs.software.sun.show.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;

import edu.zut.cs.software.sun.show.dao.DailyuseDao;
import edu.zut.cs.software.sun.show.domain.Dailyuse;
import edu.zut.cs.software.sun.show.service.DailyuseManager;

@Service
@Transactional
public class DailyuseManagerImpl extends GenericManagerImpl<Dailyuse,Long> implements DailyuseManager{

	  DailyuseDao  dao;
	
	  @Autowired
	    public void setDao(DailyuseDao dao){this.dao=dao;}


	    @Override
	    public Dailyuse save(Dailyuse dailyuse){return dao.save(dailyuse);}


		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 dao.deleteById(id);
		}
	
		public Dailyuse findById(Long id){
	        return dao.getOne(id);
	    }
	    
	

}
