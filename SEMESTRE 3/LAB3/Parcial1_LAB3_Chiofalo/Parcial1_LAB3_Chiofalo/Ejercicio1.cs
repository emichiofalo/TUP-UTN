using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Parcial1_LAB3_Chiofalo
{
    internal class Ejercicio1
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Ingrese un valor entero: ");
                int num = Convert.ToInt32(Console.ReadLine());
                List<double> resultados = new List<double>();
                MostrarResultados(DivisionRecursiva(num, resultados));                
            }
            catch (Exception)
            {
                Console.WriteLine("El numero ingresado debe ser entero.");
            }
        }

        public static List<double> DivisionRecursiva(double numero, List<double> resultados)
        {
            double result;
            if (numero < 1)
            {
                return resultados;
            }
            else
            {
                result = numero / 2;
                resultados.Add(result);
                return DivisionRecursiva(result, resultados);
            }
        }
        public static void MostrarResultados(List<double> resultados)
        {
            Console.WriteLine("Resultados:");
            double total = 0;
            foreach (double r in resultados)
            {
                total += r;
                Console.WriteLine(r.ToString());
            }
            Console.WriteLine("Total: " + total);
        }
    }

}
