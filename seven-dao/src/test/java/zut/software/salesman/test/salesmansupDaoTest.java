package zut.software.salesman.test;

import org.junit.jupiter.api.Test;

import zut.software.salesman.Domain.SalesmanSup;
import zut.software.salesman.dao.salesmansupDao;

public class salesmansupDaoTest {
	@Test
	void test() {
		SalesmanSup salesmansup=new SalesmanSup();
		salesmansup.setAge(18);
		salesmansup.setSalesmansupName("beibei");
		salesmansup.setTel("112233");
		salesmansupDao SalesmansupDao=new salesmansupDao();
		SalesmansupDao.save(salesmansup);
		SalesmansupDao.find(466);
		SalesmansupDao.update();

}
}
