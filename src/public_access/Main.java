/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package public_access;

/**
 *
 * @author thilina
 */
public class Main {

    /*
     //    =Academic Employee
     //    ==Name:employee_academic_user_info
     private String employee_academic_user_id,employee_academic_user_email,employee_academic_user_password,employee_academic_user_info_status;
     //    ==Name:employee_academic_user_recovery
     private String employee_academic_user_recovery_question_no,employee_academic_user_recovery_answer;
     //    ==Name:employee_academic_user_status
     private String employee_academic_user_status_code,employee_academic_user_status_name;
     //    ==Name:employee_academic_user_info_name
     private String employee_academic_user_info_name_sirName,employee_academic_user_info_name_first_name,employee_academic_user_info_name_second_name,employee_academic_user_info_name_last_name;
     //    ==Name:employee_academic_user_info_contact
     private String employee_academic_user_info_contact_mobile,employee_academic_user_info_contact_land,employee_academic_user_info_contact_email;
     //    ==Name:employee_academic_user_info_personal
     private String employee_academic_user_info_personal_profile_image,employee_academic_user_info_personal_dob,employee_academic_user_info_personal_age,employee_academic_user_info_personal_gender,employee_academic_user_info_personal_subject;
     //    ==Name:employee_academic_user_info_qulifications
     private String employee_academic_user_info_qulifications_file_id,employee_academic_user_info_qulifications_name,employee_academic_user_info_qulifications_type,employee_academic_user_info_qulifications_year;
     //    ==Name:employee_academic_user_info_address
     private String employee_academic_user_info_address_no,employee_academic_user_info_address_lane1,employee_academic_user_info_address_lane2,employee_academic_user_info_address_city,employee_academic_user_info_address_province,employee_academic_user_info_address_cuntry;

     //    =Non Ecademic Employee
     //    ==Name:employee_nonAcademic_administrative_user_info
     private String employee_nonAcademic_administrative_user_info_id,employee_nonAcademic_administrative_user_info_email,employee_nonAcademic_administrative_user_info_password,employee_nonAcademic_administrative_user_info_status;
     //    ==Name:employee_nonAcademic_administrative_user_recovery
     private String employee_nonAcademic_administrative_user_recovery_question_no,employee_nonAcademic_administrative_user_recoveryanswer;
     //    ==Name:employee_nonAcademic_administrative_user_status 
     private String employee_nonAcademic_administrative_user_status_code,employee_nonAcademic_administrative_user_status_name;
    
     //    =student
     ////    ==Name:stu_exam_result_practical 
     private String stu_exam_result_practical_id,stu_exam_result_practical_name,stu_exam_result_practical_mark;
     //    ==Name:stu_exam_result_theory 
     private String stu_exam_result_theory_id,stu_exam_result_theory_name,stu_exam_result_theory_mark;
     //    ==Name:stu_exam_result_type 
     private String stu_exam_result_type_id;
     //    ==Name:stu_exams_info 
     private String stu_exams_info_id,stu_exams_info_name;
     //    ==Name:stu_info_address 
     private String stu_info_address_no,stu_info_address_lane1,stu_info_address_lane2,stu_info_address_city,stu_info_address_province,stu_info_address_cuntry;
     //    ==Name:stu_info_aditional_qulifications 
     private String stu_info_aditional_qulifications_file_id,stu_info_aditional_qulifications_name,stu_info_aditional_qulifications_type,stu_info_aditional_qulifications_year;
     //    ==Name:stu_info_contact 
     private String stu_info_telephone_mobile,stu_info_telephone_land;
     //    ==Name:stu_info_name 
     private String stu_info_name_sirName,stu_info_name_first_name,stu_info_name_second_name,stu_info_name_last_name;
     //    ==Name:stu_info_personal 
     private String stu_info_personal_profile_image,stu_info_personal_nic,stu_info_personal_dob,stu_info_personal_age,stu_info_personal_gender,stu_info_personal_course;
     //    ==Name:stu_user_info 
     private String stu_user_info_id,stu_user_info_email,stu_user_info_password,stu_user_info_status;
     //    ==Name:stu_user_recovery 
     private String stu_user_recovery_question_no,stu_user_recovery_answer;
     //    ==Name:stu_user_status 
     private String stu_user_status_code,stu_user_status_name;
    
     public static void main(String[] args) {
     try {
     employee_academic_user_info c=new employee_academic_user_info("Dineth", "Dinethwa@gmail.com", "19971119", "Active");
     } catch (Exception e) {
     e.printStackTrace();
     }
     } 
     */
    String lname = "Deepal";
    boolean b;

    public static void main(String[] args) {

        Main cs = new Main();
        cs.cc("De");

        //
    }

    boolean cc(String aa) {

        if (aa.length() == 2) {
            if (aa.matches("[a-zA-Z]*")) {
                b = true;
                System.out.println("Yeeeees");

            } else {
                System.out.println("Noooooooo");
                b = false;
            }

        } else {
            if (aa.length() == 1) {
                if (aa.matches("[0-9]*")) {
                    b = true;
                    System.out.println("Yeeeees7");

                } else {
                    System.out.println("Noooooooo1");
                    b = false;
                }
            }
        }
        System.out.println("result: " + b);
        return b;

    }
//hi
//hyfiugliyfy
    /*
    
     try {
     String newpath;
     String path="/error_message.GIF";
     newpath = path.replace('\\', '/');
     File ff = new File(newpath);
     Image img = ImageIO.read(ff);
     img = img.getScaledInstance(emp_photo.getWidth(), emp_photo.getHeight(), Image.SCALE_SMOOTH);
     emp_photo.setIcon(new ImageIcon(img));

     } catch (Exception e) {
     e.printStackTrace();
     }
    
     */
}
