package zut.software.salesman.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_SalesmanSup")
@Entity
public class SalesmanSup {
	private Integer id;
	private String salesmansupName;
	private int age;
	private String tel;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="SALESMANSUP_NAME")
	public String getSalesmansupName() {
		return salesmansupName;
	}
	public void setSalesmansupName(String salesmansupName) {
		this.salesmansupName = salesmansupName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}