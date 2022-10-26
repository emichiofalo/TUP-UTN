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
import javax.persistence.FetchType;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class Vehiculo implements Serializable {
    
    private String patente; 
    private String marca; 
    private String modelo; 
    private String combustible; 
    private int anio; 
    private List<Equipamiento> equipamientos; 

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, String combustible, int anio, List<Equipamiento> equipamientos) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.anio = anio;
        this.equipamientos = equipamientos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

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

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @ManyToMany(fetch=FetchType.LAZY,
    targetEntity=Equipamiento.class,
    cascade=CascadeType.ALL)
    @JoinTable(
    name="vehiculo_equipamiento",
    joinColumns=@JoinColumn(name="patente"),
    inverseJoinColumns=@JoinColumn(name="codigo")
    ) 
    public List<Equipamiento> getEquipamientos() {
        return equipamientos;
    }

    public void setEquipamientos(List<Equipamiento> equipamientos) {
        this.equipamientos = equipamientos;
    }   
    
    public void addEquipamientos(Equipamiento equipamiento) {
        if (this.equipamientos == null) {
           this.equipamientos = new ArrayList();
        }
        this.equipamientos.add(equipamiento); 
    } 
    
}
