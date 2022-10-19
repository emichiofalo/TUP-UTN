using MySqlX.XDevAPI.Common;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3.JSON
{
    internal class Instrumentos
    {
        static void Main(string[] args)
        {
            LeerJSONFromURL();

        }

        public static void LeerJSONFromURL()
        {

            var url = "http://168.194.207.98/test/instrumentos.json";

            WebClient wc = new WebClient();
            string urlJason = wc.DownloadString(url);

            var root = JsonConvert.DeserializeObject<Root>(urlJason);

            foreach (Instrumento instrumento in root.instrumentos)
            {
                Console.WriteLine("Instrumento: " + instrumento.instrumento);
                Console.WriteLine("Id: " + instrumento.id);
                Console.WriteLine("Marca: " + instrumento.marca);
                Console.WriteLine("Modelo: " + instrumento.modelo);
                Console.WriteLine("Imagen: " + instrumento.imagen);
                Console.WriteLine("Precio: " + instrumento.precio);
                Console.WriteLine("Costo Envio: " + instrumento.costoEnvio);
                Console.WriteLine("Cantidad Vendida: " + instrumento.cantidadVendida);
                Console.WriteLine("Descripcion: " + instrumento.descripcion);
                Console.WriteLine();
                Console.WriteLine("-----------------------------");
                Console.WriteLine();
            }

        }
    }
}
