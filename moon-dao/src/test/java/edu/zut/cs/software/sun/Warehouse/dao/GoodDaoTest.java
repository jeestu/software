package edu.zut.cs.software.sun.Warehouse.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.Warehouse.dao.ShelvesDao;
import edu.zut.cs.software.sun.Warehouse.domain.Good;
import edu.zut.cs.software.sun.Warehouse.domain.Shelves;


@Rollback(value = false)
public class GoodDaoTest extends GenericDaoTestCase<Long, Good,GoodDao>{
	
	  private static final Logger logger = LogManager.getLogger(GoodDaoTest.class.getName());

	  @Autowired
	  GoodDao goodDao;
	  
      @Autowired
	  ShelvesDao shelvesDao;
	  
	  

		@Test
	    public void sava(){
	
			Good good = new Good();
		
			good.setCommoditName("妫掓绯�");
			good.setShelves(shelvesDao.getOne((long) 270));
			
	        goodDao.save(good);
	    }
	  

	    
	  
}
