package zut.software.peo.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_Peo")
public class Peo {
		private Integer id;
		private String PeoName;
		private String Stl;
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
		@Id
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		@Column(name="PEO_NAME")
		public String getPeoName() {
			return PeoName;
		}
		public void setPeoName(String peoName) {
			this.PeoName = peoName;
		}
		@Column(name="STL")
		public String getStname(){
			return Stl;
		}
		public void setStname(String Stl) {
			this.Stl=Stl;
		}
	}