/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama3;

import java.util.ArrayList;

/**
 *
 * @author juan
 */
public interface Estado {
    public ArrayList<Operador> operadoresAplicables();
    public boolean esFinal();
    public Estado aplicarOperador(Operador o);
    public int hashCode();
    public boolean equals(Estado e);
    public String toString();
}
