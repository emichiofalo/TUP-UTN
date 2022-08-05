package diagramaclases5;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Emi Chiófalo
 */
public class Empleado extends Persona{

    private Date fecha_Ingreso; 
    private int nro_Legajo; 
    private ArrayList<Factura> facturas = new ArrayList();

    public Empleado(Date fecha_Ingreso, int nro_Legajo, int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        this.fecha_Ingreso = fecha_Ingreso;
        this.nro_Legajo = nro_Legajo;
    }

    public Empleado() {
    
    }
    
    public Date getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }

    public int getNro_Legajo() {
        return nro_Legajo;
    }

    public void setNro_Legajo(int nro_Legajo) {
        this.nro_Legajo = nro_Legajo;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void addFacturas(Factura factura) {
        facturas.add(factura);
    }
    
}
