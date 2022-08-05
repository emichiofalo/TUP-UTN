package sesentayuno;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Pedido {

    private int nroPedido;
    private double monto;
    private boolean estado;
    private DocVenta docVenta = new DocVenta();
    private FormaPago formaPago = new FormaPago();
    private FormaEntrega formaEntrega = new FormaEntrega();
    private Date fechaSolicitado;
    private Date fechaRequerido;
    private Date fechaEntregado;
    private Date fechaAnulado;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<DetallePedido> detallePedidos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(int nroPedido, double monto, boolean estado, Date fechaSolicitado, Date fechaRequerido, Date fechaEntregado, Date fechaAnulado, Cliente cliente, Vendedor vendedor) {
        this.nroPedido = nroPedido;
        this.monto = monto;
        this.estado = estado;
        this.fechaSolicitado = fechaSolicitado;
        this.fechaRequerido = fechaRequerido;
        this.fechaEntregado = fechaEntregado;
        this.fechaAnulado = fechaAnulado;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public DocVenta getDocVenta() {
        return docVenta;
    }

    public void setDocVenta(DocVenta docVenta) {
        this.docVenta = docVenta;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public FormaEntrega getFormaEntrega() {
        return formaEntrega;
    }

    public void setFormaEntrega(FormaEntrega formaEntrega) {
        this.formaEntrega = formaEntrega;
    }

    public Date getFechaSolicitado() {
        return fechaSolicitado;
    }

    public void setFechaSolicitado(Date fechaSolicitado) {
        this.fechaSolicitado = fechaSolicitado;
    }

    public Date getFechaRequerido() {
        return fechaRequerido;
    }

    public void setFechaRequerido(Date fechaRequerido) {
        this.fechaRequerido = fechaRequerido;
    }

    public Date getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(Date fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public Date getFechaAnulado() {
        return fechaAnulado;
    }

    public void setFechaAnulado(Date fechaAnulado) {
        this.fechaAnulado = fechaAnulado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<DetallePedido> getDetallePedido() {
        return detallePedidos;
    }

    public void setDetallePedido(DetallePedido detallePedidos) {
        this.detallePedidos.add(detallePedidos);
    }

    @Override
    public String toString() {
        return "Pedido{" + "nroPedido=" + nroPedido + ", monto=" + monto + ", estado=" + estado + ", docVenta=" + docVenta + ", formaPago=" + formaPago + ", formaEntrega=" + formaEntrega + ", fechaSolicitado=" + fechaSolicitado + ", fechaRequerido=" + fechaRequerido + ", fechaEntregado=" + fechaEntregado + ", fechaAnulado=" + fechaAnulado + ", cliente=" + cliente + ", vendedor=" + vendedor + ", detallePedido=" + detallePedidos + '}';
    }
}
