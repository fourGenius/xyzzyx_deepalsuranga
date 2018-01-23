package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuInfoContact generated by hbm2java
 */
@Entity
@Table(name="stu_info_contact"
    ,catalog="safenets_ramani"
)
public class StuInfoContact  implements java.io.Serializable {


     private Integer idstuInfoTelephone;
     private String stuUserInfoId;
     private String stuInfoTelephoneMobile;
     private String stuInfoTelephoneLand;
     private String stuInfoContactEmail;

    public StuInfoContact() {
    }

    public StuInfoContact(String stuUserInfoId, String stuInfoTelephoneMobile, String stuInfoTelephoneLand, String stuInfoContactEmail) {
       this.stuUserInfoId = stuUserInfoId;
       this.stuInfoTelephoneMobile = stuInfoTelephoneMobile;
       this.stuInfoTelephoneLand = stuInfoTelephoneLand;
       this.stuInfoContactEmail = stuInfoContactEmail;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idstu_info_telephone", unique=true, nullable=false)
    public Integer getIdstuInfoTelephone() {
        return this.idstuInfoTelephone;
    }
    
    public void setIdstuInfoTelephone(Integer idstuInfoTelephone) {
        this.idstuInfoTelephone = idstuInfoTelephone;
    }

    
    @Column(name="stu_user_info_id", length=50)
    public String getStuUserInfoId() {
        return this.stuUserInfoId;
    }
    
    public void setStuUserInfoId(String stuUserInfoId) {
        this.stuUserInfoId = stuUserInfoId;
    }

    
    @Column(name="stu_info_telephone_mobile", length=12)
    public String getStuInfoTelephoneMobile() {
        return this.stuInfoTelephoneMobile;
    }
    
    public void setStuInfoTelephoneMobile(String stuInfoTelephoneMobile) {
        this.stuInfoTelephoneMobile = stuInfoTelephoneMobile;
    }

    
    @Column(name="stu_info_telephone_land", length=12)
    public String getStuInfoTelephoneLand() {
        return this.stuInfoTelephoneLand;
    }
    
    public void setStuInfoTelephoneLand(String stuInfoTelephoneLand) {
        this.stuInfoTelephoneLand = stuInfoTelephoneLand;
    }

    
    @Column(name="stu_info_contact_email")
    public String getStuInfoContactEmail() {
        return this.stuInfoContactEmail;
    }
    
    public void setStuInfoContactEmail(String stuInfoContactEmail) {
        this.stuInfoContactEmail = stuInfoContactEmail;
    }




}


