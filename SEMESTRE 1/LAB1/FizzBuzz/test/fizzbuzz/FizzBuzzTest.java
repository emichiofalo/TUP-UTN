package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    
    @Test
    public void testFizzBuzzZero() {
        assertEquals("Invalid number.", FizzBuzz.FizzBuzz(0));
    }
        
    @Test
    public void testFizzBuzzThree() {
        assertEquals("1 2 Fizz", FizzBuzz.FizzBuzz(3));
    }
        
    @Test 
    public void testFizzBuzzFive() {
        assertEquals("1 2 Fizz 4 Buzz", FizzBuzz.FizzBuzz(5));
    }
    
    @Test 
    public void testFizzBuzzFifteen() {
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz-Buzz", FizzBuzz.FizzBuzz(15));
    }
    
    @Test
    public void testFizzBuzzOneHundred() {
        assertEquals("Invalid number.", FizzBuzz.FizzBuzz(100));
    }
}
