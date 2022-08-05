package fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    
    @Test
    public void testFibonacciSequenceFive() {
        List<Integer> list = new ArrayList<Integer>(){{
                                    add(0);
                                    add(1);
                                    add(1);
                                    add(2);
                                    add(3);
                                    }};
        assertEquals(list, Fibonacci.FibonacciList(5));
    }

    @Test
    public void testFibonacciRecursiveZero() {
        assertEquals(0, Fibonacci.FibonacciRecursiveResult(0));
    }

    @Test
    public void testFibonacciRecursiveOne() {
        assertEquals(0, Fibonacci.FibonacciRecursiveResult(1));
    }

    @Test
    public void testFibonacciRecursiveTwo() {
        assertEquals(1, Fibonacci.FibonacciRecursiveResult(2));
    }

    @Test
    public void testFibonacciRecursiveThree() {
        assertEquals(1, Fibonacci.FibonacciRecursiveResult(3));
    }

    @Test
    public void testFibonacciRecursiveFour() {
        assertEquals(2, Fibonacci.FibonacciRecursiveResult(4));
    }

    @Test
    public void testFibonacciRecursiveFive() {
        assertEquals(3, Fibonacci.FibonacciRecursiveResult(5));
    }

    @Test
    public void testFibonacciRecursiveTen() {
        assertEquals(34, Fibonacci.FibonacciRecursiveResult(10));
    }
            
    @Test
    public void testFibonacciZero() {
        assertEquals(0, Fibonacci.FibonacciResult(0));
    }

    @Test
    public void testFibonacciOne() {
        assertEquals(0, Fibonacci.FibonacciResult(1));
    }

    @Test
    public void testFibonacciTwo() {
        assertEquals(1, Fibonacci.FibonacciResult(2));
    }

    @Test
    public void testFibonacciThree() {
        assertEquals(1, Fibonacci.FibonacciResult(3));
    }

    @Test
    public void testFibonacciFour() {
        assertEquals(2, Fibonacci.FibonacciResult(4));
    }

    @Test
    public void testFibonacciFive() {
        assertEquals(3, Fibonacci.FibonacciResult(5));
    }

    @Test
    public void testFibonacciTen() {
        assertEquals(34, Fibonacci.FibonacciResult(10));
    }
       
}
