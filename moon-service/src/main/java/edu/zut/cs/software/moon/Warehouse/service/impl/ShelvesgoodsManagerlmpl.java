package edu.zut.cs.software.moon.Warehouse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonInclude;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesgoodManager;
import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.sun.Warehouse.dao.ShelvesgoodDao;
import edu.zut.cs.software.sun.Warehouse.domain.Shelvesgoods;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Service
@Transactional
public class ShelvesgoodsManagerlmpl extends GenericManagerImpl<Shelvesgoods,Long> implements ShelvesgoodManager{

	   ShelvesgoodDao  dao;
	
	  @Autowired
	    public void setDao(ShelvesgoodDao dao){this.dao=dao;}


	    @Override
	    public Shelvesgoods save(Shelvesgoods good){return dao.save(good);}


		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 dao.deleteById(id);
		}
	
		public Shelvesgoods findById(Long id){
	        return dao.getOne(id);
	    }
	    
	
}
