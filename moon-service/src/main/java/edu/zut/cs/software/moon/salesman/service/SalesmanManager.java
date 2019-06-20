package edu.zut.cs.software.moon.salesman.service;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.sale.domain.Goods;
import edu.zut.cs.software.sun.salesman.domain.Salesman;

public interface SalesmanManager extends GenericManager<Salesman, Long> {

	Goods showGoods(Long id);
	Salesman showCompons();
	Salesman complaint();
	  
	void deleteById(Long id);

	    
}