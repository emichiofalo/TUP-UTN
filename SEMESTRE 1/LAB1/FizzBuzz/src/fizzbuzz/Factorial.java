package fizzbuzz;

public class Factorial {

    public static int Factorial(int n){
        int result = 1;
               
        for (int i = 1; i < n+1; i++) {
            result  *= i;
        }
        
        return result;
    }
    
    public static int FactorialRecursive(int n){
        int fact = 0;
        
        if (n==0) {
            fact = 1;
        }else{
            fact=n*FactorialRecursive(n-1);
        }
        
        return fact;
    }
    
}
