/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Emi Chiófalo
 */
public class aTest {
    
    public aTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class a.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        a instance = new a();
        int expResult = 0;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    @ParameterizedTest
    @CsvSource({
            "java,      algo",
            "uno,   dos",
            "hola,    chau"
    })
    public void concatenarTest(String a, String b) {
        a a1 = new a();
        String esperado = a + b;
        assertEquals(esperado, a1.concatena(a,b));
    }
    
    @Test
    @ParameterizedTest
    @CsvSource({
            "2.3,      3.4",
            "1.1,   1.0",
            "2.5,    0.5"
    }) 
    public void dividirNoPorCeroTest(float a, float b) {
        a a1 = new a();
        float esperado = a / b;
        assertEquals(esperado, a1.divide(a,b));
    }
    
}
