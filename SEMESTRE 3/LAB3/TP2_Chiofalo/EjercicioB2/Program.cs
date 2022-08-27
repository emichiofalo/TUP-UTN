namespace EjercicioB2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string str1, str2;
            do
            {
                Console.WriteLine("Ingrese una cadena: ");
                str1 = Console.ReadLine();
                Console.WriteLine("Ingrese otra cadena: ");
                str2 = Console.ReadLine();
                if (ValidarLengthCadena2(str1, str2))
                {
                    Console.WriteLine(EncontrarCadena2(str1, str2));
                    break;
                }
            } while (true);
            
        }

        public static Boolean ValidarLengthCadena2 (string str1, string str2)
        {
            if (str1.Length > str2.Length)
            {
                return true;
            }
            else
            {
                Console.WriteLine("La primer cadena debe ser más larga que la segunda. Intente nuevamente.");
                return false; 
            }
        }

        public static string EncontrarCadena2 (string str1, string str2)
        {
            if (str1.Contains(str2))
            {
                return "ENCONTRADO";
            }
            else
            {
                return "NO ENCONTRADO";
            }
        }

    }
}