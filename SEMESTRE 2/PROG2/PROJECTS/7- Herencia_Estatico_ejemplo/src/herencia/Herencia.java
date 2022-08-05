/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Invitado
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Felino f1 = new Felino("tigre", "amarillo con rayas negras", "bramido", true, true, 3, "China", 250.5);
        System.out.println("el peso del animal es: "+f1.getPeso());
        System.out.println("La distribución del animal es:"+f1.getDistribucion_geografica());
        f1.setDistribucion_geografica("Rusia");
        System.out.println("La nueva distribución geográfica del animal es: "+f1.getDistribucion_geografica());
        System.out.println("El color del pelaje del animal es:"+f1.getColor_pelaje());
        Felino f2 = new Felino();
        f2.setCantidad_crias(2);
        System.out.println("la nueva cantidad de crias para el tigre2 es:" + f2.getCantidad_crias());
        
        
        Anfibio a1 = new Anfibio(1, " Sapo", "pulmonar", false, false, true, 50, "América", 0.580);

        System.out.println("El primer anfibio tiene las características siguientes: "+a1.llamarEspecies()+" Respiración: "+
                a1.getTipo_de_respiracion()+" Piel venenosa: "+a1.isPiel_venenosa()+" cola: "+
                a1.isCola()+" macho: "+a1.isMacho()+" Cant crias: "+a1.getCantidad_crias()+" Distibución: "+
                a1.getDistribucion_geografica()+" Peso: "+a1.getPeso());
        
        Anfibio a2 = new Anfibio(2," rana", "pulmonar", false, false, true, 50, "América", 0.580);
        System.out.println("El segundo anfibio tiene las características siguientes: "+a2.llamarEspecies());
        Anfibio a3 = new Anfibio(2," tritón", "pulmonar", false, false, true, 50, "América", 0.580);
        //System.out.println("El tercer anfibio tiene las características siguientes: "+a3.getid()+a3.llamarEspecies());
        Anfibio a4 = new Anfibio(1," Cecilia", "pulmonar", false, false, true, 50, "América", 0.580);
        //System.out.println("El cuarto anfibio tiene las características siguientes: "+a4.getid()+a4.llamarEspecies()); 

        System.out.println("La cantidad de anfibios hembras son: "+ Anfibio.getContador_anfibio_hembra()); // con esta línea no me hace falta instaciar el objeto ya que los atributos y los métodos son estáticos
        System.out.println("La cantidad de anfibios machos son: "+ Anfibio.getContador_anfibio_macho());
        
    } 
    
}
