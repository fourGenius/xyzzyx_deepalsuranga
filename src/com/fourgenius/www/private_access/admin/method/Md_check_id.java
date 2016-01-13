/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.private_access.admin.method;

/**
 *
 * @author Dineth Jayasekera
 */
public class Md_check_id {
String is_id;
    public String Md_check_id(String ID) {
     
         if (ID.length() == 1) {
            System.out.println("this is a :");

            if (ID.charAt(0) == 'N') {
                System.out.println("Pastport ID");
                is_id = "password";
            } else if (ID.matches("[0-9]*")) {
                System.out.println("NIC");
                is_id = "nic";

            }else if (ID.matches("[a-zA-Z]*")) {
                is_id="name";
            }

        }

        System.out.println("char is:\n " + is_id);
        return is_id;
    }
    

   
}
