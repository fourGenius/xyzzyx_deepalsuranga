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
public class employee_academic_user_info_al_results {
    
    private String employee_academic_user_id, employee_academic_user_al_subject, employee_academic_user_al_result;
    
    public employee_academic_user_info_al_results(String employee_academic_user_id, String employee_academic_user_al_subject, String employee_academic_user_al_result){
        this.employee_academic_user_id = employee_academic_user_id;
        this.employee_academic_user_al_subject = employee_academic_user_al_subject;
        this.employee_academic_user_al_result = employee_academic_user_al_result;
    }
    
    public String getemployee_academic_user_id(){
        return employee_academic_user_id;
    }
    
    public void setemployee_academic_user_id(String employee_academic_user_id){
        this.employee_academic_user_id = employee_academic_user_id;
    }
    
    public String getemployee_academic_user_al_subject(){
        return employee_academic_user_al_subject;
    }
    
    public void setemployee_academic_user_al_subject(String employee_academic_user_al_subject){
        this.employee_academic_user_al_subject = employee_academic_user_al_subject;
    }
    
    public String employee_academic_user_al_result(){
        return employee_academic_user_al_result;
    }
    
    public void setemployee_academic_user_al_result(String employee_academic_user_al_result){
        this.employee_academic_user_al_result = employee_academic_user_al_result;
    }
}
