package tp8;

import java.util.HashSet;

public class Computadora {
    
    private String marca;
    private String modelo; 
    private HashSet<ComponenteCPU> componentes;
    private double costoComputadora;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<ComponenteCPU> getComponentes() {
        return componentes;
    }
    public void setComponentes(HashSet<ComponenteCPU> componentes) {
        this.componentes = componentes;
    }
    public void addComponentes(ComponenteCPU componente) {
        if (this.componentes == null)
            this.componentes = new HashSet<ComponenteCPU>();
        this.componentes.add(componente);
    }

    public double getCostoComputadora() {
        return costoComputadora;
    }

    public void setCostoComputadora(double costoComputadora) {
        this.costoComputadora = costoComputadora;
    }
    
    public void costoComputadora(){
        double costo = 0;
        for (ComponenteCPU componente : this.componentes){
            costo += componente.getPrecio()*componente.getCantidad();
        }
        this.costoComputadora = costo;
    }

}
