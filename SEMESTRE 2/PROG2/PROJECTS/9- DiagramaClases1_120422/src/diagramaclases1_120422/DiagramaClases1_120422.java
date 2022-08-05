package diagramaclases1_120422;

/**
 *
 * @author Emi Chiófalo
 */
public class DiagramaClases1_120422 {

    public static void main(String[] args) {
        
        Factura f1 = new Factura();
        
        f1.setTipo('C');
        f1.setNumero(5587);
        f1.setFecha(new Fecha());                                               //es la fecha de esta factura en particular 
        f1.getFecha().setDia(12);
        f1.getFecha().setMes(4);
        f1.getFecha().setAnio(2022);
        f1.setmCliente(new Cliente());                                          //es el cliente al que corresponde esta factura
        f1.getmCliente().setCodigo(124);
        f1.getmCliente().setRazonSocial("Kueroz");
        f1.setProducto(new Producto());
        f1.getmProducto().get(0).setCodigo(1);
        f1.getmProducto().get(0).setDescripcion("Cartera");
        f1.getmProducto().get(0).setPrecio(5700);
        f1.setProducto(new Producto());
        f1.getmProducto().get(1).setCodigo(2);
        f1.getmProducto().get(1).setDescripcion("Mochila");
        f1.getmProducto().get(1).setPrecio(7000);
        
        System.out.println("Factura tipo: " + f1.getTipo() + " Nro: " + f1.getNumero() + " Fecha: " + f1.getFecha().getDia() + "/" + 
                f1.getFecha().getMes() + "/" + f1.getFecha().getAnio());
        System.out.println("Cliente: " + f1.getmCliente().getCodigo() + " - " + f1.getmCliente().getRazonSocial());
        
        for (Producto prod : f1.getmProducto()){
            System.out.println(prod.getCodigo() + " " + prod.getDescripcion() + " " + prod.getPrecio());
        }
        
        System.out.println("Total: $" + f1.getTotal());
    }
    
}
