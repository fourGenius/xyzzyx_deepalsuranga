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
public class stu_info_name {

    
    private String stu_info_name_id, stu_info_name_sirName, stu_info_name_first_name, stu_info_name_last_name;

//////////////////////////////////////////////////////Insert//////////////////////////////////////////////
    public stu_info_name(String stu_info_name_id, String stu_info_name_sirName, String stu_info_name_first_name, String stu_info_name_last_name) {

        this.stu_info_name_id = stu_info_name_id;
        this.stu_info_name_sirName = stu_info_name_sirName;
        this.stu_info_name_first_name = stu_info_name_first_name;
        this.stu_info_name_last_name = stu_info_name_last_name;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from employee_nonAcademic_user_info_name where stu_info_name_id='" + stu_info_name_id + "'");
            if (rs.next()) {
                statement.executeUpdate("update stu_info_name_ set stu_info_name_sirName='" + stu_info_name_sirName + "',stu_info_name_first_name='" + stu_info_name_first_name + "' ,stu_info_name_last_name='" + stu_info_name_last_name + "' where stu_info_name_id='" + stu_info_name_id + "'");
            } else {
                statement.executeUpdate("insert into stu_info_name_(stu_info_name_id,stu_info_name_sirName,stu_info_name_last_name,stu_info_name_first_name) values ('" + stu_info_name_id + "','" + stu_info_name_sirName + "','" + stu_info_name_last_name + "','" + stu_info_name_first_name + "')");
            }
            rs.close();
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/stu_info_name;" + ex);
        }
    }

    public String getStu_info_name_id() {
        return stu_info_name_id;
    }

    public void setStu_info_name_id(String stu_info_name_id) {
        this.stu_info_name_id = stu_info_name_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into stu_info_name(stu_info_name_id) values ('" + stu_info_name_id + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/stu_info_name;" + ex);
        }
    }

    public String getStu_info_name_sirName() {
        return stu_info_name_sirName;
    }

    public void setStu_info_name_sirName(String stu_info_name_sirName) {
        this.stu_info_name_sirName = stu_info_name_sirName;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into stu_info_name(stu_info_name_sirName) values ('" + stu_info_name_sirName + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/stu_info_name;" + ex);
        }
    }

    public String getStu_info_name_first_name() {
        return stu_info_name_first_name;
    }

    public void setStu_info_name_first_name(String stu_info_name_first_name) {
        this.stu_info_name_first_name = stu_info_name_first_name;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into stu_info_name(stu_info_name_first_name) values ('" + stu_info_name_first_name + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 4/stu_info_name;" + ex);
        }
    }

    public String getStu_info_name_last_name() {
        return stu_info_name_last_name;
    }

    public void setStu_info_name_last_name(String stu_info_name_last_name) {
        this.stu_info_name_last_name = stu_info_name_last_name;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into stu_info_name(stu_info_name_last_name) values ('" + stu_info_name_last_name + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 5/stu_info_name;" + ex);
        }
    }
////////////////////////////////////////////////Update/////////////////////////////////////////////////

    public void setStu_info_name_sirName_update(String stu_info_name_id, String stu_info_name_sirName) {
        this.stu_info_name_sirName = stu_info_name_sirName;
        this.stu_info_name_id = stu_info_name_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_name set stu_info_name_sirName ='" + stu_info_name_sirName + "' where stu_info_name_id='" + stu_info_name_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 6/stu_info_name;" + ex);
        }
    }

    public void setStu_info_name_first_name_update(String stu_info_name_id, String stu_info_name_first_name) {
        this.stu_info_name_first_name = stu_info_name_first_name;
        this.stu_info_name_id = stu_info_name_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_name set stu_info_name_first_name='" + stu_info_name_first_name + "' where stu_info_name_id='" + stu_info_name_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 7/stu_info_name;" + ex);
        }

    }

    public void setStu_info_name_last_name_update(String stu_info_name_id, String stu_info_name_last_name) {
        this.stu_info_name_last_name = stu_info_name_last_name;
        this.stu_info_name_id = stu_info_name_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_name set stu_info_name_last_name='" + stu_info_name_last_name + "' where stu_info_name_id='" + stu_info_name_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 9/stu_info_name;" + ex);
        }
    }
}
