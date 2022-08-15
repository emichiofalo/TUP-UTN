/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialuno;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Gerardo
 */
public class CargaDDJJIngresoFertilizante {

    private static String[][] fertilizantesPermitidos = {{"101", "UREA", "BS"}, {"102", "SULFATO AMONICO", "BS"},
    {"103", "NITRATO AMONICO", "BS"}, {"104", "NITRATO DE CALCIO", "BS"},
    {"105", "SUPERFOSFATO SIMPLE", "BD"}, {"106", "SUPERFOSFATO TRIPLE", "BD"}, {"107", "NITRATO AMONICO", "BS"},
    {"108", "CLORURO DE POTASIO", "BD"}, {"109", "SULFATO DE POTASIO", "BS"}, {"110", "NITROGENO LIQUIDO", "BD"}};

    public static void main(String[] args) {

        DDJJIngresoFertilizante ddjj = new DDJJIngresoFertilizante();
        System.out.println("DDJJ Ingreso de Fertilizantes a Mendoza");
        System.out.println("Ingrese los siguientes datos;");
        System.out.println("Nombre Empresa:");
        String empresa = leerCadena();
        System.out.println("CUIT Empresa");
        long cuitEmpresa = leerCUIT();
        System.out.println("Año DDJJ");
        int anioDDJJ = leerAnio();
        System.out.println("Mes FFJJ");
        int mesDDJJ = leerMes(anioDDJJ);

        ddjj.setAnioDeclaracion(anioDDJJ);
        ddjj.setCuitEmpresa(cuitEmpresa);
        ddjj.setEmpresa(empresa);
        ddjj.setMesDeclaracion(mesDDJJ);

        System.out.println("Indique la cantidad de fertilizantes a ingresar");
        int cantidad = (int) leerNumeroEntero();
        ddjj.inicializarCantidadFilas(cantidad);

        int filaFertilizantes = 0;
        while (filaFertilizantes < cantidad) {
            System.out.println("---------------------------------------");
            String[] fertilizanteEncontrado = buscarFertilizante();
            System.out.println("El fertilizante " + fertilizanteEncontrado[1].toUpperCase() + " ha sido encontrado.");
            System.out.println("Ingrese la cantidad de fertilizantes " + fertilizanteEncontrado[1].toUpperCase() + " a ingresar");
            int cantidadFert = (int) leerNumeroEntero();

            double subTotal = 0;

            String tipoEnvase = fertilizanteEncontrado[2];
            int capacidad = 0;
            if ("BD".equals(tipoEnvase)) {
                System.out.println("Indique la capacidad del Bidon en litros");
                capacidad = (int) leerNumeroEntero();
                subTotal = 12 * cantidadFert;
            } else {
                capacidad = getCapacidadBolsa();
                double montoXBolsa = getMontoXTamanioBolsa(capacidad);
                subTotal = montoXBolsa * cantidadFert;
            }

            ddjj.asignarDatos(filaFertilizantes, fertilizanteEncontrado[0], fertilizanteEncontrado[1], tipoEnvase, capacidad, cantidadFert, subTotal);

            ++filaFertilizantes;
        }
        //calculo la suma de los subtotales
        ddjj.calcularMontoIngresoTotal();
        //imprimo
        imprimirDDJJ(ddjj);

    }

    private static int getCapacidadBolsa() {
        int tamanioBolsa = 0;
        while (true) {
            System.out.println("Ingrese la capacidad en kilos de la bolsa. 5, 10, 25 o 50");
            tamanioBolsa = new Scanner(System.in).nextInt();
            if (tamanioBolsa != 5 && tamanioBolsa != 10 && tamanioBolsa != 25 && tamanioBolsa != 50) {
                System.out.println("El tamaño de la bolsa no existe, debe ser de 5, 10, 25 o 50. Ingrese nuevamente la capacidad de la bolsa.");
            } else {
                break;
            }
        }
        return tamanioBolsa;
    }

