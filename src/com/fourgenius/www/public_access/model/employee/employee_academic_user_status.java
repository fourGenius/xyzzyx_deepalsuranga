/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.employee;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_academic_user_status {
    
    private String employee_academic_user_status_code,employee_academic_user_status_name;

    public employee_academic_user_status(String employee_academic_user_status_code, String employee_academic_user_status_name) {
        this.employee_academic_user_status_code = employee_academic_user_status_code;
        this.employee_academic_user_status_name = employee_academic_user_status_name;
    }

   
    
    public String getEmployee_academic_user_status_code() {
        return employee_academic_user_status_code;
    }

    public void setEmployee_academic_user_status_code(String employee_academic_user_status_code) {
        this.employee_academic_user_status_code = employee_academic_user_status_code;
    }

    public String getEmployee_academic_user_status_name() {
        return employee_academic_user_status_name;
    }

    public void setEmployee_academic_user_status_name(String employee_academic_user_status_name) {
        this.employee_academic_user_status_name = employee_academic_user_status_name;
    }
    
    
}
