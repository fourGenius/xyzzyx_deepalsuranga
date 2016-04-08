/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.exams;

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
@Suite.SuiteClasses({com.fourgenius.www.public_access.exams.NewClassIT.class, com.fourgenius.www.public_access.exams.Jp_view_exam_resultsIT.class, com.fourgenius.www.public_access.exams.Jp_add_exams_student_marksIT.class, com.fourgenius.www.public_access.exams.Jf_ExamsIT.class, com.fourgenius.www.public_access.exams.Jp_add_exams_informationsIT.class, com.fourgenius.www.public_access.exams.Jp_add_examsIT.class, com.fourgenius.www.public_access.exams.Jp_add_exams_table_viewIT.class})
public class ExamsITSuite {

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
