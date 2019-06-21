package edu.zut.cs.software.moon.commodity.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.commodity.service.MerchantManager;
import edu.zut.cs.software.sun.commodity.domain.Merchant;

@Rollback(value = false)
public class MerchantManagerTest extends GenericManagerTestCase<Long, Merchant,MerchantManager>{

	 private static final Logger logger = LogManager.getLogger(MerchantManagerTest.class.getName());
	
	 MerchantManager merchantManager;
	
	 
	public MerchantManagerTest() {
       super(Merchant.class);
   }
	
	@Autowired
   public void setManger(MerchantManager manger) {
       this.merchantManager = manger;
   }
	
	  @Test
	    public void save() {
		  Merchant merchant = new Merchant();
		  merchant.setMerchantName("Æ»¹û");
		  merchantManager.save(merchant);
	    }
	
	
	
}
