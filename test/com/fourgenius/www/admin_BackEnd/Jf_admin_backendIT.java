/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.admin_BackEnd;

import javax.swing.JButton;
import javax.swing.JLabel;
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
public class Jf_admin_backendIT {
    
    public Jf_admin_backendIT() {
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
     * Test of main method, of class Jf_admin_backend.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Jf_admin_backend.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of md_setvisible_false method, of class Jf_admin_backend.
     */
    @Test
    public void testMd_setvisible_false() {
        System.out.println("md_setvisible_false");
        JButton bt = null;
        Jf_admin_backend.md_setvisible_false(bt);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of md_setvisible_true method, of class Jf_admin_backend.
     */
    @Test
    public void testMd_setvisible_true() {
        System.out.println("md_setvisible_true");
        JButton bt = null;
        Jf_admin_backend.md_setvisible_true(bt);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of showTime method, of class Jf_admin_backend.
     */
    @Test
    public void testShowTime() {
        System.out.println("showTime");
        JLabel label = null;
        Jf_admin_backend instance = new Jf_admin_backend();
        instance.showTime(label);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
