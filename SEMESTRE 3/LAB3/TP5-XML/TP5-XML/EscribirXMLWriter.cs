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
            XmlTextWriter myXmlTextWriter = new XmlTextWriter(ruta + "XMLWriterSEmpleados.xml", null);
            myXmlTextWriter.Formatting = Formatting.Indented;
            myXmlTextWriter.WriteStartDocument(false);

            myXmlTextWriter.WriteStartElement("empleados");
            myXmlTextWriter.WriteStartElement("listado");

            myXmlTextWriter.WriteStartElement("empleado");
            myXmlTextWriter.WriteElementString("id", "4884");
            myXmlTextWriter.WriteElementString("nombreCompleto", "Rodriguez Victor");
            myXmlTextWriter.WriteElementString("cuil", "20103180326");
            myXmlTextWriter.WriteStartElement("sector");
            myXmlTextWriter.WriteAttributeString("denominacion", "Gerencia Recursos Humanos");
            myXmlTextWriter.WriteAttributeString("id", "137");
            myXmlTextWriter.WriteAttributeString("valorSemaforo", "130.13");
            myXmlTextWriter.WriteAttributeString("colorSemaforo", "VERDE");
            myXmlTextWriter.WriteEndElement();
            myXmlTextWriter.WriteElementString("cupoAsignado", "1837.15");
            myXmlTextWriter.WriteElementString("cupoConsumido", "658.02");
            myXmlTextWriter.WriteEndElement();

            myXmlTextWriter.Flush();

            myXmlTextWriter.WriteStartElement("empleado");
            myXmlTextWriter.WriteElementString("id", "1225");
            myXmlTextWriter.WriteElementString("nombreCompleto", "Sanchez Juan Ignacio");
            myXmlTextWriter.WriteElementString("cuil", "20271265817");
            myXmlTextWriter.WriteStartElement("sector");
            myXmlTextWriter.WriteAttributeString("denominacion", "Gerencia Operativa");
            myXmlTextWriter.WriteAttributeString("id", "44");
            myXmlTextWriter.WriteAttributeString("valorSemaforo", "130.13");
            myXmlTextWriter.WriteAttributeString("colorSemaforo", "ROJO");
            myXmlTextWriter.WriteEndElement();
            myXmlTextWriter.WriteElementString("cupoAsignado", "750.87");
            myXmlTextWriter.WriteElementString("cupoConsumido", "625.46");
            myXmlTextWriter.WriteEndElement();

            myXmlTextWriter.WriteEndElement();
            myXmlTextWriter.Flush();

            myXmlTextWriter.WriteElementString("subsectores", "5");
            myXmlTextWriter.WriteElementString("totalCupoAsignadoSector", "4217.21");
            myXmlTextWriter.WriteElementString("totalCupoConsumidoSector", "33.34");

            myXmlTextWriter.WriteEndElement();

            myXmlTextWriter.Flush();
            myXmlTextWriter.Close();
            // Console.ReadLine();
        }
    }
}
