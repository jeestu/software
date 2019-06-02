package zut.software.sale.dao;

import org.junit.jupiter.api.Test;

import zut.software.sale.Domain.Coupon;

class couponDaoTest {

	@Test
	void test() {
		Coupon coupon=new Coupon();
		Coupon coupon2=new Coupon();
		coupon.setCouponName("Âú200¼õ20");
		coupon.setLowPrice(20);
		coupon2.setCouponName("Âú400¼õ40");
		coupon2.setLowPrice(40);
		couponDao CouponDao=new couponDao();
		CouponDao.save(coupon);
		CouponDao.save(coupon2);
		CouponDao.delete();
		CouponDao.find();
		CouponDao.update();
	}

}
