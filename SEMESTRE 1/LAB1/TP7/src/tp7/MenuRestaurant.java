package tp7;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {

    public static void main(String[] args) {
        
        ArrayList <Plato> menu = new ArrayList <Plato>();
        Scanner sc = new Scanner(System.in);
        
        do {
            Plato plato = new Plato();
            System.out.println("Cargar nuevo plato o bebida?");
            System.out.println("1. Plato | 2. Bebida ");
            switch (leerOpcion()){
                case 1:
                    menu.add(nuevoPlato(plato));
                    break;
                case 2:
                    menu.add(nuevaBebida(plato));
                    break;
            }
            System.out.println("Desea cargar otro plato?");
            System.out.println("S (SI) N (NO)");
            String salir = leerCadena();
            if (salir.equalsIgnoreCase("n"))
                break;
        } while (true);
        
        imprimirMenu(menu);
    }
    
    private static String leerCadena(){
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
    
    private static int leerOpcion(){
        int numero = 0;
        while(true){
            numero = new Scanner(System.in).nextInt();
            if(numero != 1 && numero != 2){
                System.out.println("El numero elegido es incorrecto. Elija nuevamente.");
            }else{
                break;
            }
        }
        return numero;
    }
    
    private static Plato nuevoPlato(Plato plato){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Nuevo plato----------");
        System.out.println("Nombre: ");
        plato.setNombreCompleto(leerCadena());
        System.out.println("Precio: $");
        plato.setPrecio(sc.nextDouble());
        plato.setEsBebida(false);
        System.out.println("*Cargar al menos 1 ingrediente*");
        do {
            Ingrediente ingrediente = new Ingrediente();
            System.out.println("----------Ingredientes----------");
            System.out.println("Nombre: ");
            ingrediente.setNombre(leerCadena());
            System.out.println("Cantidad: ");
            ingrediente.setCantidad(sc.nextDouble());
            System.out.println("Unidad de medida: ");
            ingrediente.setUnidadMedida(leerCadena());
            plato.addIngredientes(ingrediente);
            System.out.println("Desea cargar otro ingrediente?");
            System.out.println("S (SI) N (NO)");
            String salir = leerCadena();
            if (salir.equalsIgnoreCase("n"))
                break;
        } while (true);
        return plato;
    }
    
    private static Plato nuevaBebida(Plato plato){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Nueva Bebida----------");
        System.out.println("Nombre: ");
        plato.setNombreCompleto(leerCadena());
        System.out.println("Precio: $");
        plato.setPrecio(sc.nextDouble());
        plato.setEsBebida(true);
        return plato;
    }
    
    private static String completarConEspacios(String cadena){
        int cantidadEspacios = 20 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }
    
    private static void imprimirMenu (ArrayList <Plato> menu){
        System.out.println("------------MENU------------");
        for (Plato plato : menu){
            System.out.println("------------------------------------");
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $" + plato.getPrecio());
            if (!plato.isEsBebida()) {
                System.out.println("------------Ingredientes------------");
                System.out.println(completarConEspacios("Nombre") + completarConEspacios("Cantidad") + "Unidad de medida");
                for (Ingrediente ingrediente : plato.getIngredientes()){
                    System.out.println(completarConEspacios(ingrediente.getNombre()) + completarConEspacios(Double.toString(ingrediente.getCantidad())) + ingrediente.getUnidadMedida());
                }
            }
        }
    }
}

