package edu.zut.cs.software.sun.show.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.show.domain.Home;

@Rollback(value = false)
public class HomeDaoTest extends GenericDaoTestCase<Long, Home,HomeDao>{
	
	  private static final Logger logger = LogManager.getLogger(HomeDaoTest.class.getName());

	  @Autowired
	  HomeDao homeDao;

	  @Test
	  public void sava(){
		  Home home = new Home();
		  home.setName("摇摇椅");
		  home.setPrice(399);
	      this.homeDao.save(home);
	    }

}
