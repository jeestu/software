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
import edu.zut.cs.software.moon.sale.service.GoodsManager;
import edu.zut.cs.software.sun.sale.dao.GoodsDao;
import edu.zut.cs.software.sun.sale.domain.Goods;
@Service
@Transactional
public class GoodsManagerImpl extends GenericManagerImpl<Goods, Long> implements GoodsManager {
	
	@Autowired
    GoodsDao dao;

	@Override
	public Goods save(Goods expenditure) {
		// TODO Auto-generated method stub
		return dao.save(expenditure);
	}
    
	@Override
	public Goods findById(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}
	@Override
	public List<Goods> getByGoodsName(String goodsName) {
		//创建查询条件数据对象
        Goods queryObject = new Goods();
        queryObject.setDateCreated(null);
        queryObject.setDateModified(null);
        queryObject.setGoodsName(goodsName);
        //创建匹配器，如何使用查询条件
        ExampleMatcher exampleMatcher =ExampleMatcher.matching()
                .withMatcher("goodsName", ExampleMatcher.GenericPropertyMatchers.startsWith());

        Example<Goods> example = Example.of(queryObject, exampleMatcher);
        List<Goods> list = dao.findAll(example);

        return list;
	}

	@Override
	public List<Goods> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Page<Goods> getByPage(int pages, int numberOfPages) {
		Specification<Goods> specification = null;
        Pageable pageable = new PageRequest(pages, numberOfPages);
        Page<Goods> page = dao.findAll(specification, pageable);
        return page;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		System.out.println("success");
	}

	@Override
	public void updateById(Long id, String name, Double price) {
		// TODO Auto-generated method stub
		Goods goods=dao.getOne(id);
		goods.setGoodsName(name);
		goods.setGoodsPrice(price);
	}

}
