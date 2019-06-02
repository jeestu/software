package zut.software.sale.dao;

import org.junit.jupiter.api.Test;

import zut.software.sale.Domain.Coupon;
import zut.software.sale.Domain.Goods;

class goodsDaoTest {

	@Test
	void test() {
		Coupon coupon=new Coupon();
		Coupon coupon2=new Coupon();
		coupon.setCouponName("ÂúÒ»°Ù¼õ10");
		coupon.setLowPrice(10);
		coupon2.setCouponName("Âú500¼õ50");
		coupon.setLowPrice(50);
		Goods goods=new Goods();
		Goods goods2=new Goods();
		goods.setGoodsName("°ÙñÞÈ¹");
		goods.setPrice(100.3);
		goods.setCoupon(coupon);
		goods2.setGoodsName("´çÉÀ");
		goods2.setPrice(500.4);
		goods2.setCoupon(coupon2);
		goodsDao GoodsDao=new goodsDao();
		GoodsDao.save(goods);
		GoodsDao.save(goods2);
		GoodsDao.delete();
		GoodsDao.find();
		GoodsDao.update();
	}

}
