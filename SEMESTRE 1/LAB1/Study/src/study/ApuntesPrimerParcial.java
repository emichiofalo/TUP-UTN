package study;

public class ApuntesPrimerParcial {

    public static void main(String[] args) {
        
    }
    
    /** 
     * CONVERSIÓN DE TIPOS - CASTING
     * 
     * Converisión explícita: se utiliza un operador uniario de conversión de tipo para crear una copia temporal de su operando (que aparece a la derecha del operador)
     * Ejemplo: 
     *          int total;
     *          promedio = (double) total / contadorCalif;
     * Basta con convertir en la expresión una sola variable int temporalmente para tener un resultado "double".
     * 
     * Conversión implícita: los valores son promovidos a valores superiores para utilizaros en una expresión. 
     * Promociones válidas de tipos
     * - double > float > long > int > char > short > byte
     * - short y byte no se pueden promocionar a char
     * - los valores boolean no se pueden promocionar ya que no se consideran números en Java
     * 
     * Integer.parseInt(String x) pasa de String a int
     * Integer.valueOf(x) pasa a Integer el valor de la variable x
     * String.valueOf(x) pasa a String el valor de la variable x
     * 
     * CONSTANTES
     * Contienen un valor que no cambia durante todo el programa. 
     * Se utiliza la palabra "final" al crearlas y por convención se nombran en mayusculas. 
     * Ejemplo: 
     *          private final static int TRES = 3;
     *          final double PI = Math.PI;
     *          final String PASSWORD = LAB1;
     * 
     * NÚMEROS ALEATORIOS
     * Entre 0 y 100: 
     *          int randomNum = new Double(Math.random() * 100).intValue();
     * 
     *          int min_val = 0;              
     *          int max_val = 100;
     *          int randomNum = (int) (Math.random()*(max_val - min_val));
     * 
     * VALORES FUERA DE RANGO
     * Se pueden usar las clases BigInteger y BigDecimal para realizar cálculos matemáticos que no pueden llevarse a cabo con los tipos primitivos.
     * 
     *          import java.math.BigInteger;
     *          BigInteger a = new BigInteger("23958719832475729346");
     * 
     * REDONDEO
     * A dos decimales:
     *          double x = 3.98235234;
     *          x = Math.round(x*100.0)/100.0;
     * 
     * LONGITUD
     * Para saber la cantidad de elementos en un array o de caractéres en una cadena usamos .length
     *          String phrase = "La lluvia en Mendoza es escasa";
     *          int numch = phrase.length();
     * 
     * MÉTODOS DE STRING - Consultar documento de cátedra. 
     * 
     * ASCII
     *          for (int i = 0; i < (numch-1); i++) {
     *              int ascii = (int) phrase.charAt(i);
     *              System.out.print(ascii+" ");
     *          }
     */ 
     /**
     * CLASES
     * - String     https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     * - Math       https://docs.oracle.com/javase/1.5.0/docs/api/java/lang/Math.html
     * - Date       https://docs.oracle.com/javase/8/docs/api/java/util/Date.html       TP2 - ej 17 y 18
     * - Calendar   https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
     * - Scanner    https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
     * 
     * GET/SET 
     * Get y set sirven para asignar valores a un objeto cuando no tenemos un constructor sobrecargado, 
     * o para cambiar los valores del objeto ya creado. 
     * Ejemplo: 
     *      Creo los métodos en mi clase:
     *          private double valor1;      atributos a los que les voy a aplicar el get/set
     *          private double valor2;
     * 
     *          public double getValor1() {
     *          return valor1;
     *          }
     *          public void setValor1(double valor1) {
     *              this.valor1 = valor1;
     *          }
     *          
     *          public double getValor2() {
     *              return valor2;
     *          }
     *          public void setValor2(double valor2) {
     *              this.valor2 = valor2;
     *          }
     * 
     *      En el main:
     *          OperacionMatematica operacion = new OperacionMatematica();      instanciación del objeto de la clase OperacionMatematica
     *                  
     *          operacion.setValor1(50.99);   o bien podría ingresar una variable en el parámetro en vez de los valores
     *          operacion.setValor2(78.67);
     * 
     * Atajo para insertar los get/set: 
     *          boton secundario - insert code - getter & setter
     * 
     * RECURSION
     *      TP2 - ej 21,22,23
     * 
     */
    
}
