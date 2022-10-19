using PrácticaParcial1_LAB3.Auxiliar;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.util;
using System.Xml;
using System.Xml.Serialization;

namespace PrácticaParcial1_LAB3.XML
{
    internal class XML2Object
    {
        static void Main(string[] args)
        {
            List<Pais> paises = leerXML();
            EscribirArchivo(paises);
        }
        public static List<Pais> leerXML()
        {
            List<Pais> listaPaises = new List<Pais>();
            string path = Utilidades.GetCurrentDirectory("XMLPaises.xml");

            try
            {
                XmlDocument xDoc = new XmlDocument();
                xDoc.Load(path);
                XmlNodeList listapaises = xDoc.GetElementsByTagName("paises");
                XmlNodeList paises = ((XmlElement)listapaises[0]).GetElementsByTagName("pais");

                foreach (XmlElement pais in paises)
                {
                    int i = 0;
                    Pais p = new Pais();
                    p.provincias = new List<Provincia>();

                    string id = pais.GetAttribute("id");
                    XmlNodeList nombre = pais.GetElementsByTagName("nombre");
                    XmlNodeList poblacion = pais.GetElementsByTagName("poblacion");

                    p.id = Convert.ToInt64(id);
                    p.nombre = nombre[0].InnerText.ToString();
                    p.poblacion = Convert.ToInt32(poblacion[0].InnerText.ToString());

                    XmlNodeList listaprovincias = pais.GetElementsByTagName("provincias");
                    XmlNodeList provincias = ((XmlElement)listaprovincias[0]).GetElementsByTagName("provincia");
                    foreach (XmlElement provincia in provincias)
                    {
                        Provincia pr = new Provincia();
                        pr.departamentos = new List<Departamento>();

                        id = provincia.GetAttribute("id");
                        nombre = provincia.GetElementsByTagName("nombre");
                        XmlNodeList superficie = provincia.GetElementsByTagName("superficie");

                        pr.id = Convert.ToInt64(id);
                        pr.nombre = nombre[0].InnerText.ToString();
                        pr.superficie = Convert.ToDouble(superficie[0].InnerText.ToString());

                        XmlNodeList listadepartamentos = provincia.GetElementsByTagName("departamentos");
                        XmlNodeList departamentos = ((XmlElement)listadepartamentos[0]).GetElementsByTagName("departamento");
                        foreach (XmlElement departamento in departamentos)
                        {
                            Departamento d = new Departamento();

                            id = departamento.GetAttribute("id");
                            nombre = departamento.GetElementsByTagName("nombre");

                            d.id = Convert.ToInt64(id);
                            d.nombre = nombre[0].InnerText.ToString();

                            pr.departamentos.Add(d);
                        }
                        p.provincias.Add(pr);
                    }
                    listaPaises.Add(p);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message + ex.StackTrace);
            }
            return listaPaises;
        }
        private static void EscribirArchivo(List<Pais> paises)
        {
            StringBuilder buffer = new StringBuilder();
            string path = Utilidades.GetCurrentDirectory("paisesXML.txt");
            StreamWriter writer = new StreamWriter(path);

            buffer.Append(Utilidades.Espaciar("Pais" + "\t"));
            buffer.Append(Utilidades.Espaciar("Poblacion pais" + "\t"));
            buffer.Append(Utilidades.Espaciar("Provincia" + "\t"));
            buffer.Append(Utilidades.Espaciar("Superficie prov." + "\t"));
            buffer.Append(Utilidades.Espaciar("Departamento prov." + "\t"));
            buffer.Append("\n");

            foreach (Pais p in paises)
            {
                foreach (Provincia pr in p.provincias)
                {
                    foreach (Departamento d in pr.departamentos)
                    {
                        buffer.Append(Utilidades.Espaciar(p.nombre + "\t"));
                        buffer.Append(Utilidades.Espaciar(p.poblacion + "\t"));
                        buffer.Append(Utilidades.Espaciar(pr.nombre + "\t"));
                        buffer.Append(Utilidades.Espaciar(pr.superficie + "\t"));
                        buffer.Append(Utilidades.Espaciar(d.nombre + "\t"));
                        buffer.Append("\n");
                    }
                }
            }

            string bufferStr = buffer.ToString();
            writer.Write(bufferStr);
            writer.Close();
        }
    }
}
