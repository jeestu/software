package zut.software.commodit.service.impl;

import zut.software.commodit.Domain.Commodit;
import zut.software.commodit.Domain.Shelves;
import zut.software.commodit.dao.commoditDao;
import zut.software.commodit.service.intowarehouse;

public class intowarehouselmpl implements intowarehouse {

	@Override
	public void Before_intoware() {
		System.out.print("���ǰ����Ʒ�У�    ");
		commoditDao CommoditDao=new commoditDao();	
		CommoditDao.testGroupBy();

	}

	@Override
	public void After_intoware() {
		System.out.print("�������Ʒ�У�    ");
		commoditDao CommoditDao=new commoditDao();	
		CommoditDao.testGroupBy();

		

	}

	@Override
	public void at_intoware() {
		System.out.println("������ ............   ");
		System.out.println("������� ............   ");
		
		
		
        Shelves shelves =new Shelves();
		
		Commodit commodit=new Commodit();
		commodit.setShelves(shelves);
		
		commoditDao CommoditDao=new commoditDao();
		CommoditDao.save(commodit);
	
		
	}

}
