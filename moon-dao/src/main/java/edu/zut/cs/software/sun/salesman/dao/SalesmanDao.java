package edu.zut.cs.software.sun.salesman.dao;

import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.salesman.domain.Salesman;
@Repository
public interface SalesmanDao extends GenericDao<Salesman,Long> {

}