/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julio.librerias.pruebas4;

/**
 *
 * @author julio
 */
public class Excepciones {
    public float divide(float a, float b) throws Exception {
    
        if(b==0) throw new Exception("División por 0");
        
        return a/b;
    
    }
}
