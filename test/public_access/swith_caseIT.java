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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dinet
 */
public class swith_caseIT {
    
    public swith_caseIT() {
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
     * Test of main method, of class swith_case.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        swith_case.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeOfDayWithSwitchStatement method, of class swith_case.
     */
    @Test
    public void testGetTypeOfDayWithSwitchStatement() {
        System.out.println("getTypeOfDayWithSwitchStatement");
        String dayOfWeekArg = "";
        swith_case instance = new swith_case();
        String expResult = "";
        String result = instance.getTypeOfDayWithSwitchStatement(dayOfWeekArg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
