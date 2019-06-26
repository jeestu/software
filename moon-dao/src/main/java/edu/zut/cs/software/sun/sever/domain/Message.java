package edu.zut.cs.software.sun.sever.domain;

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
import edu.zut.cs.software.sun.order.domain.Customer;

@Entity
@Table(name="t_message")
public class Message extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6918422765278366449L;
	Long id;
	String customerName;
	String message;
	Customer customer;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="CUSTOMERNAME")
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column(name="MESSAGE")
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
		return "Message [id=" + id + ", customerName=" + customerName + ", message=" + message + ", customer="
				+ customer + "]";
	}
	
	
}
