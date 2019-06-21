package edu.zut.cs.software.sun.commodity.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.commodity.domain.Merchant;

@Rollback(value = false)
public class MerchantDaoTest extends GenericDaoTestCase<Long, Merchant,MerchantDao>{
	
	private static final Logger logger = LogManager.getLogger(MerchantDaoTest.class.getName());
	  
	
	  @Autowired
	  MerchantDao merchantDao;

		@Test
	    public void sava(){
			Merchant merchant = new Merchant();
			merchant.setMerchantName("lili");
			merchant.setId((long) 111);
			merchant.setDateCreated(null);
			merchant.setDateModified(null);
			merchant.setDeleted(null);
			merchant.setEntityName(null);
	        this.merchantDao.save(merchant);
	    }
		
		
		@Test
	    public void testFind(){
	        List<Merchant> merchant = merchantDao.findAll();
	        assertNotNull(merchant);
	        if(logger.isInfoEnabled()){
	            logger.info(merchant);
	        }
	          }		

	}

