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
 * @author Shadow®
 */
public class stu_user_status {

    private String stu_user_info_id, stu_user_status_code, stu_user_status_name;

    public stu_user_status(String stu_user_info_id, String stu_user_status_code, String stu_user_status_name) {
        this.stu_user_info_id = stu_user_info_id;
        this.stu_user_status_code = stu_user_status_code;
        this.stu_user_status_name = stu_user_status_name;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from stu_user_status where stu_user_info_id='"+stu_user_info_id+"'");
            if (rs.next()) {
                statement.executeUpdate("update stu_user_status set stu_user_status_code='"+stu_user_status_code+"',stu_user_status_name='"+stu_user_status_name+"' where stu_user_info_id='"+stu_user_info_id+"'");
            } else {
                statement.executeUpdate("insert into stu_user_status(stu_user_info_id, stu_user_status_code, stu_user_status_name) values ('"+stu_user_info_id+"','"+stu_user_status_code+"','"+stu_user_status_name+"')");
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/stu_user_status;" + ex);
        }
    }
//
//    public String getStu_user_status_code() {
//        return stu_user_status_code;
//    }
//
//    public void setStu_user_status_code(String stu_user_status_code) {
//        this.stu_user_status_code = stu_user_status_code;
//        try {
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("insert into stu_user_status(stu_user_status_code) values '" + stu_user_status_code + "'");
//        } catch (SQLException ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 2/stu_user_status;" + ex);
//        }
//    }
//
//    public String getStu_user_status_name() {
//        return stu_user_status_name;
//    }
//
//    public void setStu_user_status_name(String stu_user_status_name) {
//        this.stu_user_status_name = stu_user_status_name;
//        try {
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("insert into stu_user_status(stu_user_status_name) values '" + stu_user_status_name + "'");
//        } catch (SQLException ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 3/stu_user_status;" + ex);
//        }
//    }
//
///////////////////////////////////////////////////////////////////////////Update/////////////////////////////////////////
//    public void setStu_user_status_code_update(String stu_user_status_code, String stu_user_info_id) {
//        this.stu_user_status_code = stu_user_status_code;
//        this.stu_user_info_id = stu_user_info_id;
//        try {
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("update stu_user_status set stu_user_status_code='" + stu_user_status_code + "' where stu_user_info_id='" + stu_user_info_id + "' ");
//        } catch (SQLException ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 4/stu_user_status;" + ex);
//        }
//    }
//
//    public void setStu_user_status_name_update(String stu_user_status_name, String stu_user_info_id) {
//        this.stu_user_status_name = stu_user_status_name;
//        this.stu_user_info_id = stu_user_info_id;
//        try {
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("update stu_user_status set stu_user_status_name='" + stu_user_status_name + "' where stu_user_info_id='" + stu_user_info_id + "' ");
//        } catch (SQLException ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 5/stu_user_status;" + ex);
//        }
//    }
}
