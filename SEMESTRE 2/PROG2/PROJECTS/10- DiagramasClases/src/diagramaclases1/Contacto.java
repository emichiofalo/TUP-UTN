package diagramaclases1;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Contacto extends Persona{

    private Integer idContacto; 
    private ContactoTipo tipo; 
    private ArrayList <ContactoDomicilio> domicilios = new ArrayList();
    private ArrayList <ContactoTelefono> telefonos = new ArrayList();

    public Contacto(Integer idContacto, ContactoTipo tipo, String nombre, String apellido, Integer idPersona) {
        super(nombre, apellido, idPersona);
        this.idContacto = idContacto;
        this.tipo = tipo;
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
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

    public void addDomicilios(ContactoDomicilio domicilio) {
        domicilios.add(domicilio);
    }

    public ArrayList<ContactoTelefono> getTelefonos() {
        return telefonos;
    }

    public void addTelefonos(ContactoTelefono telefono) {
        telefonos.add(telefono);
    }
    
    
    
}
