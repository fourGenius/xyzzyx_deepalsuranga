/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.academic_employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import public_access.Md_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_academic_user_recovery {

    private String employee_academic_user_recovery_question_no, employee_academic_user_recovery_answer;

    public employee_academic_user_recovery(String employee_academic_user_recovery_question_no, String employee_academic_user_recovery_answer) {
        this.employee_academic_user_recovery_question_no = employee_academic_user_recovery_question_no;
        this.employee_academic_user_recovery_answer = employee_academic_user_recovery_answer;
        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_academic_user_status values '" + employee_academic_user_recovery_question_no + "','" + employee_academic_user_recovery_answer + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_recovery_question_no() {
        return employee_academic_user_recovery_question_no;
    }

    public void setEmployee_academic_user_recovery_question_no(String employee_academic_user_recovery_question_no) {
        this.employee_academic_user_recovery_question_no = employee_academic_user_recovery_question_no;
        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_academic_user_status values '" + employee_academic_user_recovery_question_no + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_recovery_answer() {
        return employee_academic_user_recovery_answer;
    }

    public void setEmployee_academic_user_recovery_answer(String employee_academic_user_recovery_answer) {
        this.employee_academic_user_recovery_answer = employee_academic_user_recovery_answer;
        try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_academic_user_status values '" + employee_academic_user_recovery_answer + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }
    }

}
