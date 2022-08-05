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
public class utilesArreglosTest {

    public utilesArreglosTest() {
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
     * Test of compara method, of class utilesArreglos.
     */
    @Test
    public void testCompara() {
        System.out.println("compara");
        utilesArreglos instance = null;
        boolean expResult = false;
        boolean result = instance.compara();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sumaInterna method, of class utilesArreglos.
     */
    @Test
    public void testSumaInterna() {
        System.out.println("sumaInterna");
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        utilesArreglos instance = new utilesArreglos(  a , b);
        int expResult = 6;
        int result = instance.sumaInterna(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sumaDosVectores method, of class utilesArreglos.
     */
    @Test
    public void testSumaDosVectores() {
        System.out.println("sumaDosVectores");
        int[] a = null;
        int[] b = null;
        utilesArreglos instance = null;
        int[] expResult = null;
        int[] result = instance.sumaDosVectores(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


}