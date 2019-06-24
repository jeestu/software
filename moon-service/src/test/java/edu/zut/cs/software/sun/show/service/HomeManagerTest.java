package edu.zut.cs.software.sun.show.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.show.domain.Home;

@Rollback(value = false)
public class HomeManagerTest extends GenericManagerTestCase<Long, Home,HomeManager> {

	 private static final Logger logger=LogManager.getLogger(HomeManagerTest.class.getName());
	    private HomeManager homeManager;

	
	 public HomeManagerTest()
	 {super(Home.class);}

	 @Autowired
	    public void sethomeManager(HomeManager homeManager)
	  {this.homeManager=homeManager;}


	 
	 @Test
	    public void save(){
		 Home home = new Home();
		 home.setName("地毯");
		 home.setPrice(179);	       
		 homeManager.save(home);
	    }



}
