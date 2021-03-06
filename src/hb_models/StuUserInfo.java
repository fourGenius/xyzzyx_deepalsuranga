package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuUserInfo generated by hbm2java
 */
@Entity
@Table(name="stu_user_info"
    ,catalog="safenets_ramani"
)
public class StuUserInfo  implements java.io.Serializable {


     private Integer idstuUserInfo;
     private String stuUserInfoId;
     private String stuUserInfoEmail;
     private String stuUserInfoPassword;
     private String stuUserInfoStatus;

    public StuUserInfo() {
    }

    public StuUserInfo(String stuUserInfoId, String stuUserInfoEmail, String stuUserInfoPassword, String stuUserInfoStatus) {
       this.stuUserInfoId = stuUserInfoId;
       this.stuUserInfoEmail = stuUserInfoEmail;
       this.stuUserInfoPassword = stuUserInfoPassword;
       this.stuUserInfoStatus = stuUserInfoStatus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idstu_user_info", unique=true, nullable=false)
    public Integer getIdstuUserInfo() {
        return this.idstuUserInfo;
    }
    
    public void setIdstuUserInfo(Integer idstuUserInfo) {
        this.idstuUserInfo = idstuUserInfo;
    }

    
    @Column(name="stu_user_info_id", length=50)
    public String getStuUserInfoId() {
        return this.stuUserInfoId;
    }
    
    public void setStuUserInfoId(String stuUserInfoId) {
        this.stuUserInfoId = stuUserInfoId;
    }

    
    @Column(name="stu_user_info_email", length=100)
    public String getStuUserInfoEmail() {
        return this.stuUserInfoEmail;
    }
    
    public void setStuUserInfoEmail(String stuUserInfoEmail) {
        this.stuUserInfoEmail = stuUserInfoEmail;
    }

    
    @Column(name="stu_user_info_password")
    public String getStuUserInfoPassword() {
        return this.stuUserInfoPassword;
    }
    
    public void setStuUserInfoPassword(String stuUserInfoPassword) {
        this.stuUserInfoPassword = stuUserInfoPassword;
    }

    
    @Column(name="stu_user_info_status", length=45)
    public String getStuUserInfoStatus() {
        return this.stuUserInfoStatus;
    }
    
    public void setStuUserInfoStatus(String stuUserInfoStatus) {
        this.stuUserInfoStatus = stuUserInfoStatus;
    }




}


