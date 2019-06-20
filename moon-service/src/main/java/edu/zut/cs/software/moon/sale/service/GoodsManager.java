package edu.zut.cs.software.moon.sale.service;

import java.util.List;

import org.springframework.data.domain.Page;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.sale.domain.Goods;

public interface GoodsManager extends GenericManager<Goods, Long> {
	Goods save(Goods expenditure);

    Goods findById(Long id);
    List<Goods> getByGoodsName(String goodsName);
    List<Goods> findAll();
    Page<Goods> getByPage(int pages, int numberOfPages);


    void deleteById(Long id);

    void updateById(Long id, String name,Double price);
}
