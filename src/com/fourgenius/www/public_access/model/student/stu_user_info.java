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
public class stu_user_info {

    private String stu_user_info_id, stu_user_info_email, stu_user_info_password, stu_user_info_status;

    public stu_user_info(String stu_user_info_id, String stu_user_info_email, String stu_user_info_password, String stu_user_info_status) {
        this.stu_user_info_id = stu_user_info_id;
        this.stu_user_info_email = stu_user_info_email;
        this.stu_user_info_password = stu_user_info_password;
        this.stu_user_info_status = stu_user_info_status;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_user_info(stu_user_info_id,stu_user_info_email,stu_user_info_password,stu_user_info_status) values ('" + stu_user_info_id + "','" + stu_user_info_email + "','"+  stu_user_info_password+"','"+ stu_user_info_status +"')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getStu_user_info_id() {
        return stu_user_info_id;
    }

    public void setStu_user_info_id(String stu_user_info_id) {
        this.stu_user_info_id = stu_user_info_id;
    }

    public String getStu_user_info_email() {
        return stu_user_info_email;
    }

    public void setStu_user_info_email(String stu_user_info_email) {
        this.stu_user_info_email = stu_user_info_email;
    }

    public String getStu_user_info_password() {
        return stu_user_info_password;
    }

    public void setStu_user_info_password(String stu_user_info_password) {
        this.stu_user_info_password = stu_user_info_password;
    }

    public String getStu_user_info_status() {
        return stu_user_info_status;
    }

    public void setStu_user_info_status(String stu_user_info_status) {
        this.stu_user_info_status = stu_user_info_status;
    }

}
