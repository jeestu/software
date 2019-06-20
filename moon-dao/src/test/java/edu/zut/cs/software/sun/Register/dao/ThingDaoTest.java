package edu.zut.cs.software.sun.Register.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.Register.domain.Thing;


@Rollback(value = false)
public class ThingDaoTest extends GenericDaoTestCase<Long, Thing, ThingDao>{

	 @Autowired
	    ThingDao thingDao;

	    @Test
	    public void testadd(){
	    	Thing thing=new Thing();
	    	thing.setThingName("手机");
	    	thing.setCount("1");
	    	thingDao.save(thing);
	    }
}
