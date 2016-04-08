/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.user_FrontEnd;

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
public class Jf_UserRegistrationIT {
    
    public Jf_UserRegistrationIT() {
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
     * Test of main method, of class Jf_UserRegistration.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Jf_UserRegistration.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payment method, of class Jf_UserRegistration.
     */
    @Test
    public void testPayment() {
        System.out.println("payment");
        Jf_UserRegistration instance = new Jf_UserRegistration();
        instance.payment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTime method, of class Jf_UserRegistration.
     */
    @Test
    public void testShowTime() {
        System.out.println("showTime");
        Jf_UserRegistration instance = new Jf_UserRegistration();
        instance.showTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
