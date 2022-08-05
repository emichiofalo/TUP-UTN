package ejerciciodos;

import java.util.Date;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
public class Devolucion {

    private int codigo;
    private int cod_factura;
    private int cod_articulo;
    private Date fecha;
    private int cantidad;
    
    Detalle_Factura detalle_Factura = new Detalle_Factura();

    public Devolucion() {
    }

    public Devolucion(int codigo, int cod_factura, int cod_articulo, Date fecha, int cantidad) {
        this.codigo = codigo;
        this.cod_factura = cod_factura;
        this.cod_articulo = cod_articulo;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }
    
    
            
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(int cod_factura) {
        this.cod_factura = cod_factura;
    }

    public int getCod_articulo() {
        return cod_articulo;
    }

    public void setCod_articulo(int cod_articulo) {
        this.cod_articulo = cod_articulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }   
}
