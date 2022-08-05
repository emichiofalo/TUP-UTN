package diagramaclases1;

/**
 *
 * @author Emi Chiófalo
 */
public class Diagrama1 {

    public static void main(String[] args) {
        
        ContactoTipo tipo1 = new ContactoTipo(1234, "familia");
        ContactoTipo tipo2 = new ContactoTipo(1234, "trabajo");
        
        Contacto cont1 = new Contacto(1234, tipo1, "Pedro", "Esteban", 2345);
        Contacto cont2 = new Contacto(3456, tipo2, "Milce", "Flores", 4567);
        cont1.addDomicilios(new ContactoDomicilio(334, "Las Tipas"));
        cont1.addTelefonos(new ContactoTelefono(6667, "tt", "4678556"));
        cont2.addDomicilios(new ContactoDomicilio(2431, "Las Moreras"));
        cont2.addTelefonos(new ContactoTelefono(5554, "ff", "43433566"));        
        
        Usuario u1 = new Usuario(5678, "pepebote", "pb5432", "Pepe", "Botella", 0000);
        u1.addContacto(cont1);
        u1.addContacto(cont2);
        
        System.out.println("Contacto 1:");
        System.out.println("Nombre: " + u1.getContactos().get(0).getNombre());
        System.out.println("Numero: " + u1.getContactos().get(0).getTelefonos().get(0).getNumero());
        System.out.println("Tipo contacto: " + u1.getContactos().get(0).getTipo().getDescripcion());
        System.out.println("");
        System.out.println("Contacto 2:");
        System.out.println("Nombre: " + u1.getContactos().get(1).getNombre());
        System.out.println("Direccion: " 
                + u1.getContactos().get(1).getDomicilios().get(0).getDescripcion()
                + " " + u1.getContactos().get(1).getDomicilios().get(0).getIdContactoDomicilio());
        System.out.println("Tipo contacto: " + u1.getContactos().get(1).getTipo().getDescripcion());
        
        System.out.println("");
        System.out.println("Modificación de contacto desde usuario: ");
        u1.getContactos().get(1).getDomicilios().get(0).setDescripcion("Patricias Mendocinas");
        u1.getContactos().get(1).getDomicilios().get(0).setIdContactoDomicilio(1580);
        System.out.println("Nombre: " + u1.getContactos().get(1).getNombre());
        System.out.println("Direccion: " 
                + u1.getContactos().get(1).getDomicilios().get(0).getDescripcion()
                + " " + u1.getContactos().get(1).getDomicilios().get(0).getIdContactoDomicilio());
        
    }
    
}
