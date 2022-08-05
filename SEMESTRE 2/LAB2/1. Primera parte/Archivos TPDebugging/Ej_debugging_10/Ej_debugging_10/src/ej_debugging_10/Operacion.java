/*
Laboratorio de Computacion II
 */

package ej_debugging_10;

/**
 * @author jmonetti
 */

//Una operación  está compuesta por un Tipo y un Monto
public class Operacion {
    private char Tipo;   //puede ser 'd'ebido o 'c'redito
    private float Monto;
    
    public Operacion(char Tipo, float Monto) {
       this.Tipo = Tipo;
       this.Monto = Monto;
    }

    //metodo get
    public char getTipo() {
        return Tipo;
    }

    //metodo set
    public void setTipo(char Tipo) {
        this.Tipo = Tipo;
    }

    //metodo get
    public float getMonto() {
        return Monto;
    }

    //metodo set
    public void setMonto(float Monto) {
        this.Monto = Monto;
    }
    
    
}
