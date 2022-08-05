package diagramaclases1;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Usuario extends Persona{
    
    private Integer idUsuario;
    private String usuario; 
    private String password; 
    private ArrayList<Contacto> contactos = new ArrayList();

    public Usuario(Integer idUsuario, String usuario, String password, String nombre, String apellido, Integer idPersona) {
        super(nombre, apellido, idPersona);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void addContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    
    
}
