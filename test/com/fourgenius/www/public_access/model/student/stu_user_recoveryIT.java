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
public class stu_user_recoveryIT {
    
    public stu_user_recoveryIT() {
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
     * Test of getStu_user_recovery_question_no method, of class stu_user_recovery.
     */
    @Test
    public void testGetStu_user_recovery_question_no() {
        System.out.println("getStu_user_recovery_question_no");
        stu_user_recovery instance = null;
        String expResult = "";
        String result = instance.getStu_user_recovery_question_no();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStu_user_recovery_question_no method, of class stu_user_recovery.
     */
    @Test
    public void testSetStu_user_recovery_question_no() {
        System.out.println("setStu_user_recovery_question_no");
        String stu_user_recovery_question_no = "";
        stu_user_recovery instance = null;
        instance.setStu_user_recovery_question_no(stu_user_recovery_question_no);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStu_user_recovery_answer method, of class stu_user_recovery.
     */
    @Test
    public void testGetStu_user_recovery_answer() {
        System.out.println("getStu_user_recovery_answer");
        stu_user_recovery instance = null;
        String expResult = "";
        String result = instance.getStu_user_recovery_answer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStu_user_recovery_answer method, of class stu_user_recovery.
     */
    @Test
    public void testSetStu_user_recovery_answer() {
        System.out.println("setStu_user_recovery_answer");
        String stu_user_recovery_answer = "";
        stu_user_recovery instance = null;
        instance.setStu_user_recovery_answer(stu_user_recovery_answer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployee_nonAcademic_administrative_user_recovery_question_no_update method, of class stu_user_recovery.
     */
    @Test
    public void testSetEmployee_nonAcademic_administrative_user_recovery_question_no_update() {
        System.out.println("setEmployee_nonAcademic_administrative_user_recovery_question_no_update");
        String stu_user_recovery_question_no = "";
        String stu_user_info_id = "";
        stu_user_recovery instance = null;
        instance.setEmployee_nonAcademic_administrative_user_recovery_question_no_update(stu_user_recovery_question_no, stu_user_info_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployee_nonAcademic_administrative_user_recoveryanswer_update method, of class stu_user_recovery.
     */
    @Test
    public void testSetEmployee_nonAcademic_administrative_user_recoveryanswer_update() {
        System.out.println("setEmployee_nonAcademic_administrative_user_recoveryanswer_update");
        String stu_user_recovery_answer = "";
        String stu_user_info_id = "";
        stu_user_recovery instance = null;
        instance.setEmployee_nonAcademic_administrative_user_recoveryanswer_update(stu_user_recovery_answer, stu_user_info_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
