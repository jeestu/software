package zut.software.salesman.test;

import org.junit.jupiter.api.Test;

import zut.software.salesman.Domain.Salesman;
import zut.software.salesman.Domain.SalesmanSup;
import zut.software.salesman.dao.salesmanDao;

public class salesmanDaoTest {
	@Test
	void test() {
		SalesmanSup salesmansup= new SalesmanSup();
		salesmansup.setAge(20);
		salesmansup.setSalesmansupName("peng");
		salesmansup.setTel("445566");
		Salesman salesman=new Salesman();
		salesman.setAge(18);
		salesman.setSalesmanName("pp");
		salesman.setTel("112233");
		salesman.setStar(5);
		salesman.setSalesmanSup(salesmansup);
		salesmanDao SalesmanDao=new salesmanDao();
		SalesmanDao.save(salesman);
		SalesmanDao.update();

}
}
