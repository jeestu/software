package edu.zut.cs.software.sun.sale.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.sale.domain.Goods;

public class GoodsDaoTest extends GenericDaoTestCase<Long, Goods, GoodsDao> {
	@Autowired
	private GoodsDao goodsDao;
	@Autowired
	private CouponDao couponDao;
	@Test
	@Rollback(false)
	public void add() {
		Goods goods=new Goods();
		goods.setCoupon(couponDao.getOne(635L));
		goods.setGoodsName("百褶�?");
		goods.setGoodsPrice(100.0);
		this.goodsDao.save(goods);
	}
	@Test
	public void find() {
		goodsDao.findAll();
	}
}
