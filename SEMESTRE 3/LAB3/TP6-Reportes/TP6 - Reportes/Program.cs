using System.Diagnostics;
using System.Reflection.Metadata;
using iTextSharp.text;
using iTextSharp.text.pdf;
using MySql.Data.MySqlClient;
using ReporteItext;
using Document = iTextSharp.text.Document;


namespace TP6___Reportes
{
    internal class Program
    {
        static Connection con = new Connection();
        static PrintHelper ph = new PrintHelper();

        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el ID de la orden de la que desea generar el PDF:");
            int idOrden;
            do
            {
                try
                {
                    idOrden = Int32.Parse(Console.ReadLine());
                    break;
                }
                catch (Exception e)
                {
                    Console.WriteLine("Debe ingresar un número de ID válido.");
                }
            } while (true);

            CreatePdfReport(idOrden);

        }

        //string reportName = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.Desktop), "Reporte_orden" + idOrden + ".pdf");

        public static void CreatePdfReport(int idOrden)
        {
            string reportName = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.Desktop), "Reporte_orden" + idOrden + ".pdf");

            iTextSharp.text.Document document = (iTextSharp.text.Document)ph.pdfCreateDocument(
                reportName,
                "-",
                "-",
                "Reporte",
                ("Reporte Orden nº"+idOrden));

            if (document == null) { return; }

            AddHeaderToReport(document);
            AddTablesToReport(document, idOrden);
            ph.CloseDocument(document);
        }

        private static void AddHeaderToReport(iTextSharp.text.Document document)
        {
            iTextSharp.text.pdf.PdfPTable tableHeader = ph.pdfCreateTable(document, 1);
            ph.pdfCellText(document, tableHeader, "REPORTE", 14, true, "Center", 1, iTextSharp.text.BaseColor.LIGHT_GRAY, false);
            ph.pdfAddTable(document, tableHeader);
        }

        private static void AddTablesToReport(iTextSharp.text.Document document, int idOrden)
        {
            ph.pdfAddPara(document, " ");

            MySqlDataReader orden = con.RunSqlSelectOrders(idOrden);
            orden.Read();
            iTextSharp.text.pdf.PdfPTable table1 = ph.pdfCreateTable(document, 2);
            ph.pdfCellText(document, table1, ("REPORTE ORDEN Nº" + orden.GetInt32(0)), 8, false, "Center", 2, iTextSharp.text.BaseColor.LIGHT_GRAY, false);
            ph.pdfCellText(document, table1, ("Fecha Orden: " + orden.GetDateTime(1)), 8, false, "Left", 1, iTextSharp.text.BaseColor.WHITE, false);
            ph.pdfCellText(document, table1, ("Número: " + orden.GetInt32(0)), 8, false, "Left", 1, iTextSharp.text.BaseColor.WHITE, false);
            ph.pdfCellText(document, table1, ("Domicilio: " + orden.GetString(3)), 8, false, "Left", 1, iTextSharp.text.BaseColor.WHITE, false);
            ph.pdfCellText(document, table1, ("Estado/Provincia: " + orden.GetString(5)), 8, false, "Left", 1, iTextSharp.text.BaseColor.WHITE, false);
            ph.pdfCellText(document, table1, ("Región: " + orden.GetString(6)), 8, false, "Left", 1, iTextSharp.text.BaseColor.WHITE, false);
            ph.pdfCellText(document, table1, ("Ciudad:" + orden.GetString(4)), 8, false, "Left", 1, iTextSharp.text.BaseColor.WHITE, false);
            ph.pdfCellText(document, table1, (orden.IsDBNull(7) ? "Tipo Pago: undefined" : ("Tipo Pago: " + orden.GetString(7))), 8, false, "Left", 1, iTextSharp.text.BaseColor.WHITE, false);
            ph.pdfCellText(document, table1, ("Nombre: " + orden.GetString(2)), 8, false, "Left", 1, iTextSharp.text.BaseColor.WHITE, false);
            ph.pdfAddTable(document, table1);

            ph.pdfAddPara(document, " ");
            ph.pdfAddPara(document, " ");

            iTextSharp.text.pdf.PdfPTable table2 = ph.pdfCreateTable(document, 7);
            ph.pdfCellText(document, table2, "DETALLE: ", 8, false, "Left", 7, iTextSharp.text.BaseColor.LIGHT_GRAY, true);
            ph.pdfCellText(document, table2, "CÓDIGO", 8, false, "Left", 1, true);
            ph.pdfCellText(document, table2, "PRODUCTO", 8, false, "Left", 1, true);
            ph.pdfCellText(document, table2, "CATEGORÍA", 8, false, "Left", 1, true);
            ph.pdfCellText(document, table2, "PRECIO", 8, false, "Left", 1, true);
            ph.pdfCellText(document, table2, "CANTIDAD", 8, false, "Left", 1, true);
            ph.pdfCellText(document, table2, "DESCUENTO", 8, false, "Left", 1, true);
            ph.pdfCellText(document, table2, "SUBTOTAL", 8, false, "Left", 1, true);

            double total = 0;
            MySqlDataReader detalles = con.RunSqlSelectOrderDetailsProducts(idOrden);
            while (detalles.Read())
            {
                ph.pdfCellText(document, table2, detalles.GetString(3), 8, false, "Left", 1, true);
                ph.pdfCellText(document, table2, detalles.GetString(4), 8, false, "Left", 1, true);
                ph.pdfCellText(document, table2, detalles.GetString(5), 8, false, "Left", 1, true);
                ph.pdfCellText(document, table2, detalles.GetDouble(1).ToString(), 8, false, "Left", 1, true);
                ph.pdfCellText(document, table2, detalles.GetDouble(0).ToString(), 8, false, "Left", 1, true);
                ph.pdfCellText(document, table2, detalles.GetDouble(2).ToString(), 8, false, "Left", 1, true);
                double subtotal = detalles.GetDouble(1) * detalles.GetDouble(0);
                ph.pdfCellText(document, table2, subtotal.ToString(), 8, false, "Left", 1, true);
                total += subtotal;
            }
            con.CloseConnection();
            ph.pdfCellText(document, table2, ("TOTAL: " + total), 8, false, "Right", 7, iTextSharp.text.BaseColor.WHITE, true);
            ph.pdfAddTable(document, table2);

            ph.pdfAddPara(document, " ");
            ph.pdfAddPara(document, " ");
        }
    }
}