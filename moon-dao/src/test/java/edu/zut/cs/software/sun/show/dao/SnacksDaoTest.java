package edu.zut.cs.software.sun.show.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;

import edu.zut.cs.software.sun.show.domain.Snacks;

@Rollback(value = false)
public class SnacksDaoTest extends GenericDaoTestCase<Long, Snacks,SnacksDao>{

	private static final Logger logger = LogManager.getLogger(SnacksDaoTest.class.getName());

	  @Autowired
	  SnacksDao snacksDao;

	  @Test
	  public void sava(){
		  Snacks snacks = new Snacks();
		  snacks.setName("六个核桃露");
		  snacks.setPrice(68);
	      this.snacksDao.save(snacks);
	    }
}
