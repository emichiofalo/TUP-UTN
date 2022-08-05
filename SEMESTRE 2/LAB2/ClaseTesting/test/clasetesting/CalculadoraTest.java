/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasetesting;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emi Chiófalo
 */
public class CalculadoraTest {
    
    static Calculadora instance; 
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new Calculadora();
    }
    
    @AfterClass
    public static void tearDownClass() {
        instance = null; 
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar1 method, of class Calculadora.
     */
    @Test
    public void testSumar1() {
        System.out.println("sumar1");
        instance.sumar1();
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        try {
            System.out.println("dividir");
            float a = 21;
            float b = 7;
            double expResult = 3;
            double result = instance.dividir(a, b);
            assertEquals(expResult, result, 0.0);
        } catch (Exception ex) {
            Logger.getLogger(CalculadoraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test(timeout = 500)
    public void testTimeoutEnSumar() {
        Calculadora c = new Calculadora();
        c.sumar(1,1);
    }
}
