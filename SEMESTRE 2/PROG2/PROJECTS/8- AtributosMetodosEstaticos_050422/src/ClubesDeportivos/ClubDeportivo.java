package ClubesDeportivos;

import Auditable.Auditable;

/**
 *
 * @author Emi Chiófalo
 */
public abstract class ClubDeportivo implements Auditable {

    protected int cantSocios;
    protected int cantEntrenadores;
    protected String presidente;
    protected int cuota;
    protected int inscripcion;
    
    public ClubDeportivo(int cantSocios, int cantEntrenadores, String presidente, int cuota, int inscripcion) {
        this.cantSocios = cantSocios;
        this.cantEntrenadores = cantEntrenadores;
        this.presidente = presidente;
        this.cuota = cuota;
        this.inscripcion = inscripcion;
    }

    public int getCantSocios() {
        return cantSocios;
    }

    public void setCantSocios(int cantSocios) {
        this.cantSocios = cantSocios;
    }

    public int getCantEntrenadores() {
        return cantEntrenadores;
    }

    public void setCantEntrenadores(int cantEntrenadores) {
        this.cantEntrenadores = cantEntrenadores;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(int inscripcion) {
        this.inscripcion = inscripcion;
    }

}
