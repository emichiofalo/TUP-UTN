/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercontenedores190421;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author Martin Vargas
 */
public class EjerContenedores190421 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona p1 = new Persona("Maria");
        Persona p2 = new Persona("Pepe");
        Persona p3 = new Persona("Diego");
        Map<Integer,Persona> personas = new TreeMap();
        //gatos [][]
        personas.put(4668888, p1);
        personas.put(4668888, p3);
        personas.put(5222222, p2);
        
        for (Integer w : personas.keySet()){
            
            System.out.println(" =>" + w + " =>" + personas.get(w).getNombre());
        }
        
    }
    
}
