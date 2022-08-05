/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama2;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Cliente extends Persona implements Estado_Cuenta{
    TarjetaDeCredito creditCard;

    public Cliente(long dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        this.creditCard = creditCard;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return creditCard;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public boolean problemaVerazCodeme() {
        return true;
    }
    
    
}
