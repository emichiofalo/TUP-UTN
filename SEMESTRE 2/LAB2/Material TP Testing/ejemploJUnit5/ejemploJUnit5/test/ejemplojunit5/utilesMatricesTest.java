/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplojunit5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author julio
 */
public class utilesMatricesTest {

    public utilesMatricesTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of compara method, of class utilesMatrices.
     */
    @Test
    public void testCompara() {
        System.out.println("compara");
        utilesMatrices instance = null;
        boolean expResult = false;
        boolean result = instance.compara();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumaInterna method, of class utilesMatrices.
     */
    @Test
    public void testSumaInterna() {
        System.out.println("sumaInterna");
        int[][] a = null;
        utilesMatrices instance = null;
        int expResult = 0;
        int result = instance.sumaInterna(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumaDosMatrices method, of class utilesMatrices.
     */
    @Test
    public void testSumaDosMatrices() {
        System.out.println("sumaDosMatrices");
        int[][] a = null;
        int[][] b = null;
        utilesMatrices instance = null;
        int[][] expResult = null;
        int[][] result = instance.sumaDosMatrices(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}