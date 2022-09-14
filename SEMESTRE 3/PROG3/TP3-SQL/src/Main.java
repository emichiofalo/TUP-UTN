
import modelo.*;
import Conexion.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Computadora pc = new Computadora();

            System.out.println("Codigo de la computadora:");
            String codigo = new Scanner(System.in).nextLine();
            pc.setCodigo(codigo);

            System.out.println("Marca de la computadora:");
            String marca = new Scanner(System.in).nextLine();
            pc.setMarca(marca);

            System.out.println("Modelo de la computadora:");
            String modelo = new Scanner(System.in).nextLine();
            pc.setModelo(modelo);

            pc.createComputadora(pc);
            
            pc.setId(pc.getIdCompu());

            System.out.println("- - - - - - - - - - - ");

            do {
                System.out.println("Componente: ");
                String nroSerie = cargaNroSerie();
                String nombre = cargaNombre();
                
                Componente comp = new Componente();
                comp.setNombre(nombre);
                comp.setNroSerie(nroSerie);
                comp.setComputadora(pc);
                
                comp.createComponente(comp);
                
                pc.addComponentes(comp);
                
                System.out.println("Desea cargar otro componente? S/N");
                String salir = new Scanner(System.in).nextLine();
                if (salir.equalsIgnoreCase("n")) {
                    break;
                }
            } while (true);
            
            Conexion.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static String cargaNroSerie() {
        String var = "";

        System.out.println("Numero de Serie: ");
        var = new Scanner(System.in).nextLine();

        return var;
    }

    public static String cargaNombre() {
        String var = "";

        System.out.println("Nombre: ");
        var = new Scanner(System.in).nextLine();

        return var;
    }
}
