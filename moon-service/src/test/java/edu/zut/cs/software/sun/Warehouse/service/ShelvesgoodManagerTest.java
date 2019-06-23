package edu.zut.cs.software.sun.Warehouse.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesgoodManager;
import edu.zut.cs.software.moon.Warehouse.service.ShelvesManager;
import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.Warehouse.domain.Shelvesgoods;

@Rollback(value = false)
public class ShelvesgoodManagerTest extends GenericManagerTestCase<Long, Shelvesgoods,ShelvesgoodManager> {

	 private static final Logger logger=LogManager.getLogger(ShelvesgoodManagerTest.class.getName());
	    private ShelvesgoodManager goodManager;

	
	 public ShelvesgoodManagerTest()
	 {super(Shelvesgoods.class);}

	 @Autowired
	    public void setgoodsManager(ShelvesgoodManager goodManager)
	  {this.goodManager=goodManager;}

	 @Autowired
	 ShelvesManager shelvesManager;
	 

	 
	 
	 /**@Test
	    public void save(){
	        Shelvesgoods good = new Shelvesgoods();
	        good.setCommoditName("薯片");
	        good.setShelves(shelvesManager.findById((long) 848));
	        goodManager.save(good);
	    }



	 @Test
	    public void findAll() {
	        Assert.assertNotNull(goodManager.findAll());
	        logger.info(goodManager.findAll());
	    }**/
	    
	   
	    

	    /**@Test
	    public void deleteById() {
	    	goodManager.deleteById((long) 845);
	    }**/

	 

}

