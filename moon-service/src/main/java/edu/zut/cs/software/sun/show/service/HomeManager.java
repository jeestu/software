package edu.zut.cs.software.sun.show.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.show.domain.Home;

public interface HomeManager extends GenericManager<Home, Long>{

	Home save(Home home);
	Home findById(Long id);
	List<Home> findAll();
	  
	void deleteById(Long id);

}
