package InstitucionEducativa;

/**
 *
 * @author Emi Chiófalo
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Institucion secundaria.");
        Secundaria secund1 = new Secundaria("musical", 200, 10, "Patricias Mendocinas 400", 2005);
        System.out.println("Orientacion: " + secund1.getOrientacion());
        secund1.setOrientacion("tecnica");
        System.out.println("Orientacion: " + secund1.getOrientacion());
        
        System.out.println("");
        
        System.out.println("Institucion universitaria.");
        Universidad uni1 = new Universidad(10, 400, 50, "Arístides Villanueva 900", 1850);
        System.out.println("Año de apertura: " + uni1.getAnioApertura());
        uni1.setAnioApertura(1950);
        System.out.println("Año de apertura: " + uni1.getAnioApertura());
    }
    
}
