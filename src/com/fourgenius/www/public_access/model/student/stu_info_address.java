/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.student;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class stu_info_address {
   
    private String stu_info_address_no,stu_info_address_lane1,stu_info_address_lane2,stu_info_address_city,stu_info_address_province,stu_info_address_cuntry;

    public stu_info_address(String stu_info_address_no, String stu_info_address_lane1, String stu_info_address_lane2, String stu_info_address_city, String stu_info_address_province, String stu_info_address_cuntry) {
        this.stu_info_address_no = stu_info_address_no;
        this.stu_info_address_lane1 = stu_info_address_lane1;
        this.stu_info_address_lane2 = stu_info_address_lane2;
        this.stu_info_address_city = stu_info_address_city;
        this.stu_info_address_province = stu_info_address_province;
        this.stu_info_address_cuntry = stu_info_address_cuntry;
                try {
             Connection connection=MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_info_address(stu_info_address_no,stu_info_address_lane1,stu_info_address_lane2,stu_info_address_city,stu_info_address_province,stu_info_address_cuntry) values ('" +stu_info_address_no + "','" + stu_info_address_lane1 + "','" + stu_info_address_lane2 + "','" + stu_info_address_city + "','" + stu_info_address_province + "','"+stu_info_address_cuntry+"')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }   
    
    }

    public String getStu_info_address_no() {
        return stu_info_address_no;
    }

    public void setStu_info_address_no(String stu_info_address_no) {
        this.stu_info_address_no = stu_info_address_no;
    }

    public String getStu_info_address_lane1() {
        return stu_info_address_lane1;
    }

    public void setStu_info_address_lane1(String stu_info_address_lane1) {
        this.stu_info_address_lane1 = stu_info_address_lane1;
    }

    public String getStu_info_address_lane2() {
        return stu_info_address_lane2;
    }

    public void setStu_info_address_lane2(String stu_info_address_lane2) {
        this.stu_info_address_lane2 = stu_info_address_lane2;
    }

    public String getStu_info_address_city() {
        return stu_info_address_city;
    }

    public void setStu_info_address_city(String stu_info_address_city) {
        this.stu_info_address_city = stu_info_address_city;
    }

    public String getStu_info_address_province() {
        return stu_info_address_province;
    }

    public void setStu_info_address_province(String stu_info_address_province) {
        this.stu_info_address_province = stu_info_address_province;
    }

    public String getStu_info_address_cuntry() {
        return stu_info_address_cuntry;
    }

    public void setStu_info_address_cuntry(String stu_info_address_cuntry) {
        this.stu_info_address_cuntry = stu_info_address_cuntry;
    }
    
}
