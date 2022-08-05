package diagramaclases3;

/**
 *
 * @author Emi Chiófalo
 */
public class Diagrama3 {

    public static void main(String[] args) {
        
        Mafioso m1 = new Mafioso();
        m1.setNombre("Pepe");
        m1.setApellido("Grillo");
        m1.setFoto(new Foto());
        m1.getFoto().setPathtoFile("C://Imagenes/Mafiosos/PepeGrillo");
        m1.getFoto().setNombre("Pepe Grillo");
        m1.getFoto().setTamaño(587);
        m1.getComunicaciones().add(new MedioDeComunicacion());
        m1.getComunicaciones().get(0).setDescripcion("A decifrar");
        m1.getComunicaciones().get(0).setTipoMedio("Código");
        m1.agregarPerfil(new Perfil());                                         
        m1.getPerfiles().get(0).setDescripcion("Sospechoso");
        m1.getPerfiles().get(0).setTipoPerfil(1);
        m1.getLugaresFrecuentes().add(new Lugar());
        m1.getLugaresFrecuentes().get(0).setNombre("Escondite 1");
        m1.getLugaresFrecuentes().get(0).setDireccion("Calle Secreta 444");
        

        Detective d1 = new Detective();
        d1.setNombre("Sherlock");
        d1.setApellido("Moldes");
        d1.setFoto(new Foto());
        d1.getFoto().setPathtoFile("C://Imagenes/Detectives/SherlockMoldes");
        d1.getFoto().setNombre("Sherlock Moldes");
        d1.getFoto().setTamaño(345);
        d1.getComunicaciones().add(new MedioDeComunicacion());
        d1.getComunicaciones().get(0).setDescripcion("Inmediata");
        d1.getComunicaciones().get(0).setTipoMedio("Radio");
        d1.agregarPerfil(new Perfil());                                         
        d1.getPerfiles().get(0).setDescripcion("Oculto");
        d1.getPerfiles().get(0).setTipoPerfil(2);
        d1.setNumeroPlaca("5962");
        
        System.out.println("Mafioso:");
        System.out.println("Nombre y apellido: " + m1.getNombre() + " " + m1.getApellido() + 
                "\nPath to foto: " + m1.getFoto().getPathtoFile() + "  -  Tamaño: " + m1.getFoto().getTamaño() +
                "\nMedio de Comunicacion Tipo: " + m1.getComunicaciones().get(0).getTipoMedio() + "  -  Descripcion: " + 
                m1.getComunicaciones().get(0).getDescripcion() + "\nPerfil tipo: " + 
                m1.getPerfiles().get(0).getTipoPerfil() + "  -  Descripcion: " + m1.getPerfiles().get(0).getDescripcion() + 
                "\nLugares Frecuentes - Nombre: " + m1.getLugaresFrecuentes().get(0).getNombre() + 
                "  -  Direccion: " + m1.getLugaresFrecuentes().get(0).getDireccion());
        
        System.out.println("");
        System.out.println("Detective:");
        System.out.println("Nombre y apellido: " + d1.getNombre() + " " + d1.getApellido() + "\nNumero de placa: " + d1.getNumeroPlaca() +
                "\nPath to foto: " + d1.getFoto().getPathtoFile() + "  -  Tamaño: " + d1.getFoto().getTamaño() +
                "\nMedio de Comunicacion Tipo: " + d1.getComunicaciones().get(0).getTipoMedio() + "  -  Descripcion: " + 
                d1.getComunicaciones().get(0).getDescripcion() + "\nPerfil tipo: " + 
                d1.getPerfiles().get(0).getTipoPerfil() + "  -  Descripcion: " + d1.getPerfiles().get(0).getDescripcion()); 
        
        d1.InvestigarMafioso(m1);
        
        System.out.println("");        
        if (m1.investigar()) {
            System.out.println("El mafioso ha sido investigado");
        }
    }
    
}
