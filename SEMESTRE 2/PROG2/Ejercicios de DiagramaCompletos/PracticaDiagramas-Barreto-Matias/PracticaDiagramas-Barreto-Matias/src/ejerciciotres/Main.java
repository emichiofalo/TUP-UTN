package ejerciciotres;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 *
 */
public class Main {

    public static void main(String[] args) {

        Clinica c1 = new Clinica();

        c1.setEspecialidades(new Especialidad("Traumatologia"));
        c1.getEspecialidades().get(0).setHabitaciones(new Habitacion(5));
        c1.getEspecialidades().get(0).setMedicos(new Medico("Pepe"));
        c1.getEspecialidades().get(0).getHabitaciones().get(0).setCamas(new Cama(new Paciente("AAA", "FEDE", 'M', new Fecha(9, 05, 2022))));
        c1.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).getPaciente().setDiagnostico(new Diagnostico("Quebradura", TipoDiagnostico.tdMuyGrave));
        c1.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).getPaciente().getDiagnostico().setTratamiento(new Tratamiento("Enyesar y reposo"));
        c1.getEspecialidades().get(0).getMedicos().get(0).setPaciente(c1.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).getPaciente());

        System.out.println(c1.toString());

        Clinica c2 = new Clinica();

        c2.setEspecialidades(new Especialidad("Radiologia"));
        c2.getEspecialidades().get(0).setHabitaciones(new Habitacion(5));
        c2.getEspecialidades().get(0).setMedicos(new Medico("Mario"));
        c2.getEspecialidades().get(0).getHabitaciones().get(0).setCamas(new Cama(new Paciente("BBB", "Maty", 'M', new Fecha(19, 06, 2023))));
        c2.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).getPaciente().setDiagnostico(new Diagnostico("Quemadura", TipoDiagnostico.tdLeve));
        c2.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).getPaciente().getDiagnostico().setTratamiento(new Tratamiento("Agua fria"));
        c2.getEspecialidades().get(0).getMedicos().get(0).setPaciente(c1.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).getPaciente());

        System.out.println(c2.toString());
        
        Clinica c3 = new Clinica();

        c3.setEspecialidades(new Especialidad("Odontologia"));
        c3.getEspecialidades().get(0).setHabitaciones(new Habitacion(5));
        c3.getEspecialidades().get(0).setMedicos(new Medico("Lala"));
        c3.getEspecialidades().get(0).getHabitaciones().get(0).setCamas(new Cama(new Paciente("BBB", "Gonza", 'M', new Fecha(7, 9, 2020))));
        c3.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).getPaciente().setDiagnostico(new Diagnostico("Carie", TipoDiagnostico.tdGrave));
        c3.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).getPaciente().getDiagnostico().setTratamiento(new Tratamiento("Sacar Muela"));
        c3.getEspecialidades().get(0).getMedicos().get(0).setPaciente(c1.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).getPaciente());

        System.out.println(c3.toString());

    }
}
