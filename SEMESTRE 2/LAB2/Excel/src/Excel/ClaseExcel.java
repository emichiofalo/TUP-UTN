package excel;

import java.io.File;
import java.io.IOException;                   
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.Number;                   

/**
 *
 * @author julio
 */
public class ClaseExcel {

    private static final String UBICACION_ARCHIVO = "C:/Users/Emi Chiófalo/Google Drive/Programación/SEM 2/LABORATORIO 2/PROJECTS/MI_ARCHIVO_DE_EXCEL.xls";   //el que quiero crear

    public static void main(String[] args) {

        //1. CREAR UN ARCHIVO DE EXCEL
        WritableWorkbook miLibro = null;  //representa un fichero excel (libro)
        try {

            miLibro = Workbook.createWorkbook(new File(UBICACION_ARCHIVO));

            // CREAR UNA HOJA
            WritableSheet hojaExcel = miLibro.createSheet("hoja 1", 0);

            // AGREGAR ALGO A LA HOJA
            Label label = new Label(0, 0, "Test");
            hojaExcel.addCell(label);                

            Number numero = new Number(0, 1, 1);
            hojaExcel.addCell(numero);

            label = new Label(1, 0, "Resultado");
            hojaExcel.addCell(label);

            label = new Label(1, 1, "Paso");
            hojaExcel.addCell(label);

            numero = new Number(0, 2, 2);
            hojaExcel.addCell(numero);

            label = new Label(1, 2, "Paso 2");
            hojaExcel.addCell(label);

            miLibro.write();
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        } finally {

            if (miLibro != null) {
                try {
                    miLibro.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (WriteException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}