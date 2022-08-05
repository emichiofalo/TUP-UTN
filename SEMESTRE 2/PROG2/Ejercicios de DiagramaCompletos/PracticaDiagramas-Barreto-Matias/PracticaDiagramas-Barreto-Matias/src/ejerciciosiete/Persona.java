package ejerciciosiete;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Persona {

    private String nombre;
    private String apellido;
    private Foto foto;
    private ArrayList<MedioDeComunicacion> comunicaciones = new ArrayList<>();
    private Perfil perfil = new Perfil();

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public ArrayList<MedioDeComunicacion> getComunicaciones() {
        return comunicaciones;
    }

    public void addComunicaciones(MedioDeComunicacion medio) {
        this.comunicaciones.add(medio);
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}
