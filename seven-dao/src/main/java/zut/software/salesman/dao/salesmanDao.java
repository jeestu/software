package zut.software.salesman.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.salesman.Domain.Salesman;
import zut.software.salesman.Domain.SalesmanSup;

public class salesmanDao {
	public void save(Salesman salesman) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		SalesmanSup salesmansup = salesman.getSalesmanSup();
		entityManager.persist(salesmansup);
		entityManager.persist(salesman);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public int star()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Salesman salesman=entityManager.find(Salesman.class,476);
		transaction.commit();
		entityManager.close();
		return salesman.getStar();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Salesman salesman=entityManager.find(Salesman.class,476);
		System.out.println(salesman.getSalesmanName());
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
		Salesman salesman=entityManager.find(Salesman.class, 476);
		entityManager.remove(salesman);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Salesman salesman=entityManager.find(Salesman.class, 476);
		salesman.setAge(12341);
		entityManager.merge(salesman);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
