package zut.software.order.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.order.Domain.Customer;
import zut.software.order.Domain.Order;

public class customerDao {
	public void save(Customer customer) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(customer);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Customer customer=entityManager.find(Customer.class, 86);
		System.out.println(customer.getCustomerName());
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	//不能直接删除1的一段，因为有外键约束
	public void delete() {
		
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Customer customer=entityManager.find(Customer.class, 90);
		customer.setAge(12341);
		entityManager.merge(customer);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
