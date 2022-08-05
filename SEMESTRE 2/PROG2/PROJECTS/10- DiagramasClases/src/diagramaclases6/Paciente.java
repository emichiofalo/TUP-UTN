package diagramaclases6;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class Paciente {

    private String NSIP; 
    private String nombreApellidos; 
    private char sexo;
    private Fecha fechaNacimiento = new Fecha();
    private ArrayList<Diagnostico> diagnosticos = new ArrayList();

    public Paciente() {
    }

    public Paciente(String NSIP, String nombreApellidos, char sexo, Fecha fechaNacimiento) {
        this.NSIP = NSIP;
        this.nombreApellidos = nombreApellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNSIP() {
        return NSIP;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        Date dt = new Date();
        int edad = ((dt.getYear()+1900)-this.fechaNacimiento.getAnyo());
        return edad;
    }
    
    public Diagnostico getUltimoDiagnostico(){
        if (!diagnosticos.isEmpty()) {
            return diagnosticos.get(diagnosticos.size()-1);
        }else{
            System.out.println("No hay diagnosticos");
            return null; 
        }
    }
    
    public void diagnosticar (Diagnostico diagnostico){
        diagnosticos.add(diagnostico);
    }    
    
    public boolean estaCurado(){
        System.out.println("El paciente esta curado? S/N");
        String alta = new Scanner(System.in).nextLine();
        if (alta.equalsIgnoreCase("S")) {
            return true;
        }else{
            return false; 
        }
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }
    
}
