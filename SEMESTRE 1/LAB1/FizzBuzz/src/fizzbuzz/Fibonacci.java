package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static int FibonacciResult (int n){
        int result = 0;
        int aux1 = 0; 
        int aux2 = 1; 
        
        if (n==1) {
            return 0;
        }else if (n==2) {
            return 1;
        }else{
            for (int i = 1; i < n-1; i++) {
                result = aux1 + aux2; 
                aux1 = aux2;
                aux2 = result; 
            }
            return result;
        }
    }
    
    public static int FibonacciRecursiveResult (int n){
        if (n<=1) {
            return 0;            
        }else if (n<4) {
            return 1;
        }else{
            return FibonacciRecursiveResult(n-2)+FibonacciRecursiveResult(n-1);
        }
    }
    
    public static int FibonacciRecursiveShowSequence (int n){
        if (n<1) {
            return 0;            
        }else if (n<2) {
            return 1;
        }else{
            return FibonacciRecursiveShowSequence(n-2)+FibonacciRecursiveShowSequence(n-1);
        }
    }
    
    public static List<Integer> FibonacciList (int n){
        List <Integer> fibo = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            fibo.add(FibonacciRecursiveShowSequence(i));
        }
        return fibo;
    }
    
}
