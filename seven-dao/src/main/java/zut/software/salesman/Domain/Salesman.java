package zut.software.salesman.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="t_Salesman")
@Entity
public class Salesman {
	private Integer id;
	private String salesmanName;
	private int age;
	private int star;
	private String tel;
	private SalesmanSup salesmansup;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="SALESMAN_NAME")
	public String getSalesmanName() {
		return salesmanName;
	}
	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
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
	public int getStar()
	{
		return star;
	}
	public void setStar(int star)
	{
		this.star=star;
	}
	@JoinColumn(name="SUP_ID")
	@ManyToOne
	public SalesmanSup getSalesmanSup() {
		return salesmansup;
	}
	public void setSalesmanSup(SalesmanSup salesmansup) {
		this.salesmansup = salesmansup;
	}
}
