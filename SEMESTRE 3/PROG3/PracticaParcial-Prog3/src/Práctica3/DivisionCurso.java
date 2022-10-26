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
public class DivisionCurso implements Serializable {
    
    private int codigo; 
    private int anio; 
    private int division; 
    private Escuela escuela; 
    private List<Catedra> catedras; 

    public DivisionCurso() {
    }

    public DivisionCurso(int codigo, int anio, int division, Escuela escuela, List<Catedra> catedras) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
        this.escuela = escuela;
        this.catedras = catedras;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    @ManyToOne(cascade = CascadeType.ALL)                                           //se pone en el atributo único con el que se relaciona cada objeto de esta clase
    @JoinColumn(name = "idEscuela")
    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }
    
    public void addCatedra(Catedra catedra) {
        if (this.catedras == null) {
            this.catedras = new ArrayList();
        }
        this.catedras.add(catedra);
    }
    
}
