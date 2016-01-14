/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.nonacademic_employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_nonAcademic_administrative_user_recovery {
    
    private String employee_nonAcademic_administrative_user_recovery_question_no,employee_nonAcademic_administrative_user_recoveryanswer,employee_nonAcademic_administrative_user_info_id;
///////////////////////////////////////////////////////////////////////Insert//////////////////////////////////////////////////////////

    public employee_nonAcademic_administrative_user_recovery(String employee_nonAcademic_administrative_user_recovery_question_no, String employee_nonAcademic_administrative_user_recoveryanswer, String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_administrative_user_recovery_question_no = employee_nonAcademic_administrative_user_recovery_question_no;
        this.employee_nonAcademic_administrative_user_recoveryanswer = employee_nonAcademic_administrative_user_recoveryanswer;
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
    
     try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs=statement.executeQuery("select * from employee_nonAcademic_administrative_user_recovery where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            if (rs.next()) {
             
              statement.executeUpdate("update employee_nonAcademic_administrative_user_recovery set employee_nonAcademic_administrative_user_recovery_question_no='" + employee_nonAcademic_administrative_user_recovery_question_no + "',employee_nonAcademic_administrative_user_recoveryanswer='" + employee_nonAcademic_administrative_user_recoveryanswer + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "')");  
                
         }else{
            statement.executeUpdate("insert into employee_nonAcademic_administrative_user_recovery (employee_nonAcademic_administrative_user_recovery_question_no,employee_nonAcademic_administrative_user_recoveryanswer) values ('" + employee_nonAcademic_administrative_user_recovery_question_no + "','" + employee_nonAcademic_administrative_user_recoveryanswer+ "')");
            }rs.close();
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
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_administrative_user_recovery (employee_nonAcademic_administrative_user_recovery_question_no) values ('" +employee_nonAcademic_administrative_user_recovery_question_no+ "')");
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
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_administrative_user_recovery (employee_nonAcademic_administrative_user_recoveryanswer) values ('" +employee_nonAcademic_administrative_user_recoveryanswer+ "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/employee_nonAcademic_administrative_user_recovery;" + ex);
        }
    }
    
    /////////////////////////////////////////////Update/////////////////////////////////////////////////
    
     public void setEmployee_nonAcademic_administrative_user_recovery_question_no_update(String employee_nonAcademic_administrative_user_recovery_question_no,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_administrative_user_recovery_question_no = employee_nonAcademic_administrative_user_recovery_question_no;
     this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("Update employee_nonAcademic_administrative_user_recovery set employee_nonAcademic_administrative_user_recovery_question_no='" +employee_nonAcademic_administrative_user_recovery_question_no+ "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 4/employee_nonAcademic_administrative_user_recovery;" + ex);
        }
    }
     
     public void setEmployee_nonAcademic_administrative_user_recoveryanswer_update(String employee_nonAcademic_administrative_user_recoveryanswer,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_administrative_user_recoveryanswer = employee_nonAcademic_administrative_user_recoveryanswer;
    this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update employee_nonAcademic_administrative_user_recovery set employee_nonAcademic_administrative_user_recoveryanswer='" +employee_nonAcademic_administrative_user_recoveryanswer+ "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 5/employee_nonAcademic_administrative_user_recovery;" + ex);
        }
    }
     
     
    
    }

