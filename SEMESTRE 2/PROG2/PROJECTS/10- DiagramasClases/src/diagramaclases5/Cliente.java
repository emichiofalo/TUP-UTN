package diagramaclases5;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Cliente extends Persona implements Estado_Cuenta{

    private Tarjeta_De_Credito credit_car;
    private ArrayList<Tarjeta_De_Credito> tarjetas = new ArrayList();
    private ArrayList<Factura> facturas = new ArrayList();

    public Cliente(int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
    }

    public Cliente() {
    }

    public Tarjeta_De_Credito getCredit_car() {
        return credit_car;
    }

    public void setCredit_car(Tarjeta_De_Credito credit_car) {
        this.credit_car = credit_car;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }
    
    public boolean problemaVerazCodeme(){
        System.out.println("Con problemas en el Veraz/Codeme");
        return true;
    }       

    public ArrayList<Tarjeta_De_Credito> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta_De_Credito> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }
    
    
}
