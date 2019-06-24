package edu.zut.cs.software.sun.show.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.show.domain.Snacks;

public interface SnacksManager extends GenericManager<Snacks, Long>{

	Snacks save(Snacks snacks);
	Snacks findById(Long id);
	List<Snacks> findAll();
	  
	void deleteById(Long id);


}
