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
public class ListadoTest {
    
    static Listado instance;
     
    @BeforeClass
    public static void setUpClass() {
                
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        instance = new Listado(3);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testConstructorListado(){
        assertEquals(3,instance.p.length);
    }    
    
    @Test 
    public void testConstructorListadoCeldasVacias(){
        for (Persona persona : instance.p){
            assertNull(persona);
        }
    }
    
    @Test
    public void testAgregarUnaPersona() {
        Persona instancePer = new Persona("Juan",'f',"50427846");    
        int n = 0;
        int expResult = 1;
        int result = instance.agregarUnaPersona(instancePer, n);
        assertEquals(expResult, result);   
    }

    @Test
    public void testMuestraNombres() {
        System.out.println("Ver por pantalla si se imprimen correctamente los nombres cargados en el array.");
    }
    
}
