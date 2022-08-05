package parcial_2;

import java.util.Scanner;

public class AltaInmueble {

    public static void main(String[] args) {
        
        Edificio edificio = new Edificio();
        
        System.out.println("Ingrese los datos del edificio:");
        System.out.println("Nombre:");
        edificio.setNombre(leerString());
        System.out.println("Domicilio:");
        edificio.setDomicilio(leerString());
        
        System.out.println("Ingrese los departamentos que componen el edificio:");
        
        do {
            Departamento dpto = new Departamento();
                        
            do {
                System.out.println("Piso:");
                int piso = leerInt();
                System.out.println("Letra:");
                String letra = leerString();
                if (validarDpto(piso, letra, edificio)) {
                    System.out.println("El departamento piso " + piso + " y letra " + letra + " ya fue ingresado.");
                } else {
                    dpto.setPiso(piso);
                    dpto.setLetra(letra.toUpperCase());
                    break;
                }
            } while (true);
                        
            System.out.println("Ingrese los ambientes del departamento:");
            do {
                Ambiente ambiente = new Ambiente();
                ambiente.setTipo(tipoAmbiente());
                System.out.println("Indique los metros cuadrados del ambiente:");
                ambiente.setMetrosCuadrados(leerDouble());
                
                dpto.addtoArrayList(ambiente);
                
                System.out.println("Desea cargar otro ambiente?");
                System.out.println("S (SI) N (NO)");
                String salir = leerString();
                if (salir.equalsIgnoreCase("n"))
                    break;
            } while (true);
            
            edificio.addtoArrayList(dpto);
            
            System.out.println("Desea cargar otro departamento?");
            System.out.println("S (SI) N (NO)");
            String salir = leerString();
            if (salir.equalsIgnoreCase("n"))
                break;
            
        } while (true);
        
        imprimir(edificio);
        
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
    
    private static int leerInt(){
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
    
    private static boolean validarDpto(int piso, String letra, Edificio edificio){
        if (edificio.getDepartamentos() != null) {
            for (Departamento depto : edificio.getDepartamentos()){
                if (depto.getPiso() == piso && depto.getLetra().equalsIgnoreCase(letra)) {
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
    
    private static String tipoAmbiente(){
        boolean exit = false;
        do {
            System.out.println("Elija el tipo de ambiente:");
            System.out.println("C. Cocina | CC. Cocina Comedor | "
                    + "B. Baño | BS. Baño en Suite | E. Escritorio | "
                    + "H. Habitacion.");
            String ambiente = new Scanner(System.in).nextLine();
            switch (ambiente.toUpperCase()){
                case "C":
                    return ambiente = "Cocina";
                case "CC":
                    return ambiente = "Cocina Comedor";
                case "B":
                    return ambiente = "Baño";
                case "BS":
                    return ambiente = "Baño en Suite";
                case "E":
                    return ambiente = "Escritorio";
                case "H":
                    return ambiente = "Habitacion";
                default:
                    System.out.println("Elija una opcion valida.");
                    exit = true;
                    break;
            }
        } while (exit);
       
        return "";
    }
    
    private static void imprimir(Edificio edificio){
        System.out.println("--------------------------EDIFICIO--------------------------");
        System.out.println("Edificio: " + edificio.getNombre());
        System.out.println("Domicilio: " + edificio.getDomicilio());
        for (Departamento dpto : edificio.getDepartamentos()){
            System.out.println("--------------------------DEPARTAMENTO--------------------------");
            System.out.println("Piso: " + dpto.getPiso());
            System.out.println("Letra: " + dpto.getLetra());
            for (Ambiente ambiente : dpto.getHabitaciones()){
                System.out.println("-------------------AMBIENTE DEL DEPARTAMENTO-------------------");
                System.out.println("Tipo Ambiente: " + ambiente.getTipo());
                System.out.println("Metros Cuadrados: " + ambiente.getMetrosCuadrados());
            }
            System.out.println("-----------------------------------------------");
            System.out.println("Total Metros Cuadrados Departamento: " + dpto.totalMetrosCuadrarosDepartamento());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total Metros Cuadrados del Edificio: " + edificio.totalMetrosCuadrarosEdificio());
    }
    
}
