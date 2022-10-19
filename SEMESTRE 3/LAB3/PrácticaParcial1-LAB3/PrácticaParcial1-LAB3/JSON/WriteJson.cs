using MySql.Data.MySqlClient;
using Newtonsoft.Json;
using PrácticaParcial1_LAB3.Auxiliar;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using Formatting = Newtonsoft.Json.Formatting;

namespace PrácticaParcial1_LAB3.JSON
{
    internal class WriteJson
    {
        static Connection con = new Connection();
        static void Main(string[] args)
        {
            string path = Utilidades.GetCurrentDirectory("paises.json");
            string path2 = Utilidades.GetCurrentDirectory("paisesNico.xml");

            MySqlDataReader paises = con.RunSqlSelectPaises();
            List<Pais> listaPaises = LeerPaises(paises);
            EscribirJsonFile(listaPaises, path);
        }
        public static List<Pais> LeerPaises(MySqlDataReader paises)
        {
            List<Pais> listaPaises = new List<Pais>();
            while (paises.Read())
            {
                Pais p = new Pais
                {
                    id = paises.GetInt64(0),
                    nombre = paises.GetString(1),
                    poblacion = paises.GetInt32(2)
                };
                p.provincias = new List<Provincia>();
                MySqlDataReader provincias = con.RunSqlSelectProvincia(p.id);
                while (provincias.Read())
                {
                    Provincia pr = new Provincia
                    {
                        id = provincias.GetInt64(0),
                        nombre = provincias.GetString(2),
                        superficie = provincias.GetDouble(1),
                    };
                    pr.departamentos = new List<Departamento>();
                    MySqlDataReader departamentos = con.RunSqlSelectDepartamento(pr.id);
                    while (departamentos.Read())
                    {
                        Departamento d = new Departamento
                        {
                            id = departamentos.GetInt64(0),
                            nombre = departamentos.GetString(1),
                        };
                        pr.departamentos.Add(d);
                    }
                    p.provincias.Add(pr);
                }
                listaPaises.Add(p);
            }
            return listaPaises;
        }
        public static void EscribirJsonFile(List<Pais> paises, string pathFile)
        {

            string jsonFile = JsonConvert.SerializeObject(paises.ToArray(), Formatting.Indented);
            File.WriteAllText(pathFile, jsonFile);

        }
    }
}