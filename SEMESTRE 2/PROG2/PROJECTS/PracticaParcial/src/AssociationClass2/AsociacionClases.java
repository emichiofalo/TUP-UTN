package AssociationClass2;

public class AsociacionClases {

    public static void main(String[] args) {
        Persona p1 = new Persona("pepe");
        Inmueble i1 = new Inmueble("palomita", 145);
        
        Renta r1 = new Renta(15000,24,p1,i1);
//        p1.setRentaConstructor(new Renta(15000,24,p1,i1));
//        i1.setRentaConstructor(new Renta(15000,24,p1,i1));
        
        System.out.println(p1.getRenta().getCostoMensual());
        System.out.println(i1.getRenta().getDuracionMeses());
    }
    
}
