/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.apprest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("helloworld")
public class HelloWorldRest {

  @Context
  private UriInfo context;

  public HelloWorldRest() {}

  @GET
  @Path("saludo")
  @Produces("text/html")
  public String getHtml() {
    return "<html lang=\"en\"><body><h1>Hola Mundo!! Respuesta HTML</h1></body></html>";
  }
}