using MySqlX.XDevAPI.Common;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace Parcial1_LAB3_Chiofalo
{
    internal class Ejercicio4
    {
        static void Main(string[] args)
        {
            LeerJSONFromURL();
        }
        public static void LeerJSONFromURL()
        {
            var url = "http://168.194.207.98:8081/json/lista_heroes.php";

            WebClient wc = new WebClient();
            string urlJason = wc.DownloadString(url);
          
            var heroes = JsonConvert.DeserializeObject<List<Heroe>>(urlJason);

            foreach (Heroe h in heroes)
            {
                Console.WriteLine("Id: " + h.id);
                Console.WriteLine("Nombre: " + h.nombre);
                Console.WriteLine("Poderes: " + h.poderes.ToString());
                Console.WriteLine("Bio: " + h.bio);
                Console.WriteLine("Img: " + h.img);
                Console.WriteLine("Aparicion: " + h.aparicion);
                Console.WriteLine("Casa: " + h.casa);
                Console.WriteLine("-----------------------------");
            }

        }
    }
}
