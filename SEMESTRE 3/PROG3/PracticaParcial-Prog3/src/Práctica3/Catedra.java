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
public class Catedra implements Serializable {
    
    private int codigo; 
    private String denominacion; 
    private List<Nota> notas; 
    private List<Alumno> alumnos; 
    private DivisionCurso division; 

    public Catedra() {
    }

    public Catedra(int codigo, String denominacion, List<Nota> notas, List<Alumno> alumnos, DivisionCurso division) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.notas = notas;
        this.alumnos = alumnos;
        this.division = division;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @OneToMany(mappedBy = "catedra", cascade = CascadeType.ALL)
    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
    
    public void addNota(Nota nota) {
        if (this.notas == null) {
            this.notas = new ArrayList();
        }
        this.notas.add(nota);
    }

    @ManyToMany(                                                                    //va en el atributo(list) donde se da la relación many to many
    cascade = {CascadeType.PERSIST, CascadeType.MERGE},
    mappedBy = "cadetras",                                                               //nombre del atributo(list) de la clase que estableció la relación
    targetEntity = Alumno.class)
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void addAlumno(Alumno alumno) {
        if (this.alumnos == null) {
            this.alumnos = new ArrayList();
        }
        this.alumnos.add(alumno);
    }

    @ManyToOne(cascade = CascadeType.ALL)                                           //se pone en el atributo único con el que se relaciona cada objeto de esta clase
    @JoinColumn(name = "idDivision")
    public DivisionCurso getDivision() {
        return division;
    }

    public void setDivision(DivisionCurso division) {
        this.division = division;
    }
    
}
