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
        String user_dir = System.getProperty("user.home");
        try {
//            File file=new File("C:\\FSC\\Images");
//            if (file==null) {
//                file.mkdirs();
//            }else{
//            
//            }
//            
//            

            FileInputStream from = new FileInputStream(user_dir+"\\Documents\\FourGenius\\xyzzyx_deepalsuranga\\"+fullname+".jpg");
            FileOutputStream to = new FileOutputStream(user_dir+"\\FourGenius\\Images\\"+fullname+".jpg");
            System.out.println("File Upload path : " + user_dir+"\\FourGenius\\Images\\"+fullname+".jpg");
            Jp_registration_student_informations pic = new Jp_registration_student_informations(user_dir + "\\FourGenius\\Images\\" + fullname + ".jpg");
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
