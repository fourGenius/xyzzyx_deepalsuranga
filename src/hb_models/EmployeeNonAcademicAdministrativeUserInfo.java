package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmployeeNonAcademicAdministrativeUserInfo generated by hbm2java
 */
@Entity
@Table(name="employee_nonAcademic_administrative_user_info"
    ,catalog="safenets_ramani"
)
public class EmployeeNonAcademicAdministrativeUserInfo  implements java.io.Serializable {


     private Integer idemployeeNonAcademicAdministrativeUserInfo;
     private String employeeNonAcademicAdministrativeUserInfoId;
     private String employeeNonAcademicAdministrativeUserInfoEmail;
     private String employeeNonAcademicAdministrativeUserInfoStatus;
     private String employeeNonAcademicAdministrativeUserInfoNic;
     private String employeeNonAcademicAdministrativeUserInfoBranch;

    public EmployeeNonAcademicAdministrativeUserInfo() {
    }

	
    public EmployeeNonAcademicAdministrativeUserInfo(String employeeNonAcademicAdministrativeUserInfoBranch) {
        this.employeeNonAcademicAdministrativeUserInfoBranch = employeeNonAcademicAdministrativeUserInfoBranch;
    }
    public EmployeeNonAcademicAdministrativeUserInfo(String employeeNonAcademicAdministrativeUserInfoId, String employeeNonAcademicAdministrativeUserInfoEmail, String employeeNonAcademicAdministrativeUserInfoStatus, String employeeNonAcademicAdministrativeUserInfoNic, String employeeNonAcademicAdministrativeUserInfoBranch) {
       this.employeeNonAcademicAdministrativeUserInfoId = employeeNonAcademicAdministrativeUserInfoId;
       this.employeeNonAcademicAdministrativeUserInfoEmail = employeeNonAcademicAdministrativeUserInfoEmail;
       this.employeeNonAcademicAdministrativeUserInfoStatus = employeeNonAcademicAdministrativeUserInfoStatus;
       this.employeeNonAcademicAdministrativeUserInfoNic = employeeNonAcademicAdministrativeUserInfoNic;
       this.employeeNonAcademicAdministrativeUserInfoBranch = employeeNonAcademicAdministrativeUserInfoBranch;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idemployee_nonAcademic_administrative_user_info", unique=true, nullable=false)
    public Integer getIdemployeeNonAcademicAdministrativeUserInfo() {
        return this.idemployeeNonAcademicAdministrativeUserInfo;
    }
    
    public void setIdemployeeNonAcademicAdministrativeUserInfo(Integer idemployeeNonAcademicAdministrativeUserInfo) {
        this.idemployeeNonAcademicAdministrativeUserInfo = idemployeeNonAcademicAdministrativeUserInfo;
    }

    
    @Column(name="employee_nonAcademic_administrative_user_info_id", length=50)
    public String getEmployeeNonAcademicAdministrativeUserInfoId() {
        return this.employeeNonAcademicAdministrativeUserInfoId;
    }
    
    public void setEmployeeNonAcademicAdministrativeUserInfoId(String employeeNonAcademicAdministrativeUserInfoId) {
        this.employeeNonAcademicAdministrativeUserInfoId = employeeNonAcademicAdministrativeUserInfoId;
    }

    
    @Column(name="employee_nonAcademic_administrative_user_info_email", length=50)
    public String getEmployeeNonAcademicAdministrativeUserInfoEmail() {
        return this.employeeNonAcademicAdministrativeUserInfoEmail;
    }
    
    public void setEmployeeNonAcademicAdministrativeUserInfoEmail(String employeeNonAcademicAdministrativeUserInfoEmail) {
        this.employeeNonAcademicAdministrativeUserInfoEmail = employeeNonAcademicAdministrativeUserInfoEmail;
    }

    
    @Column(name="employee_nonAcademic_administrative_user_info_status", length=50)
    public String getEmployeeNonAcademicAdministrativeUserInfoStatus() {
        return this.employeeNonAcademicAdministrativeUserInfoStatus;
    }
    
    public void setEmployeeNonAcademicAdministrativeUserInfoStatus(String employeeNonAcademicAdministrativeUserInfoStatus) {
        this.employeeNonAcademicAdministrativeUserInfoStatus = employeeNonAcademicAdministrativeUserInfoStatus;
    }

    
    @Column(name="employee_nonAcademic_administrative_user_info_nic", length=10)
    public String getEmployeeNonAcademicAdministrativeUserInfoNic() {
        return this.employeeNonAcademicAdministrativeUserInfoNic;
    }
    
    public void setEmployeeNonAcademicAdministrativeUserInfoNic(String employeeNonAcademicAdministrativeUserInfoNic) {
        this.employeeNonAcademicAdministrativeUserInfoNic = employeeNonAcademicAdministrativeUserInfoNic;
    }

    
    @Column(name="employee_nonAcademic_administrative_user_info_branch", nullable=false, length=10)
    public String getEmployeeNonAcademicAdministrativeUserInfoBranch() {
        return this.employeeNonAcademicAdministrativeUserInfoBranch;
    }
    
    public void setEmployeeNonAcademicAdministrativeUserInfoBranch(String employeeNonAcademicAdministrativeUserInfoBranch) {
        this.employeeNonAcademicAdministrativeUserInfoBranch = employeeNonAcademicAdministrativeUserInfoBranch;
    }




}


