package zut.software.order.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import zut.software.order.Domain.Customer;
import zut.software.order.Domain.Order;
import zut.software.order.dao.orderDao;

class orderDaoTest {

	@Test
	void test() {
		Customer customer =new Customer();
		customer.setAge(21);
		customer.setCustomerName("douyu");
		customer.setTel("11321");
		Order order=new Order();
		order.setCustomer(customer);
		order.setOrderName("nwt");
		orderDao OrderDao=new orderDao();
		OrderDao.save(order);
		OrderDao.find();
		//OrderDao.delete();//注意每次都要重新注入ID
		OrderDao.update();
	}
}
