package edu.zut.cs.software.sun.show.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;

import edu.zut.cs.software.sun.show.domain.Clothes;

@Rollback(value = false)
public class ClothesDaoTest extends GenericDaoTestCase<Long, Clothes,ClothesDao>{
	
	  private static final Logger logger = LogManager.getLogger(ClothesDaoTest.class.getName());

	  @Autowired
	  ClothesDao clothesDao;

	  @Test
	  public void sava(){
		  Clothes clothes = new Clothes();
		  clothes.setName("毛呢风衣");
		  clothes.setPrice("199");
	      this.clothesDao.save(clothes);
	    }
	  
}
