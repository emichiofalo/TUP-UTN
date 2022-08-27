namespace EjercicioB1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Fraccion f1, f2;
            do
            {
                try
                {
                    Console.WriteLine("Ingrese los valores de la primer fraccion: ");
                    f1 = leerFraccion();
                    Console.WriteLine("Ingrese los valores de la segunda fraccion: ");
                    f2 = leerFraccion();
                    break;
                }
                catch (FraccionException e)
                {
                    Console.WriteLine(e.mensaje);
                }
            } while (true);
            Console.WriteLine("Resultado suma: ");
            Console.WriteLine(f1.Suma(f2).ToString());
            Console.WriteLine(f1.Restar(f2).ToString());
            Console.WriteLine(f1.Multiplicar(f2).ToString());
            Console.WriteLine(f1.Dividir(f2).ToString());
        }
        public static Fraccion leerFraccion()
        {
            int num1, num2;
            Console.WriteLine("Numerador: ");
            num1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Denominador: ");
            num2 = Convert.ToInt32(Console.ReadLine());
            Fraccion f = new Fraccion(num1, num2);
            return f;
        }
    }
}