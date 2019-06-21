package edu.zut.cs.software.moon.register.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.register.service.ThingManager;
import edu.zut.cs.software.sun.Register.domain.Thing;

@Rollback(value = false)
public class ThingManagerTset extends GenericManagerTestCase<Long, Thing,ThingManager>{

	private static final Logger logger = LogManager.getLogger(ThingManagerTset.class.getName());
	
	ThingManager thingManager;
	
      public ThingManagerTset() {
	   super(Thing.class);
	// TODO Auto-generated constructor stub
}
	
	@Autowired
    public void setManger(ThingManager manger) {
        this.thingManager = manger;
    }
	
	  @Test
	    public void save() {
		    Thing thing = new Thing();
		    thing.setCount("2");
		    thing.setThingName("手机");
		    thingManager.save(thing);
	    }
	  @Test
	    public void findAll() {
	        Assert.assertNotNull(thingManager.findAll());
	        logger.info(thingManager.findAll());
	    }
	
}
