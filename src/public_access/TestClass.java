/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package public_access;

/**
 *
 * @author deepalsuranga
 */
public class TestClass {

    public static void main(String[] args) {
        String s = "N943341583v";
        //System.out.println("is : " + s.charAt(1));
        TestClass tc = new TestClass();
        char ss = s.charAt(0);
        tc.Check_ID(ss + "");

    }

    char is_id;

    char Check_ID(String ID) {

        if (ID.length() == 1) {
            System.out.println("this is a :");

            if (ID.charAt(0) == 'N') {
                System.out.println("Pastport ID");
                is_id = 'p';
            } else if (ID.matches("[0-9]*")) {
                System.out.println("NIC");
                is_id = 'i';

            }else if (ID.matches("[a-zA-Z]*")) {
                is_id='n';
            }

        }

        System.out.println("char is:\n " + is_id);
        return is_id;
    }

}
