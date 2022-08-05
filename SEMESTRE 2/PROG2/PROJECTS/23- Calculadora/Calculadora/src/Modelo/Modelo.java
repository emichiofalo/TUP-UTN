package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Emi Chiófalo
 */
public class Modelo {

    public boolean ValidaDato(String a){
        try{
           Double.parseDouble(a);
           return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }
    
    public boolean validaRaiz(double a, double b){
        if (a>0 && b>0){
            return true;
        }else{
            JOptionPane.showMessageDialog(null,"INGRESE VALORES MAYORES A 0");
            return false;
        }
    }
    
    public boolean validaDivis0(double b){
        if (b!=0){
            return true;
        }else{
            JOptionPane.showMessageDialog(null,"NO SE PUEDE DIVIDIR POR 0");
            return false;
        }
    }
    
    public double Suma(double a, double b){
        return a+b;
    }
    
    public double Resta(double a, double b){
        return a-b;
    }
    
    public double Multip(double a, double b){
        return a*b;
    }
    
    public double Division(double a, double b){
        if(b == 0){
           return -1;
        }else{
           return a/b; 
        }   
    }

    public double Potencia(double a, double b){
        return Math.pow(a, b);
    }
    
    public double Raiz(double a, double b){
        return Math.pow(a, 1.0/b);
    }
    
}
