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
 * @author Dineth Jayasekera
 */
public class employee_academic_user_info_personal {

    private String employee_academic_user_id, employee_academic_user_info_personal_profile_image, employee_academic_user_info_personal_dob, employee_academic_user_info_personal_gender, employee_academic_user_info_personal_nic, employee_academic_user_info_personal_branch;

    public employee_academic_user_info_personal(String employee_academic_user_id, String employee_academic_user_info_personal_profile_image, String employee_academic_user_info_personal_dob, String employee_academic_user_info_personal_gender, String employee_academic_user_info_personal_nic, String employee_academic_user_info_personal_branch) {

        this.employee_academic_user_id = employee_academic_user_id;
        this.employee_academic_user_info_personal_profile_image = employee_academic_user_info_personal_profile_image;
        this.employee_academic_user_info_personal_dob = employee_academic_user_info_personal_dob;
        this.employee_academic_user_info_personal_gender = employee_academic_user_info_personal_gender;
        this.employee_academic_user_info_personal_nic = employee_academic_user_info_personal_nic;
        this.employee_academic_user_info_personal_branch = employee_academic_user_info_personal_branch;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employee_academic_user_info_personal WHERE employee_academic_user_id='" + employee_academic_user_id + "'");
            if (rs.next()) {
                statement.executeUpdate("UPDATE employee_academic_user_info_personal SET employee_academic_user_info_personal_profile_image='"+employee_academic_user_info_personal_profile_image+"', employee_academic_user_info_personal_dob='"+employee_academic_user_info_personal_dob+"', employee_academic_user_info_personal_gender='"+employee_academic_user_info_personal_gender+"', employee_academic_user_info_personal_nic='"+employee_academic_user_info_personal_nic+"', employee_academic_user_info_personal_branch='"+employee_academic_user_info_personal_branch+"' WHERE employee_academic_user_id='" + employee_academic_user_id + "'");
            } else {
                statement.executeUpdate("INSERT INTO employee_academic_user_info_personal(employee_academic_user_id,employee_academic_user_info_personal_profile_image,employee_academic_user_info_personal_dob,employee_academic_user_info_personal_gender,employee_academic_user_info_personal_nic,employee_academic_user_info_personal_branch) VALUES ('" + employee_academic_user_id + "','" + employee_academic_user_info_personal_profile_image + "','" + employee_academic_user_info_personal_dob + "','" + employee_academic_user_info_personal_gender + "','" + employee_academic_user_info_personal_nic + "','" + employee_academic_user_info_personal_branch + "')");

            }
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_info_personal_profile_image() {
        return employee_academic_user_info_personal_profile_image;
    }

    public void setEmployee_academic_user_info_personal_profile_image(String employee_academic_user_info_personal_profile_image) {
        this.employee_academic_user_info_personal_profile_image = employee_academic_user_info_personal_profile_image;
    }

    public String getEmployee_academic_user_info_personal_dob() {
        return employee_academic_user_info_personal_dob;
    }

    public void setEmployee_academic_user_info_personal_dob(String employee_academic_user_info_personal_dob) {
        this.employee_academic_user_info_personal_dob = employee_academic_user_info_personal_dob;
    }

    public String getEmployee_academic_user_info_personal_gender() {
        return employee_academic_user_info_personal_gender;
    }

    public void setEmployee_academic_user_info_personal_gender(String employee_academic_user_info_personal_gender) {
        this.employee_academic_user_info_personal_gender = employee_academic_user_info_personal_gender;
    }

    public String getEmployee_academic_user_info_personal_nic() {
        return employee_academic_user_info_personal_nic;
    }

    public void setEmployee_academic_user_info_personal_nic(String employee_academic_user_info_personal_nic) {
        this.employee_academic_user_info_personal_nic = employee_academic_user_info_personal_nic;
    }

    public String getEmployee_academic_user_info_personal_branch() {
        return employee_academic_user_info_personal_branch;
    }

    public void setEmployee_academic_user_info_personal_branch(String employee_academic_user_info_personal_branch) {
        this.employee_academic_user_info_personal_branch = employee_academic_user_info_personal_branch;
    }

}
