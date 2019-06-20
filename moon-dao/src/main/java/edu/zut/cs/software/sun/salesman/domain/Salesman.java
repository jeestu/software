package edu.zut.cs.software.sun.salesman.domain;
import edu.zut.cs.software.moon.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "salesman")
public class Salesman extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "salesman-name")
    private String salesmanName;

    @Column(name = "salesman_number")
    private String salesmanNumber;

    @Column(name = "salesman-star")
    private int salesmanStar;		


    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String selesmanName) {
        this.salesmanName = selesmanName;
    }

    public String getSalesmanNumber() {
        return salesmanNumber;
    }

    public void setSalesmanNumber(String selesmanNumber) {
        this.salesmanNumber= selesmanNumber;
    }

    public int getSalesmanstar() {
        return salesmanStar;
    }

    public void setSalesmanStar(int salesmanStar) {
        this.salesmanStar = salesmanStar;
    }

    @Override
    public String toString() {
        return "SELESMAN{" +
                " salesmanName='" + salesmanName + '\'' +
                ", salesmanNumber='" + salesmanNumber + '\'' +
                ", salesmanStar=" + salesmanStar +
                '}';
    }

}