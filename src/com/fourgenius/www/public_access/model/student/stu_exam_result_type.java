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
public class stu_exam_result_type {
    
    private String stu_exam_result_type_id;

    public stu_exam_result_type(String stu_exam_result_type_id) {
        this.stu_exam_result_type_id = stu_exam_result_type_id;
                try {
             Connection connection=MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_exam_result_type(stu_exam_result_type_id) values ('" + stu_exam_result_type_id + "')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    public String getStu_exam_result_type_id() {
        return stu_exam_result_type_id;
    }

    public void setStu_exam_result_type_id(String stu_exam_result_type_id) {
        this.stu_exam_result_type_id = stu_exam_result_type_id;
    }
    
}
