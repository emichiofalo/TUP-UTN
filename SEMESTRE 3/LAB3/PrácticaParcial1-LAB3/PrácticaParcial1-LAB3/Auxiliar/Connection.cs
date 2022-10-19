using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3.Auxiliar
{
    internal class Connection
    {
        private string connStr = "server=localhost;user=root;database=paises;port=3306;password=mysql";    //cambiar el nombre de la base de datos
        public MySqlConnection myConnection { get; set; }

        public MySqlDataReader RunSqlSelectWithLimit(long x, int y)                                    //cerrar la conexión en el main  
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT * FROM articulo LIMIT " + x + ", " + y + ";";
                MySqlDataReader reader = myCommand.ExecuteReader();
                Console.WriteLine("Query exitosa.");
                return reader;
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception de tipo " + e.GetType());
                Console.WriteLine(e.StackTrace);
                return null;
            }
        }

        public void RunSqlInsert(string query)                                                          //recibe la query que va a ejecutar
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            MySqlTransaction myTrans;
            myTrans = myConnection.BeginTransaction();
            myCommand.Connection = myConnection;
            myCommand.Transaction = myTrans;
            try
            {
                myCommand.CommandText = query;
                myCommand.ExecuteNonQuery();
                myTrans.Commit();
            }
            catch (Exception e)
            {
                try
                {
                    myTrans.Rollback();
                }
                catch (MySqlException ex)
                {
                    if (myTrans.Connection != null)
                    {
                        Console.WriteLine("Exception de tipo " + ex.GetType() +
                        " al ejecutar el roll back de la transaction.");
                    }
                }
                Console.WriteLine("Exception de tipo " + e.GetType() +
                " mientras se insertaban los datos.");
            }
        }

        //GENERAR LA QUERY PARA EL MÉTODO ANTERIOR EN EL MAIN
        //string querystr = "";
        //StringBuilder query = new StringBuilder();
        //query.Append("INSERT IGNORE INTO articulo_copy (fechaAlta, codigo, denominacion, precio, publicado) VALUES ");
        //query.Append("(\"" + FormatoFecha(split[1]) + "\", \"" + split[2] + "\", \"" + split[3] + "\", " + split[4].Replace(',','.') + ",\"" + split[5] + "\"),");  //split=línea del read del archivo 
        //querystr = query.ToString();                        //no puedo pasar un stringbuilder, tiene que ser string la query
        //querystr = querystr.Remove(querystr.Length-1);
        //querystr += ";";
        //conn.RunSqlInsert(querystr);                        //mando la query que generé
        //conn.CloseConnection();
        //query.Clear();

        public void OpenConnection()
        {
            myConnection = new MySqlConnection(connStr);
        }

        public void CloseConnection()
        {
            myConnection.Close();
        }

        public MySqlDataReader RunSqlSelectOrders(int idOrden)
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT id, order_date, ship_name, ship_address, ship_city, ship_state_province, ship_country_region, payment_type FROM orders WHERE id=" + idOrden + ";";
                MySqlDataReader reader = myCommand.ExecuteReader();
                Console.WriteLine("Query exitosa.");
                return reader;
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception de tipo " + e.GetType());
                Console.WriteLine(e.StackTrace);
                return null;
            }
        }

        public MySqlDataReader RunSqlSelectOrderDetailsProducts(int idOrden)
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT quantity, unit_price, discount, product_code, product_name, category FROM order_details JOIN products ON products.id=order_details.`product_id` WHERE order_details.order_id=" + idOrden + ";";
                MySqlDataReader reader = myCommand.ExecuteReader();
                Console.WriteLine("Query exitosa.");
                return reader;
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception de tipo " + e.GetType());
                Console.WriteLine(e.StackTrace);
                return null;
            }
        }

        //"SELECT * FROM Libro WHERE idEscritor = " + id + ";"
        //"SELECT quantity, unit_price, discount, product_code, product_name, category FROM order_details JOIN products ON products.id=order_details.`product_id` WHERE order_details.order_id=" + idOrden + ";";

        public MySqlDataReader RunSqlSelectPaises()
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT * FROM Pais;";
                MySqlDataReader reader = myCommand.ExecuteReader();
                Console.WriteLine("Query exitosa.");
                return reader;
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception de tipo " + e.GetType());
                Console.WriteLine(e.StackTrace);
                return null;
            }
        }
        public MySqlDataReader RunSqlSelectProvincia(long idPais)
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT * FROM provincia WHERE provincia.`idPais`=" + idPais + ";";
                MySqlDataReader reader = myCommand.ExecuteReader();
                Console.WriteLine("Query exitosa.");
                return reader;
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception de tipo " + e.GetType());
                Console.WriteLine(e.StackTrace);
                return null;
            }
        }
        public MySqlDataReader RunSqlSelectDepartamento(long idProvincia)
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT * FROM departamento WHERE departamento.`idProvincia`=" + idProvincia + ";";
                MySqlDataReader reader = myCommand.ExecuteReader();
                Console.WriteLine("Query exitosa.");
                return reader;
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception de tipo " + e.GetType());
                Console.WriteLine(e.StackTrace);
                return null;
            }
        }
    }
}
