package edu.zut.cs.software.sun.show.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.show.domain.Figure;

@Rollback(value = false)
public class FigureDaoTest extends GenericDaoTestCase<Long, Figure,FigureDao>{
	
	  private static final Logger logger = LogManager.getLogger(FigureDaoTest.class.getName());

	  @Autowired
	  FigureDao figureDao;

	  @Test
	  public void sava(){
		  Figure figure = new Figure();
		  figure.setName("充电宝");
		  figure.setPrice(129);
	      this.figureDao.save(figure);
	    }

}
