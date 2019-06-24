package edu.zut.cs.software.sun.show.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.show.domain.Dailyuse;

@Rollback(value = false)
public class DailyuseDaoTest extends GenericDaoTestCase<Long, Dailyuse,DailyuseDao>{
	
	  private static final Logger logger = LogManager.getLogger(DailyuseDaoTest.class.getName());

	  @Autowired
	  DailyuseDao dailyuseDao;

	  @Test
	  public void sava(){
		  Dailyuse dailyuse = new Dailyuse();
		  dailyuse.setName("护发素");
		  dailyuse.setPrice(49);
	      this.dailyuseDao.save(dailyuse);
	    }

}
