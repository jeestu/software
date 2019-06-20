package edu.zut.cs.software.moon.salesman.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.salesman.service.SalesmanManager;
import edu.zut.cs.software.moon.salesman.service.SalesmansupManager;
import edu.zut.cs.software.sun.salesman.domain.Salesman;
import edu.zut.cs.software.sun.salesman.domain.Salesmansup;

@Rollback(value = false)
public class SalesmansupManagerTest extends GenericManagerTestCase<Long, Salesman,SalesmanManager>{


	private static final Logger logger = LogManager.getLogger(SalesmansupManagerTest.class.getName());
	
	SalesmansupManager salesmansupManager;
	
	 
	public SalesmansupManagerTest() {
        super(Salesman.class);
    }
	
	@Autowired
    public void setManger(SalesmansupManager manger) {
        this.salesmansupManager = manger;
    }
	
	  @Test
	    public void save() {
		    Salesmansup salesmansup=new Salesmansup();
		    salesmansup.setSalesmansupName("112233");		   
			SalesmansupManager.save(salesmansup);
	    }

	
}
