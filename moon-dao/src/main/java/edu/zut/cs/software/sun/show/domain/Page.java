package edu.zut.cs.software.sun.show.domain;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name = "page")
public class Page extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)  
	Set<Advertising>Advertisings;
	public Set<Advertising> getAdvertisings() {
		return Advertisings;
	}

	public void setAdvertisings(Set<Advertising> advertisings) {
		Advertisings = advertisings;
	}

	@Column(name = "classname")
	String classname;

	@Override
	public String toString() {
		return "Page [classname=" + classname + "]";
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

}

