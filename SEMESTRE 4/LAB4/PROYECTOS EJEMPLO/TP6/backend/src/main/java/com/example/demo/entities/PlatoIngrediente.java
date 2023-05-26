/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entities;

/**
 *
 * @author Gerardo
 */
public class PlatoIngrediente {
    
    private long idplatoingrediente;
    private Plato plato;
    private Ingrediente ingrediente;
    private double cantidad;

    public long getIdplatoingrediente() {
        return idplatoingrediente;
    }

    public void setIdplatoingrediente(long idplatoingrediente) {
        this.idplatoingrediente = idplatoingrediente;
    }


    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
