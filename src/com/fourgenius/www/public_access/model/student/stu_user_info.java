/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Shadow
 */
public class stu_user_info {

    private String stu_user_info_id, stu_user_info_email, stu_user_info_password, stu_user_info_status;
    
//////////////////////////////////////////Insert//////////////////////////////////////////////
    
    
    public stu_user_info(String stu_user_info_id, String stu_user_info_email, String stu_user_info_password, String stu_user_info_status) {
        this.stu_user_info_id = stu_user_info_id;
        this.stu_user_info_email = stu_user_info_email;
        this.stu_user_info_password = stu_user_info_password;
        this.stu_user_info_status = stu_user_info_status;
      
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from stu_user_info where stu_user_info_id='" + stu_user_info_id + "'");
            if (rs.next()) {
                statement.executeUpdate("update stu_user_info set stu_user_info_email='" + stu_user_info_email + "',stu_user_info_password='" + stu_user_info_password + "' where stu_user_info_id='" + stu_user_info_id + "')");
            } else {
                statement.executeUpdate("insert into stu_user_info(stu_user_info_id,stu_user_info_email,stu_user_info_password,stu_user_info_status) values ('" + stu_user_info_id + "','" + stu_user_info_email + "','" + stu_user_info_password + "','" + stu_user_info_status + "')");
            }
            rs.close();
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/stu_user_info;" + ex);
        }
    }

    public String getStu_user_info_id() {
        return stu_user_info_id;
    }

    public void setStu_user_info_id(String stu_user_info_id) {
        this.stu_user_info_id = stu_user_info_id;      
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_user_info(stu_user_info_id) values ('" + stu_user_info_id + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/stu_user_info;" + ex);
        }
    }
    public String getStu_user_info_email() {
        return stu_user_info_email;
    }

    public void setStu_user_info_email(String stu_user_info_email) {
        this.stu_user_info_email = stu_user_info_email;
                try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_user_info(stu_user_info_email) values ('" + stu_user_info_email + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/stu_user_info;" + ex);
        }
    }

    public String getStu_user_info_password() {
        return stu_user_info_password;
    }

    public void setStu_user_info_password(String stu_user_info_password) {
        this.stu_user_info_password = stu_user_info_password;
                try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_user_info(stu_user_info_password) values ('" + stu_user_info_password + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 4/stu_user_info;" + ex);
        }
    }

    public String getStu_user_info_status() {
        return stu_user_info_status;
    }

    public void setStu_user_info_status(String stu_user_info_status) {
        this.stu_user_info_status = stu_user_info_status;
                        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_user_info(stu_user_info_status) values ('" + stu_user_info_status + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 5/stu_user_info;" + ex);
        }
    }

}

