package zut.software.show.test;

import org.junit.jupiter.api.Test;

import zut.software.show.Domain.Advertising;
import zut.software.show.Domain.Page;
import zut.software.show.dao.AdvertisingDao;

public class advertisingDaoTest {
	
	@Test
	void test() {
		
		Advertising advertising = new Advertising();
		Page page = new Page();
		page.setPageName("���ֵ���ƽ̨");
		page.setClassname("ϴ����Ʒ");
		advertising.setAdvertisingName("ϴ����");
		advertising.setPage(page);
		AdvertisingDao advertisingDao = new AdvertisingDao();
		advertisingDao.save(advertising);
		advertisingDao.find();
		advertisingDao.update();
		
	}

}
