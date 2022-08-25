namespace Ejercicio1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Numeros divisibles entre 2 y 5: - con bucle for -");
            for (int i = 1; i < 101; i++)
            {
                if (i%2==0 || i%5==0)
                {
                    if (i==100)
                    {
                        Console.Write(i);
                    }
                    else
                    {
                        Console.Write(i + ", ");
                    }
                }
            }

            Console.WriteLine("Numeros divisibles entre 2 y 5: - con bucle while -");
            int num = 1;
            while (num < 101)
            {
                if (num % 2 == 0 || num % 5 == 0)
                {
                    if (num == 100)
                    {
                        Console.Write(num);
                    }
                    else
                    {
                        Console.Write(num + ", ");
                    }
                }
                num++;
            }

            Console.WriteLine("Numeros divisibles entre 2 y 5: - con bucle do/while -");
            num = 1;
            do
            {
                if (num % 2 == 0 || num % 5 == 0)
                {
                    if (num == 100)
                    {
                        Console.Write(num);
                    }
                    else
                    {
                        Console.Write(num + ", ");
                    }
                }
                num++;
            } while (num < 101);

            Console.WriteLine("");
        }
    }
}