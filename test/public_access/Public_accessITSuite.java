/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package public_access;

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
@Suite.SuiteClasses({public_access.jf_SplashIT.class, public_access.jp_setStudentPasswordIT.class, public_access.MC_JavaDataBaseConnectionIT.class, public_access.Md_PanelLoadIT.class, public_access.MainIT.class, public_access.set_image_testIT.class, public_access.TestClassIT.class, public_access.SwingControlDemoIT.class, public_access.swith_caseIT.class})
public class Public_accessITSuite {

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
