package zut.software.show.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.show.Domain.Page;
import zut.software.show.Domain.Advertising;

public class AdvertisingDao {
	
	public void save(Advertising advertising) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Page page=advertising.getPage();
		entityManager.persist(page);
		entityManager.persist(advertising);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql = "FROM Advertising A";
		List<Advertising>advertising = entityManager.createQuery(jpql).getResultList();
		System.out.println(advertising);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void delete() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Advertising advertising=entityManager.find(Advertising.class, 100);
		entityManager.remove(advertising);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Advertising advertising=entityManager.find(Advertising.class, 460);
		advertising.setAdvertisingName("Ï´ÃæÄÌ");
		entityManager.merge(advertising);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
