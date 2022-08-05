import java.util.Scanner; 

public class Ejercicio14 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
           
        int randomNum = new Double(Math.random() * 100).intValue();
        
        //int min_val = 1;              //esta fue la otra alternativa que busqué para generar el random porque pensé que al estar tachado el "Double" no iba a andar, pero sí anduvo
        //int max_val = 100;
        //int randomNum = (int) (Math.random()*(max_val - min_val));
        
        int trial = 0;
        
        System.out.println("Ingrese un numero entre 0 y 100: ");
        int num;
        
        do {
            num = sc.nextInt();
            if (num<randomNum)
                System.out.println("Numero muy bajo.");
            else if (num>randomNum)
                System.out.println("Numero muy alto.");
            trial++;
            if (num==randomNum)
                System.out.println("Correcto. Numero encontrado. Cantidad de intentos: "+trial);
        } while (num!=randomNum);
        
        
        
        
    }
    
}
