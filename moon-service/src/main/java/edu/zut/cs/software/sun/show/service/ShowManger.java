package edu.zut.cs.software.sun.show.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.show.domain.Advertising;

public interface ShowManger extends GenericManager<Advertising, Long>{

	void deleteByid(Long id);

	List<Advertising> findByPage(String Name);

	List<Advertising> findAll();

}
