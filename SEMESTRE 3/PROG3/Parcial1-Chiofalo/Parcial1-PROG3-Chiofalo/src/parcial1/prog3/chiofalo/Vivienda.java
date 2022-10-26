/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.prog3.chiofalo;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class Vivienda implements Serializable {
 
    private long id; 
    private String descripcion; 
    private double metrosCuadradosCubiertos; 
    private Parcela parcela; 

    public Vivienda() {
    }

    public Vivienda(long id, String descripcion, double metrosCuadradosCubiertos, Parcela parcela) {
        this.id = id;
        this.descripcion = descripcion;
        this.metrosCuadradosCubiertos = metrosCuadradosCubiertos;
        this.parcela = parcela;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMetrosCuadradosCubiertos() {
        return metrosCuadradosCubiertos;
    }

    public void setMetrosCuadradosCubiertos(double metrosCuadradosCubiertos) {
        this.metrosCuadradosCubiertos = metrosCuadradosCubiertos;
    }

    @ManyToOne(cascade = CascadeType.ALL)                                               
    @JoinColumn(name = "idParcela")
    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }
}
