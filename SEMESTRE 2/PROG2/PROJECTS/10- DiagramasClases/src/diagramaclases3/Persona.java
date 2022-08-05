package diagramaclases3;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Persona {

    private String nombre; 
    private String apellido; 
    private Foto foto; 
    private ArrayList<MedioDeComunicacion> comunicaciones = new ArrayList();
    private ArrayList<Perfil> perfiles = new ArrayList();                       

    public void agregarPerfil(Perfil perfil){                                   
        perfiles.add(perfil);
    }
    
    public boolean quitarPerfil(int indice){
        try {
            perfiles.remove(indice);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public ArrayList<MedioDeComunicacion> getComunicaciones() {
        return comunicaciones;
    }

    public void setComunicaciones(ArrayList<MedioDeComunicacion> comunicaciones) {
        this.comunicaciones = comunicaciones;
    }
    
    public void addMedioDeComunicacion(MedioDeComunicacion medio){              
        comunicaciones.add(medio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
    
    
    
}
