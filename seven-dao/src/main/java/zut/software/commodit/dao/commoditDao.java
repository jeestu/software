package zut.software.commodit.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.commodit.Domain.Commodit;

import zut.software.commodit.Domain.Shelves;

public class commoditDao {
	public void save(Commodit commodit) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Shelves shelves=commodit.getShelves();
		
		shelves.setShelvesName("¶¬Ìì");
		
		commodit.setCommoditName("´ÖÁ¸");
		entityManager.persist(shelves);
		entityManager.persist(commodit);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Commodit commodit=entityManager.find(Commodit.class, 312);
		System.out.println(commodit.getCommoditName());
		System.out.print(commodit.getShelves().getShelvesName());
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void delete() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Commodit commodit=entityManager.find(Commodit.class, 305);
		entityManager.remove(commodit);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Commodit commodit=entityManager.find(Commodit.class, 312);
		commodit.setCommoditName("ÀÏ±ù¹÷");
		entityManager.merge(commodit);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void testGroupBy()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		
		Shelves shelves =new Shelves();
		String jpql="select COMMODIT_NAME from t_Commodits";
		List<Commodit>commodit=entityManager.createNativeQuery(jpql).getResultList();
		System.out.println(commodit);
		//System.out.print(commodit.getShelves().getShelvesName());
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
}
