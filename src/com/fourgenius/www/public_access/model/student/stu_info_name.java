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
public class stu_info_name {

    private String stu_info_name_sirName, stu_info_name_first_name, stu_info_name_second_name, stu_info_name_last_name;

    public stu_info_name(String stu_info_name_sirName, String stu_info_name_first_name, String stu_info_name_second_name, String stu_info_name_last_name) {
        this.stu_info_name_sirName = stu_info_name_sirName;
        this.stu_info_name_first_name = stu_info_name_first_name;
        this.stu_info_name_second_name = stu_info_name_second_name;
        this.stu_info_name_last_name = stu_info_name_last_name;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_info_name(stu_info_name_sirName,stu_info_name_first_name,stu_info_name_second_name,stu_info_name_last_name) values ('" + stu_info_name_sirName + "','" + stu_info_name_first_name + "','" + stu_info_name_second_name + "','" + stu_info_name_last_name + "')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getStu_info_name_sirName() {
        return stu_info_name_sirName;
    }

    public void setStu_info_name_sirName(String stu_info_name_sirName) {
        this.stu_info_name_sirName = stu_info_name_sirName;
    }

    public String getStu_info_name_first_name() {
        return stu_info_name_first_name;
    }

    public void setStu_info_name_first_name(String stu_info_name_first_name) {
        this.stu_info_name_first_name = stu_info_name_first_name;
    }

    public String getStu_info_name_second_name() {
        return stu_info_name_second_name;
    }

    public void setStu_info_name_second_name(String stu_info_name_second_name) {
        this.stu_info_name_second_name = stu_info_name_second_name;
    }

    public String getStu_info_name_last_name() {
        return stu_info_name_last_name;
    }

    public void setStu_info_name_last_name(String stu_info_name_last_name) {
        this.stu_info_name_last_name = stu_info_name_last_name;
    }

}
