/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.student;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class stu_user_status {

    private String stu_user_status_code, stu_user_status_name;

    public stu_user_status(String stu_user_status_code, String stu_user_status_name) {
        this.stu_user_status_code = stu_user_status_code;
        this.stu_user_status_name = stu_user_status_name;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_user_status(stu_user_status_code,stu_user_status_name) values ('" + stu_user_status_code + "','" + stu_user_status_name + "')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getStu_user_status_code() {
        return stu_user_status_code;
    }

    public void setStu_user_status_code(String stu_user_status_code) {
        this.stu_user_status_code = stu_user_status_code;
    }

    public String getStu_user_status_name() {
        return stu_user_status_name;
    }

    public void setStu_user_status_name(String stu_user_status_name) {
        this.stu_user_status_name = stu_user_status_name;
    }

}
