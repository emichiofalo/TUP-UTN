/*
 Laboratorio de Computación II 
 */

package ej_debugging_10;
/**
 *
 * @author jmonetti
 */
public class Ej_debugging_10 {

    
    public static void main(String[] args) {
        Caja cajaDiaria = new Caja(850);         //crear la caja con un inicial de $850,00
        Operaciones o = new Operaciones();       //crear un objeto con operaciones de ejemplo en el
        
        o.asentarOperacionesEnCaja( cajaDiaria );  //solicitar al objeto de operaciones que actualice
                                                   //la caja del dia, de acuerdo a las operaciones
                                                   //de compra y venta que contiene
        
        System.out.println("En la caja quedan: $" + cajaDiaria.saldo + " pesos" );
        
        System.out.println("El promedio de ventas es: " + o.promedioVentas());
        System.out.println("El promedio de compras es: " + o.promedioCompras());

        //mostrar que información hay en la caja (cajaDiaria) sobre credtos y debitos
        System.out.print("Los créditos totales son: ");
        System.out.println( cajaDiaria.creditosTotales() );
    
    }
    
}
