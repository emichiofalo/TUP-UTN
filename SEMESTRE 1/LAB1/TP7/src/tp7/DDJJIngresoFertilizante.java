package tp7;

import java.util.ArrayList;

public class DDJJIngresoFertilizante {
    
    private int anioDeclaracion;
    private int mesDeclaracion;
    private double montoXIngreso;
    private String empresa;
    private long cuitEmpresa;
    private ArrayList <DDJJFertilizanteIngresoDetalle> detalleFertilizante;

    public ArrayList<DDJJFertilizanteIngresoDetalle> getDetalleFertilizante() {
        return detalleFertilizante;
    }

    public void setDetalleFertilizante(ArrayList<DDJJFertilizanteIngresoDetalle> detalleFertilizante) {
        this.detalleFertilizante = detalleFertilizante;
    }

    public void addDetalleFertilizante(DDJJFertilizanteIngresoDetalle detalle) {
        if (this.detalleFertilizante == null)
            this.detalleFertilizante = new ArrayList<DDJJFertilizanteIngresoDetalle>();
        this.detalleFertilizante.add(detalle);
    }
    
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

    public void calcularMontoIngresoTotal(){
        double total=0;
        for (DDJJFertilizanteIngresoDetalle detalle : this.detalleFertilizante){
            total += detalle.getSubtotal();
        }
        this.montoXIngreso = total;
    }
}
