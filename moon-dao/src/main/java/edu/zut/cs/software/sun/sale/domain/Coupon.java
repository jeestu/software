package edu.zut.cs.software.sun.sale.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name="Coupon")
public class Coupon extends BaseEntity {
	private int lowPrice;
	private String couponName;
	public int getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(int lowPrice) {
		this.lowPrice = lowPrice;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	
}
