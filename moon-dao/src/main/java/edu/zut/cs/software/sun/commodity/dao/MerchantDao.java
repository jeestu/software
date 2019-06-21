package edu.zut.cs.software.sun.commodity.dao;

import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.commodity.domain.Merchant;

@Repository
public interface MerchantDao extends GenericDao<Merchant,Long>{

}

