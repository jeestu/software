package edu.zut.cs.software.sun.sale.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name="Goods")
public class Goods extends BaseEntity {
	private static final long serialVersionUID=1L;
	@Column(name="Goods_Name")
	private String goodsName;
	@Column(name="Goods_Price")
	private Double goodsPrice;
	@ManyToOne
	@JoinColumn(name="coupon_id")
	private Coupon coupon;
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	@JsonBackReference
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	
}
