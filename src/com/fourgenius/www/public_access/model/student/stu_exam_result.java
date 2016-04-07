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
public class stu_exam_result {

    private String stu_user_info_id, stu_exam_mark, stu_exam_result, stu_exams_info_id;

    public stu_exam_result(String stu_user_info_id, String stu_exam_mark, String stu_exam_result, String stu_exams_info_id) {
        this.stu_user_info_id = stu_user_info_id;
        this.stu_exam_mark = stu_exam_mark;
        this.stu_exam_result = stu_exam_result;
        this.stu_exams_info_id = stu_exams_info_id;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM stu_exam_result where stu_user_info_id='"+stu_user_info_id+"'");
            if (rs.next()) {
                statement.executeUpdate("UPDATE stu_exam_result set stu_exam_mark='"+stu_exam_mark+"', stu_exam_result='"+stu_exam_result+"' WHERE stu_user_info_id='"+stu_user_info_id+"' AND stu_exams_info_id='"+stu_exams_info_id+"'");
            } else {
                statement.executeUpdate("INSERT stu_exam_result(stu_user_info_id, stu_exam_mark, stu_exam_result, stu_exams_info_id) VALUES ('"+stu_user_info_id+"','"+stu_exam_mark+"','"+stu_exam_result+"','"+stu_exams_info_id+"')");
            }
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getStu_user_info_id() {
        return stu_user_info_id;
    }

    public void setStu_user_info_id(String stu_user_info_id) {
        this.stu_user_info_id = stu_user_info_id;
    }

}
