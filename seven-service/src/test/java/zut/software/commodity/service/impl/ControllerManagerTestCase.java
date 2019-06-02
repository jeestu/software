package zut.software.commodity.service.impl;

import org.junit.jupiter.api.Test;

import zut.software.commodity.Domain.Controller;

public class ControllerManagerTestCase {

@Test
	
	public void set() {
		Controller controller=new Controller();
		 controller.setAge(21);
		 controller.setControllerName("wangxi");
		 controller.setTel("123456");
		CommodityManagerImpl commodityManagerImpl=new CommodityManagerImpl();
		commodityManagerImpl.setcommodity("¼ÆËã»ú", controller);
		 
		
	}
}

