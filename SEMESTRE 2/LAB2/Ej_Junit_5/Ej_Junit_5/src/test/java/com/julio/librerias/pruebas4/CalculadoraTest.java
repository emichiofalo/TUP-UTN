/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julio.librerias.pruebas4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author julio
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        
       // assertTimeout(Duration.ofSeconds(5), () -> instance.sumar(1,1)); // pass
    }

    
    
    
    
    
    
    
    
    
    @Test
    public void testDividir() throws Exception {
        System.out.println("dividir");
        float a = 4.0F;
        float b = 2.0F;
        Calculadora instance = new Calculadora();
        float expResult = 2.0F;
        float result = instance.dividir(a, b);
        assertEquals(expResult, result, 0.0);
      
    }

    @Test
    public void testSumaArreglos() {
        System.out.println("sumaArreglos");
        int[] a = {1,2};
        int[] b = {1,2};
        Calculadora instance = new Calculadora();
        int[] expResult = {2,4};
        int[] result = instance.sumaArreglos(a, b);
        assertArrayEquals(expResult, result);
    }
    
}
