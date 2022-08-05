package ej_geometria;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emi Chiófalo
 */
public class CuadradoTest {
    
    @Test
    public void testCalculaArea() {
        Cuadrado instance = new Cuadrado(3.4F);
        float expResult = 11.56F;
        float result = instance.calculaArea();
        assertEquals(expResult, result, 0.0);
    }    
}
