/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class ActaDeContratacion {
    
    private ArrayList<Infraccion> infraccion = new ArrayList();
    private LocalDate fechaDeLabrado; 
    private LocalDate fechaVtoPagoVolun;
    private LocalTime horaDeLabrado;
    private String lugarDeConstatacion;
    private int idActa;
    private String observaciones;
    private Ruta ruta;
    private Licencias licencia;
    private AutoridadDeConstatacion autoridad; 
    private EstadoDelActa estadoActa;
    private Vehiculo vehiculo; 
    private OrganizacionEstatal organizacion;

    public ActaDeContratacion() {
    }

    public ActaDeContratacion(LocalDate fechaDeLabrado, LocalDate fechaVtoPagoVolun, LocalTime horaDeLabrado, String lugarDeConstatacion, int idActa, String observaciones) {
        this.fechaDeLabrado = fechaDeLabrado;
        this.fechaVtoPagoVolun = fechaVtoPagoVolun;
        this.horaDeLabrado = horaDeLabrado;
        this.lugarDeConstatacion = lugarDeConstatacion;
        this.idActa = idActa;
        this.observaciones = observaciones;
    }
    
    public ActaDeContratacion(LocalDate fechaDeLabrado, LocalDate fechaVtoPagoVolun, LocalTime horaDeLabrado, String lugarDeConstatacion, int idActa, String observaciones, Ruta ruta, Licencias licencia, AutoridadDeConstatacion autoridad, EstadoDelActa estadoActa, Vehiculo vehiculo, OrganizacionEstatal organizacion) {
        this.fechaDeLabrado = fechaDeLabrado;
        this.fechaVtoPagoVolun = fechaVtoPagoVolun;
        this.horaDeLabrado = horaDeLabrado;
        this.lugarDeConstatacion = lugarDeConstatacion;
        this.idActa = idActa;
        this.observaciones = observaciones;
        this.ruta = ruta;
        this.licencia = licencia;
        this.autoridad = autoridad;
        this.estadoActa = estadoActa;
        this.vehiculo = vehiculo;
        this.organizacion = organizacion;
    }

    public ArrayList<Infraccion> getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(ArrayList<Infraccion> infraccion) {
        this.infraccion = infraccion;
    }

    public void addInfraccion(Infraccion infraccion) {
        this.infraccion.add(infraccion);
    }
    
    public LocalDate getFechaDeLabrado() {
        return fechaDeLabrado;
    }

    public void setFechaDeLabrado(LocalDate fechaDeLabrado) {
        this.fechaDeLabrado = fechaDeLabrado;
    }

    public LocalDate getFechaVtoPagoVolun() {
        return fechaVtoPagoVolun;
    }

    public void setFechaVtoPagoVolun(LocalDate fechaVtoPagoVolun) {
        this.fechaVtoPagoVolun = fechaVtoPagoVolun;
    }

    public LocalTime getHoraDeLabrado() {
        return horaDeLabrado;
    }

    public void setHoraDeLabrado(LocalTime horaDeLabrado) {
        this.horaDeLabrado = horaDeLabrado;
    }

    public String getLugarDeConstatacion() {
        return lugarDeConstatacion;
    }

    public void setLugarDeConstatacion(String lugarDeConstatacion) {
        this.lugarDeConstatacion = lugarDeConstatacion;
    }

    public int getIdActa() {
        return idActa;
    }

    public void setIdActa(int idActa) {
        this.idActa = idActa;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Licencias getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencias licencia) {
        this.licencia = licencia;
    }

    public AutoridadDeConstatacion getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(AutoridadDeConstatacion autoridad) {
        this.autoridad = autoridad;
    }

    public EstadoDelActa getEstadoActa() {
        return estadoActa;
    }

    public void setEstadoActa(EstadoDelActa estadoActa) {
        this.estadoActa = estadoActa;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public OrganizacionEstatal getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(OrganizacionEstatal organizacion) {
        this.organizacion = organizacion;
    }
    
    @Override
    public String toString() {
        return "ActaDeContratacion{" + "\n" + 
                "infraccion=" + infraccion.get(0).toString() + "\n" +
                "fechaDeLabrado=" + fechaDeLabrado.toString() + "\n" +
                "fechaVtoPagoVolun=" + fechaVtoPagoVolun.toString() + "\n" +
                "horaDeLabrado=" + horaDeLabrado.toString() + "\n" +
                "lugarDeConstatacion=" + lugarDeConstatacion + "\n" +
                "idActa=" + idActa + ", observaciones=" + observaciones + "\n" +
                "ruta=" + ruta.toString() + "\n" +
                "licencia=" + licencia.toString() + "\n" +
                "autoridad=" + autoridad.toString() + "\n" +
                "estadoActa=" + estadoActa.toString() + "\n" +
                "vehiculo=" + vehiculo.toString() + "\n" +
                "organizacion=" + organizacion.toString() + '}';
    }
    
    
    
}
