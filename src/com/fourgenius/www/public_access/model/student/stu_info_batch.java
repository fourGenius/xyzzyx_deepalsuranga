/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.student;

import java.sql.Connection;
import java.sql.Statement;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class stu_info_batch {
    private String stu_user_info_id,batch,year,course;

    public stu_info_batch(String stu_user_info_id, String batch, String year, String course) {
        this.stu_user_info_id = stu_user_info_id;
        this.batch = batch;
        this.year = year;
        this.course = course;
        try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert stu_info_batch(stu_user_info_id,batch,year,course,) values ('" + stu_user_info_id + "','" + batch + "','"+ year +"','"+ course+"')");
        } catch (Exception e) {
        }
    }

    public void setStu_user_info_id(String stu_user_info_id) {
        this.stu_user_info_id = stu_user_info_id;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
}
