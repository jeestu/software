package edu.zut.cs.software.sun.Register.dao;


import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.Register.domain.Thing;
import edu.zut.cs.software.sun.Warehouse.domain.Shelves;;

@Repository
public interface ThingDao  extends GenericDao<Thing, Long>{


}
