package edu.zut.cs.software.moon.commodity.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.commodity.service.CommodityManager;
import edu.zut.cs.software.sun.commodity.dao.CommodityDao;
import edu.zut.cs.software.sun.commodity.domain.Commodity;

@Service
@Transactional
public class CommodityManagerimpl extends GenericManagerImpl<Commodity,Long> implements CommodityManager{
	CommodityDao  dao;
	
	 @Autowired
	    public void setDao(CommodityDao dao){this.dao=dao;}


	    @Override
	    public Commodity save(Commodity commodity){return dao.save(commodity);}


		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 dao.deleteById(id);
		}
	
		public Commodity findById(Long id){
	        return dao.getOne(id);
	    }
	    
	
		 @Override
		    public List<Commodity> findAll(){return dao.findAll();}
}
