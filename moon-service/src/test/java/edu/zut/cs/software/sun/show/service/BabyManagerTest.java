package edu.zut.cs.software.sun.show.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.show.domain.Baby;

@Rollback(value = false)
public class BabyManagerTest extends GenericManagerTestCase<Long, Baby,BabyManager> {

	 private static final Logger logger=LogManager.getLogger(BabyManagerTest.class.getName());
	    private BabyManager babyManager;

	
	 public BabyManagerTest()
	 {super(Baby.class);}

	 @Autowired
	    public void setbabyManager(BabyManager babyManager)
	  {this.babyManager=babyManager;}


	 
	 @Test
	    public void save(){
		 Baby baby = new Baby();
		 baby.setName("纸尿裤");
		 baby.setPrice(79);	       
		 babyManager.save(baby);
	    }



}
