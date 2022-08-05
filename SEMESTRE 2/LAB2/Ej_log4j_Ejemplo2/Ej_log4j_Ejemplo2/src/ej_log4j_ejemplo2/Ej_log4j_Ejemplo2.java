/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_log4j_ejemplo2;


import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author julio
 */
public class Ej_log4j_Ejemplo2 {

    final static Logger logger = Logger.getLogger(Ej_log4j_Ejemplo2.class);

    private void ejecutame(String parametro) {

        if (logger.isDebugEnabled()) {
            logger.debug("Esto es debug: " + parametro);
        }

        if (logger.isInfoEnabled()) {
            logger.info("Esto es info: " + parametro);
        }

       
        logger.warn("Esto es warn: " + parametro);
        logger.error("Esto es error : " + parametro);
        logger.fatal("Esto es fatal : " + parametro);

    }

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");

        //un mensaje de debug
        if (logger.isDebugEnabled()) {
            logger.debug("Esto es debug");
        }

        //un mensaje de error
        logger.error("Esto es un error");

        //un mensaje de error capturado en una excepcion
        try {
            throw new Exception();
        } catch (Exception e) {
            logger.error("Esto es un error. Excepcion.", e);
        }
        
        Ej_log4j_Ejemplo2 obj = new Ej_log4j_Ejemplo2();
        obj.ejecutame("UTN.frm");
        
    }
}
