namespace Ejercicio4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double n1 = 0;
            double n2 = 0;
            do
            {
                Console.WriteLine("Ingrese dos numeros decimales: ");
                Console.WriteLine("numero 1: ");
                n1 = Double.Parse(Console.ReadLine());
                Console.WriteLine("numero 2: ");
                n2 = Double.Parse(Console.ReadLine());
                Console.WriteLine("Seleccione la operacion a realizar:" + "\n"
                    + "1. Suma " + "\n" 
                    + "2. Resta" + "\n" 
                    + "3. Multiplicacion" + "\n"
                    + "4. Division" + "\n"
                    + "5. Resto de la division");
                string opcion = Console.ReadLine();
                switch (opcion)
                {
                    case "1":
                        Console.WriteLine(n1 + " + " + n2 + " = " + Suma(n1, n2));
                        break;
                    case "2":
                        Console.WriteLine(n1 + " - " + n2 + " = " + Resta(n1, n2));
                        break;
                    case "3":
                        Console.WriteLine(n1 + " * " + n2 + " = " + Multiplicacion(n1, n2));
                        break;
                    case "4":
                        if (n2 == 0)
                        {
                            Console.WriteLine("No se puede dividir por 0.");
                        }
                        else
                        {
                            Console.WriteLine(n1 + " / " + n2 + " = " + Division(n1, n2));
                        }
                        break;
                    case "5":
                        Console.WriteLine(n1 + " / " + n2 + " = " + Modulo(n1, n2));
                        break;
                    default:
                        Console.WriteLine("La opcion ingresada no es valida.");
                        break;
                }
                Console.WriteLine("Desea salir? S/N");
                string salir = Console.ReadLine().ToUpper();
                if (salir.Equals("S"))
                {
                    break;
                }
            } while (true);
        }

        public static double Suma (double n1, double n2)
        {
            return n1 + n2;
        }
        public static double Resta (double n1, double n2)
        {
            return n1 - n2;
        }
        public static double Multiplicacion (double n1, double n2)
        {
            return n1 * n2;
        }
        public static double Division (double n1, double n2)
        {
            return n1 / n2;            
        }
        public static double Modulo (double n1, double n2)
        {
            if (n2 == 0)
            {
                return 0;
            }
            else
            {
                return n1 % n2;
            }
        }
    }
}