/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration.student;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author dinet
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.fourgenius.www.public_access.registration.student.Jp_registration_student_c_layoutIT.class, com.fourgenius.www.public_access.registration.student.Student_SendMailSSLIT.class, com.fourgenius.www.public_access.registration.student.Jp_student_paymentIT.class, com.fourgenius.www.public_access.registration.student.Jp_registration_studentIT.class, com.fourgenius.www.public_access.registration.student.Jp_registration_student_informationsIT.class, com.fourgenius.www.public_access.registration.student.Jp_registration_student_privewIT.class, com.fourgenius.www.public_access.registration.student.user_image_copyIT.class})
public class StudentITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
