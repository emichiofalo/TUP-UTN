package ejerciciouno;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Usuario extends Persona{

    private int idUsuario;
    private String usuario;
    private String password;
    private ArrayList<Contacto> contactos = new ArrayList<>();
    
    public Usuario(int idUsuario, String usuario, String password, String nombre, String apellido, int idPersona) {
        super(nombre, apellido, idPersona);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
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
    
    public void agregarContacto(Contacto contacto){
        this.contactos.add(contacto);
    }

    @Override
    public String toString() {
        return "ID Usuario = " + idUsuario + "\n"
                +"Usuario = " + usuario +"\n" 
                + "Password = " + password + "\n" 
                +"Contactos = " + contactos +"\n" 
                + super.toString();
    }        
}
