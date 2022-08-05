package ejerciciodos;

import java.util.Date;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        Date fecha = new Date();
        fecha.getDate();       

        Devolucion d = new Devolucion();

        //Cliente
        d.detalle_Factura.factura.cliente.setDocumento("17155663");
        d.detalle_Factura.factura.cliente.setNombre("Pepe");
        d.detalle_Factura.factura.cliente.setApellido("Hongito");
        d.detalle_Factura.factura.cliente.setDireccion("Calle Falsa");
        d.detalle_Factura.factura.cliente.setTelefono(4246640);
        d.detalle_Factura.factura.cliente.setCiudad("Mendoza");

        //Proveedor
        d.detalle_Factura.articulo.proveedor.setDocumento("6987654");
        d.detalle_Factura.articulo.proveedor.setNombre("Mario");
        d.detalle_Factura.articulo.proveedor.setApellido("Bro");
        d.detalle_Factura.articulo.proveedor.setDireccion("9 Junio");
        d.detalle_Factura.articulo.proveedor.setTelefono(15565654);
        d.detalle_Factura.articulo.proveedor.setCiudad("Jujuy");
        
        //Articulo
        d.detalle_Factura.articulo.setCodigo(9);
        d.detalle_Factura.articulo.setDescripcion("Chocoloca");
        d.detalle_Factura.articulo.setExistencia(150);
        d.detalle_Factura.articulo.setPrecioVenta(290);
        d.detalle_Factura.articulo.setPrecioCosto(90);
        d.detalle_Factura.articulo.setEstado(true);
        d.detalle_Factura.articulo.setTipo("Golosina");
        
        //Factura
        d.detalle_Factura.factura.formaDePago.setCodigo(1);
        d.detalle_Factura.factura.formaDePago.setValor(600);
        d.detalle_Factura.factura.formaDePago.elejir("Efectivo");
        d.detalle_Factura.factura.setFecha(fecha);
        
        //Detalle Factura
        d.detalle_Factura.setCod_factura(d.detalle_Factura.factura.getCodigo());
        d.detalle_Factura.setCod_articulo(d.detalle_Factura.articulo.getCodigo());
        d.detalle_Factura.setCantidad(2);
        d.detalle_Factura.setIVA(21);
        d.detalle_Factura.setPrecioVenta(d.detalle_Factura.articulo.getPrecioVenta());
        d.detalle_Factura.setDescuento(10);
        
        //Devolucion
        d.setCodigo(011);
        d.setCodigo(d.detalle_Factura.getCod_factura());
        d.setCod_articulo(d.detalle_Factura.articulo.getCodigo());
        d.setFecha(fecha);
        d.setCantidad(1);
        
    }
}
