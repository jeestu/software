package edu.zut.cs.software.sun.commodity.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.commodity.domain.Commodity;


@Rollback(value = false)
public class CommodityDaoTest extends GenericDaoTestCase<Long, Commodity,CommodityDao>{
	
	  private static final Logger logger = LogManager.getLogger(CommodityDaoTest.class.getName());

	  @Autowired
	  CommodityDao commodityDao;
	  
      @Autowired
	  MerchantDao merchantDao;
	  

		@Test
	    public void sava(){
	
			Commodity commodity = new Commodity();
		
			commodity.setCommodityName("¼ÆËã»ú");
			commodity.setCommoditySort("µçÆ÷");
			commodity.setCommodityPrice(120);
			commodity.setMerchant(merchantDao.getOne((long) 777));
	        commodityDao.save(commodity);
	    }
		
		 @Test 
		  public void testFind()
		  { 
			List<Commodity> commodity = commodityDao.findAll();
		    assertNotNull(commodity); 
		    System.out.println(commodity);
		  }
}
