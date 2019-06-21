package edu.zut.cs.software.sun.Warehouse.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.software.moon.base.domain.BaseEntity;



@Entity
@Table(name = "Shelvesgood")
public class Shelvesgoods extends BaseEntity{
	
	private static final long serialVersionUID = 5521218170469636598L;
	
		private Long id;
		@Column(name="COMMODIT_NAME")
		private String commoditName;
		private Shelves shelves;
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Id
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
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
		

		@Override
		public String toString() {
			return "Goods [id=" + id + ", "
					+ "commoditName=" + commoditName + ","
							+ " shelves=" + shelves + "]";
		}
		
		
		
}
