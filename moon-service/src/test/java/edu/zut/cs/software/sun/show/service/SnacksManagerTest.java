package edu.zut.cs.software.sun.show.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.show.domain.Snacks;

public class SnacksManagerTest extends GenericManagerTestCase<Long, Snacks,SnacksManager>{

	 private static final Logger logger=LogManager.getLogger(SnacksManagerTest.class.getName());
	    private SnacksManager snacksManager;

	
	 public SnacksManagerTest()
	 {super(Snacks.class);}

	 @Autowired
	    public void setsnacksManager(SnacksManager snacksManager)
	  {this.snacksManager=snacksManager;}
	 
	 
	 @Test
	    public void save(){
		 Snacks snacks = new Snacks();
		 snacks.setName("果冻");
		 snacks.setPrice(16);	       
		 snacksManager.save(snacks);
	    }


	 
}
