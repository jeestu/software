package zut.software.commodit.service.impl;

import zut.software.commodit.dao.commoditDao;
import zut.software.commodit.service.outwarehouse;

public class outwarehouselmpl implements outwarehouse {

	@Override
	public void Before_outware() {
	
	System.out.print("����ǰ����Ʒ�У�    ");
	commoditDao CommoditDao=new commoditDao();	
	CommoditDao.testGroupBy();
	
		

	}

	@Override
	public void After_outware() {
	System.out.print("��������Ʒ�У�    ");
	commoditDao CommoditDao=new commoditDao();	
	CommoditDao.testGroupBy();
	
		

	}

	@Override
	public void at_outware() {
	System.out.print("��������Ҫ�������Ʒ�������ڵĻ�������:    ");
	commoditDao CommoditDao=new commoditDao();	
	CommoditDao.find();
	CommoditDao.delete();
	
		

	}

}
