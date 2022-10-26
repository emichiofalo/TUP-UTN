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
public class Manzana implements Serializable {
    
    private long id; 
    private String letra; 
    private double superficieManzana; 
    private List<Parcela> parcelas; 
    private Seccion seccion; 

    public Manzana() {
    }

    public Manzana(long id, String letra, double superficieManzana, List<Parcela> parcelas, Seccion seccion) {
        this.id = id;
        this.letra = letra;
        this.superficieManzana = superficieManzana;
        this.parcelas = parcelas;
        this.seccion = seccion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double getSuperficieManzana() {
        return superficieManzana;
    }

    public void setSuperficieManzana(double superficieManzana) {
        this.superficieManzana = superficieManzana;
    }

    @OneToMany(mappedBy = "manzana", cascade = CascadeType.ALL)
    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }
    
    public void addParcela(Parcela parcela) {
        if (this.parcelas == null) {
            this.parcelas = new ArrayList();
        }
        this.parcelas.add(parcela);
    }

    @ManyToOne(cascade = CascadeType.ALL)                                               
    @JoinColumn(name = "idSeccion")
    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    
    public double getSuperficieManzanaTotal(){
        double total = 0;
        try {
            for (Parcela p : this.parcelas){
                total += p.getSuperficieTitulo();
            }
            if (total == this.getSuperficieManzana()) {
                return total;
            }else{
                throw new Exception ("Los valores no concuerdan.");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return total;
        }
    }
    
    public double getSuperficieCubiertaTotalManzana(){
        double total = 0;
        for (Parcela p : this.parcelas){
            for (Vivienda v : p.getViviendas()){
                total+= v.getMetrosCuadradosCubiertos();
            }
        }
        return total; 
    }
    
}
