package parcial1_laboratorio1_chiofalo;

//Las columnas del array fertilizantesPermitidos deben coincidir con las columnas del array de la otra clase
//{"Código Fertilizante", "Nombre Fertilizante", "Tipo Envase", "Capacidad Envase", "Cantidad Envase", "Subtotal"}

import java.util.Scanner;
import java.util.Date;

public class CargaDDJJIngresoFerilizante {

    public static String[][] fertilizantesPermitidos = {{"101","UREA","BS"},{"102","SULFATO AMONICO","BS"},{"103","NITRATO AMONICO","BS"},{"104","NITRATO DE CALCIO","BS"},{"105","SUPERFOSFATO SIMPLE","BD"},{"106","SUPERFOSFATO TRIPLE","BD"},{"107","NITRATO AMONICO","BS"},{"108","CLORURO DE POTASIO","BD"},{"109","SULFATO DE POTASIO","BS"},{"110","NITROGENO LIQUIDO","BD"}};
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DDJJIngresoFertilizante ingresoFertilizante = new DDJJIngresoFertilizante();
        
        //ingreso de datos
        String empresaNombre=NombreEmpresa();
        ingresoFertilizante.setEmpresa(empresaNombre);
        
        long empresaCuit=CuitEmpresa();
        ingresoFertilizante.setCuitEmpresa(empresaCuit);
        
        int anioDeclaracion=DeclaracionAnio();
        ingresoFertilizante.setAnioDeclaracion(anioDeclaracion);
        
        int mesDeclaracion=DeclaracionMes();
        ingresoFertilizante.setMesDeclaracion(mesDeclaracion);
        
        //ingreso de fertilizantes
        String [][] arrayaux = new String[IngresoFertilizantes()][6];
        ingresoFertilizante.setDetallesFertilizantes(arrayaux);
        
        //carga de array Fertilizantes
        boolean encontrado;
        System.out.println("Ingrese el código del fertilizante a informar:");
        do {
            int codigo = sc.nextInt();
            encontrado = BusquedaFertilizante(fertilizantesPermitidos, codigo);
        } while (!encontrado);
        
       /** System.out.println("Ingrese el tamaño de la Bolsa: 5, 10, 25 o 50.");
        int tambolsa = sc.nextInt();
        if (tambolsa == 5 ||tambolsa == 10||tambolsa == 25||tambolsa == 50) {
            ingresoFertilizante.getDetallesFertilizantes
        }
        */
    }
    
    public static String NombreEmpresa(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre de la empresa: ");
        nombre=sc.nextLine();
        while (nombre.length()==0){
            System.out.println("Ingrese el nombre de la empresa correctamente.");
            nombre=sc.nextLine();
        }
        return nombre;
    }
    
    public static long CuitEmpresa(){
        Scanner sc = new Scanner(System.in);
        long cuit;
        System.out.println("Ingrese el CUIT de la empresa: ");
        cuit=sc.nextLong();
        while (String.valueOf(cuit).length()<11||String.valueOf(cuit).length()>11){
            System.out.println("Ingrese el numero de CUIT correctamente.");
            cuit=sc.nextLong();
        }
        return cuit;
    }
   
    public static int DeclaracionAnio(){
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        date.getTime();
        boolean next;
        int anio;
        System.out.println("Ingrese el anio: ");
        anio=sc.nextInt();
        while (anio>(date.getYear()+1900)){
            System.out.println("Ingrese el año correctamente.");
            anio=sc.nextInt();
        }
        return anio;
    }
    
    public static int DeclaracionMes(){
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        date.getTime();
        boolean next;
        int mes;
        System.out.println("Ingrese el mes: ");
        mes=sc.nextInt();
        while (mes<=0 || mes>(date.getMonth()+1)){
            System.out.println("Ingrese un mes valido.");
            mes=sc.nextInt();
        }
        return mes;
    }
    
    public static int IngresoFertilizantes(){
        Scanner sc = new Scanner(System.in);
        int bolsas, bidones, suma;
        
        do {
            System.out.println("Ingrese la cantidad de bolsas de fertilizante que desea ingresar:" );
            bolsas=sc.nextInt();
            System.out.println("Ingrese la cantidad de bidones de fertilizante que desea ingresar:" );
            bidones=sc.nextInt();
        } while (bolsas+bidones<=0);
        
        return suma=bolsas+bidones;         
    }
    
    public static boolean BusquedaFertilizante(String[][] array,int codigo){    //no funciona correctamente
        boolean found = true; 
        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(String.valueOf(codigo))) {
                found = true;
                //CargaDetalleFertilizante();
            }else{
                found = false;
            }
        }
        if (!found) {
            System.out.println("El codigo del fertilizante ingresado no existe, intente nuevamente.");
        }
        return found;
    }
    
    //public static int TamañoBolsa(){
        

}
    

