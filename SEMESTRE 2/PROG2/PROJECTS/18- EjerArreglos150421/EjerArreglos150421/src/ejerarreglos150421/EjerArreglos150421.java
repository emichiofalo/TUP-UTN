/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerarreglos150421;

import java.util.Scanner;

/**
 *
 * @author Martin Vargas
 */
public class EjerArreglos150421 {
private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        //double a[][][] = new double[4][4][4];
        
        double b[][][] = new double[2][2][2];
        //double a[] = new double[5]; 
        double total = 0; 

        for (int i=0; i<b.length; i++){ 
             for (int z=0; z<2; z++){   
                 for (int y=0; y<2; y++){ 
                  System.out.println("ingrese el valor de la fila " + i + " columna " + z + " =>" + y);
                  b[i][z][y] = s.nextDouble(); 
                }
            }
        }
        
        for (int i=0; i<2; i++){ 
             for (int z=0; z<2; z++){   
                 for (int y=0; y<2; y++){ 
                  System.out.println("ingrese el valor de la fila " + i + " columna " + z + " =>" + y);
                  total = total +  b[i][z][y]; 
                }
            } 
        }
            System.out.println( "La media es:" ); 
            System.out.println( total / 8 );
    }
    
}
