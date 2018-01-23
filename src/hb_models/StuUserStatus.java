package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuUserStatus generated by hbm2java
 */
@Entity
@Table(name="stu_user_status"
    ,catalog="safenets_ramani"
)
public class StuUserStatus  implements java.io.Serializable {


     private Integer idstuUserStatus;
     private Integer stuUserStatusCode;
     private String stuUserStatusName;
     private String stuUserInfoId;

    public StuUserStatus() {
    }

    public StuUserStatus(Integer stuUserStatusCode, String stuUserStatusName, String stuUserInfoId) {
       this.stuUserStatusCode = stuUserStatusCode;
       this.stuUserStatusName = stuUserStatusName;
       this.stuUserInfoId = stuUserInfoId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idstu_user_status", unique=true, nullable=false)
    public Integer getIdstuUserStatus() {
        return this.idstuUserStatus;
    }
    
    public void setIdstuUserStatus(Integer idstuUserStatus) {
        this.idstuUserStatus = idstuUserStatus;
    }

    
    @Column(name="stu_user_status_code")
    public Integer getStuUserStatusCode() {
        return this.stuUserStatusCode;
    }
    
    public void setStuUserStatusCode(Integer stuUserStatusCode) {
        this.stuUserStatusCode = stuUserStatusCode;
    }

    
    @Column(name="stu_user_status_name", length=50)
    public String getStuUserStatusName() {
        return this.stuUserStatusName;
    }
    
    public void setStuUserStatusName(String stuUserStatusName) {
        this.stuUserStatusName = stuUserStatusName;
    }

    
    @Column(name="stu_user_info_id", length=50)
    public String getStuUserInfoId() {
        return this.stuUserInfoId;
    }
    
    public void setStuUserInfoId(String stuUserInfoId) {
        this.stuUserInfoId = stuUserInfoId;
    }




}


