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
public class Proveedor extends Persona implements Estado_Cuenta{
    private String nombreComercial;

    public Proveedor(String nombreComercial, long dni, String nombre, String apellido) {
        super(dni, nombre, apellido, (long) 321321);
        this.nombreComercial = nombreComercial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
    
    @Override
    public boolean problemaVerazCodeme() {
        return true;
    }
    

}
