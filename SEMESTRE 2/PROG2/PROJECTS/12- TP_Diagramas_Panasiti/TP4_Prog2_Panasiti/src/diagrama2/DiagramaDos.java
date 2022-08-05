/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama2;
import java.util.Date;
import static utilidades.Utilidades.*;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class DiagramaDos {
    public static void ejecutar(){
        Empleado emp;
        Proveedor pro;
        Cliente cli;
        Factura fac;
        emp = new Empleado(12345, "Esteban", "Quito", 20123452, (new Date(2014, 8, 1)), 20);
        pro = new Proveedor("Clavando Clavitos", 45678, "Armando", "Casas");
        cli = new Cliente(98765, "Vicente", "Nario", 20987655);
        cli.setTarjetaDeCredito(new TarjetaDeCredito(new Date(2018,5,22), 25000.0));
        
        fac = new Factura(emp, cli, 123, new Date(2019,4,26), 1500.0);
        
        System.out.println("Factura C N° " + fac.getNroFactura());
        System.out.println("Fecha: " + fac.getFecha().getDay() + "-" + fac.getFecha().getMonth() + fac.getFecha().getYear());
        System.out.println("Monto: $" + fac.getMonto());
        System.out.println("Medio de pago: Tarjera con fecha: " + fac.getCli().getTarjetaDeCredito().getFechaIngreso().getDay() + "-" + fac.getCli().getTarjetaDeCredito().getFechaIngreso().getMonth() + fac.getCli().getTarjetaDeCredito().getFechaIngreso().getYear());
        System.out.println("Cliente: " + fac.getCli().nombre + " " + fac.getCli().getApellido());
        System.out.println("Empleado que realizó la venta: " + fac.getEmp().getNombre() + " " + fac.getEmp().getApellido());
    }
}
