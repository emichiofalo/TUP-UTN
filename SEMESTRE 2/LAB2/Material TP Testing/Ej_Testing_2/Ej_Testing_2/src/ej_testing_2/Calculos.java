

package ej_testing_2;



public abstract class Calculos {
    public abstract boolean Compara(double a, double b);
    public abstract double Calculo1(double a, double b, double c);
    public abstract double Calculo2(double a, double b, double c);

}

class CalculosImpl extends Calculos {
    //TODO:  en la prueba
    //debe descartar diferencias pequeñas provenientes
    //de errores de redondeo o truncamiento
    public boolean Compara(double f, double g) {
        if(f==g) return true;
        else return false;
    }
    
    public double Calculo1(double a, double b, double c) throws ArithmeticException {
        double res = 0.0;

        res = 2*a + Math.sin( 2 * b) / 3 * c;
        return res;
    }
    public double Calculo2(double a, double b, double c) throws ArithmeticException {
        double res = 0.0;
        res = 2*a - Math.sin( 2 * b) / 3 * c;
        return res;
    }

    //testear un timeout para este metodo
    public void buscarValor(  ) {
        double res=0.0;
        double a= -10.0;

        //repetir hasta que el seno sea = 0
        while( res != 0) {
            res = Math.sin ( a += 0.001 );
        }
    }

    
}
