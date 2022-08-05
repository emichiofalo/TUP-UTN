package ej_log4j_writeappender;

import java.io.FileOutputStream;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.WriterAppender;

public class Ej_log4j_WriteAppender {

    static Logger logger
            = Logger.getLogger("WriterAppenderExample.class");

    public static void main(String[] args) {
        try {
            FileOutputStream filename
                    = new FileOutputStream("salida.html");
            WriterAppender writeappender
                    = new WriterAppender(new HTMLLayout(), filename);
            logger.addAppender(writeappender);
            logger.info("Sistema");
            logger.info("UTN");
            logger.info("Ejemplo");
            logger.info("Writer Appender");

            logger.info("-----------");
        } catch (Exception e) {
            System.out.println("Error =" + e.getMessage());
        }
    }
}
