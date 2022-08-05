package tp8;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {
        HashMap <String, Long> agenda = new HashMap <String, Long>();
        Menu(agenda);        
    }
    
    public static void Menu (HashMap <String,Long> agenda){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Cargar contactos | 2. Buscar contacto por nombre | 3. Listar agenda | 4. Salir");
        int option = sc.nextInt();
        switch (option){
            case 1: 
                CargarContacto(agenda);
                break;
            case 2: 
                BuscarContacto(agenda);
                break;
            case 3: 
                ListarAgenda(agenda);
                break;
            default:
                break;
        }
    }
    
    public static void CargarContacto(HashMap <String,Long> agenda){
        Scanner sc = new Scanner (System.in);
        boolean exit = true;
        String name;
        Long number;
        System.out.println("----------AGENDAR CONTACTO----------");
        System.out.println("Ingrese los datos de contacto que desea ingresar: ");
        while (exit){
            System.out.println("Nombre: | Número: ");
            name=sc.nextLine().toUpperCase();
            if (agenda.containsKey(name)) {
                System.out.println("El contacto ya existe.");
            }else{
                number=sc.nextLong();
                agenda.put(name, number);
            }
            System.out.println("Desea cargar mas contactos?");
            System.out.println("1. Si | 2. No");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    exit = true;
                    break;
                case 2: 
                    exit = false;
                    break;
            }
            sc.nextLine();
        }
        Menu(agenda);
    }
    
    public static void BuscarContacto(HashMap <String,Long> agenda){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("----------BUSQUEDA DE CONTACTO----------");
        System.out.println("Nombre: ");
        name = sc.next().toUpperCase();
        if (!agenda.containsKey(name)){
            System.out.println("La persona buscada no se encuentra en la agenda.");
        }else{
            System.out.println(agenda.get(name));
        }
        Menu(agenda);
    }
    
    public static void ListarAgenda(HashMap <String,Long> agenda){
        System.out.println("----------CONTACTOS----------");
        for (String contact : agenda.keySet()){
            System.out.println(contact + " - " + agenda.get(contact));
        }
        Menu(agenda);
    }
}
