package edu.zut.cs.software.moon.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.order.service.CustomerManager;

import edu.zut.cs.software.sun.order.dao.CustomerDao;
import edu.zut.cs.software.sun.order.domain.Customer;

@Service
@Transactional
public class CustomerManagerImpl extends GenericManagerImpl<Customer, Long> implements CustomerManager {

	
	CustomerDao customerDao;
	@Autowired
    public void setDao(CustomerDao customerDao)
 {
	 this.customerDao=customerDao;
	 }

	 @Override
	    public Customer save(Customer customer)
	    {
	    	return customerDao.save(customer);
	    	}
	 @Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			dao.deleteById(id);
			
		}
	 public Customer findById(Long id){
	        return customerDao.getOne(id);
	    }
	 @Override
	    public List<Customer> findAll()
	 {
		 return dao.findAll();
		 }

}
