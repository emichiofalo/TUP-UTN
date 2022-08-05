package tp3;

public class Ej5 {

    public static void main(String[] args) {
        int array[] = new int[20];
        array=RandomPares();
        int promedio=Promedio(array);
        System.out.println("El promedio de los numeros es : "+promedio);
        System.out.println("Hay "+NumsIgualesAlPromedio(array,promedio)+" numeros iguales al promedio.");
        System.out.println("Hay "+NumsMayoresAlPromedio(array,promedio)+" numeros mayores al promedio.");
        System.out.println("Hay "+NumsMenoresAlPromedio(array,promedio)+" numeros menores al promedio.");
    }
    
    private static int[] RandomPares() {
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            int num = new Double((Math.random() * 100)+1).intValue();
            if (num%2==0) {
                array[i] = num;
            }else{
                i--;
            }
        }
        return array;
    }
    
    private static int Promedio(int array[]){
        int suma=0;
        for (int i = 0; i < 20; i++) {
            suma=array[i]+suma;
        }
        return suma/20;
    }
    
    private static int NumsIgualesAlPromedio(int array[], int promedio){
        int cantNums = 0;
        for (int i = 0; i < 20; i++) {
            if (array[i]==promedio) {
                cantNums++;
            }
        }
        return cantNums;
    }
    
    private static int NumsMayoresAlPromedio(int array[], int promedio){
        int cantNums = 0;
        for (int i = 0; i < 20; i++) {
            if (array[i]>promedio) {
                cantNums++;
            }
        }
        return cantNums;
    }
    
    private static int NumsMenoresAlPromedio(int array[], int promedio){
        int cantNums = 0;
        for (int i = 0; i < 20; i++) {
            if (array[i]<promedio) {
                cantNums++;
            }
        }
        return cantNums;
    }
    
}
