/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioD;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Barrio {
    
    private long Id; 
    private String nombre; 
    private String empresaConstructora; 
    private List<Vivienda> viviendas; 

    public Barrio() {
    }

    public Barrio(long Id, String nombre, String empresaConstructora, List<Vivienda> viviendas) {
        this.Id = Id;
        this.nombre = nombre;
        this.empresaConstructora = empresaConstructora;
        this.viviendas = viviendas;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaConstructora() {
        return empresaConstructora;
    }

    public void setEmpresaConstructora(String empresaConstructora) {
        this.empresaConstructora = empresaConstructora;
    }

    public List<Vivienda> getViviendas() {
        return viviendas;
    }

    public void addVivienda(Vivienda vivienda) {
        if (this.viviendas == null) {
            this.viviendas = new ArrayList();
        }
        this.viviendas.add(vivienda);
    }
    
    public double getSuperficieTotalTerreno(){
        double superficieTotalTerreno = 0;
        for (Vivienda viv : this.viviendas){
            superficieTotalTerreno += viv.getSuperficioTerreno();
        }
        return superficieTotalTerreno;
    }
    
    public double getSuperficieTotalCubierta(){
        double supTotalCubierta = 0; 
        for (Vivienda viv : this.viviendas){
            try{
                supTotalCubierta += viv.getMetrosCuadradosCubiertos();
            }catch (Exception e){
                e.getMessage();
            }
        }
        return supTotalCubierta; 
    }
}
