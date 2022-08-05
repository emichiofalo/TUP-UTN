package tp2;

import java.util.Date;

public class Ej17 {

    public static void main(String[] args) {
        
        Date fecha = new Date();
        String fechaSt = FuncionesPrograma.getFechaString(fecha);
        System.out.println(fechaSt);        
    }
    
    public static class FuncionesPrograma {
        public static String getFechaString(Date fecha){
            String fechaSt = fecha.toString();
            return fechaSt;
        }
                
    }
}
