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

/**
 *
 * @author Deepal_Suranga
 */
public class Md_QrCodeGenarater {

    private String set_qr_label;
    private String path = "C:\\FourGenius\\FourGenius.PNG";

    public void load_qr(JLabel qr_set_lable) {

        ///// file make 
        File file = new File("C:\\FourGenius");
        if (!file.exists()) {
            file.mkdir();
            System.out.println("Ok File");
        }

        ///// code make
        Md_RandomIntegerGenarater random_Integer_Genarate = new Md_RandomIntegerGenarater();
        String random_pin = random_Integer_Genarate.RandomCodePIN();

        //String name=random_pin.g
        //qr make
        ByteArrayOutputStream out = QRCode.from(random_pin)
                .to(ImageType.PNG).stream();

        try {
            FileOutputStream fout = new FileOutputStream(new File(path));

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
        int i = 125;//lable width and height

        try {
            Thread.sleep(1000);

            File f = new File(path);

            Image img = ImageIO.read(f);
            qr_set_lable.setSize(i, i);

            img = img.getScaledInstance(i, i, Image.SCALE_SMOOTH);
            qr_set_lable.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
