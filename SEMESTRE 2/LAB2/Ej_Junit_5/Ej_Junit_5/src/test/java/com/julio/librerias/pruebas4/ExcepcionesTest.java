/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julio.librerias.pruebas4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julio
 */
public class ExcepcionesTest {
    static Excepciones instance;

    public ExcepcionesTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        instance = new Excepciones();
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
    public void testDivide() throws Exception {
        System.out.println("divide");
        float a = 4.0F;
        float b = 2.0F;
        float expResult = 2.0F;
        float result = instance.divide(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDivide_Excepcion() {
        /*
        Exception exception = assertThrows(Exception.class, () -> {
            instance.divide(0,0);
        });
        assertNotNull(exception);
        */
        
        assertThrows(Exception.class, () -> {
            instance.divide(0,0);
        });
        
    }

}
