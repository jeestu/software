package edu.zut.cs.software.sun.order.domain;

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
@Table(name="t_order")
public class Order extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7866797411730357690L;
	
	private Long id;
	private String order_Name;
	private Customer customer;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="ORDERNAME")
	public String getOrder_Name() {
		return order_Name;
	}
	public void setOrder_Name(String order_Name) {
		this.order_Name = order_Name;
	}
	@JoinColumn(name="CUSTOMER_ID")
	@ManyToOne(fetch=FetchType.LAZY)
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", order_Name=" + order_Name + ", customer=" + customer + "]";
	}
	

}
