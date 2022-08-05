/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerarraylist220421;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Martin Vargas
 */
public class EjerArrayList220421 {

        private static Scanner s = new Scanner(System.in);

        public static void main(String[] args) {

            ArrayList<Integer> a = new ArrayList();
            int mayor = 0;
            int i=0;
            int posicion = 0;
            while(i<3){
                System.out.println("Ingrese el numero entero de ubicación "+ i + ": ");
                a.add(s.nextInt());
                i++;
            }
            
            for(int q = 0; q < a.size(); q++){
                    //System.out.println(" =>" + a.get(q)); 
                if (mayor < a.get(q).intValue()){
                    mayor = a.get(q).intValue();
                    posicion = q;
                }                         
            }
            
            posicion = 0;
            int mayorPosicion = 0;
            for (Integer w : a){
                //System.out.println(" =>" + w); 
                if (mayor < w.intValue()){
                    mayor = w.intValue();
                    mayorPosicion = posicion;
                    
                }
                posicion++;
            }
            
            Iterator e = a.iterator();
            
            while(e.hasNext()){
                int x = (int) e.next();
                if (mayor < x){
                    mayor = x;
                }                
            }
            
            System.out.println("El numero mas grande de los ingresdados es: "+ mayor);
        }
    

        
}
