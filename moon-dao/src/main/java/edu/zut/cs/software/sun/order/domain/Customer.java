package edu.zut.cs.software.sun.order.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name="t_customer")
public class Customer extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3297789844831798634L;
	
	private Long id;
	private String Name;
    private String Address;
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="NAME")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Column(name="ADDRESS")
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
    
}
