/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


/**
 *
 * @author Emi Chiófalo
 */

@Entity
public class Computadora extends EntityBean{
    
    private String codigo; 
    private String marca; 
    private String modelo; 
    private List<Componente> componentes;
    
    public Computadora() {
    }

    public Computadora(String codigo, String marca, String modelo, ArrayList<Componente> componentes) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = componentes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    @OneToMany(mappedBy = "computadora", cascade = CascadeType.ALL)
    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public void addComponentes(Componente componente) {
        if (this.componentes == null) {
            this.componentes = new ArrayList();
        }
        this.componentes.add(componente);
    }
   
}
