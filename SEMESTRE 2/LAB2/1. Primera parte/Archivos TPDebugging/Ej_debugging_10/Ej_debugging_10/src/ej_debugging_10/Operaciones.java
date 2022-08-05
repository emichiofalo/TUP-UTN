/*
 Laboratorio de Computación II
 */
package ej_debugging_10;

import java.util.ArrayList;

/**
 *
 * @author jmonetti
 */

/* Esta clase mantiene todas las operaciones que deben
 ser asentadas en la Caja (compras y ventas)
 Las ventas generan un credito.
 Las compras generan un debito
 */
public class Operaciones {

    public ArrayList<Operacion> ops = new ArrayList();

    //constructor
    public Operaciones() {
        //simulamos varias operaciones
        ops.add(new Operacion('v', 143.60f));  //venta por $143,60
        ops.add(new Operacion('c', 60.00f));    //compra por $60,00

        ops.add(new Operacion('c', 12.20f));    //...etc...
        ops.add(new Operacion('v', 564.80f));
        ops.add(new Operacion('c', 410.00f));
        ops.add(new Operacion('v', 459.20f));
        ops.add(new Operacion('v', 312.40f));
        ops.add(new Operacion('c', 41.00f));
        ops.add(new Operacion('v', 120.00f));
        ops.add(new Operacion('v', 120.50f));
        ops.add(new Operacion('v', 412.00f));
    }

    public void asentarOperacionesEnCaja(Caja c) { //recibe la caja como parametro
        for (int i = 0; i < ops.size(); i++) { //por cada elemnto del ArrayList Operaciones 
            Operacion op = ops.get(i);         //obtiene un objeto Operacion el ArrayList
            if (op.getTipo() == 'v') {         //de acuerdo al tipo de operacion
                c.credito(op.getMonto());      //realiza un credito con el Monto, o...
            } else {
                c.debito(op.getMonto());       //...realiza un débito con el Monto.
            }
        }
    }

    public float promedioVentas() {
        float acumulador = 0;
        int contador = 0;

        for (int i = 0; i < ops.size(); i++) {
            Operacion op = ops.get(i);
            if (op.getTipo() == 'v') {
                acumulador += op.getMonto();
            }
            contador++;
        }

        return acumulador / contador;
    }

    //metodo que devuelve el promedio de compras que hay en el ArrayList ops
    public float promedioCompras() {
        float acumulador = 0;
        int contador = 0;

        for (int i = 0; i < ops.size(); i++) {
            Operacion op = ops.get(i);
            if (op.getTipo() == 'c') {
                acumulador += op.getTipo();    //acumula si se trata de una compra
            }
            contador++;
        }
        return acumulador / contador;   //retorna el promedio
    }
}
