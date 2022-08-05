package Edificio;

/**
 *
 * @author Emi Chiófalo
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Edificio de oficinas.");
        EdificioOficinas edif1 = new EdificioOficinas(40, 8, 4, 5, 6, 3000, "Emilio Civit 500");
        System.out.println("Cantidad de espacios comunes: " + edif1.getCantEspaciosComunes());
        edif1.setCantEspaciosComunes(3);
        System.out.println("Cantidad de espacios comunes: " + edif1.getCantEspaciosComunes());
        
        System.out.println("");
        
        System.out.println("Edificio residencial.");
        EdificioResidencial edif2 = new EdificioResidencial(6, 3, 1, 0, 1, 6000, "Jacinto Suarez 733");
        System.out.println("Cantidad de espacios comunes: " + edif2.getCantSalidasEmergencia());
        edif2.setCantSalidasEmergencia(2);
        System.out.println("Cantidad de espacios comunes: " + edif2.getCantSalidasEmergencia());
        
        System.out.println("Valor expensas: " + edif2.getValorExpensas());
        edif2.AumentarExpensas(10);
        System.out.println("Valor expensas: " + edif2.getValorExpensas());
    }

}
