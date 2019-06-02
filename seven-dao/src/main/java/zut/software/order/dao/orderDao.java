package zut.software.order.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.order.Domain.Customer;
import zut.software.order.Domain.Order;

public class orderDao {
	public void save(Order order) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Customer customer=order.getCustomer();
		entityManager.persist(customer);
		entityManager.persist(order);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Order order=entityManager.find(Order.class, 87);
		System.out.println(order.getOrderName());
		System.out.print(order.getCustomer().getCustomerName());
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void delete() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Order order=entityManager.find(Order.class, 100);
		entityManager.remove(order);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Order order=entityManager.find(Order.class, 117);
		order.setOrderName("nwt_wudi");
		entityManager.merge(order);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
