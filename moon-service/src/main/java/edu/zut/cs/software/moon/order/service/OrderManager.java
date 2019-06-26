package edu.zut.cs.software.moon.order.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;

import edu.zut.cs.software.sun.order.domain.Order;

public interface OrderManager extends GenericManager<Order, Long> {

	Order save(Order order);
	Order findById(Long id);
	 public void deleteById(Long id);
	 void upd(Order order);
	    List<Order> findAll();
	    Order findone(String orderName);
	    public void deleteByName(String ordername);
}
