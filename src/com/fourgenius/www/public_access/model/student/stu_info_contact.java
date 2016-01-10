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
public class stu_info_contact {

    private String stu_info_telephone_mobile, stu_info_telephone_land;

    public stu_info_contact(String stu_info_telephone_mobile, String stu_info_telephone_land) {
        this.stu_info_telephone_mobile = stu_info_telephone_mobile;
        this.stu_info_telephone_land = stu_info_telephone_land;

        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_info_contact(stu_info_telephone_mobile,stu_info_telephone_land) values ('" + stu_info_telephone_mobile + "','" + stu_info_telephone_land + "')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getStu_info_telephone_mobile() {
        return stu_info_telephone_mobile;
    }

    public void setStu_info_telephone_mobile(String stu_info_telephone_mobile) {
        this.stu_info_telephone_mobile = stu_info_telephone_mobile;
    }

    public String getStu_info_telephone_land() {
        return stu_info_telephone_land;
    }

    public void setStu_info_telephone_land(String stu_info_telephone_land) {
        this.stu_info_telephone_land = stu_info_telephone_land;
    }

}
