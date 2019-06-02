package zut.software.peo.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name ="t_User")
public class User {
	private String name;
	private String gender;
	private int age;
	private Peo peo;
	Integer id;
	@Column(name="name")
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	public Integer  getId(){
		return id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	@JoinColumn(name="PEO_ID")
	@ManyToOne
	public Peo getPeo() {
		return peo;
	}
	public void setPeo(Peo peo) {
		this.peo=peo;
	}
}