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
public class stu_exams_info {
    private String stu_exams_info_id,stu_exams_info_name;

    public stu_exams_info(String stu_exams_info_id, String stu_exams_info_name) {
        this.stu_exams_info_id = stu_exams_info_id;
        this.stu_exams_info_name = stu_exams_info_name;
          
        try {
             Connection connection=MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_exams_info(stu_exams_info_id,stu_exams_info_name) values ('" +stu_exams_info_id + "','" + stu_exams_info_name + "')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }   
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
    
}
