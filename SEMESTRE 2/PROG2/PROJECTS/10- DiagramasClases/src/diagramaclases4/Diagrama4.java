package diagramaclases4;

/**
 *
 * @author Emi Chiófalo
 */
public class Diagrama4 {

    public static void main(String[] args) {
        
        BarcoAVela bv1 = new BarcoAVela();
        FordFalcon ff1 = new FordFalcon();
        HondaXR600 h6001 = new HondaXR600();
        HondaXR25 h251= new HondaXR25();
        Boing747 bg1 = new Boing747();
        
//        System.out.println("Barco a Vela:");
//        bv1.setVelocidadPromedio(bv1.leerVelocidadPromedio());
//        bv1.setVelocidadMaxima(bv1.leerVelocidadMaxima());
//        System.out.println("");
//        System.out.println("Ford Falcon");
//        ff1.setVelocidadPromedio(ff1.leerVelocidadPromedio());
//        ff1.setVelocidadMaxima(ff1.leerVelocidadMaxima());
//        ff1.agregarRuedas();
//        System.out.println("");
        System.out.println("HondaXR600");
        h6001.setVelocidadPromedio(h6001.leerVelocidadPromedio());
        h6001.setVelocidadMaxima(h6001.leerVelocidadMaxima());
        h6001.agregarRuedas();
        System.out.println("");
//        System.out.println("HondaXR25");
//        h251.setVelocidadPromedio(h251.leerVelocidadPromedio());
//        h251.setVelocidadMaxima(h251.leerVelocidadMaxima());
//        h251.agregarRuedas();
//        System.out.println("");
        System.out.println("Boing 747");
        bg1.setVelocidadPromedio(bg1.leerVelocidadPromedio());
        bg1.setVelocidadMaxima(bg1.leerVelocidadMaxima());
        
//        System.out.println("");
//        System.out.println("Barco a Vela:");
//        System.out.println("Velocidad Promedio: " + bv1.getVelocidadPromedio() + 
//                "\nVelocidad Maxima: " + bv1.getVelocidadMaxima() + "\n");
//        bv1.romperInercia();
//        System.out.println("");
//        System.out.println("Ford Falcon:");
//        System.out.println("Velocidad Promedio: " + ff1.getVelocidadPromedio() + 
//                "\nVelocidad Maxima: " + ff1.getVelocidadMaxima() + "\n");
//        ff1.romperInercia();
//        System.out.println("Cantidad de ruedas: " + ff1.getCantRuedas());
//        //System.out.println("Cantidad de ruedas: " + FordFalcon.NRUEDAS);
        System.out.println("");
        System.out.println("HondaXR600:");
        System.out.println("Velocidad Promedio: " + h6001.getVelocidadPromedio() + 
                "\nVelocidad Maxima: " + h6001.getVelocidadMaxima() + "\n");
        h6001.romperInercia();
        System.out.println("Cantidad de ruedas: " + h6001.getCantRuedas());
        System.out.println("");
//        System.out.println("HondaXR25:");
//        System.out.println("Velocidad Promedio: " + h251.getVelocidadPromedio() + 
//                "\nVelocidad Maxima: " + h251.getVelocidadMaxima() + "\n");
//        h251.romperInercia();
//        System.out.println("Cantidad de ruedas: " + h251.getCantRuedas());
//        h251.esquivarObstaculo(200);
//        System.out.println("");
        System.out.println("Boing 747:");
        System.out.println("Velocidad Promedio: " + bg1.getVelocidadPromedio() + 
                "\nVelocidad Maxima: " + bg1.getVelocidadMaxima() + "\n");
        bg1.romperInercia();
        Boing747.agregarViaje();
        System.out.println("Cantidad de viajes: " + Boing747.getViajes());
        Boing747.agregarViaje();
        bg1.despegar();
        bg1.aterrizar();
        System.out.println("Cantidad de viajes: " + Boing747.getViajes());       
        
    }
    
}
