/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_log4j_smtpappender;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Ej_log4j_SMTPAppender {

    private static final Logger logger = Logger.getLogger(Ej_log4j_SMTPAppender.class);

    public static void main(String[] args) {
        // Se utiliza PropertiesConfigurator 
        // para indicar el fichero de propiedades
        PropertyConfigurator.configure("log4j.properties");
        System.setProperty("mail.smtp.port", "465");
        System.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        //System.setProperty("mail.smtp.socketFactory.port", "465");
        //System.setProperty("mail.smtp.socketFactory.fallback", "false");
        logger.error("Esto es un error enviado a mail ");

    }

}
