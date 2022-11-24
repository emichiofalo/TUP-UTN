/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.apprest;

import com.utn.managers.FacturaManager;
import com.utn.modelo.Factura;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.PathParam;
/**
 *
 * @author Emi Chiófalo
 */
@Path("facturas")
public class FacturaRest {
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Factura> getFacturas(){
        //http://localhost:8080/apprest/rest/facturas/all
        FacturaManager mFactura = new FacturaManager();
        return mFactura.getAll();
    }
    
    @GET
    @Path("filter/{ptoVenta}/{nroComprobante}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Factura> getPaisesXFiltro(@PathParam("ptoVenta") int ptoVenta, @PathParam("nroComprobante") long nroComprobante){
        //http://localhost:8080/apprest/rest/facturas/filter/101/128296
        FacturaManager mPais = new FacturaManager();
        return mPais.getFiltered(ptoVenta, nroComprobante);
    }
    
}