    private static double getMontoXTamanioBolsa(int tamanioBolsa) {
        double monto = 0;
        if (tamanioBolsa == 5) {
            monto = 5;
        } else if (tamanioBolsa == 10) {
            monto = 8;
        } else if (tamanioBolsa == 25) {
            monto = 20;
        } else if (tamanioBolsa == 50) {
            monto = 36;
        }
        return monto;
    }

    private static String[] buscarFertilizante() {
        String[] fertilizante = new String[3];
        while (true) {
            System.out.println("Ingrese el codigo del fertilizante a ingresar");
            String codigo = leerCadena();

            boolean encontrado = false;
            for (int i = 0; i < fertilizantesPermitidos.length; i++) {
                if (fertilizantesPermitidos[i][0].equals(codigo)) {
                    fertilizante[0] = fertilizantesPermitidos[i][0];
                    fertilizante[1] = fertilizantesPermitidos[i][1];
                    fertilizante[2] = fertilizantesPermitidos[i][2];
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El codigo " + codigo + " del fertilizante ingresado no  existe, intente nuevamente.");
            } else {
                break;
            }
        }

        return fertilizante;
    }

    private static int leerAnio() {
        int anio;
        while (true) {
            anio = new Scanner(System.in).nextInt();
            if (anio > (new Date().getYear() + 1900)) {
                System.out.println("El año no puede superar el actual. Ingrese nuevamente el año.");
            } else {
                break;
            }
        }
        return anio;
    }

    private static int leerMes(int anio) {
        int mes;
        while (true) {
            mes = new Scanner(System.in).nextInt();
            if ((anio == (new Date().getYear() + 1900)) && (mes > (new Date().getMonth() + 1))) {
                System.out.println("El mes no puede superar el actual. Ingrese nuevamente el mes.");
            } else {
                break;
            }
        }
        return mes;
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

    private static long leerNumeroEntero() {
        long numero = 0;
        while (true) {
            numero = new Scanner(System.in).nextLong();
            if (numero <= 0) {
                System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            } else {
                break;
            }
        }
        return numero;
    }

    private static double leerNumeroDecimal() {
        double numero = 0;
        while (true) {
            numero = new Scanner(System.in).nextDouble();
            if (numero <= 0) {
                System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            } else {
                break;
            }
        }
        return numero;
    }

    private static String leerCadena() {
        String cadena = "";
        while (true) {
            cadena = new Scanner(System.in).nextLine();
            if (cadena.isEmpty()) {
                System.out.println("El valor ingresado no puede ser vacio. Ingrese nuevamente la cadena.");
            } else {
                break;
            }
        }
        return cadena;
    }

    private static String completarConEspacios(String cadena) {
        int cantidadEspacios = 20 - cadena.length();
        for (int i = 0; i < cantidadEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }

    private static void imprimirDDJJ(DDJJIngresoFertilizante ddjj) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Empresa: " + ddjj.getEmpresa());
        System.out.println("CUIT: " + ddjj.getCuitEmpresa());
        System.out.println("Mes: " + ddjj.getMesDeclaracion());
        System.out.println("Año: " + ddjj.getAnioDeclaracion());
        System.out.println(completarConEspacios("Código Fertilizante") + "\t" + completarConEspacios("Nombre Fertilizante") + "\t" + completarConEspacios("Tipo Envase") + "\t" + completarConEspacios("Capacidad Envase") + "\t" + completarConEspacios("Cantidad Envase") + "\t" + completarConEspacios("Subtotal") + "");
        for (int i = 0; i < ddjj.getDetallesFertilizantes().length; i++) {
            System.out.println(completarConEspacios(ddjj.getDetallesFertilizantes()[i][0]) + "\t " + completarConEspacios(ddjj.getDetallesFertilizantes()[i][1]) + " \t "
                    + completarConEspacios(ddjj.getDetallesFertilizantes()[i][2]) + " \t " + completarConEspacios(ddjj.getDetallesFertilizantes()[i][3]) + " \t "
                    + completarConEspacios(ddjj.getDetallesFertilizantes()[i][4]) + " \t " + completarConEspacios(ddjj.getDetallesFertilizantes()[i][5]) + "");
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("El monto total a abonar por el ingreso es: " + ddjj.getMontoXIngreso());
        System.out.println("--------------------------------------------------------");
    }

}
