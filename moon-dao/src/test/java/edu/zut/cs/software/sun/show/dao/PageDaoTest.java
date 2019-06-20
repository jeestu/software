package edu.zut.cs.software.sun.show.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.show.domain.Page;

@Rollback(value = false)
public class PageDaoTest extends GenericDaoTestCase<Long, Page, PageDao>{
	
	private static final Logger logger = LogManager.getLogger(PageDaoTest.class.getName());
	
	private PageDao pageDao;

	@Autowired
	public void setPageDao(PageDao pageDao) {
		this.pageDao = pageDao;
	}
	@Test
	public void testsave() {
		Page page = new Page();
		page.setClassname("ʳƷ");
		pageDao.saveAndFlush(page);
	}
	

}
