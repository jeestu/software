package edu.zut.cs.software.sun.show.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.show.domain.Baby;

@Rollback(value = false)
public class BabyDaoTest extends GenericDaoTestCase<Long, Baby,BabyDao>{
	
	  private static final Logger logger = LogManager.getLogger(BabyDaoTest.class.getName());

	  @Autowired
	  BabyDao babyDao;

	  @Test
	  public void sava(){
		  Baby baby = new Baby();
		  baby.setName("积木");
		  baby.setPrice(129);
	      this.babyDao.save(baby);
	    }

}
