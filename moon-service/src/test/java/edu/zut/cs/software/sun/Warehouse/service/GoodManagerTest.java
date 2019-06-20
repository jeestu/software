package edu.zut.cs.software.sun.Warehouse.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.Warehouse.service.GoodManager;
import edu.zut.cs.software.moon.Warehouse.service.ShelvesManager;
import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.Warehouse.domain.Good;

@Rollback(value = false)
public class GoodManagerTest extends GenericManagerTestCase<Long, Good,GoodManager> {

	 private static final Logger logger=LogManager.getLogger(GoodManagerTest.class.getName());
	    private GoodManager goodManager;

	
	 public GoodManagerTest()
	 {super(Good.class);}

	 @Autowired
	    public void setgoodsManager(GoodManager goodManager)
	  {this.goodManager=goodManager;}

	 @Autowired
	 ShelvesManager shelvesManager;
	 

	 
	 
	 @Test
	    public void save(){
	        Good good = new Good();
	        good.setCommoditName("压缩饼干");
	        good.setShelves(shelvesManager.findById((long) 270));
	        goodManager.save(good);
	    }




}

