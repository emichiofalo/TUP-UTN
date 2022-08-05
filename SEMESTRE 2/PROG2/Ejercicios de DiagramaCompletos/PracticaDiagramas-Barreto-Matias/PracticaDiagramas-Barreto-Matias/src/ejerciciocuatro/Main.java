package ejerciciocuatro;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        Bicicleta bici = new Bicicleta(2, "Pepe");
        System.out.println("Bicicleta \n"
                + "Dueno: " + bici.getDuenio() + "\n"
                + "Cant Ruedas: " + bici.getRuedas() + "\n"
                + "Velocidad Maxima: " + bici.Velocidad_Maxima(60));

        Auto auto = new Auto(4, "Fede");
        System.out.println("Auto \n"
                + "Dueno: " + auto.getDuenio() + "\n"
                + "Cant Ruedas: " + auto.getRuedas() + "\n"
                + "Velocidad Maxima: " + auto.Velocidad_Maxima(260)
                + "\nTipo Motor: " + auto.tipo("1.6"));

        Moto moto = new Moto(2, "Lea");
        System.out.println("Moto \n"
                + "Dueno: " + moto.getDuenio() + "\n"
                + "Cant Ruedas: " + moto.getRuedas() + "\n"
                + "Velocidad Maxima: " + moto.Velocidad_Maxima(180)
                + "\nTipo Motor: " + moto.tipo("4 Tiempos"));
    }
}
