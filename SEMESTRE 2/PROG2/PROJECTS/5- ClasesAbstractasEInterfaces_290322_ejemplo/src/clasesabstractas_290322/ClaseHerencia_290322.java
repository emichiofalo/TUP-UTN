package clasesabstractas_290322;

/**
 *
 * @author Emi Chiófalo
 */
public class ClaseHerencia_290322 {

    public static void main(String[] args) {
        
//      PoligonoRegular c = new PoligonoRegular(7, 3.0);  // Error!!! clase abstracta                      	         System.out.println(c.area()); 
        
        System.out.println("Ejemplo de area y perimetro del cuadrado de la clase abstracta poligono regular: ");
        Cuadrado c = new Cuadrado(3.0);
        System.out.println(c.area());
        System.out.println(c.perimetro());
        System.out.println("");
        
        System.out.println("Ejemplo de polimorfismo de la clase animal:");
        Gato g = new Gato();
        hazleHablar(g);
        Perro p = new Perro();
        hazleHablar(p);
        System.out.println("");
        System.out.println("Ejemplo de polimorfismo de la interfaz Parlanchin:");
        Cucu cu = new Cucu();
        hazleHablar(cu);
    }
    
    static void hazleHablar(Parlanchin sujeto){
        sujeto.habla();
    }
}
