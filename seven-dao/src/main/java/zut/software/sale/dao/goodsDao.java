package zut.software.sale.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import zut.software.sale.Domain.Coupon;
import zut.software.sale.Domain.Goods;

public class goodsDao {
	public void save(Goods goods) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Coupon coupon=goods.getCoupon();
		entityManager.persist(coupon);
		entityManager.persist(goods);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public Goods getGoods() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Goods goods=entityManager.find(Goods.class, 130);
		transaction.commit();
		entityManager.close();
		return goods;
	}
	public void find() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Goods goods=entityManager.find(Goods.class, 130);
		System.out.println(goods.getGoodsName());
		System.out.print(goods.getCoupon().getCouponName());
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void delete() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Goods goods=entityManager.find(Goods.class, 141);
		entityManager.remove(goods);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void delete2(Integer id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Goods goods=entityManager.find(Goods.class, id);
		entityManager.remove(goods);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void update() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("seven-dao");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Goods goods=entityManager.find(Goods.class, 137);
		goods.setGoodsName("≥¨∂Ã»π");;
		entityManager.merge(goods);
		transaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
