using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace TP6___Reportes
{
    internal class Connection
    {
        private string connStr = "server=localhost;user=root;database=northwind;port=3306;password=mysql";
        public MySqlConnection myConnection { get; set; }

        public MySqlDataReader RunSqlSelectOrders(int idOrden)
        {
            OpenConnection();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            myCommand.Connection = myConnection;
            try
            {
                myCommand.CommandText = "SELECT id, order_date, ship_name, ship_address, ship_city, ship_state_province, ship_country_region, payment_type FROM orders WHERE id="+idOrden+";";
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
