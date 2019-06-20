package edu.zut.cs.software.sun.sale.service;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.sale.service.CouponManager;
import edu.zut.cs.software.sun.sale.domain.Coupon;

public class CouponManagerTest extends GenericManagerTestCase<Long, Coupon, CouponManager> {
	
	private static final Logger logger = LogManager.getLogger(CouponManagerTest.class.getName());
	public CouponManagerTest() {
		super(Coupon.class);
	}
	@Autowired
	private CouponManager couponManager;
	@Test
	public void testFind() {
		Coupon coupon=couponManager.findById(635L);
		System.out.println(coupon);
	}
	@Test
	public void testDelete() {
		//couponManager.deleteById(634L);
	}
	@Test
	public void Save() {
		Coupon coupon=new Coupon();
		coupon.setCouponName("dd");
		couponManager.save(coupon);
	}
}
