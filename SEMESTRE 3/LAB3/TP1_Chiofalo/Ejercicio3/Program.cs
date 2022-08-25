namespace Ejercicio3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num = 0;
            do
            {
                Console.WriteLine("Ingrese un numero: ");
                num = Int32.Parse(Console.ReadLine());
                EsPar(num);
                Console.WriteLine("Desea salir? S/N");
                string salir = Console.ReadLine().ToUpper();
                if (salir.Equals("S"))
                {
                    break;
                }
            } while (true);
         
        }

        public static Boolean EsPar(int num)
        {
            if (num%2==0)
            {
                Console.WriteLine("Es par.");
                return true;
            }
            else
            {
                Console.WriteLine("Es impar.");
                return false;
            }
        }
    }
}