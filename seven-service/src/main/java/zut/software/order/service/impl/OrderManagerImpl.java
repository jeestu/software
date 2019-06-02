package zut.software.order.service.impl;

import zut.software.order.Domain.Customer;
import zut.software.order.Domain.Order;
import zut.software.order.dao.orderDao;
import zut.software.order.service.OrderManager;

public class OrderManagerImpl implements OrderManager {
	/*orderDao orderdao;

	public orderDao getOrderdao() {
		return orderdao;
	}

	public void setOrderdao(orderDao orderdao) {
		this.orderdao = orderdao;
	}*/
	@Override
	public void setorder(String orderName,Customer c) {
		OrderManagerImpl orderManagerImpl=new OrderManagerImpl();
		orderDao OrderDao=new orderDao();
		Order o=new Order(); 
		o.setCustomer(c);
		o.setOrderName(orderName);
		OrderDao.save(o);
		//orderManagerImpl.getOrderdao().save(o);
		
	}
	
}
