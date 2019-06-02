package zut.software.sale.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_Coupon")
public class Coupon {
	private Integer id;
	private String couponName;
	int lowPrice;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="COUPON_NAME")
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public int getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(int lowPrice) {
		this.lowPrice = lowPrice;
	}
	
}
