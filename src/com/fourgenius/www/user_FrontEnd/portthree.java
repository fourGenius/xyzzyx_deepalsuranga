/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.user_FrontEnd;

import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author deepalsuranga
 */
public class portthree {

    static SerialPort p;

    public static void main(String[] args) {
        //new portthree().inisialize();
    }

    public static void inisialize(SerialPort t) {
        p = t;
        try {
            //p.openPort();
            p.setFlowControlMode(0);
            p.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            System.out.println("connect");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void disconnect() {
        try {
            p.closePort();
        } catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }

    public static void writeData(String a) {
        try {
            p.writeString(a);
        } catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }

    static class SerialPortReader implements SerialPortEventListener {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            System.out.println("dfdddd");
            if (spe.isRXCHAR()) {
                if (spe.getEventValue() == 10) {
                    try {
                        byte buf[] = p.readBytes(10);
                        for (int a = 0; a < buf.length; a++) {
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            } else if (spe.isCTS()) {
                if (spe.getEventValue() == 1) {
                    System.out.println("CTS-ON");
                } else {
                    System.out.println("CTS-Off");
                }
            } else if (spe.isDSR()) {
                if (spe.getEventValue() == 1) {
                    System.out.println("DSR-ON");
                } else {
                    System.out.println("DSR-Off");
                }
            }
        }
    }
}
