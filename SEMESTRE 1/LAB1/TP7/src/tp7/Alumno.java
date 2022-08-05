package tp7;

import java.util.ArrayList;

public class Alumno {
    
    private String nombreCompleto;
    private long legajo;
    private ArrayList <Nota> notas;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    public void addNotas(Nota nota) {
        if (this.notas == null)
            this.notas = new ArrayList<Nota>();
        this.notas.add(nota);
    }
    
    public void calcularPromedio(){
        double suma = 0;
        for (Nota nota : notas){
            suma += nota.getNotaExamen();
        }
        double promedio = suma/notas.size();
        System.out.println("El promedio del alumno es: " + promedio);
    }
}
