package tpexcepciones;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class TPExcepciones {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        
        Calendar birthday = IngresoBirthday();
        String username = IngresoUsername();
        int numPassWord = IngresoNumPassWord();
               
        RegistroRedSocial r1 = new RegistroRedSocial(birthday, username, numPassWord);           
    }
    
    public static Calendar IngresoBirthday(){
        Calendar birthday = Calendar.getInstance();
        
        System.out.println("Ingrese su fecha de cumpleaños: ");
        int dia, mes, anio;
        System.out.println("Dia: " ); dia = sc.nextInt();
        System.out.println("Mes: " ); mes = sc.nextInt();
        System.out.println("Anio: " ); anio = sc.nextInt();
        birthday.set(anio, mes, dia);
        
        return birthday;
    }
    
    public static String IngresoUsername() {
        Scanner sc = new Scanner(System.in);
        
        String username = "";

        while(true){
            System.out.println("Ingrese su nombre de usuario: ");
            username = sc.nextLine();
            if (username.isEmpty()) {
                System.out.println("Campo obligatorio.");
            }else{
                break;
            }
        }
        
        return username;
    }
    
    public static int IngresoNumPassWord() {
        int numPassWord = 0;

        while(true){
            System.out.println("Ingrese una contrasenia numerica de 8 digitos: ");
            numPassWord = sc.nextInt();
            if (Integer.toString(numPassWord).length() != 8) {
                System.out.println("La contrasenia debe tener 8 digitos.");
            }else if (Integer.toString(numPassWord).length() == 8){
                break;
            }
        }
         
        return numPassWord;
    }
    
}
