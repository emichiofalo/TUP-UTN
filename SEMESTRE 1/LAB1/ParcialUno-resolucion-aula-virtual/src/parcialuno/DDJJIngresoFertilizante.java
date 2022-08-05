/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialuno;

/**
 *
 * @author Gerardo
 */
public class DDJJIngresoFertilizante {
    
    private int anioDeclaracion;
    private int mesDeclaracion;
    private double montoXIngreso;
    private String empresa;
    private long cuitEmpresa;
    private String [][] detallesFertilizantes;

    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }

    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

    public double getMontoXIngreso() {
        return montoXIngreso;
    }

    public void setMontoXIngreso(double montoXIngreso) {
        this.montoXIngreso = montoXIngreso;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCuitEmpresa() {
        return cuitEmpresa;
    }

    public void setCuitEmpresa(long cuitEmpresa) {
        this.cuitEmpresa = cuitEmpresa;
    }

    public String[][] getDetallesFertilizantes() {
        return detallesFertilizantes;
    }

    public void setDetallesFertilizantes(String[][] detallesFertilizantes) {
        this.detallesFertilizantes = detallesFertilizantes;
    }
    
    public void inicializarCantidadFilas(int filas){
    
        this.detallesFertilizantes = new String[filas][6];
        
    }
    
    public void calcularMontoIngresoTotal(){
        double total=0;
        for(int i = 0; i < this.detallesFertilizantes.length; i++){
            total += Double.parseDouble(this.detallesFertilizantes[i][5]);
        }
        this.montoXIngreso = total;
    }
    
    public void asignarDatos(int fila, String codigo, String nombre, String tipoEnvase, int capacidad, int cantidad, double subTotal){
        this.detallesFertilizantes[fila][0] = codigo;
        this.detallesFertilizantes[fila][1] = nombre;
        this.detallesFertilizantes[fila][2] = tipoEnvase;
        this.detallesFertilizantes[fila][3] = Integer.toString(capacidad);
        this.detallesFertilizantes[fila][4] = Integer.toString(cantidad);
        this.detallesFertilizantes[fila][5] = Double.toString(subTotal);
    }

        
}
