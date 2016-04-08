/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.qrGenerator;

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
public class Md_QrCodeGenaraterIT {
    
    public Md_QrCodeGenaraterIT() {
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
     * Test of load_qr method, of class Md_QrCodeGenarater.
     */
    @Test
    public void testLoad_qr() {
        System.out.println("load_qr");
        JLabel qr_set_lable = null;
        Md_QrCodeGenarater instance = new Md_QrCodeGenarater();
        instance.load_qr(qr_set_lable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandom_pin method, of class Md_QrCodeGenarater.
     */
    @Test
    public void testGetRandom_pin() {
        System.out.println("getRandom_pin");
        Md_QrCodeGenarater instance = new Md_QrCodeGenarater();
        String expResult = "";
        String result = instance.getRandom_pin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
