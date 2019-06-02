package zut.software.order.service.impl;

import org.hibernate.criterion.Order;

import zut.software.order.Domain.Customer;
import zut.software.order.dao.customerDao;
import zut.software.order.service.CustomerManager;


public class CutomerManagerImpl implements CustomerManager {
	customerDao customerdao;

	public customerDao getCustomerdao() {
		return customerdao;
	}
	
	public void setCustomerdao(customerDao customerdao) {
		this.customerdao = customerdao;
	}
	@Override
	public void setCustomer(Customer cu) {
		CutomerManagerImpl cutomerManagerImpl=new CutomerManagerImpl();
		Customer c=new Customer();
		c.setCustomerName(cu.getCustomerName());
		c.setAge(cu.getAge());
		c.setTel(cu.getTel());
		customerdao.save(c);
		cutomerManagerImpl.getCustomerdao().save(c);
		OrderManagerImpl orderManagerImpl=new OrderManagerImpl();
		orderManagerImpl.setorder("one", c);
	}
}
