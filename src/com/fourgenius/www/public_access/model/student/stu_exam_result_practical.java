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
public class stu_exam_result_practical {
    
    private String stu_exam_result_practical_id,stu_exam_result_practical_name,stu_exam_result_practical_mark;

    public String getStu_exam_result_practical_id() {
        return stu_exam_result_practical_id;
    }

    public void setStu_exam_result_practical_id(String stu_exam_result_practical_id) {
        this.stu_exam_result_practical_id = stu_exam_result_practical_id;
    }

    public String getStu_exam_result_practical_name() {
        return stu_exam_result_practical_name;
    }
    
    public void setStu_exam_result_practical_name(String stu_exam_result_practical_name) {
        this.stu_exam_result_practical_name = stu_exam_result_practical_name;
    }

    public String getStu_exam_result_practical_mark() {
        return stu_exam_result_practical_mark;
    }

    public void setStu_exam_result_practical_mark(String stu_exam_result_practical_mark) {
        this.stu_exam_result_practical_mark = stu_exam_result_practical_mark;
    }

    public stu_exam_result_practical(String stu_exam_result_practical_id, String stu_exam_result_practical_name, String stu_exam_result_practical_mark) {
        this.stu_exam_result_practical_id = stu_exam_result_practical_id;
        this.stu_exam_result_practical_name = stu_exam_result_practical_name;
        this.stu_exam_result_practical_mark = stu_exam_result_practical_mark;
    
      try {
             Connection connection=MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_exam_result_practical(stu_exam_result_practical_id,stu_exam_result_practical_name,stu_exam_result_practical_mark) values ('" +stu_exam_result_practical_id + "','" + stu_exam_result_practical_name + "','"+stu_exam_result_practical_mark+"')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
