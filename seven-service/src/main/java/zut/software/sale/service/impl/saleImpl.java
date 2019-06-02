package zut.software.sale.service.impl;

import zut.software.sale.Domain.Goods;
import zut.software.sale.dao.goodsDao;
import zut.software.sale.service.sale;

public class saleImpl implements sale {

	@Override
	public void check_BeforeGoods() {
		goodsDao GoodsDao=new goodsDao();
		GoodsDao.find();
	}

	@Override
	public void check_AfterGoods() {
		goodsDao GoodsDao=new goodsDao();
		Goods goods=GoodsDao.getGoods();
		int a=goods.getCoupon().getLowPrice();
		double b=goods.getAfterCoupon_price();
		b=goods.getPrice()-a;
		System.out.println("领卷之后的价格为"+b);
	}

	@Override
	public void sale_Goods() {
		goodsDao GoodsDao=new goodsDao();
		Goods goods=GoodsDao.getGoods();
		Integer id=goods.getId();
		//GoodsDao.delete2(id);
		System.out.println("您已成功购买"+goods+"领劵后"+goods.getAfterCoupon_price());
	}

}
