/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.private_access.admin.login;

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
public class _jp_admin_login_emailIT {
    
    public _jp_admin_login_emailIT() {
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
     * Test of email_validation method, of class _jp_admin_login_email.
     */
    @Test
    public void testEmail_validation() {
        System.out.println("email_validation");
        String email = "";
        _jp_admin_login_email instance = new _jp_admin_login_email();
        boolean expResult = false;
        boolean result = instance.email_validation(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
