package edu.zut.cs.software.sun.Warehouse.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.Warehouse.domain.Shelvesgoods;



@Rollback(value = false)
public class ShelvesgoodDaoTest extends GenericDaoTestCase<Long, Shelvesgoods,ShelvesgoodDao>{
	
	  private static final Logger logger = LogManager.getLogger(ShelvesgoodDaoTest.class.getName());

	  @Autowired
	  ShelvesgoodDao goodDao;
	  
      @Autowired
	  ShelvesDao shelvesDao;
	  
	  

		@Test
	    public void sava(){
	
			Shelvesgoods good = new Shelvesgoods();
		
			good.setCommoditName("巧克力");
			good.setShelves(shelvesDao.getOne((long) 849));
			good.setAmount(240);
	        goodDao.save(good);
	    }
	  

		@Test
	    public void testFind(){
	        List<Shelvesgoods> goods = goodDao.findAll();
	        assertNotNull(goods);
	        if(logger.isInfoEnabled()){
	            logger.info(goods);
	        }
	    }
	   
	
	    /**@Test
	    public void deleteById(){
	    	goodDao.deleteById((long) 844);
	    }**/
	      

	  
}
