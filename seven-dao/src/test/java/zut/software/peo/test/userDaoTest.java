package zut.software.peo.test;


import org.junit.jupiter.api.Test;

import zut.software.peo.Domain.Peo;
import zut.software.peo.Domain.User;
import zut.software.peo.dao.userDao;

public class userDaoTest {
	
	@Test
	void test() {
		User user=new User();
		Peo peo=new Peo();
		peo.setPeoName("π‹¿Ì");
		peo.setStname("…®µÿ");
		user.setPeo(peo);
	    user.setAge(20);
		user.setGender("men");
		user.setName("zzm");
		userDao UserDao=new userDao();
		UserDao.save(user);
		UserDao.find();
	    UserDao.update();
	}
}
