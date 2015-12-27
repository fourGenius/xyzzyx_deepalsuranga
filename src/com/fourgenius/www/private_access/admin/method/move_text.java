/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.private_access.admin.method;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Dineth Jayasekera
 */
public class move_text {

    public void _md_textFiledToLabel(JTextField textField, JLabel lableName, String textFieldText) {

        lableName.setText(textFieldText);
        textField.setText(null);

    }
    
    public  void _md_setTextFieldValues(JTextField textField,String givenName){
    
        textField.setText(givenName);
        
    }
    
    public  void _md_setLableValuesNull(JLabel lableName){
        
        lableName.setText(null);
        
    }
    
    public void _md_setPasswordFieldvalues(JPasswordField passwordField,String givenName){
    
        passwordField.setText(givenName);
        
    }
    
    public void _md_passwordFiledToLabel(JPasswordField passwordField, JLabel lableName, String passwordFieldText) {

        lableName.setText(passwordFieldText);
        passwordField.setText(null);

    }
   
}
    