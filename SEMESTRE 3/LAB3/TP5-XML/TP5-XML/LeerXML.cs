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
                xDoc.Load(path + "XMLEmpleados.xml");

                XmlNodeList listado = xDoc.GetElementsByTagName("listado");
                XmlNodeList empleados = ((XmlElement)listado[0]).GetElementsByTagName("empleado");

                
                foreach (XmlElement empleado in empleados)
                {
                    int i = 0;

                    XmlNodeList id = empleado.GetElementsByTagName("id");
                    XmlNodeList nombreCompleto = empleado.GetElementsByTagName("nombreCompleto");
                    XmlNodeList cuil = empleado.GetElementsByTagName("cuil");
                    XmlNodeList sector = empleado.GetElementsByTagName("sector");

                 
                    resultado += "Empleado: " + id[i].InnerText + "\n" +
                        "Nombre Completo: " + nombreCompleto[i].InnerText + "\n" +
                        "Cuil: " + cuil[i].InnerText + "\n" +
                        "Sector: " + ((XmlElement)sector[0]).GetAttribute("denominacion")  + "\n\n";

                }
              
            }
            catch (Exception ex)
            {
                return ex.Message + ex.StackTrace;
            }
            return resultado;

        }


    }
}
