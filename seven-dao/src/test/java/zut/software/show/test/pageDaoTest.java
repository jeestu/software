package zut.software.show.test;

import org.junit.jupiter.api.Test;

import zut.software.show.Domain.Page;
import zut.software.show.dao.PageDao;

public class pageDaoTest {
	
	@Test
	void test() {
		Page page = new Page();
		PageDao pageDao = new PageDao();
		page.setPageName("���ֵ���ƽ̨");
		page.setClassname("ϴ����Ʒ");
		pageDao.save(page);
		pageDao.find();
		pageDao.update();
	}

}
