package parcial2;

import java.util.Date;
import java.util.Scanner;

public class Functions {
    
    /**
     * 
     * Conversion de tipos: 
     *      - a String: Integer.toString(int), Double.toString(double), Long.toString(long), etc.
     *                  String.valueOf(valor);
     *      - de String:Integer.parseInt(cadena), Float.parseFloat(cadena), Double.parseDouble(cadena), etc.
     *      - casting:  double numero1 = 5;
     *                  long numero2 = (long) numero1;
     *                  int numero3 = (int) numero1;
     *                  short numero5 = (short) numero1;
     *                  float numero5 = (float) numero1;
                     
    private static long leerLong(){
        long cuit;
        while(true){
            cuit = new Scanner(System.in).nextLong();
            if(cuit <= 0){
                System.out.println("El cuit debe poseer 11 digitos. Ingrese nuevamente el cuit.");
            }else if(Long.toString(cuit).length() != 11){
                System.out.println("El cuit debe poseer 11 digitos. Ingrese nuevamente el cuit.");
            }else{
                break;
            }
        }
        return cuit;
    }
    
    private static long leerInt(){
        int numero = 0;
        while(true){
            numero = new Scanner(System.in).nextInt();
            if(numero <= 0){
                System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            }else{
                break;
            }
        }
        return numero;
    }
    
    private static double leerDouble(){
        double numero = 0;
        while(true){
            numero = new Scanner(System.in).nextDouble();
            if(numero <= 0){
                System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            }else{
                break;
            }
        }
        return numero;
    }
    
    private static String leerString(){
        String cadena = "";
        while(true){
            cadena = new Scanner(System.in).nextLine();
            if(cadena.isEmpty()){
                System.out.println("No ha ingresado ningun dato. Intente nuevamente.");
            }else{
                break;
            }
        }
        return cadena;
    }
        
    variable = Math.round(variable);  //redondea al entero màs cercano                              //redondeo
    variable = Math.round((variable%1)*100);   //los dos decimales los pasa a entero
    variable = Math.round(variable * 100.0) / 100.0;  //redondea a dos decimales (si agregamos más ceros en el 100 redondea a más decimales
    
    private static double RoundDouble (double numero){
        BigDecimal b1 = new BigDecimal(numero);
        MathContext m = new MathContext(3); // 3 = cantidad de digitos que va a mostrar
        BigDecimal b2 = b1.round(m);
        double d = b2.doubleValue();
        return d;
    }
    
    private static int leerAnio(){                                                                  //fecha
        int anio;
        while(true){
            anio = new Scanner(System.in).nextInt();
            if(anio > (new Date().getYear() + 1900)){
                System.out.println("El año no puede superar el actual. Ingrese nuevamente el año.");
            }else{
                break;
            }
        }
        return anio;
    } 
    
    private static int leerMes(int anio){
        int mes;
        while(true){
            mes = new Scanner(System.in).nextInt();
            if((anio == (new Date().getYear() + 1900)) && (mes > (new Date().getMonth() + 1))){
                System.out.println("El mes no puede superar el actual. Ingrese nuevamente el mes.");
            }else{
                break;
            }
        }
        return mes;
    }
    
    private static String completarConEspacios(String cadena){                                      //completar espacios
        int cantidadEspacios = 20 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }
    
    private static void imprimir(tipo nombre){
        System.out.println("--------------------------------------------------------");
        System.out.println("Empresa: " + ddjj.getEmpresa());
        System.out.println("CUIT: " + ddjj.getCuitEmpresa());
        System.out.println("Mes: " + ddjj.getMesDeclaracion());
        System.out.println("Año: " + ddjj.getAnioDeclaracion());
        System.out.println(completarConEspacios("Código Fertilizante") + "\t"+completarConEspacios("Nombre Fertilizante")+"\t"+completarConEspacios("Tipo Envase")+"\t"+completarConEspacios("Capacidad Envase")+"\t"+completarConEspacios("Cantidad Envase")+"\t"+completarConEspacios("Subtotal")+"");
        for(int i=0; i < ddjj.getDetallesFertilizantes().length; i++){
            System.out.println(completarConEspacios(ddjj.getDetallesFertilizantes()[i][0]) + "\t " + completarConEspacios(ddjj.getDetallesFertilizantes()[i][1]) + " \t "
                    + completarConEspacios(ddjj.getDetallesFertilizantes()[i][2]) + " \t " + completarConEspacios(ddjj.getDetallesFertilizantes()[i][3]) + " \t "
                    + completarConEspacios(ddjj.getDetallesFertilizantes()[i][4]) + " \t " + completarConEspacios(ddjj.getDetallesFertilizantes()[i][5]) + "");
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("El monto total a abonar por el ingreso es: " + ddjj.getMontoXIngreso());
        System.out.println("--------------------------------------------------------");
    }
    
    */
    
}
