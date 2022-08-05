package diagramaclases5;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Emi Chiófalo
 */
public class Tarjeta_De_Credito {

    private Date fecha_Ingreso;
    private double limite; 
    private ArrayList<Cliente> clientes = new ArrayList();

    public Tarjeta_De_Credito(Date fecha_Ingreso, double limite) {
        this.fecha_Ingreso = fecha_Ingreso;
        this.limite = limite;
    }

    public Date getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void addClientes(Cliente cliente) {
        clientes.add(cliente);
    }
      
}
