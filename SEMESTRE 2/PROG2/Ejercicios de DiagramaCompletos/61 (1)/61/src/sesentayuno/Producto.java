package sesentayuno;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Producto {

    private int idPr;
    private String descripcion;
    private String marca;
    private double precio;
    private int stock;
    private ArrayList<DetallePrecio> detallePrecios = new ArrayList<>();
    private ArrayList<DetallePedido> detallePedidos = new ArrayList<>();

    public Producto() {
    }

    public Producto(int idPr, String descripcion, String marca, double precio, int stock) {
        this.idPr = idPr;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public int getIdPr() {
        return idPr;
    }

    public void setIdPr(int idPr) {
        this.idPr = idPr;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<DetallePrecio> getDetallePrecios() {
        return detallePrecios;
    }

    public void setDetallePrecios(DetallePrecio detallePrecios) {
        this.detallePrecios.add(detallePrecios);
    }

    public ArrayList<DetallePedido> getDetallePedidos() {
        return detallePedidos;
    }

    public void setDetallePedidos(ArrayList<DetallePedido> detallePedidos) {
        this.detallePedidos = detallePedidos;
    }

    @Override
    public String toString() {
        return "Producto{" + "idPr=" + idPr + ", descripcion=" + descripcion + ", marca=" + marca + ", precio=" + precio + ", stock=" + stock + ", detallePrecios=" + detallePrecios + ", detallePedidos=" + detallePedidos + '}';
    }

}
