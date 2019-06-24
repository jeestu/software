package edu.zut.cs.software.sun.show.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.show.domain.Clothes;
import edu.zut.cs.software.sun.show.domain.Dailyuse;

@Rollback(value = false)
public class DailyuseManagerTest extends GenericManagerTestCase<Long, Dailyuse,DailyuseManager> {

	 private static final Logger logger=LogManager.getLogger(DailyuseManagerTest.class.getName());
	    private DailyuseManager dailyuseManager;

	
	 public DailyuseManagerTest()
	 {super(Dailyuse.class);}

	 @Autowired
	    public void setdailyuseManager(DailyuseManager dailyuseManager)
	  {this.dailyuseManager=dailyuseManager;}


	 
	 @Test
	    public void save(){
		 Dailyuse dailyuse = new Dailyuse();
		 dailyuse.setName("卸妆水");
		 dailyuse.setPrice(79);	       
		 dailyuseManager.save(dailyuse);
	    }



}
