package edu.zut.cs.software.moon.salesman.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.salesman.domain.Salesman;
import edu.zut.cs.software.sun.salesman.domain.Salesmansup;

public interface SalesmansupManager extends GenericManager<Salesman, Long> {

	static Salesmansup save(Salesmansup salesmansup) {
		// TODO Auto-generated method stub
		return null;
	}
	Salesman findById(Long id);
	List<Salesman> findAll();
	  
	void deleteById(Long id);

	    
}