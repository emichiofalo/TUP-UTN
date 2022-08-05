package Edificio;

/**
 *
 * @author Emi Chiófalo
 */
public class Edificio {
    protected int cantPisos; 
    protected int cantSalidasEmergencia;
    protected int cantAscensores; 
    protected int cantEspaciosComunes;
    protected double valorExpensas;
    protected String direccion;

    public Edificio(int cantPisos, int cantSalidasEmergencia, int cantAscensores, int cantEspaciosComunes, double valorExpensas, String direccion) {
        this.cantPisos = cantPisos;
        this.cantSalidasEmergencia = cantSalidasEmergencia;
        this.cantAscensores = cantAscensores;
        this.cantEspaciosComunes = cantEspaciosComunes;
        this.valorExpensas = valorExpensas;
        this.direccion = direccion;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getCantSalidasEmergencia() {
        return cantSalidasEmergencia;
    }

    public void setCantSalidasEmergencia(int cantSalidasEmergencia) {
        this.cantSalidasEmergencia = cantSalidasEmergencia;
    }

    public int getCantAscensores() {
        return cantAscensores;
    }

    public void setCantAscensores(int cantAscensores) {
        this.cantAscensores = cantAscensores;
    }

    public int getCantEspaciosComunes() {
        return cantEspaciosComunes;
    }

    public void setCantEspaciosComunes(int cantEspaciosComunes) {
        this.cantEspaciosComunes = cantEspaciosComunes;
    }

    public double getValorExpensas() {
        return valorExpensas;
    }

    public void setValorExpensas(double valorExpensas) {
        this.valorExpensas = valorExpensas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void AumentarExpensas (double porcentaje){
        porcentaje /= 100;
        this.valorExpensas = Math.round(this.valorExpensas*(1+porcentaje));
    }
    
}
