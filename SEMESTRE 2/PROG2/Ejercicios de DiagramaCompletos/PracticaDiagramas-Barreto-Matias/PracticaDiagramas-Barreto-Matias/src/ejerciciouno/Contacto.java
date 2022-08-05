package ejerciciouno;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
class Contacto extends Persona {

    private int idContacto;
    private ContactoTipo tipo;
    private ArrayList<ContactoDomicilio> domicilios = new ArrayList<>();
    private ArrayList<ContactoTelefono> telefonos = new ArrayList<>();
    
    public Contacto(String nombre, String apellido, int idPersona, int idContacto, ContactoTipo tipo) {
        super(nombre, apellido, idPersona);
        this.idContacto = idContacto;
        this.tipo = tipo;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public ContactoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ContactoTipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<ContactoDomicilio> getDomicilios() {
        return domicilios;
    }
    
    public void agregarDomicilios(ContactoDomicilio domicilios){
        this.domicilios.add(domicilios);
    }

    public ArrayList<ContactoTelefono> getTelefonos() {
        return telefonos;
    }
    
    public void agregarTelefonos(ContactoTelefono telefonos){
        this.telefonos.add(telefonos);
    }    
}
