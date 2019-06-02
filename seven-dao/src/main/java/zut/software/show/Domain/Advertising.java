package zut.software.show.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="t_Advertising")
@Entity
public class Advertising {
	private Integer id;
	private String advertisingName;
	private Page page;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="Advertising_NAME")
	public String getAdvertisingName() {
		return advertisingName;
	}
	public void setAdvertisingName(String advertisingName) {
		this.advertisingName = advertisingName;
	}
	@JoinColumn(name="Page_ID")
	@ManyToOne(fetch=FetchType.LAZY)
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

}
