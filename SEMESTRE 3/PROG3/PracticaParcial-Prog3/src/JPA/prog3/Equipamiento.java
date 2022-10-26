/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JPA.prog3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.*;

/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class Equipamiento implements Serializable {
    
    private long codigo; 
    private String descripcion; 
    private List<Vehiculo> vehiculos; 

    public Equipamiento() {
    }

    public Equipamiento(long codigo, String descripcion, List<Vehiculo> vehiculos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.vehiculos = vehiculos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @ManyToMany(
    cascade = {CascadeType.PERSIST, CascadeType.MERGE},
    mappedBy = "equipamientos",
    targetEntity = Vehiculo.class
    )
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void addVehiculos(Vehiculo vehiculo) {
        if (this.vehiculos == null) {
           this.vehiculos = new ArrayList();
        }
        this.vehiculos.add(vehiculo); 
    } 
   
}
