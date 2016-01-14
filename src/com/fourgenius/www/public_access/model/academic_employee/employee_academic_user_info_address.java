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
public class employee_academic_user_info_address {
    
    private String employee_academic_user_info_address_lane1,employee_academic_user_info_address_city,employee_academic_user_info_address_cuntry;

    public employee_academic_user_info_address(String employee_academic_user_info_address_lane1, String employee_academic_user_info_address_city, String employee_academic_user_info_address_cuntry) {
        
        this.employee_academic_user_info_address_lane1 = employee_academic_user_info_address_lane1;
        this.employee_academic_user_info_address_city = employee_academic_user_info_address_city;
        this.employee_academic_user_info_address_cuntry = employee_academic_user_info_address_cuntry;
    }

    

    

    public String getEmployee_academic_user_info_address_lane1() {
        return employee_academic_user_info_address_lane1;
    }

    public void setEmployee_academic_user_info_address_lane1(String employee_academic_user_info_address_lane1) {
        this.employee_academic_user_info_address_lane1 = employee_academic_user_info_address_lane1;
    }

    public String getEmployee_academic_user_info_address_city() {
        return employee_academic_user_info_address_city;
    }

    public void setEmployee_academic_user_info_address_city(String employee_academic_user_info_address_city) {
        this.employee_academic_user_info_address_city = employee_academic_user_info_address_city;
    }

    public String getEmployee_academic_user_info_address_cuntry() {
        return employee_academic_user_info_address_cuntry;
    }

    public void setEmployee_academic_user_info_address_cuntry(String employee_academic_user_info_address_cuntry) {
        this.employee_academic_user_info_address_cuntry = employee_academic_user_info_address_cuntry;
    }
    
    
}
