package ejercicioseis;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 * 
 */

public class Cliente extends Persona implements Estado_Cuenta{

    private TarjedaDeCredito TarjetaDeCredito;

    public Cliente() {
    }

    public Cliente(long TarjetaDeCredito, int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
    }

    public TarjedaDeCredito getTarjetaDeCredito() {
        return TarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjedaDeCredito TarjetaDeCredito) {
        this.TarjetaDeCredito = TarjetaDeCredito;
    }
                  
    @Override
    public boolean problemaVerazCodeme() {
        return false;
    }
}
