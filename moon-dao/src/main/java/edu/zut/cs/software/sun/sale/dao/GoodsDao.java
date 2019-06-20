package edu.zut.cs.software.sun.sale.dao;

import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.sale.domain.Goods;

@Repository
public interface GoodsDao extends GenericDao<Goods, Long> {

}
