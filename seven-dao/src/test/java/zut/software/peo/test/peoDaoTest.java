package zut.software.peo.test;

import org.junit.jupiter.api.Test;

import zut.software.peo.Domain.Peo;
import zut.software.peo.dao.peoDao;

public class peoDaoTest {
	@Test
	void test() {
		Peo peo=new Peo();
		peo.setPeoName("yan");
		peo.setStname("n");
		peoDao PeoDao=new peoDao();
		PeoDao.save(peo);
		PeoDao.find();
		PeoDao.update();
	}
}
