/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julio.librerias.pruebas4;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author julio
 */
@DisplayName("Testeando la clase A")
public class ATest {

    public ATest() {
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
    public void testMetodoConRetardo() {
        System.out.println("metodoConRetardo");
        A instance = new A();

        assertTimeout(Duration.ofMillis(600), () -> {
            instance.metodoConRetardo();
        });
    }

    
    
    
    @DisplayName("Esto es un test parametrizado")
    @ParameterizedTest(name = "Utilice numeros negativos y positivos, valor {0} ")
    @ValueSource(ints = {-1, -4, -3})
    public void testEsNegativo(int numero) {
        A instance = new A();
        assertTrue(instance.esNegativo(numero));
    }

    
    
    
    
    
    @DisplayName("Debería pasar para valores no nulos")
    @ParameterizedTest(name = "{index} => mascota=''{0}''")
    @EnumSource(Mascotas.class)
    void mascotaNoNula(Mascotas pet) {
        assertNotNull(pet);
        
    }

    
    /*Con methodsource*/
    
    //ejemplo 1
    @DisplayName("Test con methodsource")
    @ParameterizedTest
    @MethodSource("generadorValores")
    void testWithMethodSource(String argument) {
        assertNotNull(argument);
    }
    static Stream<String> generadorValores() {
        return Stream.of("alex", "brian");
    }

    
    
    
    
    //ejemplo 2
    @DisplayName("Test con methodsource 2")
    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(String str, int length, List<String> list) {
        assertTrue(str.length() > 0);
        assertEquals(length, list.size());
    }
    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                arguments("abc", 3, Arrays.asList("a", "b", "c")),
                arguments("limon", 2, Arrays.asList("x", "y"))
        );
    }
    
    
    
    
    /*Con CSVSource*/
    @ParameterizedTest
    @CsvSource({
            "java,      4",
            "clojure,   7",
            "python,    6"
    })
    void test_csv(String str, int length) {
        assertEquals(length, str.length());
    }
    
    
    
    
    
    
    /*Con CSVFileSource*/
    @DisplayName("Test con CSVFileSource")
    @ParameterizedTest
    @CsvFileSource(resources = "/simple.csv", numLinesToSkip = 1)
    void test_csv_file(String str, int length) {
        assertEquals(length, str.length());
    }
    
    @ParameterizedTest
    @CsvSource({
            "java,      algo",
            "uno,   dos",
            "hola,    chau"
    })
    void concatenarTest(String a, String b) {
        A a1 = new A();
        String esperado = a + b;
        assertEquals(esperado, a1.concatena(a,b));
    }
    
    @ParameterizedTest
    @CsvSource({
            "2.3,      3.4",
            "1.1,   1.0",
            "2.5,    0.5"
    })
    void dividirNoPorCeroTest(float a, float b) {
        A a1 = new A();
        float esperado = a / b;
        assertEquals(esperado, a1.divide(a,b));
    }
    
    
}
