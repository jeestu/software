package edu.zut.cs.software.sun.show.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name = "advertising")
public class Advertising extends BaseEntity{
	
	private static final long serialVersionUID = 1L;

	@Column(name = "price")
	int price;
	
	@Column(name = "name")
	String AdvertsingName;
	
	@Override
	public String toString() {
		return "advertising [AdvertsingName=" + AdvertsingName + ", AdvertsingClass=" + AdvertsingClass + ", price="
				+ price + "]";
	}

	@Column(name = "class")
	String AdvertsingClass;
	
	public String getAdvertsingName() {
		return AdvertsingName;
	}

	public void setAdvertsingName(String advertsingName) {
		AdvertsingName = advertsingName;
	}

	public String getAdvertsingClass() {
		return AdvertsingClass;
	}

	public void setAdvertsingClass(String advertsingClass) {
		AdvertsingClass = advertsingClass;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
	
