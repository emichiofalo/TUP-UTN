/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.prog3.chiofalo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class Distrito implements Serializable {
    
    private long id; 
    private String nombre; 
    private String distrito; 
    private List<Seccion> secciones; 

    public Distrito() {
    }

    public Distrito(long id, String nombre, String distrito, List<Seccion> secciones) {
        this.id = id;
        this.nombre = nombre;
        this.distrito = distrito;
        this.secciones = secciones;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    @OneToMany(mappedBy = "distrito", cascade = CascadeType.ALL)
    public List<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }
    
    public void addSeccion(Seccion seccion) {
        if (this.secciones == null) {
            this.secciones = new ArrayList();
        }
        this.secciones.add(seccion);
    }
    
    public List<Parcela> getParcelasXUbicacion(double latitud, double longitud, double rango){
        List<Parcela> parcelas = new ArrayList();
        for (Seccion s : this.secciones){
            for (Manzana m : s.getManzanas()){
                for (Parcela p : m.getParcelas()){
                    if (p.getLatitud()>(latitud-rango) && p.getLatitud()<(latitud+rango)){
                        if (p.getLongitud()>(longitud-rango) && p.getLongitud()<(longitud+rango)){
                            parcelas.add(p);
                        }
                    }
                }
            }
        }
        return parcelas;
    }
    
}
