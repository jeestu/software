package edu.zut.cs.software.moon.register.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.register.service.PeopleManager;

import edu.zut.cs.software.sun.Register.domain.People;

import edu.zut.cs.software.sun.sale.service.CouponManagerTest;

@Rollback(value = false)
public class PeopleManagerTest extends GenericManagerTestCase<Long, People, PeopleManager>{

	private static final Logger logger = LogManager.getLogger(PeopleManagerTest.class.getName());

	private PeopleManager peopleManager;
	public PeopleManagerTest() {
		super(People.class);
	}
	@Autowired
	public void setPeopleManager(PeopleManager peopleManager) {
		this.peopleManager = peopleManager;
	}
	
	@Test
	public void Save() {
		People people=new People();
		people.setPeoplename("yyy");
		people.setPeopleage("21");
		people.setPeopleset("nan");
		peopleManager.save(people);
	}
}
