package edu.zut.cs.software.sun.commodity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name = "Merchant")
public class Merchant extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String merchantName;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="Merchant_name")
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	
	
	@Override
	public String toString() {
		return "Merchant [id=" + id + ","
				+ " merchantName=" + merchantName + "]";
	}
	
	
	
	
}
