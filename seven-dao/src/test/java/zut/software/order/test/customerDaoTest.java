package zut.software.order.test;

import org.junit.jupiter.api.Test;

import zut.software.order.Domain.Customer;
import zut.software.order.dao.customerDao;

class customerDaoTest {

	@Test
	void test() {
		Customer customer=new Customer();
		customer.setAge(22);
		customer.setCustomerName("bb");
		customer.setTel("22");
		customerDao CustomerDao=new customerDao();
		CustomerDao.save(customer);
		CustomerDao.find();
		CustomerDao.update();
	}

}
