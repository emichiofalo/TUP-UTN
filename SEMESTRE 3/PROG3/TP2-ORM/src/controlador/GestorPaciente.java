/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import persistencia.ConfigHibernate;

/**
 *
 * @author Emi Chiófalo
 */
public class GestorPaciente extends Gestor{
    
    public GestorPaciente() {
        sesion = ConfigHibernate.openSession();
    }
       
}
