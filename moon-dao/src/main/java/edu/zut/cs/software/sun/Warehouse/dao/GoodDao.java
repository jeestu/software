package edu.zut.cs.software.sun.Warehouse.dao;

import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.Warehouse.domain.Good;

@Repository
public interface GoodDao extends GenericDao<Good,Long>{
	

}
