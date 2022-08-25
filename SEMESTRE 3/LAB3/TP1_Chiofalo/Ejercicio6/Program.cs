namespace Ejercicio6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            long num;
            Console.WriteLine("Ingrese un número mayor a 1:");
            do
            {
                num = long.Parse(Console.ReadLine());
                if (num > 1)
                {
                    break;
                }
                else
                {
                    Console.WriteLine("El numero debe ser mayor a 1. Intente nuevamente.");
                }

            } while (true);

            MultiplicacionRecursiva(num);
            
        }
        public static void MultiplicacionRecursiva (long num)
        {
            if (num < 100000000)
            {
                num = num * num;
                MultiplicacionRecursiva(num);
            }
            else
            {
                Console.WriteLine("Ultimo resultado de la iteracion: " + num);
            }
        }
    }
}