using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using MySql.Data.MySqlClient;
using PrácticaParcial1_LAB3.Auxiliar;

namespace PrácticaParcial1_LAB3.XML
{
    internal class Paises
    {
        static Connection con = new Connection();
        static void Main(string[] args)
        {
            string path = Directory.GetCurrentDirectory();
            path = path.Replace("bin\\Debug\\net6.0", "");
            escribirXML(path);
        }

        public static void escribirXML(string ruta)
        {
            XmlTextWriter myXmlTextWriter = new XmlTextWriter(ruta + "XMLPaises.xml", null);
            myXmlTextWriter.Formatting = Formatting.Indented;
            myXmlTextWriter.WriteStartDocument(false);
            try
            {
                MySqlDataReader paises = con.RunSqlSelectPaises();
                myXmlTextWriter.WriteStartElement("paises");
                while (paises.Read())
                {
                    myXmlTextWriter.WriteStartElement("pais");
                    myXmlTextWriter.WriteAttributeString("id", paises.GetInt64(0).ToString());
                    myXmlTextWriter.WriteElementString("nombre", paises.GetString(1));
                    myXmlTextWriter.WriteElementString("poblacion", paises.GetInt32(2).ToString());
                    
                    myXmlTextWriter.WriteStartElement("provincias");
                    MySqlDataReader provincia = con.RunSqlSelectProvincia(paises.GetInt64(0));
                    while (provincia.Read())
                    {
                        myXmlTextWriter.WriteStartElement("provincia");
                        myXmlTextWriter.WriteAttributeString("id", provincia.GetInt64(0).ToString());
                        myXmlTextWriter.WriteElementString("nombre", provincia.GetString(2));
                        myXmlTextWriter.WriteElementString("superficie", provincia.GetDouble(1).ToString());

                        myXmlTextWriter.WriteStartElement("departamentos");
                        MySqlDataReader departamento = con.RunSqlSelectDepartamento(provincia.GetInt64(0));
                        while (departamento.Read())
                        {
                            myXmlTextWriter.WriteStartElement("departamento");
                            myXmlTextWriter.WriteAttributeString("id", departamento.GetInt64(0).ToString());
                            myXmlTextWriter.WriteElementString("nombre", departamento.GetString(1));
                            myXmlTextWriter.WriteEndElement();
                        }
                        myXmlTextWriter.WriteEndElement();
                        myXmlTextWriter.WriteEndElement();
                        myXmlTextWriter.Flush();
                    }
                    myXmlTextWriter.WriteEndElement();
                    myXmlTextWriter.WriteEndElement();
                    myXmlTextWriter.Flush();
                }
                myXmlTextWriter.WriteEndElement();
                myXmlTextWriter.Flush();
                myXmlTextWriter.Close();

                con.CloseConnection();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
