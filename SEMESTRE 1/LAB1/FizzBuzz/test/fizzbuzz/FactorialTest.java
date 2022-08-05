package fizzbuzz;


import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    
    //sut = system under test 
    
    @Test
    public void testFactorialZero() {
        assertEquals(1, Factorial.Factorial(0));
    }
    
    @Test
    public void testFactorialOne() {
        assertEquals(1, Factorial.Factorial(1));
    }
    
    @Test
    public void testFactorialTwo() {
        assertEquals(2, Factorial.Factorial(2));
    }
    
    @Test
    public void testFactorialThree() {
        assertEquals(6, Factorial.Factorial(3));
    }
    
    @Test
    public void testFactorialFour() {
        assertEquals(24, Factorial.Factorial(4));
    }
    
    @Test
    public void testFactorialFive() {
        assertEquals(120, Factorial.Factorial(5));
    }
    
    @Test
    public void testFactorialNine() {
        assertEquals(362880, Factorial.Factorial(9));
    }
    
    @Test
    public void testFactorialRecursiveZero() {
        assertEquals(1, Factorial.FactorialRecursive(0));
    }
    
    @Test
    public void testFactorialRecursiveOne() {
        assertEquals(1, Factorial.FactorialRecursive(1));
    }
    
    @Test
    public void testFactorialRecursiveTwo() {
        assertEquals(2, Factorial.FactorialRecursive(2));
    }
    
    @Test
    public void testFactorialRecursiveThree() {
        assertEquals(6, Factorial.FactorialRecursive(3));
    }
    
    @Test
    public void testFactorialRecursiveFour() {
        assertEquals(24, Factorial.FactorialRecursive(4));
    }
    
    @Test
    public void testFactorialRecursiveFive() {
        assertEquals(120, Factorial.FactorialRecursive(5));
    }
    
    @Test
    public void testFactorialRecursiveNine() {
        assertEquals(362880, Factorial.FactorialRecursive(9));
    }
    
}
