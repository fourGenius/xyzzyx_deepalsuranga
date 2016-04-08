/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.private_access.admin.method;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dinet
 */
public class Md_move_textIT {
    
    public Md_move_textIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of _md_textFiledToLabel method, of class Md_move_text.
     */
    @Test
    public void test_md_textFiledToLabel() {
        System.out.println("_md_textFiledToLabel");
        JTextField textField = null;
        JLabel lableName = null;
        String textFieldText = "";
        Md_move_text instance = new Md_move_text();
        instance._md_textFiledToLabel(textField, lableName, textFieldText);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of _md_setTextFieldValues method, of class Md_move_text.
     */
    @Test
    public void test_md_setTextFieldValues() {
        System.out.println("_md_setTextFieldValues");
        JTextField textField = null;
        String givenName = "";
        Md_move_text instance = new Md_move_text();
        instance._md_setTextFieldValues(textField, givenName);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of _md_setLableValuesNull method, of class Md_move_text.
     */
    @Test
    public void test_md_setLableValuesNull() {
        System.out.println("_md_setLableValuesNull");
        JLabel lableName = null;
        Md_move_text instance = new Md_move_text();
        instance._md_setLableValuesNull(lableName);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of _md_setPasswordFieldvalues method, of class Md_move_text.
     */
    @Test
    public void test_md_setPasswordFieldvalues() {
        System.out.println("_md_setPasswordFieldvalues");
        JPasswordField passwordField = null;
        String givenName = "";
        Md_move_text instance = new Md_move_text();
        instance._md_setPasswordFieldvalues(passwordField, givenName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of _md_passwordFiledToLabel method, of class Md_move_text.
     */
    @Test
    public void test_md_passwordFiledToLabel() {
        System.out.println("_md_passwordFiledToLabel");
        JPasswordField passwordField = null;
        JLabel lableName = null;
        String passwordFieldText = "";
        Md_move_text instance = new Md_move_text();
        instance._md_passwordFiledToLabel(passwordField, lableName, passwordFieldText);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
