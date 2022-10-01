using Newtonsoft.Json;
using static TP6_JSON.Connection;
using System;
using System.Collections.Generic;
using System.Diagnostics.Metrics;
using System.IO;
using System.Net;
using MySql.Data.MySqlClient;
using TP6_JSON.Modelo;
using MySqlX.XDevAPI.Common;
using TP6_JSON.Modelo_B;
using Result = TP6_JSON.Modelo_B.Result;

namespace TP6_JSON
{
    class Program
    {
        static Connection conn = new Connection();
        static void Main(string[] args)
        {
            string path = @"C:\Users\Emi Chiófalo\Desktop\EscritoresLibros.json";

            //Escribir un JSON
            //MySqlDataReader escritores = conn.RunSqlSelectEscritores();
            //List<Escritor> listaEscritores = LeerEscritores(escritores);
            //EscribirJsonFile(listaEscritores, path);

            //Leer JSON HTTP
            LeerJSONFromURL();

        }

        public static List<Escritor> LeerEscritores(MySqlDataReader escritores) 
        {
            List<Escritor> listaEscritores = new List<Escritor>();
            while (escritores.Read())
            {
                Escritor e = new Escritor
                {
                    id = escritores.GetInt64(0),
                    apellido = escritores.GetString(1),
                    nombre = escritores.GetString(2),
                    dni = escritores.GetInt32(3)
                };
                e.libros = new List<Libro>();
                MySqlDataReader libros = conn.RunSqlSelectLibros(e.id);
                while (libros.Read())
                {
                    Libro l = new Libro
                    {
                        id = libros.GetInt64(0),
                        nombre = libros.GetString(1),
                        anioPublicacion = libros.GetInt32(2),
                        editorial = libros.GetString(3),
                    };
                    e.libros.Add(l);
                }
                listaEscritores.Add(e);
            }
            return listaEscritores;
        }
        public static void EscribirJsonFile(List<Escritor> escritores, string pathFile)
        {

            string jsonFile = JsonConvert.SerializeObject(escritores.ToArray(), Formatting.Indented);
            File.WriteAllText(pathFile, jsonFile);

        }

        public static void LeerJSONFromURL()
        {

            var url = "https://randomuser.me/api/?results=10";

            WebClient wc = new WebClient();
            string urlJason = wc.DownloadString(url);

            var root = JsonConvert.DeserializeObject<Root>(urlJason);

            foreach (Result result in root.results)
            {
                Console.WriteLine("First Name: " + result.name.first);
                Console.WriteLine("Last Name: " + result.name.last);
                Console.WriteLine("Username Login: " + result.login.username);
                Console.WriteLine("Password: " + result.login.password);
                Console.WriteLine("-----------------------------");
            }

        }

    }
}