package edu.zut.cs.software.moon.Warehouse.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.Warehouse.domain.Shelves;



public interface ShelvesManager extends GenericManager<Shelves, Long> {

	Shelves save(Shelves shelves);
	Shelves findById(Long id);
	List<Shelves> findAll();
	  
	void deleteById(Long id);

	    
}
