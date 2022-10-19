using PrácticaParcial1_LAB3.Auxiliar;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3.Arrays
{
    internal class MetodosArrays
    {
        public static void CargarArrayDiagPrincipal(int[,] array)
        {
            for (int i = 0; i < array.GetLength(0); i++)
            {
                for (int j = 0; j < array.GetLength(1); j++)
                {
                    if (i == j)
                    {
                        array[i, j] = 1;
                    }
                }
            }
        }
        public static void CargarArrayDiagInversa(int[,] array)
        {
            int col = array.GetLength(0) - 1;
            for (int i = 0; i < array.GetLength(0); i++)
            {
                for (int j = 0; j < array.GetLength(1); j++)
                {
                    if (j == col)
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
        }
        public static void CargarArrayDiagInversaYPrincipal(int[,] array)
        {
            int col = array.GetLength(0) - 1;
            for (int i = 0; i < array.GetLength(0); i++)
            {
                for (int j = 0; j < array.GetLength(1); j++)
                {
                    if (j == col)
                    {
                        array[i, j] = 1;
                    }
                    else if (i == j)
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
        }
        public static void CargarArrayCruz(int[,] array)
        {
            int centro = array.GetLength(0) / 2;
            for (int i = 0; i < array.GetLength(0); i++)
            {
                for (int j = 0; j < array.GetLength(1); j++)
                {
                    if (i != centro && j != centro)
                    {
                        array[i, j] = 0;
                    }
                    else
                    {
                        array[i, j] = 1;
                    }
                }
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
        }
        public static void ImprimirArray(int[,] array)
        {
            for (int i = 0; i < array.GetLength(0); i++)
            {
                for (int j = 0; j < array.GetLength(1); j++)
                {
                    Console.Write((array[i, j]) + "  ");
                }
                Console.WriteLine("");
            }
        }
    }
}
