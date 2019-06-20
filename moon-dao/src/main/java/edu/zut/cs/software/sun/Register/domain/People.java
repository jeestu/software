package edu.zut.cs.software.sun.Register.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name = "People")
public class People extends BaseEntity{
	
	private static final long serialVersionUID = 5521218170469636598L;
	private String PeopleName;
	private String PeopleAge;
	private String PeopleSet;
	private long id;
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="PEOPLE_NAME")
	public String getPeoplename() {
		return PeopleName;
	}
	public void setPeoplename(String peoplename) {
		PeopleName = peoplename;
	}
	@Column(name="PEOPLE_AGE")
	public String getPeopleage() {
		return PeopleAge;
	}
	public void setPeopleage(String peopleage) {
		PeopleAge = peopleage;
	}
	@Column(name="PEOPEL_SET")
	public String getPeopleset() {
		return PeopleSet;
	}
	public void setPeopleset(String peopleset) {
		PeopleSet = peopleset;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	//@JoinColumn(name="SHELVES_ID")
	@Override
	public String toString() {
		return "People [Peoplename=" + PeopleName + 
				", Peopleage=" + PeopleAge + ", Peopleset=" +
				PeopleSet + "]";
	}
	
}
