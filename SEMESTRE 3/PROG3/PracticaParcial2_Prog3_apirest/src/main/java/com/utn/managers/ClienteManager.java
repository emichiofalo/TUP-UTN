/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.managers;

import com.google.gson.Gson;
import com.utn.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerardo
 */
public class ClienteManager {
    
    List<Cliente> clientes = new ArrayList<Cliente>();
     
    public void cargarClientes() {
        clientes.add(new Cliente(1, "20-29112654-6", "Luis Negri", 120.45d));
        clientes.add(new Cliente(2, "50-11159654-2", "Cubito Hielos", 58522.20d));
        clientes.add(new Cliente(3, "27-12654789-5", "Natalia Fuerte", 3000.12d));
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public Cliente getClienteXId(long id) {
        for(Cliente c : this.clientes){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    
    public List<Cliente> deleteClienteXId(long id) {
        Cliente c = getClienteXId(id);
        this.clientes.remove(c);
        
        return this.clientes;
    }
    
    public Cliente updateClienteXId(long id, Cliente clienteUpdate) {
        Cliente c = getClienteXId(id);
        c.setCuit(clienteUpdate.getCuit());
        c.setRazonSocial(clienteUpdate.getRazonSocial());
        c.setSaldo(clienteUpdate.getSaldo());
        return c;
    } 
    
}
