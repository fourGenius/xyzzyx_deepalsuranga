/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.model.student;

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
public class stu_practical_resultIT {
    
    public stu_practical_resultIT() {
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
     * Test of getStu_user_info_id method, of class stu_practical_result.
     */
    @Test
    public void testGetStu_user_info_id() {
        System.out.println("getStu_user_info_id");
        stu_practical_result instance = null;
        String expResult = "";
        String result = instance.getStu_user_info_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStu_user_info_id method, of class stu_practical_result.
     */
    @Test
    public void testSetStu_user_info_id() {
        System.out.println("setStu_user_info_id");
        String stu_user_info_id = "";
        stu_practical_result instance = null;
        instance.setStu_user_info_id(stu_user_info_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
