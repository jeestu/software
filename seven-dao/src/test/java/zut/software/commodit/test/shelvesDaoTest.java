package zut.software.commodit.test;

import org.junit.jupiter.api.Test;

import zut.software.commodit.Domain.Shelves;
import zut.software.commodit.dao.shelvesDao;

class shelvesDaoTest {

	@Test
	void test() {
		Shelves shelves=new Shelves();
		
		shelves.setShelvesName("одлЛ");
		shelvesDao ShelvesDao=new shelvesDao();
		ShelvesDao.save(shelves);
		ShelvesDao.find();
		ShelvesDao.update();
	}

}
