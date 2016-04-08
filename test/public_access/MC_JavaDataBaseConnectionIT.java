/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package public_access;

import java.sql.Connection;
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
public class MC_JavaDataBaseConnectionIT {
    
    public MC_JavaDataBaseConnectionIT() {
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
     * Test of myConnection method, of class MC_JavaDataBaseConnection.
     */
    @Test
    public void testMyConnection() {
        System.out.println("myConnection");
        Connection expResult = null;
        Connection result = MC_JavaDataBaseConnection.myConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add_data_NoColumns method, of class MC_JavaDataBaseConnection.
     */
    @Test
    public void testAdd_data_NoColumns() {
        System.out.println("add_data_NoColumns");
        String table_name = "";
        String dataWithComa = "";
        String expResult = "";
        String result = MC_JavaDataBaseConnection.add_data_NoColumns(table_name, dataWithComa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add_data_WithColumns method, of class MC_JavaDataBaseConnection.
     */
    @Test
    public void testAdd_data_WithColumns() {
        System.out.println("add_data_WithColumns");
        String table_name = "";
        String ColumnsWithComa = "";
        String dataWithComa = "";
        String expResult = "";
        String result = MC_JavaDataBaseConnection.add_data_WithColumns(table_name, ColumnsWithComa, dataWithComa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update_data method, of class MC_JavaDataBaseConnection.
     */
    @Test
    public void testUpdate_data() {
        System.out.println("update_data");
        String SqlQuery = "";
        MC_JavaDataBaseConnection.update_data(SqlQuery);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
