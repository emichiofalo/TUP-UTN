
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("PALABRA4.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String palabra;
            int cont = 0;
            ArrayList palabras = new ArrayList();

            while ((palabra = br.readLine()) != null) {
                String palabraSinEspacio = palabra.replaceAll(" ", "");
                //palabraSinEspacio = palabra.replace(";", "");
                if (!palabraSinEspacio.equals(";")) {
                    char ultima = palabraSinEspacio.charAt(palabraSinEspacio.length() - 2);
                    if (ultima == 's') {
                        palabras.add(palabraSinEspacio);
                        cont++;
                    }
                }
            }

            System.out.println("Hay " + cont + " palabras que terminan con s:");
            for (int i = 0; i < palabras.size(); i++) {
                System.out.println(palabras.get(i));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {

            }
        }

    }

}
