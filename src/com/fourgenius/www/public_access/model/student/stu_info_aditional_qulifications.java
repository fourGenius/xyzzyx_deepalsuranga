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
public class stu_info_aditional_qulifications {

    private String stu_info_aditional_qulifications_file_id, stu_info_aditional_qulifications_name, stu_info_aditional_qulifications_type, stu_info_aditional_qulifications_year;

    public stu_info_aditional_qulifications(String stu_info_aditional_qulifications_file_id, String stu_info_aditional_qulifications_name, String stu_info_aditional_qulifications_type, String stu_info_aditional_qulifications_year) {
        this.stu_info_aditional_qulifications_file_id = stu_info_aditional_qulifications_file_id;
        this.stu_info_aditional_qulifications_name = stu_info_aditional_qulifications_name;
        this.stu_info_aditional_qulifications_type = stu_info_aditional_qulifications_type;
        this.stu_info_aditional_qulifications_year = stu_info_aditional_qulifications_year;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_exams_info(stu_info_aditional_qulifications_file_id,stu_info_aditional_qulifications_name,stu_info_aditional_qulifications_type,stu_info_aditional_qulifications_year) values ('" + stu_info_aditional_qulifications_file_id + "','" + stu_info_aditional_qulifications_name + "','"+ stu_info_aditional_qulifications_type +"','"+ stu_info_aditional_qulifications_year+"')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getStu_info_aditional_qulifications_file_id() {
        return stu_info_aditional_qulifications_file_id;
    }

    public void setStu_info_aditional_qulifications_file_id(String stu_info_aditional_qulifications_file_id) {
        this.stu_info_aditional_qulifications_file_id = stu_info_aditional_qulifications_file_id;
    }

    public String getStu_info_aditional_qulifications_name() {
        return stu_info_aditional_qulifications_name;
    }

    public void setStu_info_aditional_qulifications_name(String stu_info_aditional_qulifications_name) {
        this.stu_info_aditional_qulifications_name = stu_info_aditional_qulifications_name;
    }

    public String getStu_info_aditional_qulifications_type() {
        return stu_info_aditional_qulifications_type;
    }

    public void setStu_info_aditional_qulifications_type(String stu_info_aditional_qulifications_type) {
        this.stu_info_aditional_qulifications_type = stu_info_aditional_qulifications_type;
    }

    public String getStu_info_aditional_qulifications_year() {
        return stu_info_aditional_qulifications_year;
    }

    public void setStu_info_aditional_qulifications_year(String stu_info_aditional_qulifications_year) {
        this.stu_info_aditional_qulifications_year = stu_info_aditional_qulifications_year;
    }

}
