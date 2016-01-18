/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.academic_employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import public_access.MC_JavaDataBaseConnection;

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
        
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_academic_user_info_al_result(employee_academic_user_id,employee_academic_user_info_al_result_subject,employee_academic_user_info_al_result_result) values ('" + employee_academic_user_id + "','" + employee_academic_user_al_subject + "','" + employee_academic_user_al_result + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
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
