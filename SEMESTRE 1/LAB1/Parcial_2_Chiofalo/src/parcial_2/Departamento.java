package parcial_2;

import java.util.ArrayList;

public class Departamento {
    
    private int piso; 
    private String letra; 
    private ArrayList<Ambiente> habitaciones; 

    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }

    public ArrayList<Ambiente> getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(ArrayList<Ambiente> habitaciones) {
        this.habitaciones = habitaciones;
    }
    public void addtoArrayList(Ambiente ambiente) {                  
        if (this.habitaciones == null)
            this.habitaciones = new ArrayList<Ambiente>();
        this.habitaciones.add(ambiente);
    }
    
    public double totalMetrosCuadrarosDepartamento(){
        double total = 0;
        for (Ambiente ambiente : habitaciones){
            total += ambiente.getMetrosCuadrados();
        }
        return total;
    }
        
}
