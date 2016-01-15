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
public class employee_nonAcademic_administrative_user_info {

    private String employee_nonAcademic_administrative_user_info_id, employee_nonAcademic_administrative_user_info_email, employee_nonAcademic_administrative_user_info_status,employee_nonAcademic_administrative_user_info_nic;

    public employee_nonAcademic_administrative_user_info() {
    }


//////////////////////////////////////////Insert//////////////////////////////////////////////

    public employee_nonAcademic_administrative_user_info(String employee_nonAcademic_administrative_user_info_id, String employee_nonAcademic_administrative_user_info_email,  String employee_nonAcademic_administrative_user_info_status,String employee_nonAcademic_administrative_user_info_nic) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        this.employee_nonAcademic_administrative_user_info_email = employee_nonAcademic_administrative_user_info_email;
        this.employee_nonAcademic_administrative_user_info_status = employee_nonAcademic_administrative_user_info_status;
        this.employee_nonAcademic_administrative_user_info_nic=employee_nonAcademic_administrative_user_info_nic;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("select * from employee_nonAcademic_administrative_user_info where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            if (rs.next()) {
                statement.executeUpdate("update employee_nonAcademic_administrative_user_info set employee_nonAcademic_administrative_user_info_email='" + employee_nonAcademic_administrative_user_info_email + "',employee_nonAcademic_administrative_user_info_nic='"+employee_nonAcademic_administrative_user_info_nic+"' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
            } else {
                statement.executeUpdate("insert into employee_nonAcademic_administrative_user_info(employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_administrative_user_info_email,employee_nonAcademic_administrative_user_info_status,employee_nonAcademic_administrative_user_info_nic) values ('" + employee_nonAcademic_administrative_user_info_id + "','" + employee_nonAcademic_administrative_user_info_email + "','" + employee_nonAcademic_administrative_user_info_status + "','"+employee_nonAcademic_administrative_user_info_nic+"')");
            }
//            rs.close();
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/employee_nonAcademic_administrative_user_info;" + ex);
        }

    }

    

    public void setEmployee_nonAcademic_administrative_user_info_id(String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_administrative_user_info(employee_nonAcademic_administrative_user_info_id) values ('" + employee_nonAcademic_administrative_user_info_id + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/employee_nonAcademic_administrative_user_info;" + ex);
        }
    }

   

    public void setEmployee_nonAcademic_administrative_user_info_email(String employee_nonAcademic_administrative_user_info_email) {
        this.employee_nonAcademic_administrative_user_info_email = employee_nonAcademic_administrative_user_info_email;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_administrative_user_info(employee_nonAcademic_administrative_user_info_email) values ('" + employee_nonAcademic_administrative_user_info_email + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 4/employee_nonAcademic_administrative_user_info;" + ex);
        }
    }

    public String getEmployee_nonAcademic_administrative_user_info_status() {
        return employee_nonAcademic_administrative_user_info_status;
    }

    public void setEmployee_nonAcademic_administrative_user_info_status(String employee_nonAcademic_administrative_user_info_status) {
        this.employee_nonAcademic_administrative_user_info_status = employee_nonAcademic_administrative_user_info_status;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_administrative_user_info(employee_nonAcademic_administrative_user_info_status) values ('" + employee_nonAcademic_administrative_user_info_status + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 5/employee_nonAcademic_administrative_user_info;" + ex);
        }

    }

    

    public void setEmployee_nonAcademic_administrative_user_info_nic(String employee_academic_user_info_persona_nic) {
        this.employee_nonAcademic_administrative_user_info_nic = employee_academic_user_info_persona_nic;
    try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_nonAcademic_administrative_user_info(employee_academic_user_info_persona_nic) values ('" + employee_academic_user_info_persona_nic + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 6/employee_nonAcademic_administrative_user_info;" + ex);
        }
    }

    ////////////////////////////////////////////////////////////Update///////////////////////////////////////
    public void setEmployee_nonAcademic_administrative_user_info_email_update(String employee_nonAcademic_administrative_user_info_email, String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        this.employee_nonAcademic_administrative_user_info_email = employee_nonAcademic_administrative_user_info_email;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update employee_nonAcademic_administrative_user_info set employee_nonAcademic_administrative_user_info_email ='" + employee_nonAcademic_administrative_user_info_email + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 7/employee_nonAcademic_administrative_user_info;" + ex);
        }
    }
 public void setEmployee_nonAcademic_administrative_user_info_nic_update(String employee_nonAcademic_administrative_user_info_nic, String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        this.employee_nonAcademic_administrative_user_info_nic = employee_nonAcademic_administrative_user_info_nic;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update employee_nonAcademic_administrative_user_info set employee_nonAcademic_administrative_user_info_nic ='" + employee_nonAcademic_administrative_user_info_nic + "' where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 8/employee_nonAcademic_administrative_user_info;" + ex);
        }
    }
///////////////////////////////////////////////////////////Delete///////////////////////////////////////
    public void setEmployee_nonAcademic_administrative_user_info_status_remove(String employee_nonAcademic_administrative_user_info_status, String employee_nonAcademic_administrative_user_info_id) {
        this.employee_nonAcademic_administrative_user_info_status = employee_nonAcademic_administrative_user_info_status;
        this.employee_nonAcademic_administrative_user_info_id = employee_nonAcademic_administrative_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update employee_nonAcademic_administrative_user_info set employee_nonAcademic_administrative_user_info_status ='" + employee_nonAcademic_administrative_user_info_status + "'where employee_nonAcademic_administrative_user_info_id='" + employee_nonAcademic_administrative_user_info_id + "'");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 9/employee_nonAcademic_administrative_user_info;" + ex);
        }

    }
//////////////////////////////////////////////////Search///////////////////////////////////////////////////
    public String getEmployee_nonAcademic_administrative_user_info_nic(String nic) {
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
             ResultSet rs=statement.executeQuery("select employee_nonAcademic_administrative_user_info_nic from employee_nonAcademic_administrative_user_info where employee_nonAcademic_administrative_user_info_nic like'%"+nic+"%' ");
            employee_nonAcademic_administrative_user_info_nic=rs.getString("employee_nonAcademic_administrative_user_info_nic");
//            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 10/employee_nonAcademic_administrative_user_info;" + ex);
        }
        return employee_nonAcademic_administrative_user_info_nic;
        
    }
    
    public String getEmployee_nonAcademic_administrative_user_info_id() {
        
       
        return employee_nonAcademic_administrative_user_info_id;

    }
    
     public String getEmployee_nonAcademic_administrative_user_info_email() {
       
         return employee_nonAcademic_administrative_user_info_email;
    }

    public String getEmployee_nonAcademic_administrative_user_info_nic() {
      
        return employee_nonAcademic_administrative_user_info_nic;
    }
     
     
}
