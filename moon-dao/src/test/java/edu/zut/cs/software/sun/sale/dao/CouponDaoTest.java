package edu.zut.cs.software.sun.sale.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.sale.domain.Coupon;

public class CouponDaoTest extends GenericDaoTestCase<Long, Coupon, CouponDao> {
	private static final Logger logger = LogManager.getLogger(CouponDaoTest.class.getName());
    @Autowired
    private  CouponDao couponDao;

    @Test
    @Rollback(false)
    public void testadd(){
        Coupon coupon = new Coupon();
        coupon.setCouponName("满一百减10");
        coupon.setLowPrice(10);
        this.couponDao.save(coupon);
    }

   // @Test
   // public void testFind()
    //{
      //  logger.info(couponDao.getOne());
    //}

    @Test
    public void testFindAll() {

        List<Coupon> result = this.couponDao.findAll();
        if (logger.isInfoEnabled()) {
            logger.info("testFindAll() - List<Coupon> result={}", result); //$NON-NLS-1$
        }
        System.out.println(result);

    }

}
