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
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class stu_exams_info {

    private String idstu_exams_info,stu_exams_info_id, stu_exams_info_name, stu_exams_info_date, stu_exams_info_type, stu_exams_info_branch, stu_exams_info_batch, stu_exams_info_course;

    public stu_exams_info(String stu_exams_info_id, String stu_exams_info_name, String stu_exams_info_date, String stu_exams_info_type, String stu_exams_info_branch, String stu_exams_info_batch, String stu_exams_info_course) {
        this.stu_exams_info_id = stu_exams_info_id;
        this.stu_exams_info_name = stu_exams_info_name;
        this.stu_exams_info_date = stu_exams_info_date;
        this.stu_exams_info_type = stu_exams_info_type;
        this.stu_exams_info_branch = stu_exams_info_branch;
        this.stu_exams_info_batch = stu_exams_info_batch;
        this.stu_exams_info_course = stu_exams_info_course;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();            
            ResultSet rs = statement.executeQuery("select * from stu_exams_info where stu_exams_info_id='" + stu_exams_info_id + "'");
            if (rs.next()) {;
                statement.executeUpdate("update stu_exams_info set stu_exams_info_name='" + stu_exams_info_name + "', stu_exams_info_date='" + stu_exams_info_date + "', stu_exams_info_type='" + stu_exams_info_type + "', stu_exams_info_branch='" + stu_exams_info_branch + "', stu_exams_info_batch='" + stu_exams_info_batch + "', stu_exams_info_course='" + stu_exams_info_course + "' where stu_exams_info_id='" + stu_exams_info_id + "'");
            } else {
                statement.executeUpdate("insert stu_exams_info(stu_exams_info_id, stu_exams_info_name, stu_exams_info_date, stu_exams_info_type, stu_exams_info_branch, stu_exams_info_batch, stu_exams_info_course) values ('" + stu_exams_info_id + "','" + stu_exams_info_name + "','" + stu_exams_info_date + "','" + stu_exams_info_type + "','" + stu_exams_info_branch + "','" + stu_exams_info_batch + "','" + stu_exams_info_course + "')");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public stu_exams_info(String stu_exams_info_id) {
        this.stu_exams_info_id = stu_exams_info_id;
    }
    
    public stu_exams_info() {
    }

    public String getidstu_exams_info(){
        try {
            Connection c = MC_JavaDataBaseConnection.myConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT COUNT(idstu_exams_info) AS x FROM stu_exams_info");
            if (rs.next()) {
                idstu_exams_info = rs.getString("x");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idstu_exams_info;
    }
    public String getStu_exams_info_id() {
        return stu_exams_info_id;
    }

    public void setStu_exams_info_id(String stu_exams_info_id) {
        this.stu_exams_info_id = stu_exams_info_id;
    }

    public String getStu_exams_info_name() {
        return stu_exams_info_name;
    }

    public void setStu_exams_info_name(String stu_exams_info_name) {
        this.stu_exams_info_name = stu_exams_info_name;
    }

    public void setStu_exams_info_type(String stu_exams_info_id) {
        try {
            Connection c=MC_JavaDataBaseConnection.myConnection();
            Statement s=c.createStatement();
            s.executeUpdate("UPDATE stu_exams_info SET stu_exams_info_type='0' WHERE stu_exams_info_id='"+stu_exams_info_id+"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.stu_exams_info_id = stu_exams_info_id;
    }
}
