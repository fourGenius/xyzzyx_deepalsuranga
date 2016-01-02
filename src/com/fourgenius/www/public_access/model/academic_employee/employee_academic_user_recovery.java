/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.academic_employee;

/**
 *
 * @author Dineth Jayasekera
 */
public class employee_academic_user_recovery {
    
    private String employee_academic_user_recovery_question_no,employee_academic_user_recovery_answer;

    public employee_academic_user_recovery(String employee_academic_user_recovery_question_no, String employee_academic_user_recovery_answer) {
        this.employee_academic_user_recovery_question_no = employee_academic_user_recovery_question_no;
        this.employee_academic_user_recovery_answer = employee_academic_user_recovery_answer;
    }

    
    
    public String getEmployee_academic_user_recovery_question_no() {
        return employee_academic_user_recovery_question_no;
    }

    public void setEmployee_academic_user_recovery_question_no(String employee_academic_user_recovery_question_no) {
        this.employee_academic_user_recovery_question_no = employee_academic_user_recovery_question_no;
    }

    public String getEmployee_academic_user_recovery_answer() {
        return employee_academic_user_recovery_answer;
    }

    public void setEmployee_academic_user_recovery_answer(String employee_academic_user_recovery_answer) {
        this.employee_academic_user_recovery_answer = employee_academic_user_recovery_answer;
    }
    
    
    
}
