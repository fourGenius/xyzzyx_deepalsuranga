package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmployeeAcademicUserStatus generated by hbm2java
 */
@Entity
@Table(name="employee_academic_user_status"
    ,catalog="safenets_ramani"
)
public class EmployeeAcademicUserStatus  implements java.io.Serializable {


     private Integer idemployeeAcademicUserStatus;
     private String employeeAcademicUserId;
     private Integer employeeAcademicUserStatusCode;
     private String employeeAcademicUserStatusName;

    public EmployeeAcademicUserStatus() {
    }

    public EmployeeAcademicUserStatus(String employeeAcademicUserId, Integer employeeAcademicUserStatusCode, String employeeAcademicUserStatusName) {
       this.employeeAcademicUserId = employeeAcademicUserId;
       this.employeeAcademicUserStatusCode = employeeAcademicUserStatusCode;
       this.employeeAcademicUserStatusName = employeeAcademicUserStatusName;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idemployee_academic_user_status", unique=true, nullable=false)
    public Integer getIdemployeeAcademicUserStatus() {
        return this.idemployeeAcademicUserStatus;
    }
    
    public void setIdemployeeAcademicUserStatus(Integer idemployeeAcademicUserStatus) {
        this.idemployeeAcademicUserStatus = idemployeeAcademicUserStatus;
    }

    
    @Column(name="employee_academic_user_id", length=50)
    public String getEmployeeAcademicUserId() {
        return this.employeeAcademicUserId;
    }
    
    public void setEmployeeAcademicUserId(String employeeAcademicUserId) {
        this.employeeAcademicUserId = employeeAcademicUserId;
    }

    
    @Column(name="employee_academic_user_status_code")
    public Integer getEmployeeAcademicUserStatusCode() {
        return this.employeeAcademicUserStatusCode;
    }
    
    public void setEmployeeAcademicUserStatusCode(Integer employeeAcademicUserStatusCode) {
        this.employeeAcademicUserStatusCode = employeeAcademicUserStatusCode;
    }

    
    @Column(name="employee_academic_user_status_name", length=50)
    public String getEmployeeAcademicUserStatusName() {
        return this.employeeAcademicUserStatusName;
    }
    
    public void setEmployeeAcademicUserStatusName(String employeeAcademicUserStatusName) {
        this.employeeAcademicUserStatusName = employeeAcademicUserStatusName;
    }




}


