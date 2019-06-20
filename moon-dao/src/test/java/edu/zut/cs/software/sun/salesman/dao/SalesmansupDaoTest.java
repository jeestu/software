package edu.zut.cs.software.sun.salesman.dao;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.salesman.domain.Salesmansup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;
public class SalesmansupDaoTest  extends GenericDaoTestCase<Long, Salesmansup, SalesmansupDao> {

	private static final Logger logger = LogManager.getLogger(SalesmansupDaoTest.class.getName());

    @Autowired
    SalesmansupDao salesmansupDao;

    @Test

    public void testAdd(){
        Salesmansup salesmansup = new Salesmansup();
        salesmansup.setSalesmansupName("张展鹏");
        salesmansup.setSalesmansupNumber("0001");
        salesmansup.setSalesmansupcount(5);
        this.salesmansupDao.save(salesmansup);

    }


    @Test
    public void testFind(){
    	Salesmansup salesmansup = salesmansupDao.getOne(330L);
        assertNotNull(salesmansup);
        if(logger.isInfoEnabled()){
            logger.info("ID:330L",salesmansup);

        }
    }

}
