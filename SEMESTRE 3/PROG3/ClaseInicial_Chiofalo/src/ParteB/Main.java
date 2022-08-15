package ParteB;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class Main {

    private static String[][] articulos = {{"100", "Azucar", "20", "U"}, {"101", "Leche", "30", "U"},
    {"102", "Aceite", "50", "U"}, {"103", "Sal", "45", "U"}, {"104", "Fideos", "15", "U"},
    {"105", "Arroz", "28", "U"}, {"106", "Galletas", "26", "U"},
    {"107", "Carne Molida", "220", "Kg"}, {"108", "Shampoo", "42", "U"},
    {"109", "Queso Mantecoso", "178", "Kg"}, {"110", "Jamon Cocido", "320", "Kg"},
    {"111", "Naranjas", "80", "Kg"}};

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        System.out.println("Ingrese los datos del cliente." + "\n"
                + "Razon social: ");
        c1.setRazonSocial(leerCadena());
        System.out.println("CUIT: ");
        c1.setCuit(leerCUIT());
        Factura f1 = new Factura();
        f1.setFecha(LocalDate.now());
        f1.setLetra("A");
        System.out.println("Nro factura: ");
        f1.setNumero(new Scanner(System.in).nextInt());
        f1.setCliente(c1);

        do {
            System.out.println("Tipo de pago: C - TC - TD");
            String tipoPago = new Scanner(System.in).nextLine().toUpperCase();
            if (validarPago(tipoPago)) {
                f1.setTipoPago(tipoPago);
                break;
            } else {
                System.out.println("Tipo de pago incorrecto. Intente nuevamente.");
            }
        } while (true);

        System.out.println("-------------------------------------------------");
        System.out.println("ARTICULOS A FACTURAR");
        do {
            DetalleFactura detalle = new DetalleFactura();
            detalle.setArticulo(busquedaArticulo());
            f1.addDetalleFactura(cantAFacturar(detalle));
        } while (continuar());

        f1.setTotalItems();
        f1.setRecargo();
        f1.setTotalFinal();
        System.out.println("El ticket a pagar es de: $" + f1.getTotalFinal());

        imprimirFactura(f1);
    }

    private static String leerCadena() {
        String cadena = "";
        do {
            cadena = new Scanner(System.in).nextLine();
            if (cadena.isEmpty()) {
                System.out.println("El valor ingresado no puede ser vacio. Intente nuevamente.");
            } else {
                break;
            }
        } while (true);

        return cadena;
    }

    private static long leerCUIT() {
        long cuit;
        while (true) {
            cuit = new Scanner(System.in).nextLong();
            if (cuit <= 0) {
                System.out.println("El cuit debe poseer 11 digitos. Ingrese nuevamente el cuit.");
            } else if (Long.toString(cuit).length() != 11) {
                System.out.println("El cuit debe poseer 11 digitos. Ingrese nuevamente el cuit.");
            } else {
                break;
            }
        }
        return cuit;
    }

    static boolean validarPago(String tipoPago) {
        switch (tipoPago) {
            case "C":
                return true;
            case "TC":
                return true;
            case "TD":
                return true;
            default:
                return false;
        }
    }

    private static boolean continuar() {
        System.out.println("Desea facturar más artículos? S/N");
        String continuar = new Scanner(System.in).nextLine();
        if (continuar.equalsIgnoreCase("s")) {
            return true;
        } else {
            return false;
        }
    }

    private static Articulo busquedaArticulo() {
        Articulo articulo = new Articulo();
        boolean salir = true;
        while (salir) {
            System.out.println("Ingrese el codigo del articulo:");
            String codigo = leerCadena();
            boolean encontrado = false;
            for (int i = 0; i < articulos.length; i++) {
                if (articulos[i][0].equals(codigo)) {
                    articulo.setCodigo(Integer.valueOf(articulos[i][0]));
                    articulo.setDenominacion(articulos[i][1]);
                    articulo.setPrecio(Double.valueOf(articulos[i][2]));
                    articulo.setUnidadMedida(articulos[i][3]);
                    encontrado = true;
                    salir = false;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El codigo " + codigo + " no existe, intente nuevamente.");
            }
        }
        return articulo;
    }

    private static DetalleFactura cantAFacturar(DetalleFactura detalle) {
        double cantidad = 0;
        while (true) {
            if (detalle.getArticulo().getUnidadMedida().equals("U")) {
                System.out.println("Ingrese la cantidad de unidades a facturar: ");
                try {
                    cantidad = new Scanner(System.in).nextInt();
                    detalle.setCantidad(cantidad);
                    break;
                } catch (Exception e) {
                    System.out.println("El producto se vende por unidad. Ingrese un numero entero. ");
                }
            } else if (detalle.getArticulo().getUnidadMedida().equals("Kg")) {
                System.out.println("Ingrese los kilogramos a facturar: ");
                try {
                    cantidad = new Scanner(System.in).nextDouble();
                    detalle.setCantidad(cantidad);
                    break;
                } catch (Exception e) {
                    System.out.println("Utilice coma en vez de punto.");
                }
            }
        }
        return calculoSubtotal(detalle);
    }

    private static DetalleFactura calculoSubtotal(DetalleFactura detalle) {
        detalle.setSubtotal(detalle.getCantidad()*detalle.getArticulo().getPrecio());
        return detalle;
    }

    private static String completarConEspacios(String cadena) {
        int cantidadEspacios = 20 - cadena.length();
        for (int i = 0; i < cantidadEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }

    private static void imprimirFactura(Factura f) {
        System.out.println("-------------------------------------------------");
        System.out.println("Factura " + f.getLetra());
        System.out.println("Cliente: " + f.getCliente().getRazonSocial());
        System.out.println("Fecha: " + f.getFecha());
        System.out.println("Numero: " + f.getNumero());
        System.out.println("Tipo pago: " + f.getTipoPago());
        System.out.println(completarConEspacios("Código Item") + "\t" + completarConEspacios("Denominacion")
                + "\t" + completarConEspacios("Precio") + "\t" + completarConEspacios("Cantidad")
                + "\t" + completarConEspacios("Subttotal"));
        for (DetalleFactura detalle : f.getDetalleFactura()) {
            System.out.println(completarConEspacios(String.valueOf(detalle.getArticulo().getCodigo())) + "\t " 
                    + completarConEspacios(detalle.getArticulo().getDenominacion()) + " \t "
                    + completarConEspacios(String.valueOf(detalle.getArticulo().getPrecio())) + " \t " 
                    + completarConEspacios(String.valueOf(detalle.getCantidad())) + " \t "
                    + completarConEspacios(String.valueOf(detalle.getSubtotal())));
        }
        System.out.println("");
        System.out.println(completarConEspacios("Total items:") + "\t" + completarConEspacios(String.valueOf(f.getTotalItems())));
        System.out.println(completarConEspacios("Recargo:") + "\t" + completarConEspacios(String.valueOf(f.getRecargo())));
        System.out.println(completarConEspacios("Total final:") + "\t" + completarConEspacios(String.valueOf(f.getTotalFinal())));        
    }
    
}
