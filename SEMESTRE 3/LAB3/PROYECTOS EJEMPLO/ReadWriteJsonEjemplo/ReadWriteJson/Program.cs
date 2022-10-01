using Newtonsoft.Json;
using ReadWriteJson.Model;
using ReadWriteJson.ModeloPaises;
using System;
using System.Collections.Generic;
using System.IO;
using System.Net;

namespace ReadWriteJson
{
    class Program
    {
        static void Main(string[] args)
        {
            string path = @"C:\Users\Emi Chiófalo\Desktop\doc.json";

            //1- Escribir un JSON
            //List<Cliente> clientes = GetClientes();
            //EscribirJsonFile(clientes, path);

            //2- Leer un JSON
            //string clientes = GetJsonFile(path);
            //LeerJson(clientes);

            //3- Leer Json Sin Modelo
            //string clientes = GetJsonFile(path);
            //LeerJsonSinModelo(clientes);

            //4- Leer JSON HTTP
            LeerJSONFromURL();

        }

        #region EscrituraJSON
        public static void EscribirJsonFile(List<Cliente> clientes, string pathFile)
        {

            string jsonFile = JsonConvert.SerializeObject(clientes.ToArray(), Formatting.Indented);

            File.WriteAllText(pathFile, jsonFile);


        }

        public static List<Cliente> GetClientes()
        {

            List<Cliente> clientes = new List<Cliente> {
                new Cliente
                {
                    RazonSocial = "Juan Perez",
                    Documento = 28123456,
                    FechaAlta = new DateTime(1981,10,12),
                    Domicilio = new Domicilio
                    {
                        Calle = "Salta",
                        NroCalle = 125,
                        Ciudad = new Ciudad
                        {
                            Nombre = "Mendoza",
                            Pais = new Pais
                            {
                                Codigo = "1",
                                Nombre = "Argentina"
                            }
                        }
                    },
                    Comprobantes = new List<Comprobante>{
                        new Comprobante{ NroComprobante = "2019-123456",Total = 1250.25 },
                        new Comprobante{ NroComprobante = "2019-456789",Total = 2500.75 },
                        new Comprobante{ NroComprobante = "2020-455887",Total = 5500.75 },
                        new Comprobante{ NroComprobante = "2020-852963",Total = 3550.45 }
                    }
                },
                new Cliente
                {
                    RazonSocial = "Luis Andrada",
                    Documento = 11528963,
                    FechaAlta = new DateTime(1975,11,25),
                    Domicilio = new Domicilio
                    {
                        Calle = "Lavalle",
                        NroCalle = 1599,
                        Ciudad = new Ciudad
                        {
                            Nombre = "Cordoba",
                            Pais = new Pais
                            {
                                Codigo = "1",
                                Nombre = "Argentina"
                            }
                        }
                    },
                    Comprobantes = new List<Comprobante>{
                        new Comprobante{ NroComprobante = "2019-963258",Total = 2250.25 },
                        new Comprobante{ NroComprobante = "2019-741258",Total = 2200.75 },
                        new Comprobante{ NroComprobante = "2020-852588",Total = 4450.45 }
                    }
                },
                new Cliente
                {
                    RazonSocial = "Santiago Silva",
                    Documento = 33456987,
                    FechaAlta = new DateTime(1985,10,26),
                    Domicilio = new Domicilio
                    {
                        Calle = "San Martin",
                        NroCalle = 258963,
                        Ciudad = new Ciudad
                        {
                            Nombre = "San Luis",
                            Pais = new Pais
                            {
                                Codigo = "1",
                                Nombre = "Argentina"
                            }
                        }
                    },
                    Comprobantes = new List<Comprobante>{
                        new Comprobante{ NroComprobante = "2019-789987",Total = 5250.25 },
                        new Comprobante{ NroComprobante = "2019-456654",Total = 4500.75 },
                        new Comprobante{ NroComprobante = "2020-321223",Total = 6550.45 }
                    }
                }

            };

            return clientes;
        }
        #endregion


        #region LecturaJson
        public static string GetJsonFile(string pathFile)
        {

            string clientesDelJson;
            using (var reader = new StreamReader(pathFile))
            {
                clientesDelJson = reader.ReadToEnd();
            }
            return clientesDelJson;
        }

        public static void LeerJson(string txtJson)
        {

            Console.WriteLine(txtJson);

            List<Cliente> clientes = JsonConvert.DeserializeObject<List<Cliente>>(txtJson);
            foreach (Cliente cliente in clientes)
            {

                Console.WriteLine(cliente.RazonSocial);
                Console.WriteLine("Documento: " + cliente.Documento);
                Console.WriteLine(cliente.Domicilio.DomicilioCompleto());
                Console.WriteLine("----- Facturas ------");
                double totalComp = 0;
                foreach (Comprobante comp in cliente.Comprobantes) {
                    Console.WriteLine(comp.NroComprobante);
                    Console.WriteLine(comp.Total);
                    totalComp += comp.Total;
                }
                Console.WriteLine("Total Comprobantes: " + totalComp);
                Console.WriteLine("-----------------------");

            }


        }
        #endregion

        #region Leer Sin Modelo
        public static void LeerJsonSinModelo(string txtJson)
        {

            JsonTextReader readerJson = new JsonTextReader(new StringReader(txtJson));

            while (readerJson.Read())
            {
                if (readerJson.Value != null)
                {
                    Console.WriteLine("TOKEN Con Valor " + readerJson.TokenType + ", Valor " + readerJson.Value);
                }
                else
                {
                    Console.WriteLine("TOKEN Sin Valor " + readerJson.TokenType);
                }
            }

        }
        #endregion

        #region Leer JSON URL
        public static void LeerJSONFromURL()
        {

            var url = "https://restcountries.com/v2/regionalbloc/eu";

            WebClient wc = new WebClient();
            string paisesJson = wc.DownloadString(url);

            var paises = JsonConvert.DeserializeObject<List<Country>>(paisesJson);

            foreach (Country pais in paises) {
                Console.WriteLine("Pais: " + pais.name);
                Console.WriteLine("Población: " + pais.population);
                Console.WriteLine("Capital: " + pais.capital);
                foreach (Language idioma in pais.languages) {
                    Console.WriteLine("Idioma: " + idioma.name);
                }
                Console.WriteLine("-----------------------------");
            }

      
        } 
        #endregion

    }
}
