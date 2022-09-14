/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Conexion.ConexionComputadora;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Computadora {
    
    private long Id; 
    private String codigo; 
    private String marca; 
    private String modelo; 
    private ArrayList<Componente> componentes; 
    private ConexionComputadora conectCompu = new ConexionComputadora();

    public Computadora() {
    }

    public Computadora(long Id, String codigo, String marca, String modelo, ArrayList<Componente> componentes) {
        this.Id = Id;
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = componentes;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
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

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public void addComponentes(Componente componente) {
        if (this.componentes == null) {
            this.componentes = new ArrayList();
        }
        this.componentes.add(componente);
    }
      
    public boolean createComputadora(Computadora computadora) throws SQLException {
        return conectCompu.create(computadora);
    }
    
    public int getIdCompu (){
        return conectCompu.getIdCompu();
    }
}
