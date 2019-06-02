package zut.software.salesman.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.salesman.Domain.SalesmanSup;

public class salesmansupDao {
	public void save(SalesmanSup salesmansup) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(salesmansup);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		SalesmanSup salesmansup=entityManager.find(SalesmanSup.class, id);
		System.out.println(salesmansup.getSalesmansupName());
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	//不能直接删除1的一段，因为有外键约束
	public void delete() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		SalesmanSup salesmansup=entityManager.find(SalesmanSup.class, 466);
		entityManager.remove(salesmansup);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		SalesmanSup salesmansup=entityManager.find(SalesmanSup.class, 466);
		salesmansup.setAge(12341);
		entityManager.merge( salesmansup);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
