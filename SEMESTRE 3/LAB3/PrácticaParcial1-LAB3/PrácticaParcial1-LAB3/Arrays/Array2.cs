using PrácticaParcial1_LAB3.Auxiliar;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3.Arrays
{
    internal class Array2
    {
        static void Main(string[] args)
        {
            int num;
            try
            {
                Console.WriteLine("Ingrese un valor impar mayor o igual a 3:");
                num = Convert.ToInt32(Console.ReadLine());
                ValidarNumImpar(num);
                int[,] array = new int[num, num];
                CargarArrayDiagInversa(array);
            }
            catch (ExceptionImpar e)
            {
                Console.WriteLine(e.mensaje);
            }
        }

        public static void ValidarNumImpar(int num)
        {
            if (num < 3 || num % 2 == 0)
            {
                throw new ExceptionImpar("El valor ingresado no es un numero entero impar mayor o igual a 3.");
            }
        }

        public static void CargarArrayDiagInversa(int[,] array)
        {
            int col = array.GetLength(0)-1;
            for (int i = 0; i < array.GetLength(0); i++)
            {
                for (int j = 0; j < array.GetLength(1); j++)
                {
                    if (j==col)
                    {
                        array[i, j] = 1;
                    }
                    else
                    {
                        array[i, j] = 0;
                    }
                }
                col--;
            }
            MetodosArrays.ImprimirArray(array);
        }
    }
}
