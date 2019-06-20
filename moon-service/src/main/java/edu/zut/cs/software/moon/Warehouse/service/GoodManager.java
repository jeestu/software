package edu.zut.cs.software.moon.Warehouse.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.Warehouse.domain.Good;

public interface GoodManager extends GenericManager<Good,Long>{
	
	
		Good save(Good goods);
		Good findById(Long id);	
		public void deleteById(Long id);
	
	

}
