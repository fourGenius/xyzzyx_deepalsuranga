/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.academic_employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.Spring.max;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_academic_user_info {
    /*
     Table Names :
     employee_academic_user_info
     employee_academic_user_recovery
     employee_academic_user_status
     employee_academic_user_info_name
     employee_academic_user_info_contact
     employee_academic_user_info_personal
     employee_academic_user_info_qulifications
     employee_academic_user_info_address
     employee_nonAcademic_administrative_user_info
     employee_nonAcademic_administrative_user_recovery
     employee_nonAcademic_administrative_user_status
     */

    //Name: employee_academic_user_info
    private String idemployee_academic_user, employee_academic_user_id, employee_academic_user_email, employee_academic_user_info_status;
    public int max;

    public employee_academic_user_info(String employee_academic_user_id, String employee_academic_user_email, String employee_academic_user_info_status) {

        this.employee_academic_user_id = employee_academic_user_id;
        this.employee_academic_user_email = employee_academic_user_email;
        this.employee_academic_user_info_status = employee_academic_user_info_status;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employee_academic_user_info WHERE employee_academic_user_id='"+employee_academic_user_id+"'");
            if (rs.next()) {
                statement.executeUpdate("UPDATE employee_academic_user_info SET employee_academic_user_email='"+employee_academic_user_email+"' WHERE employee_academic_user_id='" + employee_academic_user_id + "'");
            } else {
                statement.executeUpdate("INSERT INTO employee_academic_user_info(employee_academic_user_id,employee_academic_user_email,employee_academic_user_info_status) VALUES ('" + employee_academic_user_id + "','" + employee_academic_user_email + "','" + employee_academic_user_info_status + "')");

            }
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/Employee info;" + ex);
        }

    }

    public employee_academic_user_info() {
    }

    public String getIdemployee_academic_user() {
        try {
            Connection c = MC_JavaDataBaseConnection.myConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT COUNT(idemployee_academic_user) AS x FROM employee_academic_user_info");
            if (rs.next()) {
                idemployee_academic_user = rs.getString("x");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idemployee_academic_user;
    }

    public String getEmployee_academic_user_id_s(String id) {

        try {
            Connection c = MC_JavaDataBaseConnection.myConnection();
            Statement s = c.createStatement();
            try (ResultSet rs = s.executeQuery("SELECT * FROM employee_academic_user_info where employee_academic_user_id LIKE '%" + id + "%'")) {
                while (rs.next()) {
                    employee_academic_user_id = rs.getString("employee_academic_user_id");
                    System.out.println(rs.getString("employee_academic_user_id"));
                    max = rs.getInt("idemployee_academic_user");
                    System.out.println("Max: " + max);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee_academic_user_id;
    }

    public void setEmployee_academic_user_id(String employee_academic_user_id) {
        this.employee_academic_user_id = employee_academic_user_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO employee_academic_user_info(employee_academic_user_id) VALUES ('" + employee_academic_user_id + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_email() {
        return employee_academic_user_email;
    }

    public void setEmployee_academic_user_email(String employee_academic_user_email) {
        this.employee_academic_user_email = employee_academic_user_email;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_academic_user_info(employee_academic_user_email) values ('" + employee_academic_user_email + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/Employee info;" + ex);
        }
    }

    public String getEmployee_academic_user_info_status() {
        return employee_academic_user_info_status;
    }

    public void setEmployee_academic_user_info_status(String employee_academic_user_info_status) {
        this.employee_academic_user_info_status = employee_academic_user_info_status;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee_academic_user_info(employee_academic_user_info_status) values ('" + employee_academic_user_info_status + "')");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 5/Employee info;" + ex);
        }
    }

}
