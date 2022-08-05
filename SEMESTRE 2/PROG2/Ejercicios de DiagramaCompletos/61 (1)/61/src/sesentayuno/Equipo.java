package sesentayuno;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Equipo {

    private String color;
    private String imei;
    private ArrayList<DetalleCaracteristica> detalleCaracteristicas = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String color, String imei) {
        this.color = color;
        this.imei = imei;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public ArrayList<DetalleCaracteristica> getDetalleCaracteristicas() {
        return detalleCaracteristicas;
    }

    public void setDetalleCaracteristicas(DetalleCaracteristica detalleCaracteristicas) {
        this.detalleCaracteristicas.add(detalleCaracteristicas);
    }

    @Override
    public String toString() {
        return "Equipo{" + "color=" + color + ", imei=" + imei + ", detalleCaracteristicas=" + detalleCaracteristicas + '}';
    }
}
