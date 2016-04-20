/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.user_FrontEnd;

import jssc.SerialPortList;

/**
 *
 * @author deepalsuranga
 */
public class porttwo {
    public static void main(String[] args) {
        String [] portName = SerialPortList.getPortNames();
        System.out.println(portName.length);
        for(String e:portName){
            System.out.println("port "+e);
        }
    }
}
