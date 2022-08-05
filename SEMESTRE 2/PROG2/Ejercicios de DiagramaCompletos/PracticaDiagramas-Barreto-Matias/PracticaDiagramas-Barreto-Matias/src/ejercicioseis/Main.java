package ejercicioseis;

import java.util.Date;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        Date fecha = new Date();
        fecha.getDate();

        Factura f = new Factura(123, fecha, 1500);
        f.setEmpleado(new Empleado(fecha, 654, 37965, "Pepe", "Hongito", 3777777));
        f.setCliente(new Cliente(4598476, 186254, "Lala", "keke", 1865465));
        f.getCliente().setTarjetaDeCredito(new TarjedaDeCredito(fecha, 15000));

        System.out.print("Nro Factura: " + f.getNumeroFactura() + "\n"
                + "Fecha: " + f.getFecha() + "\n"
                + "Empleado: " + f.getEmpleado().getNombre() + " " + f.getEmpleado().getApellido() + "\n"
                + "Fecha ingreso Empleado " + f.getEmpleado().getFechaIngreso() + "\n"
                + "Legajo Empleado: " + f.getEmpleado().getNroLegajo() + "\n"
                + "DNI Empleado " + f.getEmpleado().getDni() + "\n"
                + "CUIT Empleado " + f.getEmpleado().getCuit() + "\n"
                + "\n"
                + "Cliente \n"
                + "Nombre Cliente" + f.getCliente().getNombre() + " " + f.getCliente().getApellido() + "\n"
                + "DNI Cliente " + f.getCliente().getDni() + "\n"
                + "CUIT Cliente " + f.getCliente().getCuit() + "\n"
                + "Fecha Tarjeta Credito " + f.getCliente().getTarjetaDeCredito().getFechaIngreso() + "\n"
                + "Limite Tarjeta Credito " + f.getCliente().getTarjetaDeCredito().getLimite() + "\n"
                + "\n"
                + "Monto: " + f.getMonto() + "\n");
    }
}
