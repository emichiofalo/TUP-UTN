using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace PrácticaParcial1_LAB3
{
    internal class Utilidades
    {
        //string[,] array = new string[num1,num2];
        //Convert.To... para conversión de tipos
        //.Length sin paréntesis para la longitud de arrays y cadenas
        //método virtual - puede ser sobreescrito 
        //método override - sobreescribe un método heredado

        public static int NumAleatorio()
        {
            Random myObject = new Random();                               
            int numAleatorio = myObject.Next(0, 100);                     //rango para la generación del número
            return numAleatorio;
        }

        public static string Espaciar(string cadena)
        {
            int cantidadEspacios = 20 - cadena.Length;
            for (int i = 0; i < cantidadEspacios; i++)
            {
                cadena += " ";
            }
            return cadena;
        }

        public static Boolean EsPar(int num)
        {
            if (num % 2 == 0)
            {
                Console.WriteLine("Es par.");
                return true;
            }
            else
            {
                Console.WriteLine("Es impar.");
                return false;
            }
        }
    }
}
