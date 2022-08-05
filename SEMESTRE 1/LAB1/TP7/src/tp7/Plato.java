package tp7;

import java.util.ArrayList;

public class Plato {
    
    private String nombreCompleto;
    private double precio; 
    private boolean esBebida; 
    private ArrayList <Ingrediente> ingredientes;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public void addIngredientes(Ingrediente ingrediente) {
        if (this.ingredientes == null)
            this.ingredientes = new ArrayList <Ingrediente>();
        this.ingredientes.add(ingrediente);
    }
    
    
}
