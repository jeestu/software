package edu.zut.cs.software.sun.show.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.show.domain.Figure;

@Rollback(value = false)
public class FigureManagerTest extends GenericManagerTestCase<Long, Figure,FigureManager> {

	 private static final Logger logger=LogManager.getLogger(FigureManagerTest.class.getName());
	    private FigureManager figureManager;

	
	 public FigureManagerTest()
	 {super(Figure.class);}

	 @Autowired
	    public void setfigureManager(FigureManager figureManager)
	  {this.figureManager=figureManager;}


	 
	 @Test
	    public void save(){
		 Figure figure = new Figure();
		 figure.setName("老人机");
		 figure.setPrice(279);	       
		 figureManager.save(figure);
	    }



}
