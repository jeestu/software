package zut.software.order.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import zut.software.order.Domain.Customer;

class OrderManagerImplTest {

	@Test
	void test() {
		Customer customer=new Customer();
		customer.setAge(20);
		customer.setCustomerName("zhang");
		customer.setTel("222");
		//customerDao CustomerDao=new customerDao();
		//CustomerDao.save(customer);
		OrderManagerImpl orderManagerImpl=new OrderManagerImpl();
		orderManagerImpl.setorder("pyy", customer);
	}

}
