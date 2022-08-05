package parcial2;

public class Collections {
    
    /*
    ARRAYLIST: .add,.get(index),.clear,.contains,.isEmpty,.remove(index),.size
    
    public void addtoArrayList(Nota nota) {                 //este no va en el main 
        if (this.notas == null)
            this.notas = new ArrayList<Nota>();
        this.notas.add(nota);
    }
     
    public void sumarValoresArrayList(){                    //este no va en el main
        double suma = 0;
        for (Nota nota : notas){
            suma += nota.getNotaExamen();
        }
        double promedio = suma/notas.size();
        System.out.println("El promedio del alumno es: " + promedio);
    }
    
    public static void MostrarLista (ArrayList<Integer> lista){
        for (Integer value : lista) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
    
    public static void LlenarListaRndPar(ArrayList<Integer> lista, int num){
        Random rnd = new Random();
        int aux;
        for (int i = 0; i < num; i++) {
            aux = rnd.nextInt(100)+1;
            if (aux%2 == 0) {
                lista.add(aux);
            }else
                lista.add(aux+1);
        }
    }
    
    public static void BusquedaSecuencial(ArrayList<Integer> array, Integer element){
        int position = 0;
        boolean found = false; 
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == element) {
                found = true;
                position = i+1;
            }
        }
        if (found) {
            System.out.println("Encontrado: posicion " + position);
        }else{
            System.out.println("NO ENCONTRADO");
        }
    }
    
    ArrayList<Integer> ascendente = new ArrayList<Integer>(original);           //creo una copia del original para ordenarlo y no modificar el original
    ORDENAR ARRAYLIST ASCENDENTE: Collections.sort(ascendente);
    ORDENAR ARRAYLIST DESCENDENTE: Collections.sort(descendente, Collections.reverseOrder());
    
    HASHSET: .add,.clear,.contains,.isEmpty,.remove,.size
    
    public void addToHashSet(ComponenteCPU componente) {    //este no va en el main         //HASHSET
        if (this.componentes == null)
            this.componentes = new HashSet<ComponenteCPU>();
        this.componentes.add(componente);
    }
    
    HASHMAP: .put(key, value),.containskey,.get(key) te devuelve el value  de esa key,.keySet() para el for each
    
    public static void FillHashMap(HashMap <String,Long> agenda){                           //HASHMAP
        Scanner sc = new Scanner (System.in);
        boolean exit = true;
        String name;
        Long number;
        System.out.println("----------AGENDAR CONTACTO----------");
        System.out.println("Ingrese los datos de contacto que desea ingresar: ");
        while (exit){
            System.out.println("Nombre: | Número: ");
            name=sc.nextLine().toUpperCase();
            if (agenda.containsKey(name)) {
                System.out.println("El contacto ya existe.");
            }else{
                number=sc.nextLong();
                agenda.put(name, number);
            }
            System.out.println("Desea cargar mas contactos?");
            System.out.println("1. Si | 2. No");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    exit = true;
                    break;
                case 2: 
                    exit = false;
                    break;
            }
            sc.nextLine();
        }
        Menu(agenda);
    }
    
    public static void FindKey(HashMap <String,Long> agenda){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("----------BUSQUEDA DE CONTACTO----------");
        System.out.println("Nombre: ");
        name = sc.next().toUpperCase();
        if (!agenda.containsKey(name)){
            System.out.println("La persona buscada no se encuentra en la agenda.");
        }else{
            System.out.println(agenda.get(name));
        }
    }
    
    public static void ImprimirHashMap(HashMap <String,Long> agenda){
        System.out.println("----------CONTACTOS----------");
        for (String contact : agenda.keySet()){
            System.out.println(contact + " - " + agenda.get(contact));
        }
    } 
    
    */
}
