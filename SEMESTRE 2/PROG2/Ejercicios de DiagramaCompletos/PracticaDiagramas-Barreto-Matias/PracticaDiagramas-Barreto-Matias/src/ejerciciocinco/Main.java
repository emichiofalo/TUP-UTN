package ejerciciocinco;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        BarcoAVela ba = new BarcoAVela(40, 90);
        System.out.println("Barco a Vela"
                + "\nVelocidad Maxima: " + ba.getVelocidadMaxima()
                + "\nVelocidad Promedio: " + ba.getVelocidadPromedio()
                + "\n");

        FordFalcon ff = new FordFalcon(100, 180);
        ff.addRuedas(new Rueda(Auto.getNumRuedas()));
        System.out.println("Ford Falcon"
                + "\nNro Ruedas: " + ff.getRuedas().get(0).getRueda()
                + "\nVelocidad Maxima: " + ff.getVelocidadMaxima()
                + "\nVelocidad Promedio: " + ff.getVelocidadPromedio()
                + "\n");
        
        HondaXR600 hxr = new HondaXR600(120, 300);
        hxr.addRuedas(new Rueda(Moto.getNumRuedas()));
        System.out.println("HondaXR600"
                + "\nNro Ruedas: " + hxr.getRuedas().get(0).getRueda()
                + "\nVelocidad Maxima: " + hxr.getVelocidadMaxima()
                + "\nVelocidad Promedio: " + hxr.getVelocidadPromedio()
                + "\n");

        HondaXR25 hxr25 = new HondaXR25(150, 320);
        hxr25.addRuedas(new Rueda(Moto.getNumRuedas()));
        System.out.println("HondaXR600"
                + "\nNro Ruedas: " + hxr25.getRuedas().get(0).getRueda()
                + "\nVelocidad Maxima: " + hxr25.getVelocidadMaxima()
                + "\nVelocidad Promedio: " + hxr25.getVelocidadPromedio()
                + "\n");
        hxr25.esquivarObstaculo(15);        
    }
}
