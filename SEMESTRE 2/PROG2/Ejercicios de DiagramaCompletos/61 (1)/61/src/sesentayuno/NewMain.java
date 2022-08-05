package sesentayuno;

import java.util.Date;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 *
 */
public class NewMain {

    public static void main(String[] args) {

//        Pedido pedido
//                = new Pedido(1, 1500.5, true, new Date(2000, 10, 10), new Date(2000, 10, 10), new Date(2000, 10, 10), new Date(2000, 10, 10),
//                        new Cliente(5, "asd", "ASD", "aads", true),
//                        new Vendedor(10, "dffsd", "df", "asd", "asdasd", "asd", true));
//
//        pedido.setProductos(new Producto(150, "chocoloca", "serenita", 15, 50));
//        pedido.getProductos().get(0).setDetallePrecios(new DetallePrecio(30, new Date(2022, 5, 14)));
//        pedido.setDocVenta(new DocVenta(5000, true, new Date(2020, 10, 15), new Date(2020, 10, 15)));
//        pedido.setFormaPago(new FormaPago("asd", "asd", true));
//        pedido.setFormaEntrega(new FormaEntrega(66, "asdsa"));
//
//        DetallePedido detallePedido
//                = new DetallePedido(10, 150.5, true,
//                        new Producto(9, "Chocolate", "asd", 9.5, 500),
//                        new Pedido(99, 300.5, true, new Date(2020, 10, 15), new Date(2020, 10, 15), new Date(2020, 10, 15), new Date(2020, 10, 15),
//                                new Cliente(984, "asd", "asd", "asd", true),
//                                new Vendedor(99, "asd", "asd", "asd", "asd", "asd", true)));
//
        Pedido pedido = new Pedido();

        pedido.setDetallePedido(
                new DetallePedido(150, 1500.69, true,
                        new Producto(654, "asd", "ASd", 15.55, 500),
                        new Pedido(5, 1500.5, true, new Date(2020, 10, 15), new Date(2020, 10, 15), new Date(2020, 10, 15), new Date(2020, 10, 15),
                                new Cliente(55, "asd", "asd", "as", true),
                                new Vendedor(654, "asd", "Asd", "Asd", "asd", "asd", true))));
        
        DetalleCaracteristica detalleCaracteristica
                = new DetalleCaracteristica('u',
                        new Caracteristica(99, "fga"),
                        new Equipo("blu", "54654"));
        
        System.out.println(pedido.toString());
        System.out.println(detalleCaracteristica.toString());
    }
}
