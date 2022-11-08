/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.modelo;

/**
 *
 * @author Gerardo
 */
public class Cliente {
    
    private long id;
    private String cuit;
    private String razonSocial;
    private Double saldo;

    public Cliente() {
    }

    public Cliente(long id, String cuit, String razonSocial, Double saldo) {
        this.id = id;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.saldo = saldo;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
