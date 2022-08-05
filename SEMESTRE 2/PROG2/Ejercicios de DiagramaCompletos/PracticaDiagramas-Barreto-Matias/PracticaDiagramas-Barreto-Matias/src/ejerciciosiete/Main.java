package ejerciciosiete;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 *
 */
public class Main {

    public static void main(String[] args) {

        Mafioso m = new Mafioso("Matias", "Barreto");
        m.setFoto(new Foto("C/Documents/HelloThere", "CCTA", 15));
        m.setPerfil(new Perfil(2, "Hace los UML bien?"));
        m.addComunicaciones(new MedioDeComunicacion("Aparato Electrico", "Video"));
        m.addLugaresFrecuentes(new Lugar("Mendoza", "Calle Falsa 123"));
        m.investigar();

        Detective d = new Detective("777", "Pepe", "Hongito");
        d.setFoto(new Foto("D/Images", "BravoSix", 7));
        d.setPerfil(new Perfil(0, "Desconocido"));
        d.addComunicaciones(new MedioDeComunicacion("Sonido", "Casette"));
        d.investigarMafioso(m);

        System.out.println("Mafioso");
        System.out.println("Nombre " + m.getNombre() + "\n"
                + "Apellido " + m.getApellido() + "\n"
                + "Foto \n"
                + "Nombre Foto " + m.getFoto().getNombre() + "\n"
                + "Ubicacion Foto " + m.getFoto().getPathToFile() + "\n"
                + "Tamaño Foto " + m.getFoto().getTamanio() + "\n"
                + "Perfil \n"
                + "Descripcion " + m.getPerfil().getDescripcion() + "\n"
                + "Tipo Perfil " + m.getPerfil().getTipoPerfil() + "\n"
                + "Comunicaciones \n"
                + "Descripcion " + m.getComunicaciones().get(0).getDescripcion() + "\n"
                + "Tipo " + m.getComunicaciones().get(0).getTipoMedio() + "\n"
                + "Lugares Frecuentes \n"
                + "Nombre " + m.getLugaresFrecuentes().get(0).getNombre() + "\n"
                + "Direccion " + m.getLugaresFrecuentes().get(0).getDireccion() + "\n");
        
        System.out.println("Detective");
                System.out.println("Nombre " + d.getNombre() + "\n"
                + "Apellido " + d.getApellido() + "\n"
                + "Foto \n"
                + "Nombre Foto " + d.getFoto().getNombre() + "\n"
                + "Ubicacion Foto " + d.getFoto().getPathToFile() + "\n"
                + "Tamaño Foto " + d.getFoto().getTamanio() + "\n"
                + "Perfil \n"
                + "Descripcion " + d.getPerfil().getDescripcion() + "\n"
                + "Tipo Perfil " + d.getPerfil().getTipoPerfil() + "\n"
                + "Comunicaciones \n"
                + "Descripcion " + d.getComunicaciones().get(0).getDescripcion() + "\n"
                + "Tipo " + d.getComunicaciones().get(0).getTipoMedio() + "\n");
    }
}
