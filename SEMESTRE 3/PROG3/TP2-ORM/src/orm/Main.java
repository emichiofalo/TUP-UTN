package orm;

import java.util.Date;
import modelo.*;
import controlador.*;

public class Main {

    public static void main(String[] args) {
        try {
            
            GestorPaciente gestor = new GestorPaciente();
            Paciente p = new Paciente();
            p.setApellido("Perez");
            p.setNombre("Tomas");
            p.setNroSocio(123);
            p.setFechaAlta(new Date());
            p.setDni(1233313);
            
            if(p.getFechaAlta() == null)
                p.setFechaAlta(new Date());
            p.setFechaModificacion(new Date());
            
            gestor.guardar(p);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
