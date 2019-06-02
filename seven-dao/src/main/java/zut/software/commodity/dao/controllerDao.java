package zut.software.commodity.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.commodity.Domain.Controller;

public class controllerDao {

	public void save(Controller controller) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(controller);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Controller controller=entityManager.find(Controller.class, 326);
		System.out.println(controller.getControllerName());
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	//����ֱ��ɾ��1��һ�Σ���Ϊ�����Լ��
	public void delete() {
		
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Controller controller=entityManager.find(Controller.class, 328);
		controller.setAge(12341);
		entityManager.merge(controller);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}

