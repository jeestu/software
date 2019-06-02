package zut.software.commodity.test;

import org.junit.jupiter.api.Test;

import zut.software.commodity.Domain.Controller;
import zut.software.commodity.dao.controllerDao;

public class controllerDaoTest {

	@Test
	void test() {
		Controller controller=new Controller();
		controller.setAge(21);
		controller.setControllerName("wangxi");
		controller.setTel("123456");
		controllerDao ControllerDao=new controllerDao();
		ControllerDao.save(controller);
		ControllerDao.find();
		ControllerDao.update();
	}

}
