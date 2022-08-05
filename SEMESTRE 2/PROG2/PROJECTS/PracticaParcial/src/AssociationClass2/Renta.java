package AssociationClass2;

/**
 *
 * @author Emi Chiófalo
 */
public class Renta {
    
    public double costoMensual;
    public int duracionMeses;
    public Persona arrendatario; 
    public Inmueble bienInmuebleEnRenta;

    public Renta(double costoMensual, int duracionMeses, Persona arrendatario, Inmueble bienInmuebleEnRenta) {
        this.costoMensual = costoMensual;
        this.duracionMeses = duracionMeses;
        this.arrendatario = arrendatario;
        this.bienInmuebleEnRenta = bienInmuebleEnRenta;
        arrendatario.setRentaConstructor(this);
        bienInmuebleEnRenta.setRentaConstructor(this);
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public Persona getArrendatario() {
        return arrendatario;
    }

    public Inmueble getBienInmuebleEnRenta() {
        return bienInmuebleEnRenta;
    }
    
}
