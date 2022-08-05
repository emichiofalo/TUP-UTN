package tpenum_chiofalo;

public class Main {

	public static void main(String args[]) {
		
		Demarcacion delantero = Demarcacion.DELANTERO;
		Demarcacion defensa = Demarcacion.DEFENSA;
		
		// Devuelve un String con el nombre de la constante
		System.out.println("delantero.name()= "+delantero.name());
		System.out.println("defensa.toString()= "+defensa.toString());
		
		//  Devuelve un entero con la posición de la constante según está declarada.
		System.out.println("delantero.ordinal()= "+delantero.ordinal());
		
		// Compara el enum con el parámetro según el orden en el que están declaradas las constantes. 
		System.out.println("delantero.compareTo(defensa)= "+delantero.compareTo(defensa));
		System.out.println("delantero.compareTo(delantero)= "+delantero.compareTo(delantero));
		
		// Recorre todas las constantes de la enumeración
		for(Demarcacion d: Demarcacion.values()){
			System.out.print(d.toString()+" - ");
		}
		
		System.out.println();
		
		// Instanciamos el enumerado
		Equipo villareal = Equipo.VILLAREAL;
		
		// Devuelve un String con el nombre de la constante
		System.out.println("villareal.name()= "+villareal.name());
		
		// Devuelve el contenido de los atributos
		System.out.println("villareal.getNombreClub()= "+villareal.getNombreClub());
		System.out.println("villareal.getPuestoLiga()= "+villareal.getPuestoLiga());
		
		Futbolista casillas = new Futbolista("Casillas", 1, Demarcacion.PORTERO, Equipo.REAL_MADRID);
		Futbolista capdevila = new Futbolista("Capdevila", 11, Demarcacion.DEFENSA, Equipo.VILLAREAL);
		Futbolista iniesta = new Futbolista("Iniesta", 6, Demarcacion.CENTROCAMPISTA, Equipo.BAR�A);
		Futbolista navas = new Futbolista("Navas", 22, Demarcacion.DELANTERO, Equipo.SEVILLA);
		
		System.out.println(casillas.toString());
		System.out.println(capdevila.toString());
		System.out.println(iniesta.toString());
		System.out.println(navas.toString());
	}

}
