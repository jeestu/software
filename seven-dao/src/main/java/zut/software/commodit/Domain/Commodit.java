package zut.software.commodit.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="t_Commodits")
@Entity
public class Commodit {
	private Integer id;
	private String commoditName;
	private Shelves shelves;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="COMMODIT_NAME")
	public String getCommoditName() {
		return commoditName;
	}
	public void setCommoditName(String commoditName) {
		this.commoditName = commoditName;
	}
	@JoinColumn(name="SHELVES_ID")
	@ManyToOne(fetch=FetchType.LAZY)
	public Shelves getShelves() {
		return shelves;
	}
	public void setShelves(Shelves shelves) {
		this.shelves = shelves;
	}
	
}
