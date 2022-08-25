/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioA;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Expediente {
    
    private int id; 
    private String letra; 
    private int numero; 
    private String descripcion; 
    private String tipo; 
    private String ambito; 
    private ArrayList<Control> controles; 
    private ArrayList<Expediente> expedientes; 
    private Expediente expPadre;

    public Expediente() {
    }

    public Expediente(int id, String letra, int numero, String descripcion, String tipo, String ambito, ArrayList<Control> controles, ArrayList<Expediente> expedientes, Expediente expPadre) {
        this.id = id;
        this.letra = letra;
        this.numero = numero;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
        this.controles = controles;
        this.expedientes = expedientes;
        this.expPadre = expPadre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public ArrayList<Control> getControles() {
        return controles;
    }

    public void addControles(Control control) {
        if (this.controles == null) {
            this.controles = new ArrayList();
        }
        this.controles.add(control);
    }

    public ArrayList<Expediente> getExpedientes() {
        ArrayList<Expediente> lista = new ArrayList();
        listaExpedientes(this,lista);
        return lista;
    }

    public void addExpedientes(Expediente expediente) {
        if (this.expedientes == null) {
            this.expedientes = new ArrayList();
        }
        this.expedientes.add(expediente);
    }

    public Expediente getExpPadre() {
        return expPadre;
    }

    public void setExpPadre(Expediente expPadre) {
        this.expPadre = expPadre;
    }    
    
    public String getCaratulaExpediente(){
        return String.valueOf(this.numero) + " - " + this.letra + " - " 
                + this.descripcion; 
    }
    
    public String getControlesObligatorios(){
        String listaControlesObl = ""; 
        for (Control control : this.controles){
            if (control.isEsObligatorio()) {
                listaControlesObl += control.getDenominacion();
            }
            listaControlesObl += ",";
        }
        
        return listaControlesObl.substring(0, listaControlesObl.length()-1);
    }
    
    public boolean getEstadoControles(){
        for (Control cont : this.getControles()){
            if (!cont.getEstadoControl().isAprobado()) {
                return false; 
            }
        }
        return true;
    }
    
//    public List<Expediente> listaExpedientes(Expediente expPadre, ArrayList<Expediente> lista){   //resolucion profesor
//        lista.add(expPadre);
//        if (expPadre.getExpedientes() != null) {
//            for (Expediente exp : expPadre.getExpedientes()){
//                listaExpedientes(exp, lista);
//            }
//        }
//        return lista; 
//    }
    
    public List<Expediente> listaExpedientes(Expediente expPadre, ArrayList<Expediente> lista){     //mi resolucion
        for (Expediente exp : expPadre.getExpedientes()){
            if (exp.getExpedientes() != null) {
                lista.add(exp);
                listaExpedientes(exp, lista);
            }else{
                lista.add(exp);
            }
        }
        return lista; 
    }
     
}
