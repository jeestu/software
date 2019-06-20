package edu.zut.cs.software.sun.show.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.show.dao.AdvertisingDao;
import edu.zut.cs.software.sun.show.domain.Advertising;
import edu.zut.cs.software.sun.show.domain.Page;


@Rollback(value = false)
public class AdvertisingDaoTest extends GenericDaoTestCase<Long, Advertising, AdvertisingDao>{
	
	 private static final Logger logger = LogManager.getLogger(AdvertisingDaoTest.class.getName());
	 
	 private AdvertisingDao advertisingDao;
	 @Autowired
	 public void setAdvertisingDao(AdvertisingDao advertisingDao) {
		 this.advertisingDao = advertisingDao;
	 }
	 @Test
	 public void testSave() {
		 Advertising advertising = new Advertising();
		 advertising.setAdvertsingClass("Ï´ÊþÓÃÆ·");
		 advertising.setAdvertsingName("ÑÀ¸à");
		 advertising.setPrice(10);
		 advertisingDao.saveAndFlush(advertising);
	 }
	
	@Test
	public void testFind() {
		List<Advertising> advertising = advertisingDao.findAll();
		System.out.println(advertising);
	}

}
