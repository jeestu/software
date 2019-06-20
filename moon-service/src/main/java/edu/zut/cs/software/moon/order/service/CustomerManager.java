package edu.zut.cs.software.moon.order.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;

import edu.zut.cs.software.sun.order.domain.Customer;

public interface CustomerManager extends GenericManager<Customer, Long> {
	Customer save(Customer customer);
	Customer findById(Long id);
	List<Customer> findAll();
	  
	void deleteById(Long id);
}
