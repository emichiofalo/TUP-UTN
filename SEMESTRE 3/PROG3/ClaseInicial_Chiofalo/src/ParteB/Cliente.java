/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Cliente {
    
    private int numero; 
    private String razonSocial; 
    private long cuit; 
    private ArrayList <Factura> facturas; 

    public Cliente(int numero, String razonSocial, long cuit) {
        this.numero = numero;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    public Cliente() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void addFacturas(Factura factura) {
        if (this.facturas == null) {
            this.facturas = new ArrayList();
        }
        this.facturas.add(factura);
    }
    
    
    
}
