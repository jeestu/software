package edu.zut.cs.software.sun.show.dao;

import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.show.domain.Baby;

@Repository
public interface BabyDao extends GenericDao<Baby,Long>{

}
