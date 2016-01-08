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
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_nonAcademic_administrative_user_info {
  
    private String employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_administrative_user_info_email,employee_nonAcademic_administrative_user_info_password,employee_nonAcademic_administrative_user_info_status;

    public employee_nonAcademic_administrative_user_info(String employee_nonAcademic_administrative_user_info_id, String employee_nonAcademic_administrative_user_info_email, String employee_nonAcademic_administrative_user_info_password, String employee_nonAcademic_administrative_user_info_status) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        this.employee_nonAcademic_administrative_user_info_email = employee_nonAcademic_administrative_user_info_email;
        this.employee_nonAcademic_administrative_user_info_password = employee_nonAcademic_administrative_user_info_password;
        this.employee_nonAcademic_administrative_user_info_status = employee_nonAcademic_administrative_user_info_status;
    
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_administrative_user_info(employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_administrative_user_info_email,employee_nonAcademic_administrative_user_info_password,employee_nonAcademic_administrative_user_info_status) values ('" + employee_nonAcademic_administrative_user_info_id + "','" + employee_nonAcademic_administrative_user_info_email + "','" + employee_nonAcademic_administrative_user_info_password + "','" + employee_nonAcademic_administrative_user_info_status + "')");
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/employee_nonAcademic_administrative_user_info;" + ex);
        }
        
    }

    public String getEmployee_nonAcademic_administrative_user_info_id() {
        return employee_nonAcademic_administrative_user_info_id;
    
    }

    public void setEmployee_nonAcademic_administrative_user_info_id(String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
    try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_info(employee_nonAcademic_administrative_user_info_id) values ('" + employee_nonAcademic_administrative_user_info_id + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_administrative_user_info;" + ex);
        }
    }

    public String getEmployee_nonAcademic_administrative_user_info_email() {
        return employee_nonAcademic_administrative_user_info_email;
    }

    public void setEmployee_nonAcademic_administrative_user_info_email(String employee_nonAcademic_administrative_user_info_email) {
        this.employee_nonAcademic_administrative_user_info_email = employee_nonAcademic_administrative_user_info_email;
     try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_info(employee_nonAcademic_administrative_user_info_email) values ('" + employee_nonAcademic_administrative_user_info_email + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/employee_nonAcademic_administrative_user_info;" + ex);
        }
    }

    public String getEmployee_nonAcademic_administrative_user_info_password() {
        return employee_nonAcademic_administrative_user_info_password;
    }

    public void setEmployee_nonAcademic_administrative_user_info_password(String employee_nonAcademic_administrative_user_info_password) {
        this.employee_nonAcademic_administrative_user_info_password = employee_nonAcademic_administrative_user_info_password;
     try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_info(employee_nonAcademic_administrative_user_info_password) values ('" + employee_nonAcademic_administrative_user_info_password + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 4/employee_nonAcademic_administrative_user_info;" + ex);
        }
    }

    public String getEmployee_nonAcademic_administrative_user_info_status() {
        return employee_nonAcademic_administrative_user_info_status;
    }

    public void setEmployee_nonAcademic_administrative_user_info_status(String employee_nonAcademic_administrative_user_info_status) {
        this.employee_nonAcademic_administrative_user_info_status = employee_nonAcademic_administrative_user_info_status;
     try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_info(employee_nonAcademic_administrative_user_info_status) values ('" + employee_nonAcademic_administrative_user_info_status + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 5/employee_nonAcademic_administrative_user_info;" + ex);
        }
    }
    
    
}
