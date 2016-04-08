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
public class stu_practical_info {

    private String idstu_practical_info,stu_practical_info_id, stu_practical_info_name, stu_practical_info_date, stu_practical_info_type, stu_practical_info_branch, stu_practical_info_batch, stu_practical_info_course;

    public stu_practical_info(String stu_practical_info_id, String stu_practical_info_name, String stu_practical_info_date, String stu_practical_info_type, String stu_practical_info_branch, String stu_practical_info_batch, String stu_practical_info_course) {
        this.stu_practical_info_id = stu_practical_info_id;
        this.stu_practical_info_name = stu_practical_info_name;
        this.stu_practical_info_date = stu_practical_info_date;
        this.stu_practical_info_type = stu_practical_info_type;
        this.stu_practical_info_branch = stu_practical_info_branch;
        this.stu_practical_info_batch = stu_practical_info_batch;
        this.stu_practical_info_course = stu_practical_info_course;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();            
            ResultSet rs = statement.executeQuery("select * from stu_practical_info where stu_practical_info_id='" + stu_practical_info_id + "'");
            if (rs.next()) {;
                statement.executeUpdate("update stu_practical_info set stu_practical_info_name='" + stu_practical_info_name + "', stu_practical_info_date='" + stu_practical_info_date + "', stu_practical_info_type='" + stu_practical_info_type + "', stu_practical_info_branch='" + stu_practical_info_branch + "', stu_practical_info_batch='" + stu_practical_info_batch + "', stu_practical_info_course='" + stu_practical_info_course + "' where stu_practical_info_id='" + stu_practical_info_id + "'");
            } else {
                statement.executeUpdate("insert stu_practical_info(stu_practical_info_id, stu_practical_info_name, stu_practical_info_date, stu_practical_info_type, stu_practical_info_branch, stu_practical_info_batch, stu_practical_info_course) values ('" + stu_practical_info_id + "','" + stu_practical_info_name + "','" + stu_practical_info_date + "','" + stu_practical_info_type + "','" + stu_practical_info_branch + "','" + stu_practical_info_batch + "','" + stu_practical_info_course + "')");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(stu_practical_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public stu_practical_info() {
    }

    public String getidstu_practical_info(){
        try {
            Connection c = MC_JavaDataBaseConnection.myConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT COUNT(idstu_practical_info) AS x FROM stu_practical_info");
            if (rs.next()) {
                idstu_practical_info = rs.getString("x");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idstu_practical_info;
    }
    public String getStu_practical_info_id() {
        return stu_practical_info_id;
    }

    public void setStu_practical_info_id(String stu_practical_info_id) {
        this.stu_practical_info_id = stu_practical_info_id;
    }

    public String getStu_practical_info_name() {
        return stu_practical_info_name;
    }

    public void setStu_practical_info_name(String stu_practical_info_name) {
        this.stu_practical_info_name = stu_practical_info_name;
    }

}
