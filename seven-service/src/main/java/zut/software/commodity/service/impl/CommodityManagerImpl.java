package zut.software.commodity.service.impl;

import zut.software.commodity.Domain.Commodity;
import zut.software.commodity.Domain.Controller;
import zut.software.commodity.dao.commodityDao;
import zut.spftware.commodity.service.CommodityManager;

public class CommodityManagerImpl implements CommodityManager {

	/*commodityDao commoditydao;

	public commodityDao getCommoditydao() {
		return commoditydao;
	}

	public void setCommoditydao(commodityDao commoditydao) {
		this.commoditydao = commoditydao;
	}*/
	@Override
	public void setcommodity(String commodityName,Controller c) {
		CommodityManagerImpl commodityManagerImpl=new CommodityManagerImpl();
		commodityDao CommodityDao=new commodityDao();
		Commodity c1=new Commodity(); 
		c1.setController(c);
		c1.setCommodityName(commodityName);
		CommodityDao.save(c1);
		//commodityManagerImpl.getcommodityDao().save(c);
		
	}
}
	
