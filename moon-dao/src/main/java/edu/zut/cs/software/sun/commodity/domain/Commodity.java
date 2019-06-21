package edu.zut.cs.software.sun.commodity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name="T_Commodity")
public class Commodity  extends BaseEntity{
	
	private static final long serialVersionUID = -6842605178535089506L;
	private Long id;
	private String commodityName;
	private String commoditySort;
	private float commodityPrice;
	private Merchant merchant;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="Commdity_name")
	public String getCommodityName() {
		return commodityName;
	}
		
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	@Column(name="Commdity_sort")
	public String getCommoditySort() {
		return commoditySort;
	}
		
	public void setCommoditySort(String commoditySort) {
		this.commoditySort = commoditySort;
	}
	@Column(name="Commdity_price")
	public float getCommodityPrice() {
		return commodityPrice;
	}
		
	public void setCommodityPrice(float commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	@JoinColumn(name="Merchant_id")
	@ManyToOne(fetch=FetchType.LAZY)
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	
	}
	

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", "
				+ "commodityName=" + commodityName + ","
				+ "commoditySort=" + commoditySort + ","
				+ "commodityPrice=" + commodityPrice + ","
						+ " merchant=" + merchant + "]";
	}
	


}
