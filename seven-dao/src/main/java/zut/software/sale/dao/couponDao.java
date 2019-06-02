package zut.software.sale.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.sale.Domain.Coupon;

public class couponDao {
	public void save(Coupon coupon) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(coupon);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Coupon coupon=entityManager.find(Coupon.class, 131);
		System.out.println(coupon);
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
		Coupon coupon=entityManager.find(Coupon.class, 133);
		coupon.setCouponName("��300����30");
		entityManager.merge(coupon);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
