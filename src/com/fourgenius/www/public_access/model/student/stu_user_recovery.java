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
import javax.swing.JOptionPane;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Shadow®
 */
public class stu_user_recovery {

    private String stu_user_info_id, stu_user_recovery_question_no, stu_user_recovery_answer;

    public stu_user_recovery(String stu_user_info_id, String stu_user_recovery_question_no, String stu_user_recovery_answer) {

        this.stu_user_info_id = stu_user_info_id;
        this.stu_user_recovery_question_no = stu_user_recovery_question_no;
        this.stu_user_recovery_answer = stu_user_recovery_answer;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from stu_user_recovery where stu_user_info_id='" + stu_user_info_id + "'");
            if (rs.next()) {

                statement.executeUpdate("update stu_user_recovery set stu_user_recovery_question_no='" + stu_user_recovery_question_no + "',stu_user_recovery_answer='" + stu_user_recovery_answer + "' where stu_user_info_id='" + stu_user_info_id + "')");

            } else {
                statement.executeUpdate("insert into stu_user_recovery(stu_user_info_id,stu_user_recovery_question_no,stu_user_recovery_answer) values ('" + stu_user_info_id + "','" + stu_user_recovery_question_no + "','" + stu_user_recovery_answer + "')");
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/stu_user_recovery;" + ex);
        }
    }

    public String getStu_user_recovery_question_no() {
        return stu_user_recovery_question_no;
    }

    public void setStu_user_recovery_question_no(String stu_user_recovery_question_no) {
        this.stu_user_recovery_question_no = stu_user_recovery_question_no;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into stu_user_recovery (stu_user_recovery_question_no) values ('" + stu_user_recovery_question_no + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/stu_user_recovery;" + ex);
        }
    }

    public String getStu_user_recovery_answer() {
        return stu_user_recovery_answer;
    }

    public void setStu_user_recovery_answer(String stu_user_recovery_answer) {
        this.stu_user_recovery_answer = stu_user_recovery_answer;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into stu_user_recovery (stu_user_recovery_answer) values ('" + stu_user_recovery_answer + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/stu_user_recovery;" + ex);
        }
    }

}
