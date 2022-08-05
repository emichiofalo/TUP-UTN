import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int day;
        System.out.println("Elija una opcion: "
                + " 1.Lunes"
                + " 2.Martes"
                + " 3.Miercoles"
                + " 4.Jueves"
                + " 5.Viernes"
                + " 6.Sabado"
                + " 7.Domingo");
                     
        do {
            day=sc.nextInt();
            if (day<1||day>7)
                System.out.println("Ingrese una opcion valida.");
        }
        while (day<1||day>7);
                
        switch (day)
        {
        case 6: 
            System.out.println("Es un dia no laboral.");
            break;
        case 7: 
            System.out.println("Es un dia no laboral.");
            break;
        default:
            System.out.println("Es un dia laboral.");
            break;
        }
        
    }
  
}
