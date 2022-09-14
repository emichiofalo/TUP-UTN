using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TP4_ReadWriteFiles
{
    internal class ReadFile
    {
        static void Main(string[] args)
        {
            Connection conn = new Connection();
            
            try
            {
                StreamReader reader = new StreamReader(@"C:\Users\Emi Chiófalo\Desktop\listaArticulos.txt");
                string linea = reader.ReadLine();
                linea = reader.ReadLine();
                while (linea != null)
                {
                    string querystr = "";
                    StringBuilder query = new StringBuilder();
                    query.Append("INSERT IGNORE INTO articulo_copy (fechaAlta, codigo, denominacion, precio, publicado) VALUES ");
                    for (int i = 0; i < 50; i++)
                    {
                        if (linea != null)
                        {
                            string[] split = linea.Split('\t');
                            
                            query.Append("(\"" + FormatoFecha(split[1]) + "\", \"" + split[2] + "\", \"" + split[3] + "\", " + split[4].Replace(',','.') + ",\"" + split[5] + "\"),");
                                                        
                            linea = reader.ReadLine();
                        }
                        else
                        {
                            break;
                        }
                    }
                    querystr = query.ToString();
                    querystr = querystr.Remove(querystr.Length-1);
                    querystr += ";";
                    conn.RunSqlInsert(querystr);
                    conn.CloseConnection();
                    query.Clear();
                }
                
                reader.Close();
            }
            catch (Exception ex)
            {
                Console.Write(ex.StackTrace);
            }
        }

        public static string FormatoFecha (string fecha)
        {
            Convert.ToDateTime(fecha);
            return DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss");
        }
    }
}
