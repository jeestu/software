package edu.zut.cs.software.sun.salesman.dao;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.salesman.domain.Salesman;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;

public class SalesmanDaoTest  extends GenericDaoTestCase<Long, Salesman, SalesmanDao> {

	private static final Logger logger = LogManager.getLogger(SalesmanDaoTest.class.getName());

    @Autowired
    SalesmanDao salesmanDao;

    @Test

    public void testAdd(){
        Salesman salesman = new Salesman();
        salesman.setSalesmanName("燕广北");
        salesman.setSalesmanNumber("0001");
        salesman.setSalesmanStar(5);
        this.salesmanDao.save(salesman);

    }


    @Test
    public void testFind(){
    	Salesman salesman = salesmanDao.getOne(330L);
        assertNotNull(salesman);
        if(logger.isInfoEnabled()){
            logger.info("ID:330L",salesman);

        }
    }

}
