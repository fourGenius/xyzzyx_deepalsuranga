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
import java.util.Random;

/**
 * Generate random integers
 */
public class Md_RandomIntegerGenarater {

    private int randomInt;

    public String RandomCodePIN() {
        log("========================================");

        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 1; ++idx) {
            randomInt = randomGenerator.nextInt(10000);
            log("Generated : " + randomInt);
        }

        log("Done.");
        return randomInt + "";
    }

    private static void log(String aMessage) {
        System.out.println(aMessage);
    }

    public int getRandomInt() {
        return randomInt;
    }

//    public void dd(){
//    PasswordBuilder builder = new PasswordBuilder();
//    builder.lowercase(5)
//            .uppercase(5)
//            .specials(2)
//            .digits(2)
//            .shuffle();
//    // write 100, 14-char shuffled passwords
//    for (int i = 0; i < 100; i++) {
//        System.out.println(builder.build());
//    }
//    }
}
