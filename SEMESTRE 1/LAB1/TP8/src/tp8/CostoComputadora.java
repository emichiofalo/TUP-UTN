package tp8;

import java.util.HashSet;
import java.util.Scanner;

public class CostoComputadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        do {
            Computadora computadora = new Computadora();
            System.out.println("----------COTIZACION COMPUTADORA----------");
            System.out.println("DATOS COMPUTADORA: ");
            System.out.println("Marca:");
            computadora.setMarca(leerCadena());
            System.out.println("Modelo:");
            computadora.setModelo(leerCadena());
            
            do {
                ComponenteCPU componente = new ComponenteCPU();
                System.out.println("----------CARGAR COMPONENTE----------");
                System.out.println("Componente:");
                componente.setComponente(leerCadena());
                System.out.println("Marca:");
                componente.setMarca(leerCadena());
                System.out.println("Cantidad:");
                componente.setCantidad(sc.nextInt());
                System.out.println("Precio unitario:");
                componente.setPrecio(sc.nextDouble());
                computadora.addComponentes(componente);
                
                System.out.println("Desea agregar otro componente?");
                System.out.println("SI (S) NO (N)");
                String salir = leerCadena();
                if (salir.equalsIgnoreCase("n")) 
                    break;
            } while (true);
            
            computadora.costoComputadora();
            mostrarComputadora(computadora);
            
            System.out.println("Desea cotizar otra computadora?");
            System.out.println("SI (S) NO (N)");
            String salir = leerCadena();
            if (salir.equalsIgnoreCase("n")) 
                break;
                        
        } while (true);
        
    }
    
    private static String leerCadena(){
        String cadena = "";
        while (true) {
            cadena = new Scanner(System.in).nextLine();
            if (cadena.isEmpty()) {
                System.out.println("No ha ingresado ningun dato. Intente nuevamente.");
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
    
    private static void mostrarComputadora(Computadora computadora){
        System.out.println("----------------COMPUTADORA----------------");
        System.out.println("Marca:   " + computadora.getMarca());
        System.out.println("Modelo:  " + computadora.getModelo());
        System.out.println("Componentes:");
        System.out.println(completarConEspacios("Componente") + "\t" + completarConEspacios("Marca") + "\t" + completarConEspacios("Cantidad") + "\t" + completarConEspacios("Precio unitario") + "\t" + completarConEspacios("Subtotal") + "");
        for (ComponenteCPU componente : computadora.getComponentes()) {
            System.out.println(completarConEspacios(componente.getComponente()) + "\t " + completarConEspacios(componente.getMarca()) + " \t "
                    + completarConEspacios(Integer.toString(componente.getCantidad())) + " \t " + completarConEspacios(Double.toString(componente.getPrecio())) + " \t "
                    + completarConEspacios(Double.toString(componente.getPrecio()*componente.getCantidad())) + "");

        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Costo total: $" + computadora.getCostoComputadora());
        System.out.println("--------------------------------------------------------");
        
        if (computadora.getCostoComputadora()<5000) {
            System.out.println("El precio sugerido de venta es " + computadora.getCostoComputadora()+ 
                " + " + computadora.getCostoComputadora()*0.4 + " = " + computadora.getCostoComputadora()*1.4);
        }else{
            System.out.println("El precio sugerido de venta es " + computadora.getCostoComputadora()+ 
                " + " + computadora.getCostoComputadora()*0.3 + " = " + computadora.getCostoComputadora()*1.3);
        }
        
    }
    
}
