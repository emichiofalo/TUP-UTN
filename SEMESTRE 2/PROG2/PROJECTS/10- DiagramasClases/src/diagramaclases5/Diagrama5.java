package diagramaclases5;

import java.util.Date;

/**
 *
 * @author Emi Chiófalo
 */
public class Diagrama5 {

    public static void main(String[] args) {

        Date d1 = new Date();
        d1.setDate(24);
        d1.setMonth(4);
        d1.setYear(2022);
        Tarjeta_De_Credito tc1 = new Tarjeta_De_Credito(d1, 500000);
        Cliente c1 = new Cliente(35987443, "Manuela", "Ortega", 27359874);
        Empleado e1 = new Empleado(d1, 5678, 28933475, "Jacinto", "Suarez", 2528933);
        Proveedor p1 = new Proveedor("Milanga Langa", 29554433, "Roberto", "Carlos", 2329554);
        Factura f1 = new Factura(e1, c1, 9876, d1, 28794);
        c1.getTarjetas().add(tc1);
        c1.getFacturas().add(f1);
        e1.getFacturas().add(f1);
        System.out.println("Empleado: " + e1.getNombre() + " " + e1.getApellido() + 
                "\nFacturas: " + "\nNumero factura: " + e1.getFacturas().get(0).getNro_Factura() + 
                "\nNombre y apellido cliente: " + e1.getFacturas().get(0).getCliente().getNombre() + " " + e1.getFacturas().get(0).getCliente().getApellido()
                + "\nFecha: " + e1.getFacturas().get(0).getFecha().getDate() + "/" + e1.getFacturas().get(0).getFecha().getMonth() + "/" + e1.getFacturas().get(0).getFecha().getYear()
                + "\nMonto: $" + e1.getFacturas().get(0).getMonto());
        System.out.println("");
        System.out.println("Tarjeta de credito cliente:" + 
                "\nFecha Ingreso: " + e1.getFacturas().get(0).getCliente().getTarjetas().get(0).getFecha_Ingreso().getDate() +
                "/" + + e1.getFacturas().get(0).getCliente().getTarjetas().get(0).getFecha_Ingreso().getMonth() + 
                "/" + e1.getFacturas().get(0).getCliente().getTarjetas().get(0).getFecha_Ingreso().getYear() + 
                "\nLimite: $" + e1.getFacturas().get(0).getCliente().getTarjetas().get(0).getLimite());
        System.out.println("Condicion Veraz del cliente:");
        c1.problemaVerazCodeme();
        System.out.println("");
        System.out.println("Proveedor:" + "\nNombre comercial: " + p1.getNombre_Comercial() + "\nNombre y apellido: " + p1.getNombre() + " " + p1.getApellido() + 
                "\nDNI: " + p1.getDni());
        System.out.println("Condicion Veraz del proveedor: ");
        p1.problemaVerazCodeme();
        
    }
    
}
