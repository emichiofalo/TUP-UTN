package sesentayuno;

import java.util.Date;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Natural extends Cliente {

    private String nombre;
    private String apellido;
    private String DNI;
    private char sexo;
    private Date fechaNacimiento;

    public Natural() {
    }

    public Natural(String nombre, String apellido, String DNI, char sexo, Date fechaNacimiento, int idCliente, String direccion, String tel, String email, boolean estado) {
        super(idCliente, direccion, tel, email, estado);
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Natural{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }    
}
