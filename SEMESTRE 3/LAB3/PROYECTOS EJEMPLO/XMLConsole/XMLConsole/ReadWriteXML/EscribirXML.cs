using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Linq;
using System.IO;

namespace ReadWriteXML
{
    class EscribirXML
    {

        static void Main(string[] args)
        {
            CrearDocumentoXML();
        }
        protected static void CrearDocumentoXML()
        {
            try
            {
                XElement alumnos = new XElement("Alumnos");

                XElement alumno = new XElement("Alumno");
                XAttribute nroControl = new XAttribute("NoControl", "05231104");
                alumno.Add(nroControl);
                XElement nombre = new XElement("Nombre", "Edison García");
                alumno.Add(nombre);
                XElement semestre = new XElement("Semestre", "7");
                alumno.Add(semestre);
                alumnos.Add(alumno);

                alumno = new XElement("Alumno");
                nroControl = new XAttribute("NoControl", "05231106");
                alumno.Add(nroControl);
                nombre = new XElement("Nombre", "Abraham Gomez García");
                alumno.Add(nombre);
                semestre = new XElement("Semestre", "9");
                alumno.Add(semestre);
                alumnos.Add(alumno);

                alumno = new XElement("Alumno");
                nroControl = new XAttribute("NoControl", "05231108");
                alumno.Add(nroControl);
                nombre = new XElement("Nombre", "Alejandro Carvajal");
                alumno.Add(nombre);
                semestre = new XElement("Semestre", "7");
                alumno.Add(semestre);
                alumnos.Add(alumno);

                alumno = new XElement("Alumno");
                nroControl = new XAttribute("NoControl", "06231110");
                alumno.Add(nroControl);
                nombre = new XElement("Nombre", "Luis Armando");
                alumno.Add(nombre);
                semestre = new XElement("Semestre", "10");
                alumno.Add(semestre);
                alumnos.Add(alumno);

                XDeclaration declaration = new XDeclaration("1.0", "utf-8", "yes");
                XComment comentario = new XComment("Lista de Alumnos");
                XDocument miXML = new XDocument(declaration, comentario, alumnos);

                
                string path = Directory.GetCurrentDirectory();
                path = path.Replace("bin\\Debug", "");
                string archivoXML = path + "miXMLAlumnos.xml";
                miXML.Save(@archivoXML);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

        }
    }
}
