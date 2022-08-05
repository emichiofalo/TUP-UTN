public class Ejercicio9 {

    public static void main(String[] args) {
        
        int num=1;
        while (num>0 && num<=100){
            if (num%2==0)
                System.out.println(num+" es divisible por 2.");
            else if (num%3==0)
                System.out.println(num+" es divisible por 3.");
                    else
                        System.out.println(num+" no es divisible por 2 ni 3.");
            num++;
        }
    }
    
}
