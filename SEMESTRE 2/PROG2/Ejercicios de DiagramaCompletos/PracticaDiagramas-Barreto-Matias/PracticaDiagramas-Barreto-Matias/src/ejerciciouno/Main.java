package ejerciciouno;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        
        Usuario u = new Usuario(1, "Pip", "123456", "Pepe", "Hongito", 37); 
        u.agregarContacto(new Contacto("LA", "R", 12, 9, new ContactoTipo(5, "Telefono")));
        u.getContactos().get(0).agregarDomicilios(new ContactoDomicilio(99, "asdasd"));
        u.getContactos().get(0).agregarTelefonos(new ContactoTelefono(64, "asdasd", "564654"));
        
        System.out.println(u.toString());        
    }
}
