package edu.zut.cs.software.sun.show.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;


@Entity
@Table(name = "clothes")
public class Clothes extends BaseEntity{

	private static final long serialVersionUID = 55212181704663658L;
	

	private Long id;
	@Column(name="SName")
	private String name;
	@Column(name="SPrice")
	private String price;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
