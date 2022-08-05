package diagramaclases2_120422;

/**
 *
 * @author Emi Chiófalo
 */
public class NewMain {

    public static void main(String[] args) {
        
        Recibo r1 = new Recibo();
        
        r1.setTipo('F');
        r1.setNumero(1234);
        //r1.setFecha(new Fecha());                                             //no se hace porque está instanciado en el comprobante
        r1.getFecha().setDia(12);
        r1.getFecha().setMes(4);
        r1.getFecha().setAnio(2022);
        //r1.setProveedor(new Proveedor());                                     //no se hace porque está instanciado en el recibo
        r1.getProveedor().setCodigo(2345);
        r1.getProveedor().setRazonSocial("Mix mix");
        r1.setTotal(5500);
        r1.setDetalle("cinco mil quinientos con cero centavos");
        
        System.out.println("Recibo tipo: " + r1.getTipo() + " nro: " + r1.getNumero() + " Fecha: " + r1.getFecha().getDia() + "/" + 
                r1.getFecha().getMes() + "/" + r1.getFecha().getAnio());
        System.out.println("Proveedor: " + r1.getProveedor().getCodigo() + " - " + r1.getProveedor().getRazonSocial());
        System.out.println("Total: $" + r1.getTotal() + " detalle: " + r1.getDetalle());
        
    }
    
}
