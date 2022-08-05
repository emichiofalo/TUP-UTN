/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

import java.time.*;

/**
 *
 * @author Emi Chiófalo
 */
public class Main {

    public static void main(String[] args) {
        
        ActaDeContratacion a1 = new ActaDeContratacion(LocalDate.now(), LocalDate.of(2022, 5, 27), LocalTime.now(), "Godoy Cruz", 0005663, "el conductor hizo una vuelta en u poniendo en riesgo a los demas");
        
        a1.addInfraccion(new Infraccion("Vuelta en U", 10000, new TipoDeInfraccion(1,"giro en u para dar la vuelta", "grave", 10000, 10)));
        a1.setOrganizacion(new OrganizacionEstatal("Transito", "Godoy Cruz"));
        a1.setVehiculo(new Vehiculo("azul","FGT123",2010,new Marca("Renault",new Modelo("Sedan"))));
        a1.setEstadoActa(new EstadoDelActa("el conductor cometio una infraccion", "infraccion de un conductor"));
        a1.setRuta(new Ruta("7", "160", new TipoRuta("ruta principal", "provincial")));
        a1.setLicencia(new Licencias(1234, LocalDate.of(2024,5,13), 3, new Conductor("las catitas 45", "pepe", "salvatico", 24567897, "m")));
        a1.setAutoridad(new AutoridadDeConstatacion(123,11234,"sandra","gimenez",23456765,"f"));
        
        System.out.println(a1.toString());
        
    }
    
}
