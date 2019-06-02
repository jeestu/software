package zut.software.commodit.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_Shelves")
@Entity
public class Shelves {
	private Integer id;
	private String shelvesName;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="SHELVES_NAME")
	public String getShelvesName() {
		return shelvesName;
	}
	public void setShelvesName(String shelvesName) {
		this.shelvesName = shelvesName;
	}
	
	
}
