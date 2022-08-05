/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

import java.util.ArrayList;
import static utilidades.Utilidades.*;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Contacto extends Persona {
    private static int nextID = 1;
    //Atributos:
    private int idContacto;
    private ContactoTipo tipo;
    private ArrayList<ContactoDomicilio> domicilios = new ArrayList<ContactoDomicilio>();
    private ArrayList<ContactoTelefono> telefonos = new ArrayList<ContactoTelefono>();

    public Contacto(int idPersona, String nombre, String apellido, int idContacto, ContactoTipo tipo) {
        super(idPersona, nombre, apellido);
        this.idContacto = idContacto;
        this.tipo = tipo;
        nextID++;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public ContactoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ContactoTipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<ContactoDomicilio> getDomicilios() {
        return domicilios;
    }

    public void addDomicilios(ContactoDomicilio domicilio) {
        this.domicilios.add(domicilio);
    }

    public ArrayList<ContactoTelefono> getTelefonos() {
        return telefonos;
    }

    public void addTelefonos(ContactoTelefono telefono) {
        this.telefonos.add(telefono);
    }

    //Metodos agregados
    public void verInfoDomicilios(){
        if (!this.getDomicilios().isEmpty()) {
            println("+\tDomicilios:");
            for (ContactoDomicilio domicilio : this.getDomicilios()) {
                println("\t-\t" + domicilio.getDescripcion() + " #" + domicilio.getIdContactoDomicilio());
            }
        } else {
            println("No hay domicilios para este contacto.");
        }//if-else
        
    }//verInfoDomicilios()
    public void verInfoTelefonos(){
        if (!this.getTelefonos().isEmpty()) {
            println("+\tTeléfonos:");
            for (ContactoTelefono telefono : this.getTelefonos()) {
                println("\t-\t" + telefono.getNumeroCompleto() + " #" + telefono.getIdContactoTelefono());
            }
        } else {
            println("No hay telefonos para este contacto.");
        }//if-else
    }//verInfoDomicilios()
    public void verInfo() {
        println(this.getNombreApellido());
        println("Tipo: " + this.getTipo().getDescripcion() + " #" + this.getTipo().getIdCotactoTipo());
        this.verInfoDomicilios();
        this.verInfoTelefonos();
        
    }//verInfo()
    
    @Override
    public void editarDatosPersonales(){
        super.editarDatosPersonales();
//        println("Editar Tipo (Actual: " + this.tipo.getDescripcion() + ", vacio para no modificar): ");
//        this.setApellido(leerCadena("Nuevo Tipo: "));
    }
    
    public void editarDomicilio(){
        int aEditar;
        println("Domicilios:");
        this.verInfoDomicilios();
        aEditar = leerEntero("Ingrese el #id del domicilio a editar: ");
        for(ContactoDomicilio domicilio : this.domicilios){
            if(domicilio.getIdContactoDomicilio() == aEditar){
                domicilio.editarInfo();
            }//if
        }//for
    }//editarDomicilio()
    public void editarTelefono(){
        int aEditar;
        println("Telefonos:");
        this.verInfoTelefonos();
        aEditar = leerEntero("Ingrese el #id del teléfono a editar: ");
        for(ContactoTelefono telefono : this.telefonos){
            if(telefono.getIdContactoTelefono()== aEditar){
                telefono.editarInfo();
            }//if
        }//for
    }//editarTelefono()
    
    public void eliminarDomicilio(){
        int aEliminar;
        println("Domicilios:");
        this.verInfoDomicilios();
        aEliminar = leerEntero("Ingrese el #id del domicilio a eliminar: ");
        for(ContactoDomicilio domicilio : this.domicilios){
            if(domicilio.getIdContactoDomicilio() == aEliminar){
                try {
                    this.domicilios.remove(domicilio);
                    println("Domicilio eliminado.");
                } catch(Exception e) {
                    println("Ocurrió un error y no se pudo eliminar");
                }
            }//if
        }//for
    }//eliminarDomicilio()
    
    public void eliminarTelefono(){
        int aEliminar;
        println("Telefonos:");
        this.verInfoTelefonos();
        aEliminar = leerEntero("Ingrese el #id del teléfono a eliminar : ");
        for(ContactoTelefono telefono : this.telefonos){
            if(telefono.getIdContactoTelefono()== aEliminar){
                try {
                    this.telefonos.remove(telefono);
                    println("Teléfono eliminado.");
                } catch(Exception e) {
                    println("Ocurrió un error y no se pudo eliminar");
                }
            }//if
        }//for
    }//eliminarTelefono()
    public void agregarDomicilio(){
        String domicilio = leerCadena("Ingrese el domicilio: ");
        this.addDomicilios(new ContactoDomicilio(ContactoDomicilio.getNextID(), domicilio));
    }//agregarDomicilio()
    
    public void agregarTelefono(){
        String codigo = leerCadena("Ingrese el código: ");
        String numero = leerCadena("Ingrese el número: ");
        this.addTelefonos(new ContactoTelefono(ContactoTelefono.getNextID(), codigo, numero));
    }//agregarTelefono()

    //Métodos estáticos
    public static int getNextID() {
        return nextID;
    }
}
