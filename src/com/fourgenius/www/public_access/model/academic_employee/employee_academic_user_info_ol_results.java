/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.academic_employee;

/**
 *
 * @author Pamitha Gayashan
 */
public class employee_academic_user_info_ol_results {
    
    private String employee_academic_user_id, employee_academic_user_ol_subject, employee_academic_user_ol_result;
    
    public employee_academic_user_info_ol_results(String employee_academic_user_id, String employee_academic_user_ol_subject, String employee_academic_user_ol_result) {
        
        this.employee_academic_user_id = employee_academic_user_id;
        this.employee_academic_user_ol_subject = employee_academic_user_ol_subject;
        this.employee_academic_user_ol_result = employee_academic_user_ol_result;
    }
    
    public String getemployee_academic_user_id() {
        return employee_academic_user_id;
    }

    public void setemployee_academic_user_id(String employee_academic_user_id) {
        this.employee_academic_user_id = employee_academic_user_id;
    }

    public String getEmployee_academic_user_info_address_city() {
        return employee_academic_user_ol_subject;
    }

    public void setEmployee_academic_user_info_address_city(String employee_academic_user_ol_subject) {
        this.employee_academic_user_ol_subject = employee_academic_user_ol_subject;
    }

    public String getemployee_academic_user_ol_result() {
        return employee_academic_user_ol_result;
    }

    public void setEmployee_academic_user_info_address_cuntry(String employee_academic_user_ol_result) {
        this.employee_academic_user_ol_result = employee_academic_user_ol_result;
    }
    
}
