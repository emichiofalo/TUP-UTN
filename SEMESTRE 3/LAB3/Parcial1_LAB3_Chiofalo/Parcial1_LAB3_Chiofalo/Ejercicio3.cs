using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TP6___Reportes;

namespace Parcial1_LAB3_Chiofalo
{
    internal class Ejercicio3
    {
        static Connection con = new Connection();
        static void Main(string[] args)
        {
            MySqlDataReader datos = con.RunSqlSelectData();
            Console.WriteLine(Espaciar("id-purchase order") + Espaciar("creation date") + Espaciar("quantity") +
                Espaciar("unit cost") + Espaciar("product code") + Espaciar("product name") + Espaciar("category"));
            while (datos.Read())
            {
                Console.WriteLine(Espaciar(datos.GetInt32(0).ToString()) + Espaciar(datos.GetString(1)) + Espaciar(datos.GetDouble(2).ToString()) +
                Espaciar(datos.GetDouble(3).ToString()) + Espaciar(datos.GetString(4)) + Espaciar(datos.GetString(5)) + Espaciar(datos.GetString(6)));
            }
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
    }
}
