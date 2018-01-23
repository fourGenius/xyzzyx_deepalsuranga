package com.fourgenius.www.public_access.registration.student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author deepalsuranga
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author deepal_suranga
 */
public class user_image_copy {
    
//    public static void main(String[] args) {
//        user_image_copy aa=new user_image_copy();
//        aa.copyImage("C://Users//deepa//Documents//FourGenius//xyzzyx_deepalsuranga//943341583v-Weerasinghe-capture.jpg");
//    }

    public void copyImage(String fullname) {
        fullname=fullname.replace("/", "-");
        try {
            File file = null;
            File file_stu = null;
            if (file==null) {
                file=new File("C:\\FourGenius\\Student_Images\\");
                file_stu=new File("C:\\FourGenius\\STUDENT_FOLDERS\\"+fullname);
                file.mkdirs();
                file_stu.mkdirs();
            }
            
            
            FileInputStream from = new FileInputStream("C:\\FourGenius\\" + fullname + ".jpg");
            FileOutputStream to = new FileOutputStream("C:\\FourGenius\\Student_Images\\" + fullname + ".jpg");
            Jp_registration_student_informations pic = new Jp_registration_student_informations("C:\\FourGenius\\Student_Images\\" + fullname + ".jpg");
            byte[] buffer = new byte[4096];
            int byteRead;
            while ((byteRead = from.read(buffer)) != -1) {

                to.write(buffer, 0, byteRead);

            }
            from.close();
            to.close();
            System.out.println("File is Coped!");
        } catch (Exception e) {
        }
    }

}
