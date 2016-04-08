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
public class Admin_SendMailSSLIT {
    
    public Admin_SendMailSSLIT() {
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
     * Test of sendingSSL method, of class Admin_SendMailSSL.
     */
    @Test
    public void testSendingSSL() {
        System.out.println("sendingSSL");
        String subject_plus = "";
        String message_body = "";
        Admin_SendMailSSL instance = new Admin_SendMailSSL();
        instance.sendingSSL(subject_plus, message_body);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
