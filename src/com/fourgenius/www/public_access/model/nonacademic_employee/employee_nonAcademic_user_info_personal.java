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
public class employee_nonAcademic_user_info_personal {
    
    private String employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_user_info_personal_profile_image,employee_nonAcademic_user_info_personal_dob,employee_nonAcademic_user_info_personal_gender;

    public employee_nonAcademic_user_info_personal() {
    }

    public employee_nonAcademic_user_info_personal(String employee_nonAcademic_administrative_user_info_id, String employee_nonAcademic_user_info_personal_profile_image, String employee_nonAcademic_user_info_personal_dob, String employee_nonAcademic_user_info_personal_gender) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        this.employee_nonAcademic_user_info_personal_profile_image = employee_nonAcademic_user_info_personal_profile_image;
        this.employee_nonAcademic_user_info_personal_dob = employee_nonAcademic_user_info_personal_dob;
        this.employee_nonAcademic_user_info_personal_gender = employee_nonAcademic_user_info_personal_gender;
    
    try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from employee_nonAcademic_user_info_personal where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            if (rs.next()) {
               statement.executeUpdate("update employee_nonAcademic_user_info_personal set employee_nonAcademic_user_info_personal_profile_image='" + employee_nonAcademic_user_info_personal_profile_image + "',employee_nonAcademic_user_info_personal_dob='" + employee_nonAcademic_user_info_personal_dob+ "' ,employee_nonAcademic_user_info_personal_gender='" + employee_nonAcademic_user_info_personal_gender + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            } else {
               statement.executeUpdate("insert employee_nonAcademic_user_info_personal(employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_user_info_personal_profile_image,employee_nonAcademic_user_info_personal_dob,employee_nonAcademic_user_info_personal_gender) values ('"+employee_nonAcademic_administrative_user_info_id+"'," + employee_nonAcademic_user_info_personal_profile_image + "','" + employee_nonAcademic_user_info_personal_dob+ "','" + employee_nonAcademic_user_info_personal_gender + "')");
            }
            rs.close();
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/employee_nonAcademic_user_info_personal;" + ex);
        }
    }

    public String getEmployee_nonAcademic_administrative_user_info_id() {
        return employee_nonAcademic_administrative_user_info_id;
    }

    public void setEmployee_nonAcademic_administrative_user_info_id(String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
    try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert employee_nonAcademic_user_info_personal(employee_nonAcademic_administrative_user_info_id) values ('"+employee_nonAcademic_administrative_user_info_id+"')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_personal;" + ex);
        }
    }

    public String getEmployee_nonAcademic_user_info_personal_profile_image() {
        return employee_nonAcademic_user_info_personal_profile_image;
    
    }

    public void setEmployee_nonAcademic_user_info_personal_profile_image(String employee_nonAcademic_user_info_personal_profile_image) {
        this.employee_nonAcademic_user_info_personal_profile_image = employee_nonAcademic_user_info_personal_profile_image;
     try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert employee_nonAcademic_user_info_personal(employee_nonAcademic_user_info_personal_profile_image) values ('" + employee_nonAcademic_user_info_personal_profile_image + "')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 3/employee_nonAcademic_user_info_personal;" + ex);
        }
    }

    public String getEmployee_nonAcademic_user_info_personal_dob() {
        return employee_nonAcademic_user_info_personal_dob;
    }

    public void setEmployee_nonAcademic_user_info_personal_dob(String employee_nonAcademic_user_info_personal_dob) {
        this.employee_nonAcademic_user_info_personal_dob = employee_nonAcademic_user_info_personal_dob;
     try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert employee_nonAcademic_user_info_personal(employee_nonAcademic_user_info_personal_dob) values ('" + employee_nonAcademic_user_info_personal_dob+ "')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 4/employee_nonAcademic_user_info_personal;" + ex);
        }
    }

    public String getEmployee_nonAcademic_user_info_personal_gender() {
        return employee_nonAcademic_user_info_personal_gender;
    }

    public void setEmployee_nonAcademic_user_info_personal_gender(String employee_nonAcademic_user_info_personal_gender) {
        this.employee_nonAcademic_user_info_personal_gender = employee_nonAcademic_user_info_personal_gender;
     try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert employee_nonAcademic_user_info_personal(employee_nonAcademic_user_info_personal_gender) values ('" + employee_nonAcademic_user_info_personal_gender + "')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 5/employee_nonAcademic_user_info_personal;" + ex);
        }
    }

///////////////////////////////////////////////////////////Update//////////////////////////////////////////////////////////////////////////////
  public void setEmployee_nonAcademic_user_info_personal_gender_update(String employee_nonAcademic_user_info_personal_gender,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_personal_gender = employee_nonAcademic_user_info_personal_gender;
     this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("update employee_nonAcademic_user_info_personal set employee_nonAcademic_user_info_personal_gender='" + employee_nonAcademic_user_info_personal_gender + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 6/employee_nonAcademic_user_info_personal;" + ex);
        }
    }
  
public void setEmployee_nonAcademic_user_info_personal_dob_update(String employee_nonAcademic_user_info_personal_dob,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_personal_dob = employee_nonAcademic_user_info_personal_dob;
     this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("update employee_nonAcademic_user_info_personal set employee_nonAcademic_user_info_personal_dob='" + employee_nonAcademic_user_info_personal_dob+ "'  where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 7/employee_nonAcademic_user_info_personal;" + ex);
        }
    }

 public void setEmployee_nonAcademic_user_info_personal_profile_image_update(String employee_nonAcademic_user_info_personal_profile_image,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_personal_profile_image = employee_nonAcademic_user_info_personal_profile_image;
     this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("update employee_nonAcademic_user_info_personal set employee_nonAcademic_user_info_personal_profile_image='" + employee_nonAcademic_user_info_personal_profile_image + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 8/employee_nonAcademic_user_info_personal;" + ex);
        }
    }
}
