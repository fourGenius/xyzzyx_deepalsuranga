/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.academic_employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_academic_user_info_name {

    private String employee_academic_user_id, employee_academic_user_info_name_surName, employee_academic_user_info_name_first_name, employee_academic_user_info_name_last_name;

    public employee_academic_user_info_name(String employee_academic_user_id, String employee_academic_user_info_name_surName, String employee_academic_user_info_name_first_name, String employee_academic_user_info_name_last_name) {

        this.employee_academic_user_id = employee_academic_user_id;
        this.employee_academic_user_info_name_surName = employee_academic_user_info_name_surName;
        this.employee_academic_user_info_name_first_name = employee_academic_user_info_name_first_name;
        this.employee_academic_user_info_name_last_name = employee_academic_user_info_name_last_name;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_academic_user_info_name(employee_academic_user_id,employee_academic_user_info_name_surName,employee_academic_user_info_name_first_name,employee_academic_user_info_name_last_name) values ('" + employee_academic_user_id + "','" + employee_academic_user_info_name_surName + "','" + employee_academic_user_info_name_first_name + "','" + employee_academic_user_info_name_last_name + "')");
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public employee_academic_user_info_name() {
    }
    

    public String getEmployee_academic_user_id() {
        

        return employee_academic_user_id;
    }

    public String getEmployee_academic_user_info_name_surName() {
        return employee_academic_user_info_name_surName;
    }

    public void setEmployee_academic_user_info_name_sirName(String employee_academic_user_info_name_surName) {
        this.employee_academic_user_info_name_surName = employee_academic_user_info_name_surName;
    }

    public String getEmployee_academic_user_info_name_first_name() {
        return employee_academic_user_info_name_first_name;
    }

    public void setEmployee_academic_user_info_name_first_name(String employee_academic_user_info_name_first_name) {
        this.employee_academic_user_info_name_first_name = employee_academic_user_info_name_first_name;
    }

    public String getEmployee_academic_user_info_name_last_name() {
        return employee_academic_user_info_name_last_name;
    }

    public void setEmployee_academic_user_info_name_last_name(String employee_academic_user_info_name_last_name) {
        this.employee_academic_user_info_name_last_name = employee_academic_user_info_name_last_name;
    }

}
