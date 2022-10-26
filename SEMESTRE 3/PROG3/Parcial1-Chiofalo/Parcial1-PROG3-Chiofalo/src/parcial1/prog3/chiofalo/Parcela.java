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
public class Parcela implements Serializable {
    
    private long id; 
    private int nroParcela; 
    private double latitud; 
    private double longitud; 
    private double superficieTitulo; 
    private Manzana manzana; 
    private List<Vivienda> viviendas; 

    public Parcela() {
    }

    public Parcela(long id, int nroParcela, double latitud, double longitud, double superficieTitulo, Manzana manzana, List<Vivienda> viviendas) {
        this.id = id;
        this.nroParcela = nroParcela;
        this.latitud = latitud;
        this.longitud = longitud;
        this.superficieTitulo = superficieTitulo;
        this.manzana = manzana;
        this.viviendas = viviendas;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNroParcela() {
        return nroParcela;
    }

    public void setNroParcela(int nroParcela) {
        this.nroParcela = nroParcela;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getSuperficieTitulo() {
        return superficieTitulo;
    }

    public void setSuperficieTitulo(double superficieTitulo) {
        this.superficieTitulo = superficieTitulo;
    }

    @ManyToOne(cascade = CascadeType.ALL)                                               
    @JoinColumn(name = "idManzana")
    public Manzana getManzana() {
        return manzana;
    }

    public void setManzana(Manzana manzana) {
        this.manzana = manzana;
    }

    @OneToMany(mappedBy = "parcela", cascade = CascadeType.ALL)
    public List<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(List<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }
    
    public void addVivienda(Vivienda vivienda) {
        if (this.viviendas == null) {
            this.viviendas = new ArrayList();
        }
        this.viviendas.add(vivienda);
    }
    
}
