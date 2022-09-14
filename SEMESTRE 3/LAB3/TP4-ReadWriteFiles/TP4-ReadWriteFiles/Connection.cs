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
        private string connStr = "server=localhost;user=root;database=utn;port=3306;password=mysql";
        public MySqlConnection myConnection { get; set; }
        
        public MySqlDataReader RunSqlSelect(long x, int y)
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

        public void RunSqlInsert(string query)
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

        public void OpenConnection()
        {
            this.myConnection = new MySqlConnection(this.connStr);
        }

        public void CloseConnection()
        {
            this.myConnection.Close();
        }

    }
}
