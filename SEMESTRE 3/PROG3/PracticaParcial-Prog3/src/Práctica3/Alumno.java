/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Práctica3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class Alumno implements Serializable {
    
    private long legajo; 
    private String nombre; 
    private String apellido; 
    private Date fechaNacimiento; 
    private List<Catedra> catedras; 
    private List<Nota> notas; 

    public Alumno() {
    }

    public Alumno(long legajo, String nombre, String apellido, Date fechaNacimiento, List<Catedra> catedras, List<Nota> notas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.catedras = catedras;
        this.notas = notas;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Temporal(TemporalType.DATE)      
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @ManyToMany(fetch=FetchType.LAZY,                                               //va en el atributo(list) donde se da la relación many to many 
    targetEntity=Catedra.class,                                                         //xxx=clase con la que se establece la relación
    cascade=CascadeType.ALL)
    @JoinTable(                                                                     //tabla intermedia
    name="CatedrasAlumno",                                                                     //crear el nombre de la tabla intermedia
    joinColumns=@JoinColumn(name="catedras"),                                            //nombre del atributo del modelo de objeto de esta clase
    inverseJoinColumns=@JoinColumn(name="alumnos"))
    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedra(List<Catedra> catedras) {
        this.catedras = catedras;
    }
    
    public void addCatedra(Catedra catedra) {
        if (this.catedras == null) {
            this.catedras = new ArrayList();
        }
        this.catedras.add(catedra);
    }

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL)
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
    
}
