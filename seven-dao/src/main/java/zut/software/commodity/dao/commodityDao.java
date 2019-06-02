package zut.software.commodity.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.commodity.Domain.Controller;
import zut.software.commodity.Domain.Commodity;

public class commodityDao {

	public void save(Commodity commodity) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Controller controller=commodity.getController();
		entityManager.persist(controller);
		entityManager.persist(commodity);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Commodity commodity=entityManager.find(Commodity.class, 327);
		System.out.println(commodity.getCommodityName());
		System.out.print(commodity.getController().getControllerName());
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void delete() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Commodity commodity=entityManager.find(Commodity.class, 317);
		entityManager.remove(commodity);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Commodity commodity=entityManager.find(Commodity.class, 329);
		commodity.setCommodityName("¼ÆËã»ú");
		commodity.setPrice(15);
		entityManager.merge(commodity);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
