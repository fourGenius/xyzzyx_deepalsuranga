/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.nonacademic_employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import public_access.Md_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_nonAcademic_administrative_user_recovery {
    
    private String employee_nonAcademic_administrative_user_recovery_question_no,employee_nonAcademic_administrative_user_recoveryanswer;

    public employee_nonAcademic_administrative_user_recovery(String employee_nonAcademic_administrative_user_recovery_question_no, String employee_nonAcademic_administrative_user_recoveryanswer) {
        this.employee_nonAcademic_administrative_user_recovery_question_no = employee_nonAcademic_administrative_user_recovery_question_no;
        this.employee_nonAcademic_administrative_user_recoveryanswer = employee_nonAcademic_administrative_user_recoveryanswer;
     try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_recovery (employee_nonAcademic_administrative_user_recovery_question_no,employee_nonAcademic_administrative_user_recoveryanswer) values ('" + employee_nonAcademic_administrative_user_recovery_question_no + "','" + employee_nonAcademic_administrative_user_recoveryanswer+ "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 1/employee_nonAcademic_administrative_user_recovery;" + ex);
        }
    }

    public String getEmployee_nonAcademic_administrative_user_recovery_question_no() {
        return employee_nonAcademic_administrative_user_recovery_question_no;
    }

    public void setEmployee_nonAcademic_administrative_user_recovery_question_no(String employee_nonAcademic_administrative_user_recovery_question_no) {
        this.employee_nonAcademic_administrative_user_recovery_question_no = employee_nonAcademic_administrative_user_recovery_question_no;
     try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_recovery (employee_nonAcademic_administrative_user_recovery_question_no) values ('" +employee_nonAcademic_administrative_user_recovery_question_no+ "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_administrative_user_recovery;" + ex);
        }
    }

    public String getEmployee_nonAcademic_administrative_user_recoveryanswer() {
        return employee_nonAcademic_administrative_user_recoveryanswer;
    }

    public void setEmployee_nonAcademic_administrative_user_recoveryanswer(String employee_nonAcademic_administrative_user_recoveryanswer) {
        this.employee_nonAcademic_administrative_user_recoveryanswer = employee_nonAcademic_administrative_user_recoveryanswer;
    try {
            Connection connection = Md_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into employee_nonAcademic_administrative_user_recovery (employee_nonAcademic_administrative_user_recoveryanswer) values ('" +employee_nonAcademic_administrative_user_recoveryanswer+ "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/employee_nonAcademic_administrative_user_recovery;" + ex);
        }
    }
    
    
}
