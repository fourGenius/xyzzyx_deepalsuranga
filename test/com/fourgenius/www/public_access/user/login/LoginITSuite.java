/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.user.login;

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
@Suite.SuiteClasses({com.fourgenius.www.public_access.user.login.images.ImagesITSuite.class, com.fourgenius.www.public_access.user.login.Admin_SendMailSSLIT.class, com.fourgenius.www.public_access.user.login.User_SendMailSSLIT.class, com.fourgenius.www.public_access.user.login.Jf_user_loginIT.class, com.fourgenius.www.public_access.user.login.images_butons.Images_butonsITSuite.class})
public class LoginITSuite {

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
