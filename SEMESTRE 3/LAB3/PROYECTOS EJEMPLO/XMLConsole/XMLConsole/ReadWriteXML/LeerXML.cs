using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;
using System.Xml;
using System.IO;

namespace ReadWriteXML
{
    class LeerXML
    {

        static void Main(string[] args)
        {
            string xml = leerXML();
            Console.Write(xml);
            Console.ReadLine();
        }

        public static string leerXML()
        {
            string resultado = "";
            string path = Directory.GetCurrentDirectory();
            path = path.Replace("bin\\Debug", "");

            try
            {

                XmlDocument xDoc = new XmlDocument();
                xDoc.Load(path + "XMLPersonas.xml");
                XmlNodeList personas = xDoc.GetElementsByTagName("personas");
                XmlNodeList lista = ((XmlElement)personas[0]).GetElementsByTagName("persona");

                foreach (XmlElement nodo in lista)
                {

                    int i = 0;

                    string dni = nodo.GetAttribute("dni");
                    if (dni != null && dni != "")
                    {
                        resultado += dni;
                    }

                    XmlNodeList nNombre =
                    nodo.GetElementsByTagName("nombre");

                    XmlNodeList nApellido1 =
                    nodo.GetElementsByTagName("apellido1");

                    XmlNodeList nApellido2 =
                    nodo.GetElementsByTagName("apellido2");

                    resultado += "Elemento nombre " + nNombre[i].InnerText + " " + 
                        nApellido1[i].InnerText + " " +
                        nApellido2[i++].InnerText + "\n";

                }
            }
            catch (Exception ex)
            {
                return ex.Message;
            }
            return resultado;

        }


    }
}
