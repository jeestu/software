package zut.software.show.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.show.Domain.Page;

public class PageDao {
	
	public void save(Page page) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(page);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql = "SELECT P.classname FROM Page P";
		List<Page>page = entityManager.createQuery(jpql).getResultList();
		System.out.println(page);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Page page=entityManager.find(Page.class, 460);
		page.setClassname("·þ×°");
		entityManager.merge(page);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
