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
 * @author Dineth Jayasekera
 */
public class employee_academic_user_info_contact {
    
    private String employee_academic_user_id, employee_academic_user_info_contact_mobile,employee_academic_user_info_contact_land,employee_academic_user_info_contact_email;

    public employee_academic_user_info_contact(String employee_academic_user_id, String employee_academic_user_info_contact_mobile, String employee_academic_user_info_contact_land, String employee_academic_user_info_contact_email) {
        
        this.employee_academic_user_id = employee_academic_user_id;
        this.employee_academic_user_info_contact_mobile = employee_academic_user_info_contact_mobile;
        this.employee_academic_user_info_contact_land = employee_academic_user_info_contact_land;
        this.employee_academic_user_info_contact_email = employee_academic_user_info_contact_email;
        
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_academic_user_info_contact(employee_academic_user_id,employee_academic_user_info_contact_mobile,employee_academic_user_info_contact_land,employee_academic_user_info_contact_email) values ('" + employee_academic_user_id + "','" + employee_academic_user_info_contact_mobile + "','" + employee_academic_user_info_contact_land + "','"+employee_academic_user_info_contact_email+"')");
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
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
