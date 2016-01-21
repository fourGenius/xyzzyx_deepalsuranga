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

            FileInputStream from = new FileInputStream("E:\\xyzzyx_deepalsuranga\\" + fullname + ".jpg");
            FileOutputStream to = new FileOutputStream(user_dir+"\\Google Drive\\4_Genius_Creations\\FourGenius\\Images\\" + fullname + ".jpg");
            System.out.println("File Upload path : "+user_dir+"\\Google Drive\\4_Genius_Creations\\FourGenius\\Images\\" + fullname + ".jpg");

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
