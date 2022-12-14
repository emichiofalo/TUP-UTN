using PrácticaParcial1_LAB3.Auxiliar;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3.Arrays
{
    internal class Array3
    {
        static void Main(string[] args)
        {
            int num;
            try
            {
                Console.WriteLine("Ingrese un valor impar mayor o igual a 5:");
                num = Convert.ToInt32(Console.ReadLine());
                ValidarNumImpar(num);
                int[,] array = new int[num, num];
                CargarArrayRectangulo(array);
            }
            catch (ExceptionImpar e)
            {
                Console.WriteLine(e.mensaje);
            }
        }

        public static void ValidarNumImpar(int num)
        {
            if (num < 5 || num % 2 == 0)
            {
                throw new ExceptionImpar("El valor ingresado no es un numero entero impar mayor o igual a 5.");
            }
        }

        public static void CargarArrayRectangulo(int[,] array)
        {
            int centro = array.GetLength(0) / 2;
            for (int i = 0; i < array.GetLength(0); i++)
            {
                for (int j = 0; j < array.GetLength(1); j++)
                {
                    array[i, j] = 0;
                }
            }
            array[centro - 1, centro - 1] = 1;
            array[centro - 1, centro] = 1;
            array[centro - 1, centro + 1] = 1;
            array[centro, centro - 1] = 1;
            array[centro, centro + 1] = 1;
            array[centro + 1, centro - 1] = 1;
            array[centro + 1, centro] = 1;
            array[centro + 1, centro + 1] = 1;

            MetodosArrays.ImprimirArray(array);
        }
    }
}
