/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import Datos.*;

/**
 *
 * @author Emi Chiófalo
 */
public class EntradaModelo {
    
    private int numero;
    private String patente;
    private FuncionModelo funcion;
    private float precioComprado;
    private static float precio = 700; 
    private EntradaDAO entradaDAO = new EntradaDAO();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public FuncionModelo getFuncion() {
        return funcion;
    }

    public void setFuncion(FuncionModelo funcion) {
        this.funcion = funcion;
    }

    public static float getPrecio() {
        return precio;
    }

    public static void setPrecio(float precio) {
        EntradaModelo.precio = precio;
    }

    public float getPrecioComprado() {
        return precioComprado;
    }

    public void setPrecioComprado(float precioComprado) {
        this.precioComprado = precioComprado;
    }
    
    //CRUD
    //CREATE
    public boolean createEntrada(EntradaModelo entrada) {
        return entradaDAO.create(entrada);
    }

    //READ
    public List<EntradaModelo> readEntradas() {
        return entradaDAO.read();
    }
    
    public int readEntradasDisponibles(int codigoFuncion) {
        return entradaDAO.readDisponibles(codigoFuncion);
    }

    //DELETE
    public boolean deleteEntrada(int entradaCod) {
        return entradaDAO.delete(entradaCod);
    }

    public boolean findEntrada(int entradaCod) {
        return entradaDAO.find(entradaCod);
    }

    public boolean entradaExist(int entradaCod) {
        return entradaDAO.exist(entradaCod);
    }
    
}
