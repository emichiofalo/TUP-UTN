using MySql.Data.MySqlClient;
using MySqlX.XDevAPI.Relational;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TP4_ReadWriteFiles
{
    internal class WriteFile
    {
        static void Main(string[] args)
        {
            Connection conn = new Connection();
            
            try
            {
                MySqlDataReader reader;
                StreamWriter writer = new StreamWriter(@"C:\Users\Emi Chiófalo\Desktop\listaArticulos.txt");
                StringBuilder buffer = new StringBuilder();

                long i = 0;

                buffer.Append("id" + "\t");
                buffer.Append("fecha alta" + "\t");
                buffer.Append("código" + "\t");
                buffer.Append("denominación" + "\t");
                buffer.Append("precio" + "\t");
                buffer.Append("publicado" + "\t");
                buffer.Append("\n");
                int contSalida;

                do
                {
                    contSalida = 0;
                    reader = conn.RunSqlSelect(i, 50);

                    while (reader.Read())
                    {
                        buffer.Append(reader.GetInt32(0));
                        buffer.Append("\t");
                        buffer.Append(reader.GetString(1));
                        buffer.Append("\t");
                        buffer.Append(reader.GetString(2));
                        buffer.Append("\t");
                        buffer.Append(reader.GetString(3));
                        buffer.Append("\t");
                        buffer.Append(reader.GetFloat(4));
                        buffer.Append("\t");
                        buffer.Append(reader.GetChar(5));
                        buffer.Append("\t");
                        buffer.Append("\n");
                        contSalida++;
                    }
                    i += 50;
                    conn.CloseConnection();

                } while (contSalida == 50);
                writer.Write(buffer.ToString());
                writer.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
