/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.nonacademic_employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import public_access.Md_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_nonAcademic_administrative_user_status {
    
    private String employee_nonAcademic_administrative_user_status_code,employee_nonAcademic_administrative_user_status_name;

    public employee_nonAcademic_administrative_user_status(String employee_nonAcademic_administrative_user_status_code, String employee_nonAcademic_administrative_user_status_name) {
        this.employee_nonAcademic_administrative_user_status_code = employee_nonAcademic_administrative_user_status_code;
        this.employee_nonAcademic_administrative_user_status_name = employee_nonAcademic_administrative_user_status_name;
    try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_status(employee_nonAcademic_administrative_user_status_code,employee_nonAcademic_administrative_user_status_name) values '" + employee_nonAcademic_administrative_user_status_code + "','" +employee_nonAcademic_administrative_user_status_name+ "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/employee_nonAcademic_administrative_user_status;" + ex);
        }
    }

    public String getEmployee_nonAcademic_administrative_user_status_code() {
        return employee_nonAcademic_administrative_user_status_code;
    }

    public void setEmployee_nonAcademic_administrative_user_status_code(String employee_nonAcademic_administrative_user_status_code) {
        this.employee_nonAcademic_administrative_user_status_code = employee_nonAcademic_administrative_user_status_code;
    try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_status(employee_nonAcademic_administrative_user_status_code) values '" + employee_nonAcademic_administrative_user_status_code + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_administrative_user_status;" + ex);
        }
    }

    public String getEmployee_nonAcademic_administrative_user_status_name() {
        return employee_nonAcademic_administrative_user_status_name;
    }

    public void setEmployee_nonAcademic_administrative_user_status_name(String employee_nonAcademic_administrative_user_status_name) {
        this.employee_nonAcademic_administrative_user_status_name = employee_nonAcademic_administrative_user_status_name;
    try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_status(employee_nonAcademic_administrative_user_status_name) values '" + employee_nonAcademic_administrative_user_status_name + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/employee_nonAcademic_administrative_user_status;" + ex);
        }
    }
    
    
}
