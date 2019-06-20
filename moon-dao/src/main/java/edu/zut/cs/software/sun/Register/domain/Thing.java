package edu.zut.cs.software.sun.Register.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name = "Thing")
public class Thing extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String ThingName;
	private String Count;
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="THING_NAME")
	public String getThingName() {
		return ThingName;
	}
	public void setThingName(String thingName) {
		ThingName = thingName;
	}
	@Column(name="THING_COUNT")
	public String getCount() {
		return Count;
	}
	public void setCount(String count) {
		Count = count;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Thing [id=" + id + ", ThingName=" 
	             + ThingName + ", "
	             		+ "Count=" + Count + "]";
	}
	
	
}
