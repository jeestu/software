package zut.software.commodity.service.impl;

import org.junit.jupiter.api.Test;

import zut.software.commodity.Domain.Controller;


public class CommodityManagerImplTest {

	@Test
	void test() {
		Controller controller=new Controller();
		controller.setAge(21);
		controller.setControllerName("wangxi");
		controller.setTel("123456");
		//controllerDao ControllerDao=new controllerDao();
		//ControllerDao.save(controller);
		CommodityManagerImpl commodityManagerImpl=new CommodityManagerImpl();
		commodityManagerImpl.setcommodity("�����", controller);
	}

}
