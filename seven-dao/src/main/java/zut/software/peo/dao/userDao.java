package zut.software.peo.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.peo.Domain.Peo;
import zut.software.peo.Domain.User;

public class userDao {
	public void save(User user) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Peo peo=user.getPeo();
		entityManager.persist(peo);
		entityManager.persist(user);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public User getUser() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		User user=entityManager.find(User.class,440);
		transaction.commit();
		entityManager.close();
		return user;
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		User user=entityManager.find(User.class, 436);
		System.out.println(user.getAge());
		System.out.println(user.getGender());
		System.out.print(user.getPeo().getPeoName());
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void delete() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		User user=entityManager.find(User.class, 432);
		entityManager.remove(user);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void delete2(Integer id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		User user=entityManager.find(User.class, id);
		entityManager.remove(user);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		User user=entityManager.find(User.class, 376);
		user.setName("ygbn");
		entityManager.merge(user);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
