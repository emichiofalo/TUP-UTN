package claseenum2;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class NewMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Mes[] meses = Mes.values();                                             //la clase enumerada le retorna un arreglo con su contenido
        
        System.out.println("Escribe un numero de dias:");
        int dias = sc.nextInt();
        
        for(Mes mes : meses){
            if (mes.getNumDias()==dias) {
                System.out.println(mes.toString());
            }
        }
        
    }
    
}
