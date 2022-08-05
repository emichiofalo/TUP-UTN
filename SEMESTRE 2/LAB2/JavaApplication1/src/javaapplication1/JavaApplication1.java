/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */

class C{
    String cadena = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    
    public C(){
        for (int i = 0; i < 2; i++) {
            cadena = cadena.concat(cadena);
        }
    }
}

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        C a;
        int cont = 0;
        while (true){
            //try{Thread.sleep(10);}catch(Exception e){}
            ar.add(new C());
            
//            if(cont++ == 300){
//                ar.clear();
//                cont = 0; 
//                System.gc();
//            }
        }
        
    }
    
}
