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
public class stu_user_recovery {

    private String stu_user_recovery_question_no, stu_user_recovery_answer;

    public stu_user_recovery(String stu_user_recovery_question_no, String stu_user_recovery_answer) {
        this.stu_user_recovery_question_no = stu_user_recovery_question_no;
        this.stu_user_recovery_answer = stu_user_recovery_answer;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_user_recovery(stu_user_recovery_question_no,stu_user_recovery_answer) values ('" + stu_user_recovery_question_no + "','" + stu_user_recovery_answer + "')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getStu_user_recovery_question_no() {
        return stu_user_recovery_question_no;
    }

    public void setStu_user_recovery_question_no(String stu_user_recovery_question_no) {
        this.stu_user_recovery_question_no = stu_user_recovery_question_no;
    }

    public String getStu_user_recovery_answer() {
        return stu_user_recovery_answer;
    }

    public void setStu_user_recovery_answer(String stu_user_recovery_answer) {
        this.stu_user_recovery_answer = stu_user_recovery_answer;
    }

}
