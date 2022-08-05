package tp2;

public class Fraccion {
    
    private int numerador;
    private int denominador;
    
    public Fraccion (int numerador,int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    
    public Fraccion (){
    }
    
    //auxiliar para operación suma y resta - MCM
    public static int maximoComunDivisor(int a, int b) {
        int temporal;
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public static int minimoComunMultiplo(int a, int b) {
        return (a * b) / maximoComunDivisor(a, b);
    }
    //fin auxiliar
    
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        Fraccion result = new Fraccion();
        int MCM = minimoComunMultiplo(f1.denominador, f2.denominador);
        result.numerador = ((MCM/f1.denominador)*f1.numerador)+((MCM/f2.denominador)*f2.numerador);
        result.denominador = MCM;
        return result;
    }   
    
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        Fraccion result = new Fraccion();
        int MCM = minimoComunMultiplo(f1.denominador, f2.denominador);
        result.numerador = ((MCM/f1.denominador)*f1.numerador)-((MCM/f2.denominador)*f2.numerador);
        result.denominador = MCM;
        return result;
    }
    
    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        Fraccion result = new Fraccion();
        result.numerador = f1.numerador*f2.numerador;
        result.denominador = f1.denominador*f2.denominador;
        return result;
    }
    
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        Fraccion result = new Fraccion();
        result.numerador = f1.numerador*f2.denominador;
        result.denominador = f1.denominador*f2.numerador;
        return result;
    }
    
    public void mostrar(){
        System.out.println(this.numerador+"/"+this.denominador);
    }
}
        
    