package edu.zut.cs.software.sun.commodity.dao;

import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.commodity.domain.Commodity;

@Repository
public interface CommodityDao extends GenericDao<Commodity,Long>{
	

}

