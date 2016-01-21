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
import javax.swing.JOptionPane;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Pamitha Gayashan
 */
public class employee_academic_user_info_ol_results {

    private String employee_academic_user_id, employee_academic_user_ol_subject, employee_academic_user_ol_result;

    public employee_academic_user_info_ol_results(String employee_academic_user_id, String employee_academic_user_ol_subject, String employee_academic_user_ol_result) {

        this.employee_academic_user_id = employee_academic_user_id;
        this.employee_academic_user_ol_subject = employee_academic_user_ol_subject;
        this.employee_academic_user_ol_result = employee_academic_user_ol_result;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employee_academic_user_info_ol_result WHERE employee_academic_user_id='" + employee_academic_user_id + "'");
            if (rs.next()) {
                statement.executeUpdate("INSERT INTO employee_academic_user_info_ol_result(employee_academic_user_id,employee_academic_user_info_ol_result_subject,employee_academic_user_info_ol_result_result) VALUES ('" + employee_academic_user_id + "','" + employee_academic_user_ol_subject + "','" + employee_academic_user_ol_result + "')");
            } else {
                statement.executeUpdate("INSERT INTO employee_academic_user_info_ol_result(employee_academic_user_id,employee_academic_user_info_ol_result_subject,employee_academic_user_info_ol_result_result) VALUES ('" + employee_academic_user_id + "','" + employee_academic_user_ol_subject + "','" + employee_academic_user_ol_result + "')");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public String getemployee_academic_user_id() {
        return employee_academic_user_id;
    }

    public void setemployee_academic_user_id(String employee_academic_user_id) {
        this.employee_academic_user_id = employee_academic_user_id;
    }

    public String getEmployee_academic_user_info_address_city() {
        return employee_academic_user_ol_subject;
    }

    public void setEmployee_academic_user_info_address_city(String employee_academic_user_ol_subject) {
        this.employee_academic_user_ol_subject = employee_academic_user_ol_subject;
    }

    public String getemployee_academic_user_ol_result() {
        return employee_academic_user_ol_result;
    }

    public void setEmployee_academic_user_info_address_cuntry(String employee_academic_user_ol_result) {
        this.employee_academic_user_ol_result = employee_academic_user_ol_result;
    }

}
