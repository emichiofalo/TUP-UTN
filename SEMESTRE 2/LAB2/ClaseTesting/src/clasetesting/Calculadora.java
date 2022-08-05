package clasetesting;

public class Calculadora {
    int c=1;
    
    public void sumar1(){
        c++;
    }
    
    public int sumar(int a, int b){
        try {Thread.sleep(450);} catch (Exception e){};
        return a+b;
    }
    
    public int restar(int a, int b){
        return a-b;
    }
    
    public int multiplicar(int a, int b){
        return a*b;
    }
    
    public double dividir(float a, float b) throws Exception {
        if (b!=0) throw new Exception();
        else
            return a/b;
        
        //return 0;                                                             //debería devolver una excepción
    }
    
    public int[] sumaArreglos (int a[], int b[]){
        int c[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
 }
