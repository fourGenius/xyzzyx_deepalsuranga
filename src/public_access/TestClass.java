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
//
//    public static void main(String[] args) {
//        String s = "N943341583v";
//        //System.out.println("is : " + s.charAt(1));
//        TestClass tc = new TestClass();
//        char ss = s.charAt(0);
//        tc.Check_ID(ss + "");
//
//    }
//
//    boolean is_id;
//
//    Boolean Check_ID(String ID) {
//
//        if (ID.length() == 1) {
//            System.out.println("this is a :");
//
//            if (ID.charAt(0) == 'N') {
//                System.out.println("Pastport ID");
//                is_id = true;
//            } else if (ID.matches("[0-9]*")) {
//                System.out.println("NIC");
//                is_id = false;
//                /*
//                 if ("0".equals(ID)) {
//                 System.out.println("Phone number");
//                 } else {
//                 System.out.println("NIC");
//                 is_id = false;
//                 }
//                 */
//
//            }
//
//        }
//
//        System.out.println("boolen is:\n " + is_id);
//        return is_id;
//    }
//

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.email_walidation("deepalsuranga@@live.com");
    }

    public boolean email_walidation(String email) {

        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String email1 = email;
        Boolean result = email1.matches(EMAIL_REGEX);
        System.out.println("is e-mail: " + email1 + " :Valid = " + result);

        return result;
    }

}
