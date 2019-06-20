package edu.zut.cs.software.sun.salesman.domain;
import edu.zut.cs.software.moon.base.domain.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "salesmansup")
public class Salesmansup extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

    @Column(name = "salesmansup-name")
    private String salesmansupName;

    @Column(name = "salesmansup_number")
    private String salesmansupNumber;

    @Column(name = "salesmansup-count")
    private int salesmansupCount;		


    public String getSalesmansupName() {
        return salesmansupName;
    }

    public void setSalesmansupName(String selesmansupName) {
        this.salesmansupName = selesmansupName;
    }

    public String getSalesmansupNumber() {
        return salesmansupNumber;
    }

    public void setSalesmansupNumber(String selesmansupNumber) {
        this.salesmansupNumber= selesmansupNumber;
    }

    public int getSalesmansupcount() {
        return salesmansupCount;
    }

    public void setSalesmansupcount(int salesmansupcount) {
        this.salesmansupCount = salesmansupcount;
    }

    @Override
    public String toString() {
        return "SELESMAN{" +
                " salesmansupName='" + salesmansupName + '\'' +
                ", salesmansupNumber='" + salesmansupNumber + '\'' +
                ", salesmansupcount=" + salesmansupCount +
                '}';
    }


}
