/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpprofiling;

/**
 *
 * @author Emi Chiófalo
 */
public class A {

    String bigString = "abcdefghijklmnopqrstuvwxyz_abcdefghijklmn";
    
    public A(){
        for(int i=0; i<24; i++)
        bigString = bigString.concat(bigString);
    }

}
