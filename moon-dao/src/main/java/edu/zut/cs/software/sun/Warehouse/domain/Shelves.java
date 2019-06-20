package edu.zut.cs.software.sun.Warehouse.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;




@Entity
@Table(name = "Shelves")
public class Shelves extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String shelvesName;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="SHELVES_NAME")
	public String getShelvesName() {
		return shelvesName;
	}
	public void setShelvesName(String shelvesName) {
		this.shelvesName = shelvesName;
	}
	
	
	@Override
	public String toString() {
		return "Shelves [id=" + id + ","
				+ " shelvesName=" + shelvesName + "]";
	}
	
	
	
	
}
