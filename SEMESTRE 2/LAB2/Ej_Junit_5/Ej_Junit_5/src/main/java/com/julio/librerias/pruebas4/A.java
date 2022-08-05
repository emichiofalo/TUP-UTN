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
public class A {

    public void metodoConRetardo() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    public boolean esNegativo(int numero) {
        if (numero < 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public String concatena(String a, String b){
        return a + b;
    }
    
    public float divide(float a, float b){
        return a/b;
    }

}
