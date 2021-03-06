package hb_models;
// Generated Jan 21, 2018 10:14:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmployeeNonAcademicAdministrativeUserRecovery generated by hbm2java
 */
@Entity
@Table(name="employee_nonAcademic_administrative_user_recovery"
    ,catalog="safenets_ramani"
)
public class EmployeeNonAcademicAdministrativeUserRecovery  implements java.io.Serializable {


     private Integer idemployeeNonAcademicAdministrativeUserRecovery;
     private String employeeNonAcademicAdministrativeUserInfoId;
     private Integer employeeNonAcademicAdministrativeUserRecoveryQuestionNo;
     private String employeeNonAcademicAdministrativeUserRecoveryanswer;

    public EmployeeNonAcademicAdministrativeUserRecovery() {
    }

    public EmployeeNonAcademicAdministrativeUserRecovery(String employeeNonAcademicAdministrativeUserInfoId, Integer employeeNonAcademicAdministrativeUserRecoveryQuestionNo, String employeeNonAcademicAdministrativeUserRecoveryanswer) {
       this.employeeNonAcademicAdministrativeUserInfoId = employeeNonAcademicAdministrativeUserInfoId;
       this.employeeNonAcademicAdministrativeUserRecoveryQuestionNo = employeeNonAcademicAdministrativeUserRecoveryQuestionNo;
       this.employeeNonAcademicAdministrativeUserRecoveryanswer = employeeNonAcademicAdministrativeUserRecoveryanswer;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idemployee_nonAcademic_administrative_user_recovery", unique=true, nullable=false)
    public Integer getIdemployeeNonAcademicAdministrativeUserRecovery() {
        return this.idemployeeNonAcademicAdministrativeUserRecovery;
    }
    
    public void setIdemployeeNonAcademicAdministrativeUserRecovery(Integer idemployeeNonAcademicAdministrativeUserRecovery) {
        this.idemployeeNonAcademicAdministrativeUserRecovery = idemployeeNonAcademicAdministrativeUserRecovery;
    }

    
    @Column(name="employee_nonAcademic_administrative_user_info_id", length=50)
    public String getEmployeeNonAcademicAdministrativeUserInfoId() {
        return this.employeeNonAcademicAdministrativeUserInfoId;
    }
    
    public void setEmployeeNonAcademicAdministrativeUserInfoId(String employeeNonAcademicAdministrativeUserInfoId) {
        this.employeeNonAcademicAdministrativeUserInfoId = employeeNonAcademicAdministrativeUserInfoId;
    }

    
    @Column(name="employee_nonAcademic_administrative_user_recovery_question_no")
    public Integer getEmployeeNonAcademicAdministrativeUserRecoveryQuestionNo() {
        return this.employeeNonAcademicAdministrativeUserRecoveryQuestionNo;
    }
    
    public void setEmployeeNonAcademicAdministrativeUserRecoveryQuestionNo(Integer employeeNonAcademicAdministrativeUserRecoveryQuestionNo) {
        this.employeeNonAcademicAdministrativeUserRecoveryQuestionNo = employeeNonAcademicAdministrativeUserRecoveryQuestionNo;
    }

    
    @Column(name="employee_nonAcademic_administrative_user_recoveryanswer", length=50)
    public String getEmployeeNonAcademicAdministrativeUserRecoveryanswer() {
        return this.employeeNonAcademicAdministrativeUserRecoveryanswer;
    }
    
    public void setEmployeeNonAcademicAdministrativeUserRecoveryanswer(String employeeNonAcademicAdministrativeUserRecoveryanswer) {
        this.employeeNonAcademicAdministrativeUserRecoveryanswer = employeeNonAcademicAdministrativeUserRecoveryanswer;
    }




}


