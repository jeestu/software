package edu.zut.cs.software.sun.show.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.show.domain.Figure;

public interface FigureManager extends GenericManager<Figure, Long>{

	Figure save(Figure figure);
	Figure findById(Long id);
	List<Figure> findAll();
	  
	void deleteById(Long id);

}
