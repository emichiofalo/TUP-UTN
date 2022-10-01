using MySql.Data.MySqlClient;

namespace TP6_JSON
{
    internal class Connection
    {
        private string connStr = "server=localhost;user=root;database=TP_Json;port=3306;password=mysql";
        public MySqlConnection myConnection { get; set; }

        public MySqlDataReader RunSqlSelectEscritores()
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT * FROM Escritor";
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
        public MySqlDataReader RunSqlSelectLibros(long id)
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT * FROM Libro WHERE idEscritor = " + id + ";";
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