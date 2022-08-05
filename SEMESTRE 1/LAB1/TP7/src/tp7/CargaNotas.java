package tp7;

import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {

    public static void main(String[] args) {
        
        ArrayList <Alumno> alumnos = new ArrayList <Alumno>();
        Scanner sc = new Scanner(System.in);
        
        do {
            Alumno alumno = new Alumno();
            System.out.println("----------Datos del Alumno----------");
            System.out.println("Nombre completo: ");
            alumno.setNombreCompleto(leerCadena());
            System.out.println("Legajo: ");
            alumno.setLegajo(sc.nextLong());
            do {
                Nota nota = new Nota();
                System.out.println("----------Nueva Nota----------");
                System.out.println("Catedra: ");
                nota.setCatedra(leerCadena());
                System.out.println("Nota: ");
                nota.setNotaExamen(sc.nextDouble());
                alumno.addNotas(nota);
                System.out.println("Desea salir de la carga de notas?");
                System.out.println("S (SI) N (NO)");
                String salir = leerCadena();
                if (salir.equalsIgnoreCase("s"))
                    break;
            } while (true);
            alumnos.add(alumno);
            System.out.println("Desea salir de la carga de alumnos?");
            System.out.println("S (SI) N (NO)");
            String salir = leerCadena();
            if (salir.equalsIgnoreCase("s"))
                break;
        } while (true);
        
        mostrarNotas(alumnos);
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
    
    private static String completarConEspacios(String cadena){
        int cantidadEspacios = 20 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }
    
    private static void mostrarNotas(ArrayList <Alumno> alumnos){
        for (Alumno alumno : alumnos){
            System.out.println("------------------------------------");
            System.out.println("Alumno: " + alumno.getNombreCompleto());
            System.out.println("Legajo: " + alumno.getLegajo());
            System.out.println("Notas ------------------------------");
            for (Nota nota : alumno.getNotas()){
                System.out.println("Catedra: " + nota.getCatedra());
                System.out.println("Nota: " + nota.getNotaExamen());
            }
            System.out.println("------------------------------------");
            alumno.calcularPromedio();
            System.out.println("------------------------------------");
            System.out.println("");
        }
    }
}
