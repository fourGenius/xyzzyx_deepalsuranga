/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.admin_BackEnd;

import javax.swing.ImageIcon;
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
public class Jp_admin_adminsIT {
    
    public Jp_admin_adminsIT() {
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
     * Test of set_admin_email_Comb method, of class Jp_admin_admins.
     */
    @Test
    public void testSet_admin_email_Comb() {
        System.out.println("set_admin_email_Comb");
        Jp_admin_admins instance = new Jp_admin_admins();
        instance.set_admin_email_Comb();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set_admin_ans_Comb method, of class Jp_admin_admins.
     */
    @Test
    public void testSet_admin_ans_Comb() {
        System.out.println("set_admin_ans_Comb");
        Jp_admin_admins instance = new Jp_admin_admins();
        instance.set_admin_ans_Comb();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ResizeImage method, of class Jp_admin_admins.
     */
    @Test
    public void testResizeImage() {
        System.out.println("ResizeImage");
        String imgPath = "";
        Jp_admin_admins instance = new Jp_admin_admins();
        ImageIcon expResult = null;
        ImageIcon result = instance.ResizeImage(imgPath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
