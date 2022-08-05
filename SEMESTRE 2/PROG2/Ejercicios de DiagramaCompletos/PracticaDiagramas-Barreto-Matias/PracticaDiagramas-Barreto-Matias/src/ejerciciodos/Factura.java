package ejerciciodos;

import java.util.Date;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Factura {

    private int codigo;
    private String cod_cliente;
    private String empleado;
    private Date fecha;
    private String forma_de_pago;
    private boolean estadoFactura;

    Cliente cliente = new Cliente();
    Forma_de_pago formaDePago = new Forma_de_pago();        
    
    public Factura() {
    }

    public Factura(int codigo, String cod_cliente, String empleado, Date fecha, String forma_de_pago, boolean estadoFactura) {
        this.codigo = codigo;
        this.cod_cliente = cod_cliente;
        this.empleado = empleado;
        this.fecha = fecha;
        this.forma_de_pago = forma_de_pago;
        this.estadoFactura = estadoFactura;
    }        

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(String cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public boolean isEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(boolean estadoFactura) {
        this.estadoFactura = estadoFactura;
    }
}
