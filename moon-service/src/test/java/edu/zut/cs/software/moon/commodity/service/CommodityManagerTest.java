package edu.zut.cs.software.moon.commodity.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.commodity.service.CommodityManager;
import edu.zut.cs.software.moon.commodity.service.MerchantManager;
import edu.zut.cs.software.sun.commodity.domain.Commodity;

public class CommodityManagerTest extends GenericManagerTestCase<Long, Commodity,CommodityManager>{
	private static final Logger logger=LogManager.getLogger(CommodityManagerTest.class.getName());
    private CommodityManager commodityManager;


 public CommodityManagerTest()
 {super(Commodity.class);}

 @Autowired
    public void setgoodsManager(CommodityManager commodityManager)
  {this.commodityManager=commodityManager;}

 @Autowired
 MerchantManager merchantManager;
 

 
 
 @Test
    public void save(){
	 Commodity commodity = new Commodity();
        
	 commodity.setCommodityName("х╧вс");
	 commodity.setMerchant(merchantManager.findById((long) 777));
	 commodityManager.save(commodity);
    }
    @Test public void findAll() 
    { Assert.assertNotNull(commodityManager.findAll());
     logger.info(commodityManager.findAll()); }

  
}

