package zut.software.commodity.test;

import org.junit.jupiter.api.Test;

import zut.software.commodity.Domain.Commodity;
import zut.software.commodity.Domain.Controller;
import zut.software.commodity.dao.commodityDao;

public class commodityDaoTest {

	@Test
	void test() { 
		Controller controller =new Controller();
		 controller.setAge(21);
		 controller.setControllerName("wangxi");
		 controller.setTel("123456");
		Commodity commodity=new Commodity();
		commodity.setController(controller);
		commodity.setCommodityName("�����");
		commodity.setPrice(15);
		commodityDao CommodityDao=new commodityDao();
		CommodityDao.save(commodity);
		CommodityDao.find();
		//CommodityDao.delete();//ע��ÿ�ζ�Ҫ����ע��ID
		CommodityDao.update();
	}

}
