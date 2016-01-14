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
public class employee_nonAcademic_user_info_contact {
    private String employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_user_info_contact_mobile,employee_nonAcademic_user_info_contact_land,employee_nonAcademic_user_info_contact_email ;

    public employee_nonAcademic_user_info_contact() {
    }
//////////////////////////////////////////////////Insert///////////////////////////////////////////////
    public employee_nonAcademic_user_info_contact(String employee_nonAcademic_administrative_user_info_id, String employee_nonAcademic_user_info_contact_mobile, String employee_nonAcademic_user_info_contact_land, String employee_nonAcademic_user_info_contact_email) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        this.employee_nonAcademic_user_info_contact_mobile = employee_nonAcademic_user_info_contact_mobile;
        this.employee_nonAcademic_user_info_contact_land = employee_nonAcademic_user_info_contact_land;
        this.employee_nonAcademic_user_info_contact_email = employee_nonAcademic_user_info_contact_email;
    
         try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from employee_nonAcademic_user_info_contact where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            if (rs.next()) {
               statement.executeUpdate("update employee_nonAcademic_user_info_contact set employee_nonAcademic_user_info_contact_mobile='" + employee_nonAcademic_user_info_contact_mobile + "',employee_nonAcademic_user_info_contact_land='" + employee_nonAcademic_user_info_contact_land+ "' ,employee_nonAcademic_user_info_contact_email='" + employee_nonAcademic_user_info_contact_email + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            } else {
               statement.executeUpdate("insert into employee_nonAcademic_user_info_contact(employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_user_info_contact_mobile,employee_nonAcademic_user_info_contact_land,employee_nonAcademic_user_info_contact_email) values ('"+employee_nonAcademic_administrative_user_info_id+"','" + employee_nonAcademic_user_info_contact_mobile + "','" + employee_nonAcademic_user_info_contact_land + "','" + employee_nonAcademic_user_info_contact_email +"')");
            }
            rs.close();
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/employee_nonAcademic_user_info_contact;" + ex);
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
        statement.executeUpdate("insert into employee_nonAcademic_user_info_contact(employee_nonAcademic_administrative_user_info_id) values ('"+employee_nonAcademic_administrative_user_info_id+"')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_contact;" + ex);
        }
    }

    public String getEmployee_nonAcademic_user_info_contact_mobile() {
        return employee_nonAcademic_user_info_contact_mobile;
    }

    public void setEmployee_nonAcademic_user_info_contact_mobile(String employee_nonAcademic_user_info_contact_mobile) {
        this.employee_nonAcademic_user_info_contact_mobile = employee_nonAcademic_user_info_contact_mobile;
     try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert into employee_nonAcademic_user_info_contact(employee_nonAcademic_user_info_contact_mobile) values (" + employee_nonAcademic_user_info_contact_mobile + "')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 3/employee_nonAcademic_user_info_contact;" + ex);
        }
    }

    public String getEmployee_nonAcademic_user_info_contact_land() {
        return employee_nonAcademic_user_info_contact_land;
    }

    public void setEmployee_nonAcademic_user_info_contact_land(String employee_nonAcademic_user_info_contact_land) {
        this.employee_nonAcademic_user_info_contact_land = employee_nonAcademic_user_info_contact_land;
     try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert into employee_nonAcademic_user_info_contact(employee_nonAcademic_user_info_contact_land) values ('" + employee_nonAcademic_user_info_contact_land + "')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 4/employee_nonAcademic_user_info_contact;" + ex);
        }
    }

    public String getEmployee_nonAcademic_user_info_contact_email() {
        return employee_nonAcademic_user_info_contact_email;
    }

    public void setEmployee_nonAcademic_user_info_contact_email(String employee_nonAcademic_user_info_contact_email) {
        this.employee_nonAcademic_user_info_contact_email = employee_nonAcademic_user_info_contact_email;
     try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert into employee_nonAcademic_user_info_contact(employee_nonAcademic_user_info_contact_email) values ('" + employee_nonAcademic_user_info_contact_email + "')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 5/employee_nonAcademic_user_info_contact;" + ex);
        }
    }
    
    /////////////////////////////////////////////////////////Update////////////////////////////////////////////////////////////////////////////////
    public void setEmployee_nonAcademic_user_info_contact_email_update(String employee_nonAcademic_user_info_contact_email,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_contact_email = employee_nonAcademic_user_info_contact_email;
     
        try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("update employee_nonAcademic_user_info_contact set employee_nonAcademic_user_info_contact_email='" + employee_nonAcademic_user_info_contact_email + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 6/employee_nonAcademic_user_info_contact;" + ex);
        }
    }
    
    public void setEmployee_nonAcademic_user_info_contact_land_update(String employee_nonAcademic_user_info_contact_land,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_contact_land = employee_nonAcademic_user_info_contact_land;
     
        try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("update employee_nonAcademic_user_info_contact set employee_nonAcademic_user_info_contact_land='" + employee_nonAcademic_user_info_contact_land+ "'  where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 7/employee_nonAcademic_user_info_contact;" + ex);
        }
    }
    
    public void setEmployee_nonAcademic_user_info_contact_mobile_update(String employee_nonAcademic_user_info_contact_mobile,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_contact_mobile = employee_nonAcademic_user_info_contact_mobile;
     
        try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("update employee_nonAcademic_user_info_contact set employee_nonAcademic_user_info_contact_mobile='" + employee_nonAcademic_user_info_contact_mobile + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 8/employee_nonAcademic_user_info_contact;" + ex);
        }
    }
}
