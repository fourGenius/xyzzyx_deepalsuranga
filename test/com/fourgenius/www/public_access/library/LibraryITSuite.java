/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.library;

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
@Suite.SuiteClasses({com.fourgenius.www.public_access.library.jp_paymentsIT.class, com.fourgenius.www.public_access.library.jp_reportsIT.class, com.fourgenius.www.public_access.library.jp_return_booksIT.class, com.fourgenius.www.public_access.library.jp_burrow_booksIT.class, com.fourgenius.www.public_access.library.images.ImagesITSuite.class, com.fourgenius.www.public_access.library.jp_edit_booksIT.class, com.fourgenius.www.public_access.library.jp_active_membersIT.class, com.fourgenius.www.public_access.library.jp_membersIT.class, com.fourgenius.www.public_access.library.jp_search_booksIT.class, com.fourgenius.www.public_access.library.jp_add_booksIT.class, com.fourgenius.www.public_access.library.Fine_payIT.class})
public class LibraryITSuite {

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
