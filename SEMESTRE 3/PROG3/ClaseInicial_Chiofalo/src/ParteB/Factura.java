/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */

public class Factura {
    
    private String letra; 
    private int numero; 
    private double recargo; 
    private String tipoPago; 
    private double totalItems; 
    private double totalFinal; 
    private LocalDate fecha; 
    private Cliente cliente; 
    private List<DetalleFactura> detalleFactura; 

    public Factura(String letra, int numero, double recargo, String tipoPago, double totalItems, double totalFinal, LocalDate fecha, Cliente cliente, List<DetalleFactura> detalleFactura) {
        this.letra = letra;
        this.numero = numero;
        this.recargo = recargo;
        this.tipoPago = tipoPago;
        this.totalItems = totalItems;
        this.totalFinal = totalFinal;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalleFactura = detalleFactura;
    }

    public Factura() {
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

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo() {
        if (this.tipoPago.equals("C")) {
            this.recargo = 0.0;
        } else if (this.tipoPago.equals("TD")) {
            this.recargo = this.totalItems * 0.05;
        } else if (this.tipoPago.equals("TC")) {
            this.recargo = this.totalItems * 0.1;
        }
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getTotalItems() {
        return totalItems;
    }

    public void setTotalItems() {
        for (DetalleFactura detalle : this.detalleFactura){
            this.totalItems += detalle.getSubtotal();
        }
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal() {
        this.totalFinal = this.getTotalItems() + this.getRecargo();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void addDetalleFactura(DetalleFactura detalleFactura) {
        if (this.detalleFactura == null) {
            this.detalleFactura = new ArrayList();
        }
        this.detalleFactura.add(detalleFactura);
    }    
   
}
