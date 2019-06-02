package zut.software.salesman.service.impl;

import zut.software.sale.dao.couponDao;
import zut.software.sale.dao.goodsDao;
import zut.software.salesman.dao.salesmanDao;
import zut.software.salesman.service.Salesman;
public class SalesmanImpl implements Salesman {

	@Override
	public void show_Goods() {
		goodsDao GoodsDao=new goodsDao();
		GoodsDao.find();
	}

	@Override
	public void show_Coupon() {
		couponDao CouoponDao=new couponDao();
		CouoponDao.find();
	}

	@Override
	public void show_star() {
		salesmanDao SalesmanDao =new salesmanDao();
		int star= SalesmanDao.star();
		System.out.println("该客服的星级为"+star);
	}

}
