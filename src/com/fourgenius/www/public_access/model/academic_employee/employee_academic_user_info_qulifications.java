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
import public_access.Md_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_academic_user_info_qulifications {

    private String employee_academic_user_info_qulifications_file_id, employee_academic_user_info_qulifications_name, employee_academic_user_info_qulifications_type, employee_academic_user_info_qulifications_year;

    public employee_academic_user_info_qulifications(String employee_academic_user_info_qulifications_file_id, String employee_academic_user_info_qulifications_name, String employee_academic_user_info_qulifications_type, String employee_academic_user_info_qulifications_year) {
        this.employee_academic_user_info_qulifications_file_id = employee_academic_user_info_qulifications_file_id;
        this.employee_academic_user_info_qulifications_name = employee_academic_user_info_qulifications_name;
        this.employee_academic_user_info_qulifications_type = employee_academic_user_info_qulifications_type;
        this.employee_academic_user_info_qulifications_year = employee_academic_user_info_qulifications_year;
        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_academic_user_status values '" + employee_academic_user_info_qulifications_file_id + "','" + employee_academic_user_info_qulifications_name + "','" + employee_academic_user_info_qulifications_type + "','" + employee_academic_user_info_qulifications_year + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_info_qulifications_file_id() {
        return employee_academic_user_info_qulifications_file_id;
    }

    public void setEmployee_academic_user_info_qulifications_file_id(String employee_academic_user_info_qulifications_file_id) {
        this.employee_academic_user_info_qulifications_file_id = employee_academic_user_info_qulifications_file_id;
        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_academic_user_status values '" + employee_academic_user_info_qulifications_file_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_info_qulifications_name() {
        return employee_academic_user_info_qulifications_name;
    }

    public void setEmployee_academic_user_info_qulifications_name(String employee_academic_user_info_qulifications_name) {
        this.employee_academic_user_info_qulifications_name = employee_academic_user_info_qulifications_name;
    }

    public String getEmployee_academic_user_info_qulifications_type() {
        return employee_academic_user_info_qulifications_type;
    }

    public void setEmployee_academic_user_info_qulifications_type(String employee_academic_user_info_qulifications_type) {
        this.employee_academic_user_info_qulifications_type = employee_academic_user_info_qulifications_type;
    }

    public String getEmployee_academic_user_info_qulifications_year() {
        return employee_academic_user_info_qulifications_year;
    }

    public void setEmployee_academic_user_info_qulifications_year(String employee_academic_user_info_qulifications_year) {
        this.employee_academic_user_info_qulifications_year = employee_academic_user_info_qulifications_year;
    }

}
