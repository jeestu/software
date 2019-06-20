package edu.zut.cs.software.moon.sale.service;

import java.util.List;

import org.springframework.data.domain.Page;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.sale.domain.Coupon;

public interface CouponManager extends GenericManager<Coupon,Long> {
	public Coupon save(Coupon expenditure);

    Coupon findById(Long id);
    List<Coupon> findAll();
    Page<Coupon> getByPage(int pages, int numberOfPages);


    void deleteById(Long id);

    void updateById(Long id, String name,int price);
}
