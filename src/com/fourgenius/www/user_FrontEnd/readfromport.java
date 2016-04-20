/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.user_FrontEnd;

import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;

/**
 *
 * @author deepalsuranga
 */
public class readfromport {

    static class SerialPortReader implements SerialPortEventListener {

        static SerialPort p;

        @Override
        public void serialEvent(SerialPortEvent spe) {
            new a(){
                
            };
            if (spe.isRXCHAR()) {
                if (spe.getEventValue() == 10) {
                    try {
                        byte buf[] = p.readBytes(10);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Runnable t = new Runnable() {

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        SerialPortReader spr = new SerialPortReader();
    }
    
}
