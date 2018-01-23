package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmployeeAcademicUserInfoQulifications generated by hbm2java
 */
@Entity
@Table(name="employee_academic_user_info_qulifications"
    ,catalog="safenets_ramani"
)
public class EmployeeAcademicUserInfoQulifications  implements java.io.Serializable {


     private Integer idemployeeAcademicUserInfoQulifications;
     private String employeeAcademicUserId;
     private String employeeAcademicUserInfoQulificationsFileId;
     private String employeeAcademicUserInfoQulificationsName;
     private String employeeAcademicUserInfoQulificationsStartYear;
     private String employeeAcademicUserInfoQulificationsEndYear;

    public EmployeeAcademicUserInfoQulifications() {
    }

    public EmployeeAcademicUserInfoQulifications(String employeeAcademicUserId, String employeeAcademicUserInfoQulificationsFileId, String employeeAcademicUserInfoQulificationsName, String employeeAcademicUserInfoQulificationsStartYear, String employeeAcademicUserInfoQulificationsEndYear) {
       this.employeeAcademicUserId = employeeAcademicUserId;
       this.employeeAcademicUserInfoQulificationsFileId = employeeAcademicUserInfoQulificationsFileId;
       this.employeeAcademicUserInfoQulificationsName = employeeAcademicUserInfoQulificationsName;
       this.employeeAcademicUserInfoQulificationsStartYear = employeeAcademicUserInfoQulificationsStartYear;
       this.employeeAcademicUserInfoQulificationsEndYear = employeeAcademicUserInfoQulificationsEndYear;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idemployee_academic_user_info_qulifications", unique=true, nullable=false)
    public Integer getIdemployeeAcademicUserInfoQulifications() {
        return this.idemployeeAcademicUserInfoQulifications;
    }
    
    public void setIdemployeeAcademicUserInfoQulifications(Integer idemployeeAcademicUserInfoQulifications) {
        this.idemployeeAcademicUserInfoQulifications = idemployeeAcademicUserInfoQulifications;
    }

    
    @Column(name="employee_academic_user_id", length=50)
    public String getEmployeeAcademicUserId() {
        return this.employeeAcademicUserId;
    }
    
    public void setEmployeeAcademicUserId(String employeeAcademicUserId) {
        this.employeeAcademicUserId = employeeAcademicUserId;
    }

    
    @Column(name="employee_academic_user_info_qulifications_file_id", length=50)
    public String getEmployeeAcademicUserInfoQulificationsFileId() {
        return this.employeeAcademicUserInfoQulificationsFileId;
    }
    
    public void setEmployeeAcademicUserInfoQulificationsFileId(String employeeAcademicUserInfoQulificationsFileId) {
        this.employeeAcademicUserInfoQulificationsFileId = employeeAcademicUserInfoQulificationsFileId;
    }

    
    @Column(name="employee_academic_user_info_qulifications_name", length=50)
    public String getEmployeeAcademicUserInfoQulificationsName() {
        return this.employeeAcademicUserInfoQulificationsName;
    }
    
    public void setEmployeeAcademicUserInfoQulificationsName(String employeeAcademicUserInfoQulificationsName) {
        this.employeeAcademicUserInfoQulificationsName = employeeAcademicUserInfoQulificationsName;
    }

    
    @Column(name="employee_academic_user_info_qulifications_start_year", length=10)
    public String getEmployeeAcademicUserInfoQulificationsStartYear() {
        return this.employeeAcademicUserInfoQulificationsStartYear;
    }
    
    public void setEmployeeAcademicUserInfoQulificationsStartYear(String employeeAcademicUserInfoQulificationsStartYear) {
        this.employeeAcademicUserInfoQulificationsStartYear = employeeAcademicUserInfoQulificationsStartYear;
    }

    
    @Column(name="employee_academic_user_info_qulifications_end_year", length=10)
    public String getEmployeeAcademicUserInfoQulificationsEndYear() {
        return this.employeeAcademicUserInfoQulificationsEndYear;
    }
    
    public void setEmployeeAcademicUserInfoQulificationsEndYear(String employeeAcademicUserInfoQulificationsEndYear) {
        this.employeeAcademicUserInfoQulificationsEndYear = employeeAcademicUserInfoQulificationsEndYear;
    }




}


