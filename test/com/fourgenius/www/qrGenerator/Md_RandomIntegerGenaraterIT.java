/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.qrGenerator;

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
public class Md_RandomIntegerGenaraterIT {
    
    public Md_RandomIntegerGenaraterIT() {
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
     * Test of RandomCodePIN method, of class Md_RandomIntegerGenarater.
     */
    @Test
    public void testRandomCodePIN() {
        System.out.println("RandomCodePIN");
        Md_RandomIntegerGenarater instance = new Md_RandomIntegerGenarater();
        String expResult = "";
        String result = instance.RandomCodePIN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandomInt method, of class Md_RandomIntegerGenarater.
     */
    @Test
    public void testGetRandomInt() {
        System.out.println("getRandomInt");
        Md_RandomIntegerGenarater instance = new Md_RandomIntegerGenarater();
        int expResult = 0;
        int result = instance.getRandomInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
