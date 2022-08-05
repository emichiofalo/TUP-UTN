/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_telnet_appender;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Ej_Telnet_Appender {

    static Logger logger = Logger.getLogger(Ej_Telnet_Appender.class);

    public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		// Realizar logging hacia el puerto 23
		logger.debug("Log4j. Utilización de FileAppender. Configuración exitosa !!!");
                
                for(int i=0;i<10000;i++) {
                    try{Thread.sleep(1000);}catch(Exception e){}
                    logger.debug("El programa se encuentra en la iteración: " + i);    
                }
    }
}
