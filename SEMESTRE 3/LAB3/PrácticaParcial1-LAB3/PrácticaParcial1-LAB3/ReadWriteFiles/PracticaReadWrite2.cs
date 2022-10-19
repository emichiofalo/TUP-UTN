using MySql.Data.MySqlClient;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3.ReadWriteFiles
{
    internal class PracticaReadWrite2
    {
        static void Main(string[] args)
        {
            List<int> numeros = LlenarArray();
            EscribirArchivo(numeros);
            LeerArchivo(numeros);
        }
        public static List<int> LlenarArray()
        {
            List<int> numeros = new List<int>();
            Console.WriteLine("Ingrese números enteros. Para finalizar ingrese 0.");
            while (true)
            {
                try
                {
                    int num = Convert.ToInt32(Console.ReadLine());
                    if (num == 0)
                    {
                        break;
                    }
                    else
                    {
                        numeros.Add(num);
                    }
                }
                catch (Exception)
                {
                    Console.WriteLine("Solo debe ingresar números enteros.");
                }
            }
            return numeros;
        }
        public static void EscribirArchivo(List<int> numeros)
        {
            string path = Directory.GetCurrentDirectory();
            path = path.Replace("bin\\Debug\\net6.0", "");
            StreamWriter writer = new StreamWriter(path + "numeros.txt");

            string numerosStr = "";
            foreach (int numero in numeros)
            {
                numerosStr += numero.ToString() + "-";
            }
            numerosStr = numerosStr.Remove(numerosStr.Length-1);
            
            writer.Write(numerosStr);
            writer.Close();
        }
        public static void LeerArchivo(List<int> numeros)
        {
            string path = Directory.GetCurrentDirectory();
            path = path.Replace("bin\\Debug\\net6.0", "");
            StreamReader reader = new StreamReader(path + "numeros.txt");
            string pares = "", impares = "";
            try
            {
                string numerosStr = reader.ReadLine();
                string[] split = numerosStr.Split('-');                
                foreach (string num in split)
                {
                    if (Convert.ToInt32(num)%2 == 0)
                    {
                        pares += num + ",";
                    }
                    else
                    {
                        impares += num + ",";
                    }
                }
                pares = pares.Remove(pares.Length - 1);
                impares = impares.Remove(impares.Length - 1);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
            }
            Console.WriteLine("Números pares: " + pares);
            Console.WriteLine("Números impares: " + impares);
        }
    }
}
