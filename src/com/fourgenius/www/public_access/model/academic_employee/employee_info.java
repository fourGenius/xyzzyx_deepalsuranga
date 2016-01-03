/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.academic_employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import public_access.Md_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_info {
    /*
     Table Names :
     employee_academic_user_info
     employee_academic_user_recovery
     employee_academic_user_status
     employee_academic_user_info_name
     employee_academic_user_info_contact
     employee_academic_user_info_personal
     employee_academic_user_info_qulifications
     employee_academic_user_info_address
     employee_nonAcademic_administrative_user_info
     employee_nonAcademic_administrative_user_recovery
     employee_nonAcademic_administrative_user_status
     */

    //Name: employee_academic_user_info
    private String employee_academic_user_id, employee_academic_user_email, employee_academic_user_password, employee_academic_user_info_status;

//    void all_sql() {
//        try {
//            Connection connection = Md_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//
//        } catch (SQLException ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
//        }
//    }
    public employee_info(String employee_academic_user_id, String employee_academic_user_email, String employee_academic_user_password, String employee_academic_user_info_status) {

        this.employee_academic_user_id = employee_academic_user_id;
        this.employee_academic_user_email = employee_academic_user_email;
        this.employee_academic_user_password = employee_academic_user_password;
        this.employee_academic_user_info_status = employee_academic_user_info_status;

        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_info values '" + employee_academic_user_id + "','" + employee_academic_user_email + "','" + employee_academic_user_password + "','" + employee_academic_user_info_status + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }

    }

    public String getEmployee_academic_user_id() {
        return employee_academic_user_id;

    }

    public void setEmployee_academic_user_id(String employee_academic_user_id) {
        this.employee_academic_user_id = employee_academic_user_id;
        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_info values '" + employee_academic_user_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_email() {
        return employee_academic_user_email;
    }

    public void setEmployee_academic_user_email(String employee_academic_user_email) {
        this.employee_academic_user_email = employee_academic_user_email;
        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_info values '" + employee_academic_user_email + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_password() {
        return employee_academic_user_password;
    }

    public void setEmployee_academic_user_password(String employee_academic_user_password) {
        this.employee_academic_user_password = employee_academic_user_password;
        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_info values '" + employee_academic_user_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_info_status() {
        return employee_academic_user_info_status;
    }

    public void setEmployee_academic_user_info_status(String employee_academic_user_info_status) {
        this.employee_academic_user_info_status = employee_academic_user_info_status;
        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_info values '" + employee_academic_user_info_status + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

}
