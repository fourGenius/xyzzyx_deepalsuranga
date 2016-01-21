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
public class stu_info_contact {

    private String stu_user_info_id, stu_info_telephone_mobile, stu_info_telephone_land, stu_info_contact_email;

//////////////////////////////////////////////////Insert///////////////////////////////////////////////
    public stu_info_contact(String stu_user_info_id, String stu_info_telephone_mobile, String stu_info_telephone_land, String stu_info_contact_email) {
        this.stu_user_info_id = stu_user_info_id;
        this.stu_info_telephone_mobile = stu_info_telephone_mobile;
        this.stu_info_telephone_land = stu_info_telephone_land;
        this.stu_info_contact_email = stu_info_contact_email;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from stu_info_contact where stu_user_info_id='"+stu_user_info_id+"'");
            if (rs.next()) {
                statement.executeUpdate("update stu_info_contact set stu_info_telephone_mobile='"+stu_info_telephone_mobile+"', stu_info_telephone_land='"+stu_info_telephone_land+"', stu_info_contact_email='"+stu_info_contact_email+"' where stu_user_info_id='"+stu_user_info_id+"'");
            } else {
                statement.executeUpdate("insert stu_info_contact(stu_user_info_id, stu_info_telephone_mobile, stu_info_telephone_land, stu_info_contact_email) values ('"+stu_user_info_id+"','"+stu_info_telephone_mobile+"','"+stu_info_telephone_land+"','"+stu_info_contact_email+"')");
            }
            rs.close();
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/stu_info_contact;" + ex);
        }
    }
//
//    public String getStu_user_info_id() {
//        return stu_user_info_id;
//    }
//
//    public void setStu_user_info_id(String stu_user_info_id) {
//        this.stu_user_info_id = stu_user_info_id;
//        try {
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("insert into stu_info_contact(stu_user_info_id) values ('" + stu_user_info_id + "')");
//        } catch (Exception ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 2/stu_info_contact;" + ex);
//        }
//    }
//
//    public String getStu_info_telephone_mobile() {
//        return stu_info_telephone_mobile;
//    }
//
//    public void setStu_info_telephone_mobile(String stu_info_telephone_mobile) {
//        this.stu_info_telephone_mobile = stu_info_telephone_mobile;
//        try {
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("insert into stu_info_contact(stu_info_telephone_mobile) values ('" + stu_info_telephone_mobile + "')");
//        } catch (Exception ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 3/stu_info_contact;" + ex);
//        }
//    }
//
//    public String getStu_info_telephone_land() {
//        return stu_info_telephone_land;
//    }
//
//    public void setStu_info_telephone_land(String stu_info_telephone_land) {
//        this.stu_info_telephone_land = stu_info_telephone_land;
//        try {
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("insert into stu_info_contact(stu_info_telephone_land) values ('" + stu_info_telephone_land + "')");
//        } catch (Exception ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 4/stu_info_contact;" + ex);
//        }
//    }
///////////////////////////////////////////////////////////Update////////////////////////////////////////////////////////////////////////////////
//
//    public void setStu_info_telephone_land_update(String stu_info_telephone_land, String stu_user_info_id) {
//        this.stu_info_telephone_land = stu_info_telephone_land;
//
//        try {
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("update stu_info_contact set stu_info_telephone_land='" + stu_info_telephone_land + "'  where stu_user_info_id='" + stu_user_info_id + "'");
//        } catch (Exception ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 5/stu_info_contact;" + ex);
//        }
//    }
//
//    public void setStu_info_telephone_mobile_update(String stu_info_telephone_mobile, String stu_user_info_id) {
//        this.stu_info_telephone_mobile = stu_info_telephone_mobile;
//
//        try {
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("update stu_info_contact set stu_info_telephone_mobile='" + stu_info_telephone_mobile + "' where stu_user_info_id='" + stu_user_info_id + "'");
//        } catch (Exception ex) {
//            JOptionPane.showConfirmDialog(null, "Error is: 6/stu_info_contact;" + ex);
//        }
//    }
}
