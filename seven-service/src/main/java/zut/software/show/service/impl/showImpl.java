package zut.software.show.service.impl;

import zut.software.show.dao.AdvertisingDao;
import zut.software.show.dao.PageDao;
import zut.software.show.service.show;

public class showImpl implements show{

	
	
	@Override
	public void showPage() {
		
		PageDao pageDao = new PageDao();
		pageDao.find();
	}

	@Override
	public void showAdvertising() {
		AdvertisingDao advertisingDao = new AdvertisingDao();
		advertisingDao.find();
	}

}
