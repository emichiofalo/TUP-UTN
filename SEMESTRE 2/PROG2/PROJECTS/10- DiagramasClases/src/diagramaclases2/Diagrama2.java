package diagramaclases2;

/**
 *
 * @author Emi Chiófalo
 */
public class Diagrama2 {

    public static void main(String[] args) {
        
        System.out.println("Bicicleta");
        Bicicleta b1 = new Bicicleta(4,"Tommy");
        System.out.println("Cantidad Ruedas: " + b1.getRuedas());
        System.out.println("Dueño: " + b1.getDuenio());
        b1.Precio();
        b1.Velocidad_Maxima();
        
        System.out.println("");
        System.out.println("Auto");
        Auto a1 = new Auto(3,4,"Felipe");
        System.out.println("Cantidad Ruedas: " + a1.getRuedas());
        System.out.println("Cantidad Puertas: " + a1.getPuertas());
        System.out.println("Dueño: " + a1.getDuenio());
        a1.Precio();
        a1.Velocidad_Maxima();
        System.out.println(a1.Tipo());
        
        System.out.println("");
        System.out.println("Moto");
        Moto m1 = new Moto(2,"Monica");
        System.out.println("Cantidad Ruedas: " + a1.getRuedas());
        System.out.println("Dueño: " + a1.getDuenio());
        m1.Precio();
        m1.Velocidad_Maxima();
        System.out.println(m1.Tipo());
       
    }
    
}
