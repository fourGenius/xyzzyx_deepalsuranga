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
public class employee_nonAcademic_user_info_name {

    private String employee_nonAcademic_administrative_user_info_id, employee_nonAcademic_user_info_name_sirName, employee_nonAcademic_user_info_name_first_name, employee_nonAcademic_user_info_name_last_name,fullName;

    public employee_nonAcademic_user_info_name() {
    }
//////////////////////////////////////////////////////Insert//////////////////////////////////////////////

    public employee_nonAcademic_user_info_name(String employee_nonAcademic_administrative_user_info_id, String employee_nonAcademic_user_info_name_sirName, String employee_nonAcademic_user_info_name_first_name, String employee_nonAcademic_user_info_name_last_name) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        this.employee_nonAcademic_user_info_name_sirName = employee_nonAcademic_user_info_name_sirName;
        this.employee_nonAcademic_user_info_name_first_name = employee_nonAcademic_user_info_name_first_name;
        this.employee_nonAcademic_user_info_name_last_name = employee_nonAcademic_user_info_name_last_name;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from employee_nonAcademic_user_info_name where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            if (rs.next()) {
                statement.executeUpdate("update employee_nonAcademic_user_info_name set employee_nonAcademic_user_info_name_sirName='" + employee_nonAcademic_user_info_name_sirName + "',employee_nonAcademic_user_info_name_first_name='" + employee_nonAcademic_user_info_name_first_name + "' ,employee_nonAcademic_user_info_name_last_name='" + employee_nonAcademic_user_info_name_last_name + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            } else {
                statement.executeUpdate("insert into employee_nonAcademic_user_info_name(employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_user_info_name_sirName,employee_nonAcademic_user_info_name_last_name,employee_nonAcademic_user_info_name_first_name) values ('" + employee_nonAcademic_administrative_user_info_id + "','" + employee_nonAcademic_user_info_name_sirName + "','" + employee_nonAcademic_user_info_name_last_name + "','" + employee_nonAcademic_user_info_name_first_name + "')");
            }
//            rs.close();
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/employee_nonAcademic_user_info_name;" + ex);
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
            statement.executeUpdate("insert into employee_nonAcademic_user_info_name(employee_nonAcademic_administrative_user_info_id) values ('" + employee_nonAcademic_administrative_user_info_id + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_name;" + ex);
        }
    }

    

    public void setEmployee_nonAcademic_user_info_name_sirName(String employee_nonAcademic_user_info_name_sirName) {
        this.employee_nonAcademic_user_info_name_sirName = employee_nonAcademic_user_info_name_sirName;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_user_info_name(employee_nonAcademic_user_info_name_sirName) values ('" + employee_nonAcademic_user_info_name_sirName + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/employee_nonAcademic_user_info_name;" + ex);
        }
    }

   

    public void setEmployee_nonAcademic_user_info_name_first_name(String employee_nonAcademic_user_info_name_first_name) {
        this.employee_nonAcademic_user_info_name_first_name = employee_nonAcademic_user_info_name_first_name;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_user_info_name(employee_nonAcademic_user_info_name_first_name) values ('" + employee_nonAcademic_user_info_name_first_name + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 4/employee_nonAcademic_user_info_name;" + ex);
        }

    }

   

    public void setEmployee_nonAcademic_user_info_name_last_name(String employee_nonAcademic_user_info_name_last_name) {
        this.employee_nonAcademic_user_info_name_last_name = employee_nonAcademic_user_info_name_last_name;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_user_info_name(employee_nonAcademic_user_info_name_last_name) values ('" + employee_nonAcademic_user_info_name_last_name + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 5/employee_nonAcademic_user_info_name;" + ex);
        }
    }
////////////////////////////////////////////////Update/////////////////////////////////////////////////

    public void setEmployee_nonAcademic_user_info_name_sirName_update(String employee_nonAcademic_user_info_name_sirName, String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_name_sirName = employee_nonAcademic_user_info_name_sirName;
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update employee_nonAcademic_user_info_name set employee_nonAcademic_user_info_name_sirName ='" + employee_nonAcademic_user_info_name_sirName + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 6/employee_nonAcademic_user_info_name;" + ex);
        }
    }

    public void setEmployee_nonAcademic_user_info_name_first_name_update(String employee_nonAcademic_user_info_name_first_name, String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_name_first_name = employee_nonAcademic_user_info_name_first_name;
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update employee_nonAcademic_user_info_name set employee_nonAcademic_user_info_name_first_name='" + employee_nonAcademic_user_info_name_first_name + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 7/employee_nonAcademic_user_info_name;" + ex);
        }

    }

    public void setEmployee_nonAcademic_user_info_name_last_name_update(String employee_nonAcademic_user_info_name_last_name, String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_name_last_name = employee_nonAcademic_user_info_name_last_name;
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update employee_nonAcademic_user_info_name set Employee_nonAcademic_user_info_name_last_name='" + employee_nonAcademic_user_info_name_last_name + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 8/employee_nonAcademic_user_info_name;" + ex);
        }
    }
    //////////////////////////////////////Search//////////////////////////////////////////////////////////
    public String getFullName(String name) {
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs=statement.executeQuery("select  concat_ws(employee_nonAcademic_user_info_name_sirName,employee_nonAcademic_user_info_name_first_name,employee_nonAcademic_user_info_name_last_name) as fullname  from employee_nonAcademic_user_info_name where employee_nonAcademic_user_info_name_sirName like '%"+name+"%' or employee_nonAcademic_user_info_name_first_name like '%"+name+"%' or employee_nonAcademic_user_info_name_last_name like '%"+name+"%'");
            fullName=rs.getString("fullname");
//            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 9/employee_nonAcademic_administrative_user_info;" + ex);
        }
        return fullName;
        
    }
 
     public String getEmployee_nonAcademic_user_info_name_last_name() {
        
         return employee_nonAcademic_user_info_name_last_name;
    }
     
     public String getEmployee_nonAcademic_user_info_name_sirName() {
       
         return employee_nonAcademic_user_info_name_sirName;
    }
     
     public String getEmployee_nonAcademic_user_info_name_first_name() {
       
         return employee_nonAcademic_user_info_name_first_name;
    } 
}
