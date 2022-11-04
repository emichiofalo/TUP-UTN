/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.apprest;

import com.google.gson.Gson;
import com.utn.managers.ClienteManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.utn.modelo.Cliente;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Gerardo
 * API  de  Java  JAX-RS
 */

@Path("cliente")
public class ClienteRest {
    
  @GET
  @Path("lista")
  @Produces(MediaType.TEXT_PLAIN)
  public String getClientesTxt() {
      //Ejemplo http://localhost:8080/apprest/rest/cliente/lista
      ClienteManager mCliente = new ClienteManager();
      mCliente.cargarClientes();
      String json = new Gson().toJson(mCliente.getClientes());
      return json;
  }
  
  
  @GET
  @Path("/html")
  @Produces(MediaType.TEXT_HTML)
  public String getHTML(){
      //Ejemplo http://localhost:8080/apprest/rest/cliente/html
      return "<b><i>Nombre: JUAN, Edad: 55</i></b>";
  }
  
  @GET
  @Path("clientes")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Cliente> getClientes() {
      //Ejemplo http://localhost:8080/apprest/rest/cliente/clientes
      ClienteManager mCliente = new ClienteManager();
      mCliente.cargarClientes();
      return mCliente.getClientes();
  }
  
  @GET
  @Path("/cliente")
  @Produces(MediaType.APPLICATION_JSON)
  public Cliente getCliente() {
      //Ejemplo http://localhost:8080/apprest/rest/cliente/cliente
      ClienteManager mCliente = new ClienteManager();
      mCliente.cargarClientes();
      return mCliente.getClientes().get(0);
  }
 
  @GET
  @Path("/id/{clienteId}")
  @Produces(MediaType.TEXT_PLAIN)
  public String getClienteXId(@PathParam("clienteId") long id) {
      //Ejemplo http://localhost:8080/apprest/rest/cliente/id/1
      ClienteManager mCliente = new ClienteManager();
      mCliente.cargarClientes();
      String json = new Gson().toJson(mCliente.getClienteXId(id));
      return json;
  }
  
  @GET
  @Path("/{clienteId}")
  @Produces(MediaType.APPLICATION_JSON)
  public Cliente getClienteObjectXId(@PathParam("clienteId") long id) {
      //Ejemplo http://localhost:8080/apprest/rest/cliente/1
      ClienteManager mCliente = new ClienteManager();
      mCliente.cargarClientes();
      return mCliente.getClienteXId(id);
  }
  
  @GET
  @Path("/urlparams")
  @Produces(MediaType.TEXT_HTML)
  public String getHTMLQueryParam(@QueryParam("nombre") String p1,@QueryParam("edad") int p2){
      //Ejemplo http://localhost:8080/apprest/rest/cliente/urlparams?nombre=Juan&edad=25
      return "<b>Nombre: " + p1 + ", Edad: " + p2 + "</b>";
  }
  
  //JSON
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public List<Cliente> agregarCliente(Cliente cliente){
      //Ejemplo http://localhost:8080/apprest/rest/cliente/
      /*
        {
            "cuit": "20-29123321-8",
            "id": 1,
            "razonSocial": "Carlos Garcia",
            "saldo": 120.45
        }
      */
      ClienteManager mCliente = new ClienteManager();
      mCliente.cargarClientes();
      mCliente.addCliente(cliente);
      return mCliente.getClientes();
  } 
  
  //FormParam
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public List<Cliente> crearCliente(@FormParam("id") long id, @FormParam("cuit") String c,
    @FormParam("razonSocial") String rz, @FormParam("saldo") Double s) {
      ClienteManager mCliente = new ClienteManager();
      mCliente.cargarClientes();
      Cliente cliente = new Cliente();
      cliente.setId(id);
      cliente.setCuit(c);
      cliente.setRazonSocial(rz);
      cliente.setSaldo(s);
      mCliente.addCliente(cliente);
      return mCliente.getClientes();
  }
  
  
  
  @DELETE
  @Path("/{clienteId}")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Cliente> deleteCliente(@PathParam("clienteId") long id){
      //Ejemplo http://localhost:8080/apprest/rest/cliente/2
      ClienteManager mCliente = new ClienteManager();
      mCliente.cargarClientes();
      return mCliente.deleteClienteXId(id);
  } 
  
  @PUT
  @Path("/{clienteId}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public List<Cliente> updateCliente(@PathParam("clienteId") long id, Cliente clienteUpdate) {
      //Ejemplo http://localhost:8080/apprest/rest/cliente/2
      /*
        {
            "cuit": "20-32654789-8",
            "razonSocial": "Jose Gomez",
            "saldo": 5020.75
        }
      */
      ClienteManager mCliente = new ClienteManager();
      mCliente.cargarClientes();
      mCliente.updateClienteXId(id, clienteUpdate);
      return mCliente.getClientes();
  }
}
