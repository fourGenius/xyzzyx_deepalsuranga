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
public class employee_academic_user_info_contact {
    
    private String employee_academic_user_info_contact_mobile,employee_academic_user_info_contact_land,employee_academic_user_info_contact_email;

    public employee_academic_user_info_contact(String employee_academic_user_info_contact_mobile, String employee_academic_user_info_contact_land, String employee_academic_user_info_contact_email) {
        this.employee_academic_user_info_contact_mobile = employee_academic_user_info_contact_mobile;
        this.employee_academic_user_info_contact_land = employee_academic_user_info_contact_land;
        this.employee_academic_user_info_contact_email = employee_academic_user_info_contact_email;
    }

    public String getEmployee_academic_user_info_contact_mobile() {
        return employee_academic_user_info_contact_mobile;
    }

    public void setEmployee_academic_user_info_contact_mobile(String employee_academic_user_info_contact_mobile) {
        this.employee_academic_user_info_contact_mobile = employee_academic_user_info_contact_mobile;
    }

    public String getEmployee_academic_user_info_contact_land() {
        return employee_academic_user_info_contact_land;
    }

    public void setEmployee_academic_user_info_contact_land(String employee_academic_user_info_contact_land) {
        this.employee_academic_user_info_contact_land = employee_academic_user_info_contact_land;
    }

    public String getEmployee_academic_user_info_contact_email() {
        return employee_academic_user_info_contact_email;
    }

    public void setEmployee_academic_user_info_contact_email(String employee_academic_user_info_contact_email) {
        this.employee_academic_user_info_contact_email = employee_academic_user_info_contact_email;
    }
    
    
    
}
