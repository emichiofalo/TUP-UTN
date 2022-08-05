package ej_geometria;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emi Chiófalo
 */
public class CirculoTest {
    
    @Test
    public void testCalculaArea() {
        Circulo instance = new Circulo(3.4F);
        float expResult = 36.2984F;
        float result = instance.calculaArea();
        assertEquals(expResult, result, 0.01);
    }
}
