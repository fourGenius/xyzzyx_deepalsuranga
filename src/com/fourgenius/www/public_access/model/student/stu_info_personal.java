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
public class stu_info_personal {

    private String stu_info_personal_id, stu_info_personal_profile_image, stu_info_personal_nic, stu_info_personal_dob, stu_info_personal_age, stu_info_personal_gender, stu_info_personal_course;

    public stu_info_personal(String stu_info_personal_id, String stu_info_personal_profile_image, String stu_info_personal_nic, String stu_info_personal_dob, String stu_info_personal_age, String stu_info_personal_gender, String stu_info_personal_course) {
        this.stu_info_personal_id = stu_info_personal_id;
        this.stu_info_personal_profile_image = stu_info_personal_profile_image;
        this.stu_info_personal_nic = stu_info_personal_nic;
        this.stu_info_personal_dob = stu_info_personal_dob;
        this.stu_info_personal_age = stu_info_personal_age;
        this.stu_info_personal_gender = stu_info_personal_gender;
        this.stu_info_personal_course = stu_info_personal_course;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from stu_info_personal where stu_info_personal_id='" + stu_info_personal_id + "'");
            if (rs.next()) {
                statement.executeUpdate("update stu_info_personal set stu_info_personal_profile_image='" + stu_info_personal_profile_image + "',stu_info_personal_dob='" + stu_info_personal_dob + "' ,stu_info_personal_gender='" + stu_info_personal_gender + "' where stu_info_personal_id='" + stu_info_personal_id + "'");
            } else {
                statement.executeUpdate("insert stu_info_personal(stu_info_personal_id,stu_info_personal_profile_image,stu_info_personal_dob,stu_info_personal_gender) values ('" + stu_info_personal_id + "'," + stu_info_personal_profile_image + "','" + stu_info_personal_dob + "','" + stu_info_personal_gender + "')");
            }
            rs.close();
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/stu_info_personal;" + ex);
        }
    }

    public String getStu_info_personal_id() {
        return stu_info_personal_id;
    }

    public void setStu_info_personal_id(String stu_info_personal_id) {
        this.stu_info_personal_id = stu_info_personal_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_personal(stu_info_personal_id) values ('" + stu_info_personal_id + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/stu_info_personal;" + ex);
        }
    }

    public String getStu_info_personal_profile_image() {
        return stu_info_personal_profile_image;
    }

    public void setStu_info_personal_profile_image(String stu_info_personal_profile_image) {
        this.stu_info_personal_profile_image = stu_info_personal_profile_image;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_personal(stu_info_personal_profile_image) values ('" + stu_info_personal_profile_image + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/stu_info_personal;" + ex);
        }
    }

    public String getStu_info_personal_nic() {
        return stu_info_personal_nic;
    }

    public void setStu_info_personal_nic(String stu_info_personal_nic) {
        this.stu_info_personal_nic = stu_info_personal_nic;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_personal(stu_info_personal_nic) values ('" + stu_info_personal_nic + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 4/stu_info_personal;" + ex);
        }
    }

    public String getStu_info_personal_dob() {
        return stu_info_personal_dob;
    }

    public void setStu_info_personal_dob(String stu_info_personal_dob) {
        this.stu_info_personal_dob = stu_info_personal_dob;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_personal(stu_info_personal_dob) values ('" + stu_info_personal_dob + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 5/stu_info_personal;" + ex);
        }
    }

    public String getStu_info_personal_age() {
        return stu_info_personal_age;
    }

    public void setStu_info_personal_age(String stu_info_personal_age) {
        this.stu_info_personal_age = stu_info_personal_age;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_personal(stu_info_personal_age) values ('" + stu_info_personal_age + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 6/stu_info_personal;" + ex);
        }
    }

    public String getStu_info_personal_gender() {
        return stu_info_personal_gender;
    }

    public void setStu_info_personal_gender(String stu_info_personal_gender) {
        this.stu_info_personal_gender = stu_info_personal_gender;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_personal(stu_info_personal_gender) values ('" + stu_info_personal_gender + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 7/stu_info_personal;" + ex);
        }
    }

    public String getStu_info_personal_course() {
        return stu_info_personal_course;
    }

    public void setStu_info_personal_course(String stu_info_personal_course) {
        this.stu_info_personal_course = stu_info_personal_course;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_personal(stu_info_personal_course) values ('" + stu_info_personal_course + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 8/stu_info_personal;" + ex);
        }
    }

///////////////////////////////////////////////////////////Update//////////////////////////////////////////////////////////////////////////////
    public void setStu_info_personal_gender_update(String stu_info_personal_gender, String stu_info_personal_id) {
        this.stu_info_personal_gender = stu_info_personal_gender;
        this.stu_info_personal_id = stu_info_personal_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_personal set stu_info_personal_gender='" + stu_info_personal_gender + "' where stu_info_personal_id='" + stu_info_personal_id + "'");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 9/stu_info_personal;" + ex);
        }
    }

    public void setStu_info_personal_dob_update(String stu_info_personal_dob, String stu_info_personal_id) {
        this.stu_info_personal_dob = stu_info_personal_dob;
        this.stu_info_personal_id = stu_info_personal_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_personal set stu_info_personal_dob='" + stu_info_personal_dob + "'  where stu_info_personal_id='" + stu_info_personal_id + "'");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 10/stu_info_personal;" + ex);
        }
    }

    public void setStu_info_personal_profile_image_update(String stu_info_personal_profile_image, String stu_info_personal_id) {
        this.stu_info_personal_profile_image = stu_info_personal_profile_image;
        this.stu_info_personal_id = stu_info_personal_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_personal set stu_info_personal_profile_image='" + stu_info_personal_profile_image + "' where stu_info_personal_id='" + stu_info_personal_id + "'");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 11/stu_info_personal;" + ex);
        }
    }

//  public void setStu_info_personal_course_update(String stu_info_personal_course,String stu_info_personal_id) {
//        this.stu_info_personal_course = stu_info_personal_course;
//     this.stu_info_personal_id = stu_info_personal_id;
//        try {
//             Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//        statement.executeUpdate("update stu_info_personal set stu_info_personal_course='" + stu_info_personal_course + "' where stu_info_personal_id='" + stu_info_personal_id + "'");
//        } catch (Exception ex) {
//        JOptionPane.showConfirmDialog(null, "Error is: 12/stu_info_personal;" + ex);
//        }
//    }
}
