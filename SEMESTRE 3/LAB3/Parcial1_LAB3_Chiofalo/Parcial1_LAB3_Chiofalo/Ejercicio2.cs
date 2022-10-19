using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Parcial1_LAB3_Chiofalo
{
    internal class Ejercicio2
    {
        static void Main(string[] args)
        {
            int num;
            try
            {
                Console.WriteLine("Ingrese un valor entero mayor o igual a 5:");
                num = Convert.ToInt32(Console.ReadLine());
                ValidarNum5(num);
                int[,] array = new int[num, num];
                CargarArray(array);
                ImprimirArray(array);
                SeleccionarCeldas(array);
            }
            catch (Exception5 e)
            {
                Console.WriteLine(e.mensaje);
            }

            
        }
        public static void ValidarNum5(int num)
        {
            if (num <5)
            {
                throw new Exception5("El valor ingresado debe ser mayor o igual a 5.");
            }
        }
        public static int NumAleatorio()
        {
            Random myObject = new Random();
            int numAleatorio = myObject.Next(0, 100);                     //rango para la generación del número
            return numAleatorio;
        }
        public static void CargarArray(int[,] array)
        {
            for (int i = 0; i < array.GetLength(0); i++)
            {
                for (int j = 0; j < array.GetLength(1); j++)
                {
                    array[i, j] = NumAleatorio();
                }
            }
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
        public static void SeleccionarCeldas(int[,] array)
        {
            List<int> ints = new List<int>();   
            Console.WriteLine("Seleccione 3 celdas de la matriz.");
            int dimension = array.GetLength(0);
            int contadorCeldas = 0;
            int n1, n2;
            do
            {
                Console.WriteLine("Fila:");
                n1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Columna:");
                n2 = Convert.ToInt32(Console.ReadLine());
                if (ValidarCelda(n1,n2,dimension))
                {
                    contadorCeldas++;
                    ints.Add(array[n1-1, n2-1]);
                    if (contadorCeldas == 3)
                    {
                        break;
                    }
                }

            } while (true);
            //string lista = ints.ToArray().ToString();
            Console.WriteLine(ints[0].ToString() + "+" + ints[1].ToString() + "+" + ints[2].ToString() + "=" + (ints[0] + ints[1] + ints[2]));
        }
        public static Boolean ValidarCelda(int n1, int n2, int dimension)
        {
            if (n1 > dimension || n2 > dimension || n2 < 0 || n2 < 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }
}
