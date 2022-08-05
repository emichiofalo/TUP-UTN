package ejerciciotres;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Habitacion {

    private static int siguienteNumero = 1;
    private int numero;
    private ArrayList<Cama> camas = new ArrayList<>();

    public Habitacion() {
    }

    public Habitacion(int numero) {
        this.numero = siguienteNumero;
        siguienteNumero++;
    }

    public static int getSiguienteNumero() {
        return siguienteNumero;
    }

    public static void setSiguienteNumero(int siguienteNumero) {
        Habitacion.siguienteNumero = siguienteNumero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Cama> getCamas() {
        return camas;
    }

    public void setCamas(Cama camas) {
        this.camas.add(camas);
    }

    @Override
    public String toString() {
        return "\n"+ "Numero = " + numero + "\n";
    }
}
