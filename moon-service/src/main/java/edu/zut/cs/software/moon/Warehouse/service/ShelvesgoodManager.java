package edu.zut.cs.software.moon.Warehouse.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.Warehouse.domain.Shelvesgoods;

public interface ShelvesgoodManager extends GenericManager<Shelvesgoods,Long>{
	
	
		Shelvesgoods save(Shelvesgoods goods);
		Shelvesgoods findById(Long id);	
		public void deleteById(Long id);
	
	

}
