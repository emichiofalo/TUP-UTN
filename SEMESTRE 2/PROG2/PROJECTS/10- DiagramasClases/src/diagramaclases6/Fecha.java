package diagramaclases6;

/**
 *
 * @author Emi Chiófalo
 */
public class Fecha {

    private int dia; 
    private int mes; 
    private int anyo; 

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    public boolean isBisiesto(){
        if (this.anyo % 4 == 0 && this.anyo % 100 != 0 || this.anyo % 400 == 0) {
            return true;
        }else{
            return false;
        }
    }
    
    public void imprimir(){
        System.out.println("Fecha: " + this.dia + "/" + this.mes + "/" + this.anyo);
    }
    
    public String toString(){
        return "Fecha: " + String.valueOf(this.dia) + "/" + String.valueOf(this.mes) + "/" + String.valueOf(this.anyo);
    }
    
    public int getDiferenciaAnyos(Fecha fecha){
        if (fecha.getAnyo() > this.anyo) {
            return fecha.getAnyo() - this.anyo;
        }else{
            return this.anyo - fecha.getAnyo();
        }
    }
    
}
