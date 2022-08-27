namespace EjercicioC2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese una serie de números separados por coma sin espacio: ");
            string str = Console.ReadLine();
            string[] arrayStr = str.Split(',');
            int suma = 0;
            for (int i = 0; i < arrayStr.Length; i++)
            {
                suma += Convert.ToInt32(arrayStr[i]);
            }
            Console.WriteLine("Resultado suma valores ingresados: " + suma);
        }
    }
}