package zut.software.order.service;

import zut.software.order.Domain.Customer;

public interface OrderManager {
	public void setorder(String orderName,Customer c);
}
