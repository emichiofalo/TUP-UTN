/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Práctica3;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class Nota implements Serializable {
    
    private int id; 
    private double valor; 
    private Date fechaExamen; 
    private boolean esRecuperatorio; 
    private Catedra catedra; 
    private Alumno alumno; 

    public Nota() {
    }

    public Nota(int id, double valor, Date fechaExamen, boolean esRecuperatorio, Catedra catedra, Alumno alumno) {
        this.id = id;
        this.valor = valor;
        this.fechaExamen = fechaExamen;
        this.esRecuperatorio = esRecuperatorio;
        this.catedra = catedra;
        this.alumno = alumno;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Temporal(TemporalType.DATE)      
    public Date getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public boolean isEsRecuperatorio() {
        return esRecuperatorio;
    }

    public void setEsRecuperatorio(boolean esRecuperatorio) {
        this.esRecuperatorio = esRecuperatorio;
    }

    @ManyToOne(cascade = CascadeType.ALL)                                           //se pone en el atributo único con el que se relaciona cada objeto de esta clase
    @JoinColumn(name = "idCatedra")
    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    @ManyToOne(cascade = CascadeType.ALL)                                           //se pone en el atributo único con el que se relaciona cada objeto de esta clase
    @JoinColumn(name = "idAlumno")
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
}
