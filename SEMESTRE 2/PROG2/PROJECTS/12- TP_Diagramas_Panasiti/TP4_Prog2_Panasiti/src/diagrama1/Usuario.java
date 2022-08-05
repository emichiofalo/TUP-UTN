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
public class Usuario extends Persona {

    private static int nextID = 1;

    private int idUsuario;
    private String usuario;
    private String password;
    private ArrayList<Contacto> contactos = new ArrayList<Contacto>();

    public Usuario(int idPersona, String nombre, String apellido, int idUsuario, String usuario, String password) {
        super(idPersona, nombre, apellido);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
        nextID++;
    }//Usuario()

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void addContactos(Contacto contacto) {
        this.contactos.add(contacto);
    }

    //Métodos agregados
    public void nuevoContacto() {
        String nombrePersona, apellidoPersona, descripcionTipo;
        while (true) {//Solicitar nombre
            nombrePersona = leerCadena("Ingrese el nombre: ");
            if (nombrePersona.length() >= 2) {
                break;
            } else {
                println("Nombre muy corto.");
            }
        }

        while (true) {//Solicitar apellido
            apellidoPersona = leerCadena("Ingrese el apellido: ");
            if (apellidoPersona.length() >= 2) {
                break;
            } else {
                println("Apellido muy corto.");
            }
        }//while()

        while (true) {//Solicitar apellido
            descripcionTipo = leerCadena("Ingrese el tipo de contacto: ");
            if (descripcionTipo.length() >= 2) {
                break;
            } else {
                println("Tipo muy corto.");
            }
        }//while()
        this.addContactos(new Contacto(Persona.getNextID(), nombrePersona, apellidoPersona, Contacto.getNextID(), ContactoTipo.getTipo(descripcionTipo)));
    }//nuevoContacto()

    public void listarContactos() {
        int cont = 1;
        if (!this.contactos.isEmpty()) {
            println("Contactos de " + this.usuario + ":");
            for (Contacto contacto : this.contactos) {
                println(cont + ". " + contacto.getApellidoNombre() + " #" + contacto.getIdContacto());
            }//for
        } else {
            println("No hay contactos para este usuario.");
        }//if
    }//listarContactos()

    public void verInfoContacto() {
        if (!this.contactos.isEmpty()) {
            int contactoID = leerEnteroEntre("Ingrese el id del contacto: ", 1, Contacto.getNextID() - 1);
            for (Contacto encontrado : this.contactos) {
                if (encontrado.getIdContacto() == contactoID) {
                    encontrado.verInfo();
                    return;
                }
            }//for
        } else {
            println("No hay contactos para este usuario.");
        }//if
    }//verInfoContacto()

    public void editarContacto() {
        if (!this.contactos.isEmpty()) {
            int contactoID = leerEnteroEntre("Ingrese el id del contacto: ", 1, Contacto.getNextID() - 1);
            for (Contacto contacto : this.contactos) {
                if (contacto.getIdContacto() == contactoID) {
                    int option;//
                    boolean exit = false;
                    Scanner key;
                    while (true) {
                        println("Seleccione una opción:");
                        println("1) Editar datos personales");
                        println("2) Agregar domicilio");
                        println("3) Agregar telefono");
                        println("4) Editar domicilio");
                        println("5) Editar telefono");
                        println("6) Eliminar domicilio");
                        println("7) Eliminar telefono");
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
                                contacto.editarDatosPersonales();
                                break;
                            case 2:
                                contacto.agregarDomicilio();
                                break;
                            case 3:
                                contacto.agregarTelefono();
                                break;
                            case 4:
                                contacto.editarDomicilio();
                                break;
                            case 5:
                                contacto.editarTelefono();
                                break;
                            case 6:
                                contacto.eliminarDomicilio();
                                break;
                            case 7:
                                contacto.eliminarTelefono();
                                break;
                            default:
                                println("Opción incorrecta, intente de nuevo.");
                                break;
                        } //Fin Switch
                        if (exit) {
                            break;
                        } // Fin If
                    } //Fin While
                    return;
                }//if
            }//for
        } else {
            println("No hay contactos para este usuario.");
        }//if
    }//editarContacto()

    public void eliminarContacto() {
        if (!this.contactos.isEmpty()) {
            int contactoID = leerEnteroEntre("Ingrese el id del contacto: ", 1, Contacto.getNextID() - 1);
            for (Contacto encontrado : this.contactos) {
                if (encontrado.getIdContacto() == contactoID) {
                    try {
                        this.contactos.remove(encontrado);
                        println("Contacto eliminado.");
                    } catch (Exception e) {
                        println("Ocurrió un error y no se pudo eliminar");
                    }
                    return;
                }//if
            }//for
        } else {
            println("No hay contactos para este usuario.");
        }//if
    }//editarContacto()

    public void mostrarDatos() {
        println("Datos Personales:");
        println("=================");
        println("\t- Nombre:" + this.getNombre());
        println("\t- Apellido:" + this.getApellido());
        println("\t- Usuario:" + this.getUsuario());
        println("");
        println("Contactos:");
        println("¯¯¯¯¯¯¯¯¯¯");
        if (!this.contactos.isEmpty()) {
            for (Contacto contacto : this.contactos) {
                contacto.verInfo();
            }//for
        } else {
            println("No hay contactos para este usuario.");
        }//if-else
    }//mostrarDatos()

    //Métodos estáticos
    public static int getNextID() {
        return nextID;
    }

}
