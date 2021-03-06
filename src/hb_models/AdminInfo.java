package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdminInfo generated by hbm2java
 */
@Entity
@Table(name="admin_info"
    ,catalog="safenets_ramani"
)
public class AdminInfo  implements java.io.Serializable {


     private Integer adminInfoId;
     private String adminFirstName;
     private String adminLastName;
     private String adminEmail;
     private String adminNic;
     private String adminSecurityQu;
     private String adminSecurityAnswer;
     private String adminType;
     private String adminId;

    public AdminInfo() {
    }

    public AdminInfo(String adminFirstName, String adminLastName, String adminEmail, String adminNic, String adminSecurityQu, String adminSecurityAnswer, String adminType, String adminId) {
       this.adminFirstName = adminFirstName;
       this.adminLastName = adminLastName;
       this.adminEmail = adminEmail;
       this.adminNic = adminNic;
       this.adminSecurityQu = adminSecurityQu;
       this.adminSecurityAnswer = adminSecurityAnswer;
       this.adminType = adminType;
       this.adminId = adminId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="admin_info_id", unique=true, nullable=false)
    public Integer getAdminInfoId() {
        return this.adminInfoId;
    }
    
    public void setAdminInfoId(Integer adminInfoId) {
        this.adminInfoId = adminInfoId;
    }

    
    @Column(name="admin_firstName", length=100)
    public String getAdminFirstName() {
        return this.adminFirstName;
    }
    
    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    
    @Column(name="admin_lastName", length=100)
    public String getAdminLastName() {
        return this.adminLastName;
    }
    
    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    
    @Column(name="admin_email", length=100)
    public String getAdminEmail() {
        return this.adminEmail;
    }
    
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    
    @Column(name="admin_nic", length=10)
    public String getAdminNic() {
        return this.adminNic;
    }
    
    public void setAdminNic(String adminNic) {
        this.adminNic = adminNic;
    }

    
    @Column(name="admin_security_qu", length=2)
    public String getAdminSecurityQu() {
        return this.adminSecurityQu;
    }
    
    public void setAdminSecurityQu(String adminSecurityQu) {
        this.adminSecurityQu = adminSecurityQu;
    }

    
    @Column(name="admin_security_answer", length=100)
    public String getAdminSecurityAnswer() {
        return this.adminSecurityAnswer;
    }
    
    public void setAdminSecurityAnswer(String adminSecurityAnswer) {
        this.adminSecurityAnswer = adminSecurityAnswer;
    }

    
    @Column(name="admin_type", length=50)
    public String getAdminType() {
        return this.adminType;
    }
    
    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    
    @Column(name="admin_id", length=50)
    public String getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }




}


