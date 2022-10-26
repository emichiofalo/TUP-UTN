/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Práctica3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class Escuela implements Serializable {
    
    private int numero; 
    private String denominacion; 
    private List<DivisionCurso> divisiones; 

    public Escuela() {
    }

    public Escuela(int numero, String denominacion, List<DivisionCurso> division) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.divisiones = division;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @OneToMany(mappedBy = "escuela", cascade = CascadeType.ALL)
    public List<DivisionCurso> getDivision() {
        return divisiones;
    }

    public void setDivision(List<DivisionCurso> divisiones) {
        this.divisiones = divisiones;
    }
    
    public void addDivision(DivisionCurso division) {
        if (this.divisiones == null) {
            this.divisiones = new ArrayList();
        }
        this.divisiones.add(division);
    }
}
