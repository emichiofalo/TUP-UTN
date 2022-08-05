package ej_listados_0;

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
public class PersonaTest {
    
    static Persona instance;
    
    public PersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new Persona("Juan",'f',"50427846");
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

    @Test
    public void testConstructorPersonaNotNull() {
        assertNotNull(instance);
    }
    
    @Test
    public void testStringValues(){
        assertEquals("Juan", instance.Nombre);
        assertEquals("50427846", instance.documento);
    }
    
    @Test
    public void testCharValue(){
        assertEquals('f', instance.sexo);
    }
    
}
