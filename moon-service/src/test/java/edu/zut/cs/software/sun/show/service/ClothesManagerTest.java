package edu.zut.cs.software.sun.show.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.show.domain.Clothes;

@Rollback(value = false)
public class ClothesManagerTest extends GenericManagerTestCase<Long, Clothes,ClothesManager> {

	 private static final Logger logger=LogManager.getLogger(ClothesManagerTest.class.getName());
	    private ClothesManager clothesManager;

	
	 public ClothesManagerTest()
	 {super(Clothes.class);}

	 @Autowired
	    public void setclothesManager(ClothesManager clothesManager)
	  {this.clothesManager=clothesManager;}


	 
	 @Test
	    public void save(){
		 Clothes clothes = new Clothes();
		 clothes.setName("工装裤");
		 clothes.setPrice("89");	       
		 clothesManager.save(clothes);
	    }



	/** @Test
	    public void findAll() {
	        Assert.assertNotNull(goodManager.findAll());
	        logger.info(goodManager.findAll());
	    }**/
	    
	   
	    

	    /**@Test
	    public void deleteById() {
	    	goodManager.deleteById((long) 845);
	    }**/

	 


}
