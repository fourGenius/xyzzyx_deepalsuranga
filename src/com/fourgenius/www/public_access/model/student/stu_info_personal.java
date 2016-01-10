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
public class stu_info_personal {

    private String stu_info_personal_profile_image, stu_info_personal_nic, stu_info_personal_dob, stu_info_personal_age, stu_info_personal_gender, stu_info_personal_course;

    public stu_info_personal(String stu_info_personal_profile_image, String stu_info_personal_nic, String stu_info_personal_dob, String stu_info_personal_age, String stu_info_personal_gender, String stu_info_personal_course) {
        this.stu_info_personal_profile_image = stu_info_personal_profile_image;
        this.stu_info_personal_nic = stu_info_personal_nic;
        this.stu_info_personal_dob = stu_info_personal_dob;
        this.stu_info_personal_age = stu_info_personal_age;
        this.stu_info_personal_gender = stu_info_personal_gender;
        this.stu_info_personal_course = stu_info_personal_course;
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("insert into stu_info_personal(stu_info_personal_profile_image,stu_info_personal_nic,stu_info_personal_dob,stu_info_personal_age,stu_info_personal_gender,stu_info_personal_course) values ('" + stu_info_personal_profile_image + "','" + stu_info_personal_nic + "','" + stu_info_personal_dob + "','" + stu_info_personal_age + "','" + stu_info_personal_gender + "','" + stu_info_personal_course + "')");
        } catch (SQLException ex) {
            Logger.getLogger(stu_exams_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getStu_info_personal_profile_image() {
        return stu_info_personal_profile_image;
    }

    public void setStu_info_personal_profile_image(String stu_info_personal_profile_image) {
        this.stu_info_personal_profile_image = stu_info_personal_profile_image;
    }

    public String getStu_info_personal_nic() {
        return stu_info_personal_nic;
    }

    public void setStu_info_personal_nic(String stu_info_personal_nic) {
        this.stu_info_personal_nic = stu_info_personal_nic;
    }

    public String getStu_info_personal_dob() {
        return stu_info_personal_dob;
    }

    public void setStu_info_personal_dob(String stu_info_personal_dob) {
        this.stu_info_personal_dob = stu_info_personal_dob;
    }

    public String getStu_info_personal_age() {
        return stu_info_personal_age;
    }

    public void setStu_info_personal_age(String stu_info_personal_age) {
        this.stu_info_personal_age = stu_info_personal_age;
    }

    public String getStu_info_personal_gender() {
        return stu_info_personal_gender;
    }

    public void setStu_info_personal_gender(String stu_info_personal_gender) {
        this.stu_info_personal_gender = stu_info_personal_gender;
    }

    public String getStu_info_personal_course() {
        return stu_info_personal_course;
    }

    public void setStu_info_personal_course(String stu_info_personal_course) {
        this.stu_info_personal_course = stu_info_personal_course;
    }

}
