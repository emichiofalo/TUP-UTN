namespace EjercicioC1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, num2;
            string[,] array;
            do
            {
                try
                {
                    Console.WriteLine("Primer valor para la matriz: ");
                    num1 = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("Segundo valor para la matriz: ");
                    num2 = Convert.ToInt32(Console.ReadLine());
                    array = new string[num1, num2];
                    break;
                }
                catch (Exception)
                {
                    Console.WriteLine("Debe ingresar un número entero.");
                }
            } while (true);

            for (int i = 0; i < num1; i++)
            {
                for (int j = 0; j < num2; j++)
                {
                    if ((i+1)+(j+1) == num1+num2)
                    {
                        array[i, j] = "X";
                        Console.Write(array[i, j]);
                    }
                    else
                    {
                        array[i, j] = "O";
                        Console.Write(array[i, j]);
                    }
                }
                Console.WriteLine();
            }

            
        }        
    }
}