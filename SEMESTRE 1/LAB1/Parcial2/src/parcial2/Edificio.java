package parcial2;

import java.util.ArrayList;

public class Edificio {
    
    private String nombre; 
    private String domicilio; 
    private ArrayList<Departamento> departamentos;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    public void addtoArrayList(Departamento departamento) {                  
        if (this.departamentos == null)
            this.departamentos = new ArrayList<Departamento>();
        this.departamentos.add(departamento);
    }
    
    public double totalMetrosCuadrarosEdificio(){
        double total = 0;
        for (Departamento dpto : departamentos){
            total += dpto.totalMetrosCuadrarosDepartamento();
        }
        return total;
    }
       
}
