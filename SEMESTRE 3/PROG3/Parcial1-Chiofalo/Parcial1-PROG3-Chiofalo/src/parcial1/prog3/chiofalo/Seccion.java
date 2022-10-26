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
public class Seccion implements Serializable {
    
    private long id; 
    private String nombre; 
    private String rubro; 
    private String direccion; 
    private Distrito distrito; 
    private List<Manzana> manzanas; 

    public Seccion() {
    }

    public Seccion(long id, String nombre, String rubro, String direccion, Distrito distrito, List<Manzana> manzanas) {
        this.id = id;
        this.nombre = nombre;
        this.rubro = rubro;
        this.direccion = direccion;
        this.distrito = distrito;
        this.manzanas = manzanas;
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

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @ManyToOne(cascade = CascadeType.ALL)                                               
    @JoinColumn(name = "idDistrito")
    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    @OneToMany(mappedBy = "seccion", cascade = CascadeType.ALL)
    public List<Manzana> getManzanas() {
        return manzanas;
    }

    public void setManzanas(List<Manzana> manzanas) {
        this.manzanas = manzanas;
    }
    
    public void addManzana(Manzana manzana) {
        if (this.manzanas == null) {
            this.manzanas = new ArrayList();
        }
        this.manzanas.add(manzana);
    }
    
}
