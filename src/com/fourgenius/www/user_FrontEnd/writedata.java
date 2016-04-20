/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.user_FrontEnd;

import jssc.SerialPort;

/**
 *
 * @author deepalsuranga
 */
public class writedata {
    static SerialPort p;
    public static void main(String[] args) {
        p = new SerialPort("COM7");
        try {
            System.out.println(p.getPortName());
            p.writeInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
