using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using PrácticaParcial1_LAB3.Auxiliar;

namespace PrácticaParcial1_LAB3.ReadWriteFiles
{
    internal class PracticaRead1
    {
        static void Main(string[] args)
        {
            try
            {
                string path = Directory.GetCurrentDirectory();
                path = path.Replace("bin\\Debug\\net6.0", "");
                StreamReader reader = new StreamReader(path + "archivo.txt");
                string datos = reader.ReadLine();
                string[] split = datos.Split('#');
                foreach (string s in split)
                {
                    string[] split2 = s.Split(',');
                    foreach(string s2 in split2)
                    {
                        Console.Write(Utilidades.Espaciar(s2));
                    }
                    Console.WriteLine();
                }
                reader.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
            }
            
        }
        

    }
}
