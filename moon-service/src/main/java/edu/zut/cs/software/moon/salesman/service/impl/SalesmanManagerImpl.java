package edu.zut.cs.software.moon.salesman.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.salesman.service.SalesmanManager;
import edu.zut.cs.software.sun.sale.dao.GoodsDao;
import edu.zut.cs.software.sun.sale.domain.Goods;
import edu.zut.cs.software.sun.salesman.dao.SalesmanDao;
import edu.zut.cs.software.sun.salesman.domain.Salesman;

@Service
@Transactional
public abstract class SalesmanManagerImpl extends GenericManagerImpl<Salesman,Long> implements SalesmanManager{


	 SalesmanDao  salesmandao;
	 GoodsDao goodsdao;
	 
	 @Autowired
	    public void setDao(SalesmanDao salesmandao)
	 {	
		 this.salesmandao=salesmandao;
		 }



	@Override
	public Goods showGoods(Long id) {
		return goodsdao.getOne(id);
	}



	@Override
	public Salesman showCompons() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Salesman complaint() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}