/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteA;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class CalculoFactura {

    private static String[][] articulos = {{"100", "Azucar", "20", "U"}, {"101", "Leche", "30", "U"},
    {"102", "Aceite", "50", "U"}, {"103", "Sal", "45", "U"}, {"104", "Fideos", "15", "U"},
    {"105", "Arroz", "28", "U"}, {"106", "Galletas", "26", "U"},
    {"107", "Carne Molida", "220", "Kg"}, {"108", "Shampoo", "42", "U"},
    {"109", "Queso Mantecoso", "178", "Kg"}, {"110", "Jamon Cocido", "320", "Kg"},
    {"111", "Naranjas", "80", "Kg"}};

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Factura f1 = new Factura();

        System.out.println("Ingrese los datos de la factura: ");
        System.out.println("Fecha: ");
        f1.setFecha(leerCadena());
        System.out.println("Nro factura: ");
        f1.setNroFactura(leerLong());
        System.out.println("Razon social: ");
        f1.setRazonSocial(leerCadena());
        System.out.println("Cuit: ");
        f1.setCuitCliente(leerCUIT());

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

        int cantItems;
        do {
            System.out.println("Cantidad de artículos a facturar: ");
            cantItems = sc.nextInt();
            if (validarCantItems(cantItems)) {
                f1.setItemsFactura(new String[cantItems][5]);
                break;
            } else {
                System.out.println("Debe ingresar por lo menos un artículo.");
            }
        } while (true);

        System.out.println("-------------------------------------------------");
        System.out.println("ARTICULOS A FACTURAR");
        for (int i = 0; i < cantItems; i++) {
            String[] articulo = busquedaArticulo();
            articulo = cantAFacturar(articulo);
            f1.getItemsFactura()[i][0] = articulo[0];
            f1.getItemsFactura()[i][1] = articulo[1];
            f1.getItemsFactura()[i][2] = articulo[2];
            f1.getItemsFactura()[i][3] = articulo[3];
            f1.getItemsFactura()[i][4] = articulo[4];
        }

        f1.setMontoTotalItems(calcularMontoTotalItems(f1.getItemsFactura()));
        f1.setRecargo(calcularRecargo(f1.getTipoPago(), f1.getMontoTotalItems()));
        double totalAPagar = f1.getRecargo() + f1.getMontoTotalItems();
        f1.setMontoFinal(totalAPagar);
        System.out.println("El ticket a pagar es de: $" + totalAPagar);

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

    private static long leerLong() {
        long numero;
        while (true) {
            numero = sc.nextLong();
            if (numero < 0) {
                System.out.println("El valor ingresado no puede ser negativo. Intente nuevamente.");
            } else {
                break;
            }
        }
        return numero;
    }

    private static long leerCUIT() {
        long cuit;
        while (true) {
            cuit = sc.nextLong();
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

    static boolean validarCantItems(int cantItems) {
        if (cantItems <= 0) {
            return false;
        }
        return true;
    }

    private static String[] busquedaArticulo() {
        String[] articulo = new String[5];
        boolean salir = true;
        while (salir) {
            System.out.println("Ingrese el codigo del articulo:");
            String codigo = leerCadena();
            boolean encontrado = false;
            for (int i = 0; i < articulos.length; i++) {
                if (articulos[i][0].equals(codigo)) {
                    articulo[0] = articulos[i][0];
                    articulo[1] = articulos[i][1];
                    articulo[2] = articulos[i][2];
                    articulo[3] = articulos[i][3];
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

    private static String[] cantAFacturar(String[] articulo) {
        double cantidad = 0;
        while (true) {
            if (articulo[3].equals("U")) {
                System.out.println("Ingrese la cantidad de unidades a facturar: ");
                try {
                    cantidad = new Scanner(System.in).nextInt();
                    articulo[3] = String.valueOf(cantidad);
                    break;
                } catch (Exception e) {
                    System.out.println("El producto se vende por unidad. Ingrese un numero entero. ");
                }
            } else if (articulo[3].equals("Kg")) {
                System.out.println("Ingrese los kilogramos a facturar: ");
                try {
                    cantidad = new Scanner(System.in).nextDouble();
                    articulo[3] = String.valueOf(cantidad);
                    break;
                } catch (Exception e) {
                    System.out.println("Utilice coma en vez de punto.");
                }
            }
        }
        return calculoSubtotal(articulo);
    }

    private static String[] calculoSubtotal(String[] articulo) {
        articulo[4] = String.valueOf(Double.valueOf(articulo[2]) * Double.valueOf(articulo[3]));
        return articulo;
    }

    private static double calcularMontoTotalItems(String[][] itemsFactura) {
        double montoTotalItems = 0;
        for (String[] item : itemsFactura) {
            montoTotalItems += Double.valueOf(item[4]);
        }
        return montoTotalItems;
    }

    private static double calcularRecargo(String tipoPago, double totalItems) {
        double recargo = 0;
        if (tipoPago.equals("C")) {
            recargo = 0.0;
        } else if (tipoPago.equals("TD")) {
            recargo = totalItems * 0.05;
        } else if (tipoPago.equals("TC")) {
            recargo = totalItems * 0.1;
        }
        return recargo;
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
        System.out.println("Cliente: " + f.getRazonSocial());
        System.out.println("Fecha: " + f.getFecha());
        System.out.println("Numero: " + f.getNroFactura());
        System.out.println("Tipo pago: " + f.getTipoPago());
        System.out.println(completarConEspacios("Código Item") + "\t" + completarConEspacios("Denominacion")
                + "\t" + completarConEspacios("Precio") + "\t" + completarConEspacios("Cantidad")
                + "\t" + completarConEspacios("Subttotal"));
        for (int i = 0; i < f.getItemsFactura().length; i++) {
            System.out.println(completarConEspacios(f.getItemsFactura()[i][0]) + "\t " + completarConEspacios(f.getItemsFactura()[i][1]) + " \t "
                    + completarConEspacios(f.getItemsFactura()[i][2]) + " \t " + completarConEspacios(f.getItemsFactura()[i][3]) + " \t "
                    + completarConEspacios(f.getItemsFactura()[i][4]));
        }
        System.out.println("");
        System.out.println(completarConEspacios("Total items:") + "\t" + completarConEspacios(String.valueOf(f.getMontoTotalItems())));
        System.out.println(completarConEspacios("Recargo:") + "\t" + completarConEspacios(String.valueOf(f.getRecargo())));
        System.out.println(completarConEspacios("Total final:") + "\t" + completarConEspacios(String.valueOf(f.getMontoFinal())));        
    }
}
