package edu.zut.cs.software.moon.order.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.order.service.OrderManager;

import edu.zut.cs.software.sun.order.dao.OrderDao;
import edu.zut.cs.software.sun.order.domain.Order;
import edu.zut.cs.software.sun.order.domain.Order_Up;
@Service
@Transactional
public class OrderManagerImpl extends GenericManagerImpl<Order, Long> implements OrderManager{

	OrderDao orderDao;
    @Autowired
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	 @Override
	    public Order save(Order order){return orderDao.save(order);}

	 @Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 orderDao.deleteById(id);
		}
	
		public Order findById(Long id){
	        return orderDao.getOne(id);
	    }
	    
	
	
	 @Override public List<Order> findAll(){return orderDao.findAll();}
	@Override
	public void upd(Order order) {
		// TODO Auto-generated method stub
		Order_Up.getintstan().upd(order);
	}
	@Override
	public Order findone(String orderName) {
		// TODO Auto-generated method stub
		Order o=Order_Up.getintstan().findOne(orderName);
		return o;
		
	}
	@Override
	public void deleteByName(String ordername) {
		// TODO Auto-generated method stub
		Order_Up.getintstan().del(ordername);
	} 
	 
}
