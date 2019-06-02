package zut.software.sale.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name="t_Goods")
@Entity
public class Goods {
	private String goodsName;
	private double price;
	private double afterCoupon_price;
	@Transient
	public double getAfterCoupon_price() {
		return afterCoupon_price;
	}
	public void setAfterCoupon_price(double afterCoupon_price) {
		this.afterCoupon_price = afterCoupon_price;
	}
	private Integer id;
	private Coupon coupon;
	@Column(name="GOODS_NAME")
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@JoinColumn(name="COUPON_ID")
	@ManyToOne
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
}
