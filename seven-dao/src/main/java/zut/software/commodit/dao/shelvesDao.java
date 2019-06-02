package zut.software.commodit.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import zut.software.commodit.Domain.Commodit;
import zut.software.commodit.Domain.Shelves;

public class shelvesDao {
	
	public void save(Shelves shelves) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(shelves);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Shelves shelves=entityManager.find(Shelves.class, 244);
		System.out.println(shelves.getShelvesName());
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
		Shelves shelves=entityManager.find(Shelves.class, 244);
		//shelves.setSite(33);
		entityManager.merge(shelves);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
	
	
	
	
}
