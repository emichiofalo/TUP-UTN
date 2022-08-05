/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.sql.Connection;
import Modelo .*;
import Vistas .*;

/**
 *
 * @author Emi Chiófalo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ComprarEntradaVista compraEntrada = new ComprarEntradaVista();
        ComprarEntradaControlador contComp = new ComprarEntradaControlador(compraEntrada);
        compraEntrada.setVisible(true);

//        PeliculaVistaAdmin vistaPeli = new PeliculaVistaAdmin();
//        PeliculaControlador contComp = new PeliculaControlador(vistaPeli);
//        vistaPeli.setVisible(true);
    }
    
    
}
