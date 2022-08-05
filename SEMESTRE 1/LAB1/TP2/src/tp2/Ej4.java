package tp2;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ej4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero: ");
        double money = sc.nextDouble();
        
        int b200,b100,b50,b20,b10,b5,b2,b1,m50,m25,m10,m5; 
        
        b200 = (int) (money/200);
        money = money - (200*b200);
        b100 = (int) (money/100);
        money = money - (100*b100);
        b50 = (int) (money/50);
        money = money - (50*b50);
        b20 = (int) (money/20);
        money = money - (20*b20);
        b10 = (int) (money/10);
        money = money - (10*b10);
        b5 = (int) (money/5);
        money = money - (5*b5);
        b2 = (int) (money/2);
        money = money - (2*b2);
        b1 = (int) (money/1);
        money = money - (1*b1);
        
        BigDecimal bd = new BigDecimal(money).setScale(2, RoundingMode.HALF_UP);
        money = bd.doubleValue();
        money = money*100;
        m50 = (int) (money/50);
        money = money - (50*m50);
        m25 = (int) (money/25);
        money = money - (25*m25);
        m10 = (int) (money/10);
        money = money - (10*m10);
        m5 = (int) (money/5);
        money = money - (5*m5);
        
        System.out.println("Se necesitan: ");
        if (b200>0)
            System.out.println(b200+" billete/s de $200");
        if (b100>0)
            System.out.println(b100+" billete/s de $100");
        if (b50>0)
            System.out.println(b50+" billete/s de $50");
        if (b20>0)
            System.out.println(b20+" billete/s de $20");
        if (b10>0)
            System.out.println(b10+" billete/s de $10");
        if (b5>0)
            System.out.println(b5+" billete/s de $5");
        if (b2>0)
            System.out.println(b2+" billete/s de $2");
        if (b1>0)
            System.out.println(b1+" billete/s de $1");
        
        if (m50>0)
            System.out.println(m50+" moneda/s de $0,50");
        if (m25>0)
            System.out.println(m25+" moneda/s de $0,25");
        if (m10>0)
            System.out.println(m10+" moneda/s de $0,10");
        if (m5>0)
            System.out.println(m5+" moneda/s de $0,05");
                
        
    }
    
}
