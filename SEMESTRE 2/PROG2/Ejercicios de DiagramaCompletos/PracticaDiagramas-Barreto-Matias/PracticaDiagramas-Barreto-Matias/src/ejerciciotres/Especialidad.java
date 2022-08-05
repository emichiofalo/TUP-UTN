package ejerciciotres;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Especialidad {

    private String nombre;
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();
    private ArrayList<Medico> medicos = new ArrayList<>();

    public Especialidad() {
    }

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion habitaciones) {
        this.habitaciones.add(habitaciones);
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico medicos) {
        this.medicos.add(medicos);
    }
}
