package zut.software.commodit.service.impl;

import zut.software.commodit.dao.commoditDao;
import zut.software.commodit.service.outwarehouse;

public class outwarehouselmpl implements outwarehouse {

	@Override
	public void Before_outware() {
	
	System.out.print("出库前的商品有：    ");
	commoditDao CommoditDao=new commoditDao();	
	CommoditDao.testGroupBy();
	
		

	}

	@Override
	public void After_outware() {
	System.out.print("出库后的商品有：    ");
	commoditDao CommoditDao=new commoditDao();	
	CommoditDao.testGroupBy();
	
		

	}

	@Override
	public void at_outware() {
	System.out.print("此下是你要出库的商品和其所在的货架名称:    ");
	commoditDao CommoditDao=new commoditDao();	
	CommoditDao.find();
	CommoditDao.delete();
	
		

	}

}
