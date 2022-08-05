package parcial2_prog2_chiofaloemilia;

/**
 *
 * @author Emi Chiófalo
 */
public class Parcial2_Prog2_ChiofaloEmilia {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(51, "Los Tilos 456", "2617444899", 24897544, "Pepe", "Perez");
        c1.setPedidoCliente(new Pedido(15, 14000, EstadoPedido.ABIERTO));
        c1.getPedidoCliente().setPago(new Pago(1234, "Pago aprobado", EstadoPedido.CERRADO, 1500));
        c1.getPedidoCliente().setDetallePedido(new DetallePedido(2,1400));
        c1.getPedidoCliente().getDetallePedido().addPedido(c1.getPedidoCliente());
        c1.getPedidoCliente().getDetallePedido().addProductos(new Producto(1556, "arcor", 700, 10));
        c1.getPedidoCliente().getDetallePedido().addProductos(new Producto(1445, "cadbury", 700, 15));
        c1.getPedidoCliente().setDocumentoVenta(new DocumentoVenta(56, 1400, EstadoPedido.EN_PROCESO));
        
        System.out.println("Datos del cliente: \n" + 
                "Nombre:" + c1.nombrePersona + "\n" +
                "Apellido:" + c1.apellidoPersona + "\n" + 
                "DNI:" + c1.Personadni + "\n" +
                "Numero cliente:" + c1.getNumeroCliente() + "\n" + 
                "Numero pedido:" + c1.getPedidoCliente().getNumeroPedido() + "\n" + 
                "Estado de pedido pagado:" + c1.getPedidoCliente().getPago().getEstado().toString() + "\n" + 
                "Numero del pago:" + c1.getPedidoCliente().getPago().getNumeroPago() + "\n" +
                "Descripcion pago:" + c1.getPedidoCliente().getPago().getDescripcion() + "\n" +
                "Precio de venta:" + c1.getPedidoCliente().getDetallePedido().getPrecioVenta() + "\n" +
                "Productos del pedido:" + "\n" + 
                "Producto 1: " + c1.getPedidoCliente().getDetallePedido().getProductos().get(0).getMarca() + " precio: $" + c1.getPedidoCliente().getDetallePedido().getProductos().get(0).getPrecio() + "\n" + 
                "Producto 2: " + c1.getPedidoCliente().getDetallePedido().getProductos().get(1).getMarca() + " precio: $" + c1.getPedidoCliente().getDetallePedido().getProductos().get(1).getPrecio() + "\n" + 
                "Nro doc Venta:" + c1.getPedidoCliente().getDocumentoVenta().getNumeroDocumentoVenta() + "\n" +
                "Estado documento una vez pagado:" + c1.getPedidoCliente().getDocumentoVenta().getEstado().toString()+
                "\n");
        
        
        Repartidor r1 = new Repartidor(3, 24897544, "Jacinto", "Suarez");
        r1.addDeliverys(new Delivery(100, EstadoPedido.CERRADO));
        r1.getDeliverys().get(0).setNumeroEntrega(35);
        r1.getDeliverys().get(0).setPedido(new Pedido(103));
        r1.getDeliverys().get(0).getPedido().setDetallePedido(new DetallePedido(3,1200));
        r1.getDeliverys().get(0).getPedido().setDocumentoVenta(new DocumentoVenta(57, 1300, EstadoPedido.CERRADO));
        r1.getDeliverys().get(0).getPedido().setPago(new Pago(1235, "Pago aprobado", EstadoPedido.CERRADO, 1300));
        
        r1.addDeliverys(new Delivery(100, EstadoPedido.CERRADO));
        r1.getDeliverys().get(1).setNumeroEntrega(36);
        r1.getDeliverys().get(1).setPedido(new Pedido(104));
        r1.getDeliverys().get(1).getPedido().setDetallePedido(new DetallePedido(4,1600));
        r1.getDeliverys().get(1).getPedido().setDocumentoVenta(new DocumentoVenta(53, 1700, EstadoPedido.CERRADO));
        r1.getDeliverys().get(1).getPedido().setPago(new Pago(1236, "Pago aprobado", EstadoPedido.CERRADO, 1700));
        
        System.out.println("Datos del repartidor: \n" + 
                "Nombre:" + r1.nombrePersona + "\n" +
                "Apellido:" + r1.apellidoPersona + "\n" + 
                "DNI:" + r1.Personadni + "\n" +
                "Numero repartidor:" + r1.getNumeroRepartidor() + "\n" +
                "\n"+
                "Pedidos:" + "\n" +
                "Pedido 1:" + "\n" +
                "Numero de entrega pedido:" + r1.getDeliverys().get(0).getNumeroEntrega() + "\n" + 
                "Numero pedido:" + r1.getDeliverys().get(0).getPedido().getNumeroPedido() + "\n" +   
                "Precio de venta:" + r1.getDeliverys().get(0).getPedido().getDetallePedido().getPrecioVenta() + "\n" + 
                "Cantidad productos:" + r1.getDeliverys().get(0).getPedido().getDetallePedido().getCantidad() + "\n" +        
                "Nro doc Venta pagado:" + r1.getDeliverys().get(0).getPedido().getDocumentoVenta().getNumeroDocumentoVenta() + "\n" +
                "Monto total pagado:" + r1.getDeliverys().get(0).getPedido().getPago().getMontoTotal() + "\n" +
                "\n"+
                "Pedido 2:" + "\n" +
                "Numero de entrega pedido:" + r1.getDeliverys().get(1).getNumeroEntrega() + "\n" + 
                "Numero pedido:" + r1.getDeliverys().get(1).getPedido().getNumeroPedido() + "\n" +   
                "Precio de venta:" + r1.getDeliverys().get(1).getPedido().getDetallePedido().getPrecioVenta() + "\n" + 
                "Cantidad productos:" + r1.getDeliverys().get(1).getPedido().getDetallePedido().getCantidad() + "\n" +        
                "Nro doc Venta pagado:" + r1.getDeliverys().get(1).getPedido().getDocumentoVenta().getNumeroDocumentoVenta() + "\n" +
                "Monto total pagado:" + r1.getDeliverys().get(1).getPedido().getPago().getMontoTotal() + "\n"
                );
        
    }
    
}
