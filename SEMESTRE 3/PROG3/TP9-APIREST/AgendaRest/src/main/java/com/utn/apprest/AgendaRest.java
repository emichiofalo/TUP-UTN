/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.apprest;

import com.google.gson.Gson;
import com.utn.managers.AgendaManager;
import com.utn.modelo.Agenda;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("agenda")
public class AgendaRest {
    
  @GET
  @Path("/{agendaId}")
  @Produces(MediaType.APPLICATION_JSON)
  public Agenda getAgendaObjectXId(@PathParam("agendaId") int id) {
      //Ejemplo http://localhost:8080/apprest/rest/agenda/1
      AgendaManager mAgenda = new AgendaManager();
      return mAgenda.getById(id);
  }  
    
  @GET
  @Path("agendas")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Agenda> getAgenda() {
      //Ejemplo http://localhost:8080/apprest/rest/agenda/agendas
      AgendaManager mAgenda = new AgendaManager();
      return mAgenda.getAll();
  }  
    
  @DELETE
  @Path("del/{agendaId}")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Agenda> deleteAgenda(@PathParam("agendaId") int id){
      //Ejemplo http://localhost:8080/apprest/rest/agenda/del/2
      AgendaManager mAgenda = new AgendaManager();
      mAgenda.delete(id);
      return mAgenda.getAll();
  } 
  
  @PUT
  @Path("/{agendaId}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public List<Agenda> updateAgenda(@PathParam("agendaId") int id, Agenda agendaUpdate) {
      //Ejemplo http://localhost:8080/apprest/rest/agenda/2
      
      AgendaManager mAgenda = new AgendaManager();
      
      mAgenda.update(id, agendaUpdate);
      return mAgenda.getAll();
  }
  
  @POST
  @Path("add")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public List<Agenda> agregarCliente(Agenda agenda){
      //Ejemplo http://localhost:8080/apprest/rest/agenda/add
      AgendaManager mAgenda = new AgendaManager();
      mAgenda.insert(agenda);
      return mAgenda.getAll();
  } 
}
