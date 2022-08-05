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
import org.junit.jupiter.api.Tag;

/**
 *
 * @author julio
 */
public class TagsTest {
    
    public TagsTest() {
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
    @Tag("desarrollo")
    @Tag("produccion")
    public void testConcatena() {
        System.out.println("concatena");
        String a = "a";
        String b = "b";
        Tags instance = new Tags();
        String expResult = "ab";
        String result = instance.concatena(a, b);
        assertEquals(expResult, result);
    }

    @Test
    @Tag("desarrollo")
    public void testDuplica() {
        System.out.println("duplica");
        String a = "a";
        Tags instance = new Tags();
        String expResult = "aa";
        String result = instance.duplica(a);
        assertEquals(expResult, result);
    }

    @Test
    @Tag("produccion")
    public void testSinEspacios() {
        System.out.println("sinEspacios");
        String a = " aa ";
        Tags instance = new Tags();
        String expResult = "aa";
        String result = instance.sinEspacios(a);
        assertEquals(expResult, result);
    }
    
}
