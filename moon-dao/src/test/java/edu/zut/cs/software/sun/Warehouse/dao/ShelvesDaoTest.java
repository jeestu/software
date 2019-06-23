package edu.zut.cs.software.sun.Warehouse.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.Warehouse.domain.Shelves;



@Rollback(value = false)
public class ShelvesDaoTest extends GenericDaoTestCase<Long, Shelves,ShelvesDao>{
	
	private static final Logger logger = LogManager.getLogger(ShelvesDaoTest.class.getName());
	  
	
	  @Autowired
	  ShelvesDao shelvesDao;

		/**@Test
	    public void sava(){
			Shelves shelves = new Shelves();
			shelves.setShelvesName("4��");
			shelves.setId((long) 111);
			shelves.setDateCreated(null);
			shelves.setDateModified(null);
			shelves.setDeleted(null);
			shelves.setEntityName(null);
	        this.shelvesDao.save(shelves);
	    }
		
		
		@Test
	    public void testFind(){
	        List<Shelves> shelves = shelvesDao.findAll();
	        assertNotNull(shelves);
	        if(logger.isInfoEnabled()){
	            logger.info(shelves);
	        }
	    }**/
		
		

	}
