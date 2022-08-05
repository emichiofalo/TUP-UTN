/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

import java.util.ArrayList;
import java.util.Scanner;
import static utilidades.Utilidades.*;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class DiagramaUno {

    private static ArrayList<Usuario> users = new ArrayList<Usuario>();
    private static Usuario currentUser;
    private static boolean sesionIniciada = false;

    public static void ejecutar() {
        int option;
        boolean exit = false;
        Scanner key;
        while (true) {
            if (sesionIniciada) {
                println("Sesión iniciada como " + currentUser.getUsuario() + ".");
            } else {
                println("No ha iniciado sesión todavía.");
            }
            println("Seleccione una opción:");
            println("1) Registrar usuario");
            println("2) Iniciar Sesión");
            println("3) Contactos");
            println("4) Mostrar datos del usuario");
            System.out.println("");
            println("0. Salir");
            System.out.print("$ ");

            key = new Scanner(System.in);
            if (key.hasNextInt()) {
                option = key.nextInt();
            } else {
                key.nextLine();
                option = 99; //No importa el valor, en el switch saldrá por default
            }
            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    users.add(registrarUsuario());//agregar nuevo usuario a users.
                    break;
                case 2:
                    iniciarSesion();//comprobar usuario y contraseña
                    break;
                case 3:
                    if (sesionIniciada) {
                        adminContactos();//agregar n contactos
                    } else {
                        println("Todavia no ha iniciado sesión.");
                    }
                    break;
                case 4:
                    if (sesionIniciada) {
                        currentUser.mostrarDatos();//Mostrar datos del usuario
                    } else {
                        println("Todavia no ha iniciado sesión.");
                    }
                    break;
                default:
                    println("Opción incorrecta, intente de nuevo.");
                    break;
            } //Fin Switch
            if (exit) {
                break;
            } // Fin If
        } //Fin While
    }

    public static Usuario registrarUsuario() {
        String nombrePersona, apellidoPersona, nombreUsuario, passUsuario;
        while (true) {//Solicitar nombre
            nombrePersona = leerCadena("Ingrese su nombre: ");
            if (nombrePersona.length() >= 2) {
                break;
            } else {
                println("Nombre muy corto.");
            }
        }

        while (true) {//Solicitar apellido
            apellidoPersona = leerCadena("Ingrese su Apellido: ");
            if (apellidoPersona.length() >= 2) {
                break;
            } else {
                println("Apellido muy corto.");
            }
        }//while()

        while (true) {//Solicitar nombre de usuario
            nombreUsuario = leerCadena("Ingrese un nombre de usuario: ");
            if (nombreUsuario.length() >= 5) {
                break;
            } else {
                println("Usuario muy corto.");
            }
        }//while()

        while (true) {//Solicitar contraseña de usuario
            passUsuario = leerCadena("Ingrese una contraseña de usuario: ");
            if (passUsuario.length() >= 5) {
                break;
            } else {
                println("Contraseña muy corta.");
            }
        }//while()
        return new Usuario(Persona.getNextID(), nombrePersona, apellidoPersona, Usuario.getNextID(), nombreUsuario, passUsuario);
    }//registrarUsuario()

    public static void iniciarSesion() {
        if(!users.isEmpty()){
            String nombreUsuario, passUsuario;
            nombreUsuario = leerCadena("Ingrese su nombre de usuario: ");
            passUsuario = leerCadena("Ingrese su contraseña: ");
            for (Usuario user : users) {
                if (nombreUsuario.equals(user.getUsuario()) && passUsuario.equals(user.getPassword())) {
                    sesionIniciada = true;
                    currentUser = user;
                    break;
                }
            }//for()
            if (sesionIniciada) {
                println("Bienvenido " + currentUser.getNombre() + "!!");
            } else {
                println("Nombre de usuario y/o contraseña incorrectos.");
            }
        } else {
            println("Todavia no hay usuarios registrados");
        }
    }//iniciarSesion()

    public static void adminContactos() {
        Contacto contacto;
        int option;
        boolean exit = false;
        Scanner key;
        while (true) {
            println("Seleccione una opción:");
            println("1) Agregar contacto");
            println("2) Listar contactos");
            println("3) Ver info de contacto");
            println("4) Editar contacto");
            println("5) Eliminar contacto");
            System.out.println("");
            println("0. Salir");
            System.out.print("$ ");

            key = new Scanner(System.in);
            if (key.hasNextInt()) {
                option = key.nextInt();
            } else {
                key.nextLine();
                option = 99; //No importa el valor, en el switch saldrá por default
            }
            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    currentUser.nuevoContacto();
                    break;
                case 2:
                    currentUser.listarContactos();
                    break;
                case 3:
                    currentUser.verInfoContacto();
                    break;
                case 4:
                    currentUser.editarContacto();
                    break;
                case 5:
                    currentUser.eliminarContacto();
                    break;
                default:
                    println("Opción incorrecta, intente de nuevo.");
                    break;
            } //switch
            if (exit) {
                break;
            } //if
        } //While
    }//agregarContactos()
}//DiagramaUno
