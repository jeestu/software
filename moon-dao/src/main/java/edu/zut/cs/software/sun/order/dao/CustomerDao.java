package edu.zut.cs.software.sun.order.dao;

import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.order.domain.Customer;
@Repository
public interface CustomerDao extends GenericDao<Customer, Long> {

}
