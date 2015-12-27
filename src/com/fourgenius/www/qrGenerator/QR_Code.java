/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.qrGenerator;

/**
 *
 * @author deepal_suranga
 */
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QR_Code {
   String path;
   public static  String qrNumber;

    public static String getQrNumber() {
        return qrNumber;
    }

    public static void setQrNumber(String qrNumber) {
        QR_Code.qrNumber = qrNumber;
    }
    
     public void loadQr(JLabel lable){
         ByteArrayOutputStream out = QRCode.from(qrNumber).to(ImageType.PNG).stream();
 
        try {
            FileOutputStream fout = new FileOutputStream(new File("E:\\QR_Code.PNG"));
 
            fout.write(out.toByteArray());
 
            fout.flush();
            fout.close();
 
        } catch (FileNotFoundException e) {
            // Do Logging
        	e.printStackTrace();
        } catch (IOException e) {
            // Do Logging
        	e.printStackTrace();
        }
         
       
        
        int i=125;//lable width and height
        
        try {
             Thread.sleep(1000);
             
           path="E:\\QR_Code.PNG";
         
                File f = new File(path);
               
                Image img = ImageIO.read(f);
                lable.setSize(i,i);
               
                img = img.getScaledInstance(i, i, Image.SCALE_SMOOTH);
                lable.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
