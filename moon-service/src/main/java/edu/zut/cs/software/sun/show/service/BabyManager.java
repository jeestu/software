package edu.zut.cs.software.sun.show.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.show.domain.Baby;

public interface BabyManager extends GenericManager<Baby, Long>{

	Baby save(Baby baby);
	Baby findById(Long id);
	List<Baby> findAll();
	  
	void deleteById(Long id);

}
