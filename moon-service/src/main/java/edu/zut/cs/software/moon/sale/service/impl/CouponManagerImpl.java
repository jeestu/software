package edu.zut.cs.software.moon.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.sale.service.CouponManager;
import edu.zut.cs.software.sun.sale.dao.CouponDao;
import edu.zut.cs.software.sun.sale.domain.Coupon;
import edu.zut.cs.software.sun.sale.domain.Goods;
@Service
@Transactional
public class CouponManagerImpl extends GenericManagerImpl<Coupon, Long> implements CouponManager {
    
	@Autowired
	CouponDao dao;

	@Override
	public Coupon save(Coupon expenditure) {
		// TODO Auto-generated method stub
		return dao.saveAndFlush(expenditure);
	}

	@Override
	public Coupon findById(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}


	@Override
	public List<Coupon> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Page<Coupon> getByPage(int pages, int numberOfPages) {
		Specification<Goods> specification = null;
        Pageable pageable = new PageRequest(pages, numberOfPages);
        Page<Coupon> page = dao.findAll(pageable);
        return page;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public void updateById(Long id, String name, int price) {
		// TODO Auto-generated method stub
		Coupon coupon=dao.getOne(id);
		coupon.setCouponName(name);
		coupon.setLowPrice(price);
		dao.saveAndFlush(coupon);
	}

}
