package tpexcepciones;

import java.util.Calendar;
import java.util.Scanner;
import static tpexcepciones.TPExcepciones.sc;

/**
 *
 * @author Emi Chiófalo
 */

public class RegistroRedSocial {

    Scanner sc = new Scanner(System.in);
    
    private String username; 
    private int numPassWord;
    private Calendar birthday;

    public RegistroRedSocial(Calendar birthday, String username, int numPassWord){
        this.birthday = validateBirthday(birthday);
        this.username = username;
        this.numPassWord = numPassWord;  
    }

    public String getUsername() {
        return username;
    }

    public int getNumPassWord() {
        return numPassWord;
    }

    public Calendar getBirthday(){
        return birthday;
    }

    public Calendar validateBirthday(Calendar birthday){
               
        try {
            int edad = DiferenciaEdad.diferenciaFecha(birthday);
            if (edad<13) {
                System.out.println("Edad: " + edad + " anios.");
                throw new ExcepcionEdadInsuficiente("No pueden registrarse menores de 13 anios en este sitio.");
            }
        }catch (ExcepcionEdadInsuficiente e){
            System.out.println(e.getMessage());
        }
        
        return birthday;
    }
   
}
