package tp7;

import java.util.Scanner;

public class Facturacion {

    private static String articulos [][] = {{"101","Leche","25"},{"102","Gaseosa","30"},
            {"103","Fideos","15"},{"104","Arroz","28"},{"105","Vino","120"},{"106","Manteca","20"},
            {"107","Lavandina","18"},{"108","Detergente","46"},{"109","Jabon en polvo","96"},
            {"110","Galletas","60"}};
    
    public static void main(String[] args) {
        Factura factura = new Factura();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los datos de la factura:");
        System.out.println("Fecha:");
        factura.setFechaFactura(sc.nextLine());
        System.out.println("Número de factura:");
        factura.setNumeroFactura(leerNumeroEntero());
        System.out.println("Cliente:");
        factura.setCliente(leerCadena());
        
        while(true){
            DetalleFactura detallefact = new DetalleFactura();
            String [] articulo = buscarArticulo();
            detallefact.setCodigoArticulo(articulo[0]);
            detallefact.setNombreArticulo(articulo[1]);
            detallefact.setPrecioUnitario(Double.valueOf(articulo[2]));
            System.out.println("Ingrese la cantidad a facturar: ");
            int cantidad = sc.nextInt();
            detallefact.setCantidad(cantidad);
            double descuento = calcularDescuento(cantidad,articulo);
            detallefact.setDescuento(descuento);
            detallefact.setSubTotal(calcularSubTotal(cantidad,descuento,articulo));
            
            factura.addDetallesFactura(detallefact);
            
            System.out.println("Desea salir?");
            System.out.println("S (SI) N (NO)");
            String salir = leerCadena();
            if (salir.equalsIgnoreCase("s"))
                break;
        }
        
        factura.calcularMontoTotal();
        imprimirFactura(factura);
    }
    
    private static Long leerNumeroEntero(){
        long numero = 0;
        while(true){
            numero = new Scanner(System.in).nextLong();
            if(numero <= 0){
                System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            }else{
                break;
            }
        }
        return numero;
    }
    
    private static String leerCadena(){
        String cadena = "";
        while(true){
            cadena = new Scanner(System.in).nextLine();
            if(cadena.isEmpty()){
                System.out.println("El valor ingresado no puede ser vacio. Ingrese nuevamente la cadena.");
            }else{
                break;
            }
        }
        return cadena;
    }
    
    private static String[] buscarArticulo(){
         String [] articulo = new String[3];
         while(true){
               System.out.println("Ingrese el codigo del articulo a facturar:");
               String codigo = leerCadena();

               boolean encontrado = false;
               for(int i=0; i < articulos.length; i++){
                   if(articulos[i][0].equals(codigo)){
                       articulo[0] = articulos[i][0];
                       articulo[1] = articulos[i][1];
                       articulo[2] = articulos[i][2];      
                       encontrado = true;
                       break;
                   }
               }
               if(!encontrado){
                   System.out.println("El codigo ingresado no  existe, intente nuevamente.");
               }else{
                   break;
               }
         }
        
        return articulo;
    }
    
    private static double calcularDescuento (int cantidad, String[] articulo){
        double descuento = 0.0;
        if (cantidad > 5)
            descuento = Double.valueOf(articulo[2])*0.1;
        return descuento;
    }
    
    private static double calcularSubTotal (int cantidad, double descuento, String[] articulo){
        double subTotal = 0.0;
        subTotal = (Double.valueOf(articulo[2])-descuento)*cantidad;
        return subTotal;
    }
    
    private static String completarConEspacios(String cadena){
        int cantidadEspacios = 20 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }
    
    private static void imprimirFactura(Factura factura){
        System.out.println("--------------------------------------------------------");
        System.out.println("Fecha:   " + factura.getFechaFactura());
        System.out.println("Numero:  " + Long.toString(factura.getNumeroFactura()));
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println(completarConEspacios("Código") + "\t"+completarConEspacios("Nombre")+"\t"+completarConEspacios("Cantidad")+"\t"+completarConEspacios("Precio")+"\t"+completarConEspacios("Descuento")+"\t"+completarConEspacios("Subtotal")+"");
        System.out.println(completarConEspacios("Artículo") + "\t"+completarConEspacios("Artículo")+"\t"+completarConEspacios(" ")+"\t"+completarConEspacios("Unitario")+"\t"+completarConEspacios(" ")+"\t"+completarConEspacios(" ")+"");
        for(DetalleFactura detalle : factura.getDetallesFactura()){
            System.out.println(completarConEspacios(detalle.getCodigoArticulo()) + "\t " + completarConEspacios(detalle.getNombreArticulo()) + " \t "
                    + completarConEspacios(Integer.toString(detalle.getCantidad())) + " \t " + completarConEspacios(Double.toString(detalle.getPrecioUnitario())) + " \t "
                    + completarConEspacios(Double.toString(detalle.getDescuento())) + " \t " + completarConEspacios(Double.toString(detalle.getSubTotal())) + "");
        
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("El monto total es: " + factura.getTotalCalculadoFactura());
        System.out.println("--------------------------------------------------------");
    }
    
}   

