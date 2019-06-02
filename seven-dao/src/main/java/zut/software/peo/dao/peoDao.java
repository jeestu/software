package zut.software.peo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.peo.Domain.Peo;


public class peoDao {
	public void save(Peo peo) {		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(peo);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Peo peo=entityManager.find(Peo.class,435);
		System.out.println(peo);
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
		Peo peo=entityManager.find(Peo.class, 156);
		peo.setPeoName("用户名");;
		entityManager.merge(peo);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
