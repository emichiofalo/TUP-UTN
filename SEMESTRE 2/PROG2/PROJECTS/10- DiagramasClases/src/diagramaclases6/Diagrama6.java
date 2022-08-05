package diagramaclases6;

/**
 *
 * @author Emi Chiófalo
 */
public class Diagrama6 {

    public static void main(String[] args) {
        
        Tratamiento trat1 = new Tratamiento("Reposo");
        Tratamiento trat2 = new Tratamiento("Antibioticos");
        Tratamiento trat3 = new Tratamiento("Cirugía");
        
        Diagnostico diag1 = new Diagnostico("Tratamientos terminados", TipoDiagnostico.tdAlta);
        Diagnostico diag2 = new Diagnostico("Gripe Viral", TipoDiagnostico.tdLeve);
        Diagnostico diag3 = new Diagnostico("Infeccion", TipoDiagnostico.tdGrave);
        Diagnostico diag4 = new Diagnostico("Apendicitis", TipoDiagnostico.tdMuyGrave);
        
        diag2.addTratamiento(trat1);
        diag3.addTratamiento(trat2);
        diag4.addTratamiento(trat3);
        
        Paciente p1 = new Paciente("1234", "Paula Morales", 'f', new Fecha(23,5,1990));
        Paciente p2 = new Paciente("3456", "Jacinto Suarez", 'm', new Fecha(19,9,1968));
        Paciente p3 = new Paciente("5678", "Mariela Sevilla", 'f', new Fecha(5,12,2000));
        p1.diagnosticar(diag1);
        p2.diagnosticar(diag2);
        p3.diagnosticar(diag3);
        p3.diagnosticar(diag4);
        
        Medico m1 = new Medico("Guido Salguero");
        Medico m2 = new Medico("Marcela Niella");
        Medico m3 = new Medico("Carolina Colombi");
        
        Especialidad esp1 = new Especialidad("Cardiologia", m1);
        Especialidad esp2 = new Especialidad("Cirugia", m3);
        
        Clinica cl1 = new Clinica();
        
        cl1.addEspecialidad(esp1);
        cl1.addEspecialidad(esp2);
        esp1.addMedico(m1);
        esp2.addMedico(m2);
        esp2.addMedico(m3);
        m1.addPaciente(p1);
        m2.addPaciente(p2);
        m3.addPaciente(p3);
        
        Habitacion h1 = new Habitacion();
        Habitacion h2 = new Habitacion();
        h1.addCama(2);
        h2.addCama(3);
        esp1.addHabitacion(h1);
        esp2.addHabitacion(h2);
        esp2.ingresarPaciente(p2);
        esp2.ingresarPaciente(p3);
        
        System.out.println("Especialidad: " + cl1.obtenerEspecialidad("cirugia").getNombre());
        System.out.println("Medicos: \n" + cl1.obtenerEspecialidad("cirugia").getMedicos().get(0).getNombreApellidos() +
                "\n" + cl1.obtenerEspecialidad("cirugia").getMedicos().get(1).getNombreApellidos());
        System.out.println("Habitacion 1:" + "\nCantidad de camas:" + cl1.obtenerEspecialidad("cirugia").getHabitaciones().get(0).getCamas().size());
        System.out.println("Paciente: " + cl1.obtenerEspecialidad("cirugia").getHabitaciones().get(0).getCamas().get(0).getPaciente().getNombreApellidos());
        cl1.obtenerEspecialidad("cirugia").darAlta(p2);
        System.out.println("Ingresar nuevo paciente a la cama:");
        esp2.ingresarPaciente(p1);
        System.out.println("Paciente: " + cl1.obtenerEspecialidad("cirugia").getHabitaciones().get(0).getCamas().get(0).getPaciente().getNombreApellidos());
        
        System.out.println("");

        System.out.println("Paciente: " + esp2.getMedicos().get(0).getPacientes().get(0).getNombreApellidos() + 
                "\nNSIP: " + esp2.getMedicos().get(0).getPacientes().get(0).getNSIP() + 
                "\nSexo: " + esp2.getMedicos().get(0).getPacientes().get(0).getSexo() + 
                "\nEdad: " + esp2.getMedicos().get(0).getPacientes().get(0).getEdad() + 
                "\nMedico: " + esp2.getMedicos().get(0).getNombreApellidos() + " Especialidad: " + esp2.getNombre() + 
                "\nDiagnostico: " + esp2.getMedicos().get(0).getPacientes().get(0).getDiagnosticos().get(0).getTexto() + 
                " " + esp2.getMedicos().get(0).getPacientes().get(0).getDiagnosticos().get(0).getTipo() + 
                "\nTratamiento: " + esp2.getMedicos().get(0).getPacientes().get(0).getDiagnosticos().get(0).getTratamiento().getTexto());
        p2.getDiagnosticos().get(0).tratar(p2.getDiagnosticos().get(0).getTratamiento());
        //System.out.println(p2.getDiagnosticos().get(0).getTipo());
       
    }
    
}
