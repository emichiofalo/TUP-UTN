/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julio.librerias.pruebas4;

public class Calculadora {

    
    public int sumar(int a, int b){
        try{Thread.sleep(450);}catch(Exception e){}
      return a+b;
    }
    public float dividir(float a, float b) throws Exception{
        if(b==0) throw new Exception();
        else
            return a/b;
    }
    
    
    public int[] sumaArreglos( int a[] , int b[] ){
       int c[] = new int[ a.length ];
       
          for(int i=0; i<a.length; i++)
              c[i] = a[i] + b[i]; 
       
       return c; 
    }
    
}
