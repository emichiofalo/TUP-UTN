using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;
using System.IO;
using System.Xml;

namespace ReadWriteXML
{
    class EscribirXMLWriter
    {
        static void Main(string[] args)
        {
            string path = Directory.GetCurrentDirectory();
            path = path.Replace("bin\\Debug", "");
            escribirXML(path);
        }

        public static void escribirXML(string ruta)
        {
            XmlTextWriter myXmlTextWriter = new XmlTextWriter(ruta + "newbooks.xml", null);
            myXmlTextWriter.Formatting = Formatting.Indented;
            myXmlTextWriter.WriteStartDocument(false);
            myXmlTextWriter.WriteComment("Esto es un comentario");

            myXmlTextWriter.WriteStartElement("bookstore");
            myXmlTextWriter.WriteStartElement("book", null);

            myXmlTextWriter.WriteElementString("title", null, "The Autobiography of Mark Twain");
            myXmlTextWriter.WriteStartElement("Author", null);

            myXmlTextWriter.WriteElementString("first-name", "Mark");
            myXmlTextWriter.WriteElementString("last-name", "Twain");
            myXmlTextWriter.WriteEndElement();
            myXmlTextWriter.WriteElementString("price", "7.99");
            myXmlTextWriter.WriteEndElement();

            myXmlTextWriter.Flush();
            myXmlTextWriter.WriteStartElement("book", null);
            myXmlTextWriter.WriteAttributeString("genre", "autobiography");
            myXmlTextWriter.WriteAttributeString("publicationdate", "1979");
            myXmlTextWriter.WriteAttributeString("ISBN", "0-7356-0562-9");
            myXmlTextWriter.WriteEndElement();
            myXmlTextWriter.WriteEndElement();

            myXmlTextWriter.Flush();
            myXmlTextWriter.Close();
            // Console.ReadLine();
        }
    }
}
