package edu.zut.cs.software.sun.show.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;

import edu.zut.cs.software.sun.show.dao.FigureDao;

import edu.zut.cs.software.sun.show.domain.Figure;
import edu.zut.cs.software.sun.show.service.FigureManager;

@Service
@Transactional
public class FigureManagerImpl extends GenericManagerImpl<Figure,Long> implements FigureManager{

	FigureDao  dao;
	
	  @Autowired
	    public void setDao(FigureDao dao){this.dao=dao;}


	    @Override
	    public Figure save(Figure figure){return dao.save(figure);}


		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 dao.deleteById(id);
		}
	
		public Figure findById(Long id){
	        return dao.getOne(id);
	    }
	    
	

}
