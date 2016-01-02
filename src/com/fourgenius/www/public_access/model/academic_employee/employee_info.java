/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.academic_employee;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_info {
    /*
    Table Names :
    employee_academic_user_info
    employee_academic_user_recovery
    employee_academic_user_status
    employee_academic_user_info_name
    employee_academic_user_info_contact
    employee_academic_user_info_personal
    employee_academic_user_info_qulifications
    employee_academic_user_info_address
    employee_nonAcademic_administrative_user_info
    employee_nonAcademic_administrative_user_recovery
    employee_nonAcademic_administrative_user_status
    */ 
    //Name: employee_academic_user_info
    private String employee_academic_user_id,employee_academic_user_email,employee_academic_user_password,employee_academic_user_info_status;

    public employee_info(String employee_academic_user_id, String employee_academic_user_email, String employee_academic_user_password, String employee_academic_user_info_status) {
        
        this.employee_academic_user_id = employee_academic_user_id;
        this.employee_academic_user_email = employee_academic_user_email;
        this.employee_academic_user_password = employee_academic_user_password;
        this.employee_academic_user_info_status = employee_academic_user_info_status;
    }

    
    
    

    public String getEmployee_academic_user_id() {
        return employee_academic_user_id;
    }

    public void setEmployee_academic_user_id(String employee_academic_user_id) {
        this.employee_academic_user_id = employee_academic_user_id;
    }

    public String getEmployee_academic_user_email() {
        return employee_academic_user_email;
    }

    public void setEmployee_academic_user_email(String employee_academic_user_email) {
        this.employee_academic_user_email = employee_academic_user_email;
    }

    public String getEmployee_academic_user_password() {
        return employee_academic_user_password;
    }

    public void setEmployee_academic_user_password(String employee_academic_user_password) {
        this.employee_academic_user_password = employee_academic_user_password;
    }

    public String getEmployee_academic_user_info_status() {
        return employee_academic_user_info_status;
    }

    public void setEmployee_academic_user_info_status(String employee_academic_user_info_status) {
        this.employee_academic_user_info_status = employee_academic_user_info_status;
    }
    
    
    
   
}
