/*
 Laboratorio de Computación II
 */
package ej_debugging_10;

import java.util.ArrayList;

/**
 *
 * @author jmonetti
 */
//Esta clase encapsula los datos necesarios para
//mantener la caja en una farmacia.
public class Caja {

    ArrayList<Float> debitos = new ArrayList();  //guarda todos los débitos
    ArrayList<Float> creditos = new ArrayList(); //guarda todos los créditos
    float saldo = 0;

    //constructor.  recibe el saldo inicial con el que se inicia la caja
    public Caja(float saldoInicial) {
        if (saldoInicial > 0 && saldoInicial < 1000) {  //con esta restricción  
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
    }

    //incorporar un debito de una cantidad valor ($valor) en la caja
    public boolean debito(float valor) {
        if (valor > 0 && valor <= 350) {  //si cumple con esta condición
            saldo -= valor;
            debitos.add(valor);
        } else {
            return false;
        }

        return true;
    }

    //incorporar un crédito de una cantidad valor ($valor) en la caja
    public boolean credito(float valor) {
        if (valor <= 350 && valor > 0) {  //si cumple con esta condición
            saldo += valor;
            creditos.add(valor);
        } else {
            return false;
        }
        return true;      //si se pudo incorporar, devuelve verdadero
    }
    
    public float creditosTotales() {
        float total=0;
        
        for(int i=0; i<creditos.size(); i++) {
           float credito = creditos.get(i); //obtengo uno de los creditos del ArrayList
           total = total + credito;          //y lo sumo al total
        }
        
        return total;  //retornamos el total de creditos que hay en el ArrayList
    }

}
