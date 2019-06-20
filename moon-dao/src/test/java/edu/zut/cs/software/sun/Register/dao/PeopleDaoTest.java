package edu.zut.cs.software.sun.Register.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.Register.domain.People;

 public class PeopleDaoTest extends GenericDaoTestCase<Long, People,PeopleDao>{
		
		  @Autowired
		  PeopleDao peopleDao;
	      
	      @Test
		    public void sava(){
				People people = new People();
				people.setPeoplename("燕广北");
				people.setPeopleage("21");
				people.setPeopleset("男");
				peopleDao.save(people);
				
	      }
}
				
