/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.user.login;

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
public class User_SendMailSSLIT {
    
    public User_SendMailSSLIT() {
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
     * Test of sendingSSL method, of class User_SendMailSSL.
     */
    @Test
    public void testSendingSSL() {
        System.out.println("sendingSSL");
        String to_mail = "";
        String subject_plus = "";
        String message_body = "";
        User_SendMailSSL instance = new User_SendMailSSL();
        instance.sendingSSL(to_mail, subject_plus, message_body);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
