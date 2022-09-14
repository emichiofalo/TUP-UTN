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
    class LeerXMLReader
    {
        static void Main(string[] args)
        {
            string xml = leerXML();
            Console.Write(xml);
            Console.ReadLine();
        }

        private static string leerXML()
        {
            string resultado = "";
            string path = Directory.GetCurrentDirectory();
            path = path.Replace("bin\\Debug", "");

            using (XmlReader reader = XmlReader.Create(path + "perls.xml"))
            {
                while (reader.Read())
                {
                    // Only detect start elements.
                    if (reader.IsStartElement())
                    {
                        // Get element name and switch on it.
                        switch (reader.Name)
                        {
                            case "perls":
                                // Detect this element.
                                resultado += "Start <perls> element." + "\n";
                                break;
                            case "autor":
                                // Detect this element.
                                string attCodigo = reader["codigo"];
                                if (attCodigo != null)
                                {
                                    resultado += "  Has attribute name: " + attCodigo + "\n";
                                }
                                resultado += reader.Value.Trim() + "\n";
                                break;
                            case "article":
                                // Detect this article element.
                                resultado += "Start <article> element." + "\n";
                                // Search for the attribute name on this current node.
                                string attribute = reader["name"];
                                if (attribute != null)
                                {
                                    resultado += "  Has attribute name: " + attribute + "\n";
                                }
                                // Next read will contain text.
                                if (reader.Read())
                                {
                                    resultado += "  Text node: " + reader.Value.Trim() + "\n";
                                }
                                break;
                        }
                    }
                }
            }
            return resultado;
        }
    }
}
