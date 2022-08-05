package com.julio.librerias.pruebas4;

import java.util.stream.Stream;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Emi Chiófalo
 */
public class BTest {
    
    public BTest() {
    }
    
    @DisplayName("test parametrizado")
    @ParameterizedTest
    @MethodSource("generarNumeros")
    public void sumarParametrizado(int a, int b) {
        B instance = new B();
        instance.setA(a);
        instance.setB(b);
        
        instance.sumar();
        assertEquals(instance.getA()+instance.getB(),instance.getC());
    }
    static Stream<Arguments> generarNumeros(){
        return Stream.of(
            arguments(1,2),
            arguments(2,3)
         );
    }
    
//    @DisplayName("test parametrizado")
//    @ParameterizedTest
//    @CsvSource({
//            "1,2",
//            "2,3",
//            "3,4"})
//    public void sumarParametrizado2(int a, int b) {
//        B instance = new B();
//        instance.setA(a);
//        instance.setB(b);
//        
//        instance.sumar();
//        assertEquals(instance.getA()+instance.getB(),instance.getC());
//    }
    
}
