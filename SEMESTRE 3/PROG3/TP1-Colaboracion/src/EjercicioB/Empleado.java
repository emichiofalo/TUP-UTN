/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Empleado {
    
    private String nombre; 
    private long cuit; 
    private String domicilio; 
    private String email; 
    private RegimenHorario regimenHorario; 
    private List<Tardanza> tardanzas; 
    private List<Asistencia> asistencias; 

    public Empleado() {
    }

    public Empleado(String nombre, long cuit, String domicilio, String email, RegimenHorario regimenHorario, List<Tardanza> tardanzas, List<Asistencia> asistencias) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.email = email;
        this.regimenHorario = regimenHorario;
        this.tardanzas = tardanzas;
        this.asistencias = asistencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RegimenHorario getRegimenHorario() {
        return regimenHorario;
    }

    public void setRegimenHorario(RegimenHorario regimenHorario) {
        this.regimenHorario = regimenHorario;
    }

    public List<Tardanza> getTardanzas() {
        return tardanzas;
    }

    public void addTardanzas(Tardanza tardanza) {
        if (this.tardanzas == null) {
            this.tardanzas = new ArrayList();
        }
        this.tardanzas.add(tardanza);
    }

    public List<Asistencia> getAsistenciaXMesXAnio(int mes, int anio) {
        List<Asistencia> asistenciasXMesXAnio = new ArrayList();
        for (Asistencia asistencia : this.asistencias){
            if (asistencia.getFecha().getYear() == anio && asistencia.getFecha().getMonth().getValue() == mes) {
                asistenciasXMesXAnio.add(asistencia);
            }
        }
        return asistenciasXMesXAnio;
    }

    public void addAsistencias(Asistencia asistencia) {
        if (this.asistencias == null) {
            this.asistencias = new ArrayList();
        }
        this.asistencias.add(asistencia);
    }
    
    public List<Tardanza> getDiasConTardanza(int mes, int anio){
        List<Tardanza> diasConTardanza = new ArrayList();
        int horaIngreso = regimenHorario.getHoraIngreso()*60 + regimenHorario.getMinutoIngreso();
        int horaEgreso = regimenHorario.getHoraEgreso()*60 + regimenHorario.getMinutoEgreso();
        for (Asistencia asistencia : this.asistencias){
            if (asistencia.getFecha().getYear() == anio && asistencia.getFecha().getMonth().getValue() == mes) {
                int horaAsistencia = asistencia.getHora()*60 + asistencia.getMinuto();
                if (asistencia.getTipo().equals("E")) {
                    if (horaIngreso+15<horaAsistencia) {
                        Tardanza t = new Tardanza();
                        t.setTipo("E");
                        t.setFecha(asistencia.getFecha());
                        t.setHora(asistencia.getHora());
                        t.setMinuto(asistencia.getMinuto());
                        diasConTardanza.add(t);
                    }
                }else if (asistencia.getTipo().equals("S")) {
                    if (horaEgreso+15<horaAsistencia) {
                        Tardanza t = new Tardanza();
                        t.setTipo("S");
                        t.setFecha(asistencia.getFecha());
                        t.setHora(asistencia.getHora());
                        t.setMinuto(asistencia.getMinuto());
                        diasConTardanza.add(t);
                    }
                }
            }
        }
        return diasConTardanza;
    }
    
    
    
}
