package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdminStatus generated by hbm2java
 */
@Entity
@Table(name="admin_status"
    ,catalog="safenets_ramani"
)
public class AdminStatus  implements java.io.Serializable {


     private Integer adminStatusId;
     private String statusName;
     private Integer statusNumber;

    public AdminStatus() {
    }

    public AdminStatus(String statusName, Integer statusNumber) {
       this.statusName = statusName;
       this.statusNumber = statusNumber;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="admin_status_id", unique=true, nullable=false)
    public Integer getAdminStatusId() {
        return this.adminStatusId;
    }
    
    public void setAdminStatusId(Integer adminStatusId) {
        this.adminStatusId = adminStatusId;
    }

    
    @Column(name="status_name", length=100)
    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    
    @Column(name="status_number")
    public Integer getStatusNumber() {
        return this.statusNumber;
    }
    
    public void setStatusNumber(Integer statusNumber) {
        this.statusNumber = statusNumber;
    }




}


