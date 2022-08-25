namespace Ejercicio2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random myObject = new Random();
            int numAleatorio = myObject.Next(0, 100);
            int cantIntentos = 0;
            int numIngresado = 0;

            do
            {
                cantIntentos++;
                Console.WriteLine("Ingrese un numero entre 0 y 100:");
                numIngresado = Convert.ToInt32(Console.ReadLine());
                if (numIngresado > 100 || numIngresado < 0)
                {
                    Console.WriteLine("Debe ingresar un numero entre 0 y 100.");
                }
                else if (numIngresado > numAleatorio)
                {
                    Console.WriteLine("El numero ingresado es muy alto.");
                }
                else if (numIngresado < numAleatorio)
                {
                    Console.WriteLine("El numero ingresado es muy bajo.");
                }
                else if (numIngresado == numAleatorio) 
                {
                    Console.WriteLine("Correcto, numero encontrado. Cantidad de intentos: " + cantIntentos);
                    break;
                }
            } while (true);

        }
    }
}