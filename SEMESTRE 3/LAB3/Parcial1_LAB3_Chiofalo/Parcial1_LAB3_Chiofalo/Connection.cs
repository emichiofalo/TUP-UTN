using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace TP6___Reportes
{
    internal class Connection
    {
        private string connStr = "server=localhost;user=root;database=northwind;port=3306;password=mysql";
        public MySqlConnection myConnection { get; set; }

        public MySqlDataReader RunSqlSelectData()
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT po.id, po.`creation_date`, pod.quantity, pod.unit_cost, p.product_code, p.`product_name`, p.`category` FROM purchase_order_details AS pod INNER JOIN purchase_orders AS po ON pod.`purchase_order_id`= po.`id` INNER JOIN products AS p ON pod.`product_id`= p.id;";
                MySqlDataReader reader = myCommand.ExecuteReader();
                return reader;
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception de tipo " + e.GetType());
                Console.WriteLine(e.StackTrace);
                return null;
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
