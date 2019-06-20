package edu.zut.cs.software.moon.Warehouse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.Warehouse.service.GoodManager;
import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.sun.Warehouse.dao.GoodDao;
import edu.zut.cs.software.sun.Warehouse.domain.Good;


@Service
@Transactional
public class GoodsManagerlmpl extends GenericManagerImpl<Good,Long> implements GoodManager{

	   GoodDao  dao;
	
	  @Autowired
	    public void setDao(GoodDao dao){this.dao=dao;}


	    @Override
	    public Good save(Good good){return dao.save(good);}


		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 dao.deleteById(id);
		}
	
		public Good findById(Long id){
	        return dao.getOne(id);
	    }
	    
	
}
