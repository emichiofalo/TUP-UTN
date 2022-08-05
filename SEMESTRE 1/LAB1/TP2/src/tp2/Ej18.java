package tp2;

import java.util.Date;
import java.util.Scanner;

public class Ej18 {

    public static void main(String[] args) {
        
        System.out.println(leerAnio());
    }
    
    public static class FuncionesPrograma {
        public static Date getFechaDate(int y,int m,int d){
            Date fechaD = new Date(y,m,d);
            return fechaD;
        }
    }
    private static int leerAnio(){
        int anio;
        while(true){
            anio = new Scanner(System.in).nextInt();
            System.out.println(new Date().getYear());
            if(anio > (new Date().getYear() + 1900)){
                System.out.println("El año no puede superar el actual. Ingrese nuevamente el año.");
            }else{
                break;
            }
        }
        return anio;
    }
    
}