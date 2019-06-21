package edu.zut.cs.software.moon.commodity.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.commodity.domain.Commodity;

public interface CommodityManager extends GenericManager<Commodity,Long>{
	Commodity save(Commodity commodity);
	Commodity findById(Long id);
	
	 public void deleteById(Long id);

	    List<Commodity> findAll();
	
}
