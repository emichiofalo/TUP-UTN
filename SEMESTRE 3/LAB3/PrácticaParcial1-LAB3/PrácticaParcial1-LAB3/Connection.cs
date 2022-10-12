using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TP4_ReadWriteFiles
{
    internal class Connection
    {
        private string connStr = "server=localhost;user=root;database=utn;port=3306;password=mysql";    //cambiar el nombre de la base de datos
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
            this.myConnection = new MySqlConnection(this.connStr);
        }

        public void CloseConnection()
        {
            this.myConnection.Close();
        }


        //"SELECT * FROM Libro WHERE idEscritor = " + id + ";"
    }
}
