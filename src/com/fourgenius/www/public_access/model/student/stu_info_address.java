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
public class stu_info_address {

    private String stu_user_info_id, stu_info_address_no, stu_info_address_lane1, stu_info_address_lane2, stu_info_address_city, stu_info_address_province, stu_info_address_cuntry;

    public stu_info_address(String stu_user_info_id, String stu_info_address_no, String stu_info_address_lane1, String stu_info_address_lane2, String stu_info_address_city, String stu_info_address_province, String stu_info_address_cuntry) {
        this.stu_user_info_id = stu_user_info_id;
        this.stu_info_address_no = stu_info_address_no;
        this.stu_info_address_lane1 = stu_info_address_lane1;
        this.stu_info_address_lane2 = stu_info_address_lane2;
        this.stu_info_address_city = stu_info_address_city;
        this.stu_info_address_province = stu_info_address_province;
        this.stu_info_address_cuntry = stu_info_address_cuntry;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from stu_info_address where stu_user_info_id='" + stu_user_info_id + "'");
            if (rs.next()) {
                statement.executeUpdate("update stu_info_address set stu_info_address_no='" + stu_info_address_no + "',stu_info_address_lane1='" + stu_info_address_lane1 + "',stu_info_address_lane2='" + stu_info_address_lane2 + "',stu_info_address_city='" + stu_info_address_city + "',stu_info_address_province='" + stu_info_address_province + "',stu_info_address_cuntry='" + stu_info_address_cuntry + "' where stu_user_info_id='" + stu_user_info_id + "'");
            } else {
                statement.executeUpdate("insert stu_info_address(stu_user_info_id,stu_info_address_no,employee_nonAcademic_administrative_user_info_id,stu_info_address_lane1,stu_info_address_lane2,stu_info_address_city,stu_info_address_province,stu_info_address_cuntry) values ('" + stu_user_info_id + "','" + stu_info_address_no + "'," + stu_info_address_lane1 + "','" + stu_info_address_lane2 + "','" + stu_info_address_city + "','" + stu_info_address_province + "','" + stu_info_address_cuntry + "')");
            }
            rs.close();
        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(null, "Error is: 1/stu_info_address;" + ex);
        }
    }

    public String getStu_user_info_id() {
        return stu_user_info_id;
    }

    public void setStu_user_info_id(String stu_user_info_id) {
        this.stu_user_info_id = stu_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_address(stu_user_info_id) values ('" + stu_user_info_id + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 2/stu_info_address;" + ex);
        }
    }

    public String getStu_info_address_no() {
        return stu_info_address_no;
    }

    public void setStu_info_address_no(String stu_info_address_no) {
        this.stu_info_address_no = stu_info_address_no;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_address(stu_info_address_no) values ('" + stu_info_address_no + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 3/stu_info_address;" + ex);
        }
    }

    public String getStu_info_address_lane1() {
        return stu_info_address_lane1;
    }

    public void setStu_info_address_lane1(String stu_info_address_lane1) {
        this.stu_info_address_lane1 = stu_info_address_lane1;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_address(stu_info_address_lane1) values ('" + stu_info_address_lane1 + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 4/stu_info_address;" + ex);
        }
    }

    public String getStu_info_address_lane2() {
        return stu_info_address_lane2;
    }

    public void setStu_info_address_lane2(String stu_info_address_lane2) {
        this.stu_info_address_lane2 = stu_info_address_lane2;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_address(stu_info_address_lane2) values ('" + stu_info_address_lane2 + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 5/stu_info_address;" + ex);
        }
    }

    public String getStu_info_address_city() {
        return stu_info_address_city;
    }

    public void setStu_info_address_city(String stu_info_address_city) {
        this.stu_info_address_city = stu_info_address_city;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_address(stu_info_address_city) values ('" + stu_info_address_city + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 6/stu_info_address;" + ex);
        }
    }

    public String getStu_info_address_province() {
        return stu_info_address_province;
    }

    public void setStu_info_address_province(String stu_info_address_province) {
        this.stu_info_address_province = stu_info_address_province;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_address(stu_info_address_province) values ('" + stu_info_address_province + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 7/stu_info_address;" + ex);
        }
    }

    public String getStu_info_address_cuntry() {
        return stu_info_address_cuntry;
    }

    public void setStu_info_address_cuntry(String stu_info_address_cuntry) {
        this.stu_info_address_cuntry = stu_info_address_cuntry;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert stu_info_address(stu_info_address_cuntry) values ('" + stu_info_address_cuntry + "')");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 8/stu_info_address;" + ex);
        }
    }
    ///////////////////////////////////////////////Update////////////////////////////////////////////////////////

    public void setStu_info_address_no_update(String stu_info_address_no, String stu_user_info_id) {
        this.stu_info_address_no = stu_info_address_no;
        this.stu_user_info_id = stu_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_address set stu_info_address_no ='" + stu_info_address_no + "'  where stu_user_info_id ='" + stu_user_info_id + "'");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 9/stu_info_address;" + ex);
        }
    }

    public void setStu_info_address_lane1_update(String stu_info_address_lane1, String stu_user_info_id) {
        this.stu_info_address_lane1 = stu_info_address_lane1;
        this.stu_user_info_id = stu_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_address set stu_info_address_lane1='" + stu_info_address_lane1 + "' where stu_user_info_id ='" + stu_user_info_id + "'");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 10/stu_info_address;" + ex);
        }
    }

    public void setStu_info_address_lane2_update(String stu_info_address_lane2, String stu_user_info_id) {
        this.stu_info_address_lane2 = stu_info_address_lane2;
        this.stu_user_info_id = stu_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_address set stu_info_address_lane2='" + stu_info_address_lane2 + "' where stu_user_info_id='" + stu_user_info_id + "'");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 11/stu_info_address;" + ex);
        }
    }

    public void setStu_info_address_province_update(String stu_info_address_province, String stu_user_info_id) {
        this.stu_info_address_province = stu_info_address_province;
        this.stu_user_info_id = stu_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_address set stu_info_address_cuntry ='" + stu_info_address_province + "' where stu_user_info_id='" + stu_user_info_id + "'");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 12/stu_info_address;" + ex);
        }
    }

    public void setStu_info_address_city_update(String stu_info_address_city, String stu_user_info_id) {
        this.stu_info_address_city = stu_info_address_city;
        this.stu_user_info_id = stu_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_address set sstu_info_address_city ='" + stu_info_address_city + "' where stu_user_info_id='" + stu_user_info_id + "'");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 13/stu_info_address;" + ex);
        }
    }

    public void setStu_info_address_cuntry_update(String stu_info_address_cuntry, String stu_user_info_id) {
        this.stu_info_address_cuntry = stu_info_address_cuntry;
        this.stu_user_info_id = stu_user_info_id;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update stu_info_address set stu_info_address_cuntry ='" + stu_info_address_cuntry + "' where stu_user_info_id='" + stu_user_info_id + "'");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error is: 14/stu_info_address;" + ex);
        }
    }
}