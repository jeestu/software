package zut.software.show.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_Page")
@Entity
public class Page {
	
	private Integer id;
	private String classname;
	private String pageName;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getClassname() {
		return classname;
	}
	@Column(name="Page_NAME")
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}

}
