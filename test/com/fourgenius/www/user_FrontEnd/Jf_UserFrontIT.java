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
public class Jf_UserFrontIT {
    
    public Jf_UserFrontIT() {
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
     * Test of main method, of class Jf_UserFront.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Jf_UserFront.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTime method, of class Jf_UserFront.
     */
    @Test
    public void testShowTime() {
        System.out.println("showTime");
        Jf_UserFront instance = new Jf_UserFront();
        instance.showTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDate method, of class Jf_UserFront.
     */
    @Test
    public void testShowDate() {
        System.out.println("showDate");
        Jf_UserFront instance = new Jf_UserFront();
        instance.showDate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
