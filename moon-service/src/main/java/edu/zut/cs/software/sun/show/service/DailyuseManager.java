package edu.zut.cs.software.sun.show.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.show.domain.Dailyuse;

public interface DailyuseManager extends GenericManager<Dailyuse, Long>{

	Dailyuse save(Dailyuse dailyuse);
	Dailyuse findById(Long id);
	List<Dailyuse> findAll();
	  
	void deleteById(Long id);

}
