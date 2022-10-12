using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace PrácticaParcial1_LAB3
{
    internal class ReadWrite
    {
        //READ FILE
        //StreamReader reader = new StreamReader(@"C:\Users\Emi Chiófalo\Desktop\listaArticulos.txt");          //archivo que voy a leer
        //string linea = reader.ReadLine();                                                                     //leo línea por línea el archivo y lo manipulo
        //reader.Close();                                                                                       //cierro el reader

        //WRITE FILE
        //MySqlDataReader reader;                                                                               //leo la info de la BD
        //reader = conn.RunSqlSelect(i, 50);                                                                    //query de select, itero sobre lo de la BD con un while reader.Read()
        //StreamWriter writer = new StreamWriter(@"C:\Users\Emi Chiófalo\Desktop\listaArticulos.txt");          //archivo al que voy a escribir
        //writer.Write(buffer.ToString());                                                                      //mando un string, no un stringbuilder
        //writer.Close();                                                                                       //cierro el writer

        public static void EscribirObjetoXML<T>(T objecto, string ruta)
        {
            System.Xml.Serialization.XmlSerializer x = new System.Xml.Serialization.XmlSerializer(objecto.GetType());
            XmlWriterSettings settings = new XmlWriterSettings();
            settings.Indent = true;
            settings.IndentChars = "\t";
            XmlWriter writer = XmlWriter.Create(ruta, settings);
            x.Serialize(writer, objecto);
        }

    }
}
