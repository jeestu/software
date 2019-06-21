package edu.zut.cs.software.sun.Warehouse.service;


import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesManager;
import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.Warehouse.domain.Shelves;

@Rollback(value = false)
public class ShelvesManagerTest extends GenericManagerTestCase<Long, Shelves,ShelvesManager>{

	 private static final Logger logger = LogManager.getLogger(ShelvesManagerTest.class.getName());
	
	 ShelvesManager shelvesManager;
	
	 
	public ShelvesManagerTest() {
        super(Shelves.class);
    }
	
	@Autowired
    public void setManger(ShelvesManager manger) {
        this.shelvesManager = manger;
    }
	
	  @Test
	    public void save() {
		    Shelves shelves = new Shelves();
		    shelves.setShelvesName("°ô°ôÌÇ");
		    shelvesManager.save(shelves);
	    }
	  @Test
	    public void findAll() {
	        Assert.assertNotNull(shelvesManager.findAll());
	        logger.info(shelvesManager.findAll());
	    }
	
}
