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
public class employee_nonAcademic_user_info_address {
  private String employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_user_info_address_lane1,employee_nonAcademic_user_info_address_city,employee_nonAcademic_user_info_address_cuntry;

    public employee_nonAcademic_user_info_address() {
    }
///////////////////////////////////////////////////////Insert/////////////////////////////////////////////
    public employee_nonAcademic_user_info_address(String employee_nonAcademic_administrative_user_info_id, String employee_nonAcademic_user_info_address_lane1, String employee_nonAcademic_user_info_address_city, String employee_nonAcademic_user_info_address_cuntry) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        this.employee_nonAcademic_user_info_address_lane1 = employee_nonAcademic_user_info_address_lane1;
        this.employee_nonAcademic_user_info_address_city = employee_nonAcademic_user_info_address_city;
        this.employee_nonAcademic_user_info_address_cuntry = employee_nonAcademic_user_info_address_cuntry;
    
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from employee_nonAcademic_user_info_address where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            if (rs.next()) {
               statement.executeUpdate("update employee_nonAcademic_user_info_address set employee_nonAcademic_user_info_address_lane1='" + employee_nonAcademic_user_info_address_lane1 + "',employee_nonAcademic_user_info_address_city='" + employee_nonAcademic_user_info_address_city+ "' ,employee_nonAcademic_user_info_address_cuntry='" + employee_nonAcademic_user_info_address_cuntry + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            } else {
               statement.executeUpdate("insert into employee_nonAcademic_user_info_address(employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_user_info_address_lane1,employee_nonAcademic_user_info_address_city,employee_nonAcademic_user_info_address_cuntry) values ('"+employee_nonAcademic_administrative_user_info_id+"','" + employee_nonAcademic_user_info_address_lane1 + "','"+employee_nonAcademic_user_info_address_city+"','" + employee_nonAcademic_user_info_address_cuntry + "')");
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
        statement.executeUpdate("insert employee_nonAcademic_user_info_address(employee_nonAcademic_administrative_user_info_id) values ('"+employee_nonAcademic_administrative_user_info_id+"')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_address;" + ex);
        }
    }

    public String getEmployee_nonAcademic_user_info_address_lane1() {
        return employee_nonAcademic_user_info_address_lane1;
    }

    public void setEmployee_nonAcademic_user_info_address_lane1(String employee_nonAcademic_user_info_address_lane1) {
        this.employee_nonAcademic_user_info_address_lane1 = employee_nonAcademic_user_info_address_lane1;
    try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert employee_nonAcademic_user_info_address(employee_nonAcademic_user_info_address_lane1) values ('" + employee_nonAcademic_user_info_address_lane1 + "')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_address;" + ex);
        }
    }

    public String getEmployee_nonAcademic_user_info_address_city() {
        return employee_nonAcademic_user_info_address_city;
    }

    public void setEmployee_nonAcademic_user_info_address_city(String employee_nonAcademic_user_info_address_city) {
        this.employee_nonAcademic_user_info_address_city = employee_nonAcademic_user_info_address_city;
    
    try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert employee_nonAcademic_user_info_address(employee_nonAcademic_user_info_address_city) values ('"+employee_nonAcademic_user_info_address_city+"')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_address;" + ex);
        }
    }

    public String getEmployee_nonAcademic_user_info_address_cuntry() {
        return employee_nonAcademic_user_info_address_cuntry;
    }

    public void setEmployee_nonAcademic_user_info_address_cuntry(String employee_nonAcademic_user_info_address_cuntry) {
        this.employee_nonAcademic_user_info_address_cuntry = employee_nonAcademic_user_info_address_cuntry;
    
    try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("insert employee_nonAcademic_user_info_address(employee_nonAcademic_user_info_address_cuntry) values ('" + employee_nonAcademic_user_info_address_cuntry + "')");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_address;" + ex);
        }
    }
  
 ///////////////////////////////////////////////Update////////////////////////////////////////////////////////
    
    public void setEmployee_nonAcademic_user_info_address_cuntry_update(String employee_nonAcademic_user_info_address_cuntry,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_address_cuntry = employee_nonAcademic_user_info_address_cuntry;
    this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
    try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("update employee_nonAcademic_user_info_address set employee_nonAcademic_user_info_address_cuntry='" + employee_nonAcademic_user_info_address_cuntry + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_address;" + ex);
        }
    }
    
     public void setEmployee_nonAcademic_user_info_address_city_update(String employee_nonAcademic_user_info_address_city,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_address_city = employee_nonAcademic_user_info_address_city;
    this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
    try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
        statement.executeUpdate("update employee_nonAcademic_user_info_address set employee_nonAcademic_user_info_address_city='" + employee_nonAcademic_user_info_address_city+ "'  where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_address;" + ex);
        }
    }

public void setEmployee_nonAcademic_user_info_address_lane1_update(String employee_nonAcademic_user_info_address_lane1,String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_user_info_address_lane1 = employee_nonAcademic_user_info_address_lane1;
    this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
             Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
       statement.executeUpdate("update employee_nonAcademic_user_info_address set employee_nonAcademic_user_info_address_lane1='" + employee_nonAcademic_user_info_address_lane1 + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "Error is: 2/employee_nonAcademic_user_info_address;" + ex);
        }
    }
}
