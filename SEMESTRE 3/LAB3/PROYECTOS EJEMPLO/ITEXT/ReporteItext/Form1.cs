using System;
using System.IO;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using iTextSharp.text;
using iTextSharp.text.pdf;
using iTextSharp.text.html;
using iTextSharp.text.html.simpleparser;
using iTextSharp.text.xml;
using System.Diagnostics;

namespace ReporteItext
{
    public partial class Form1 : Form
    {

        private PrintHelper ph;

        public Form1()
        {
            InitializeComponent();
        }

        private void btImprimir_Click(object sender, EventArgs e)
        {
            ph = new PrintHelper();
            CreatePdfReport();
            ph = null;
        }

       
        private void CreatePdfReport()
        {
            string docName = "ReporteEjemplo.pdf";
            string reportName = ph.BuildReportName(docName);

            iTextSharp.text.Document document = (iTextSharp.text.Document)ph.pdfCreateDocument(
                reportName,
                "Luis",
                "Pdro",
                "ppp",
                "pppe");

            if (document == null) { return; }

            AddHeaderToReport(document);
            AddTablesToReport(document);
            ph.CloseDocument(document);
            ph.ShowDocument(reportName);
        }

        private void AddHeaderToReport(iTextSharp.text.Document document)
        {
            iTextSharp.text.pdf.PdfPTable tableHeader = ph.pdfCreateTable(document, 1);
            ph.pdfCellText(document, tableHeader, "Mi primer Reporte ITEXT", 14, true, "Center", 1, iTextSharp.text.BaseColor.LIGHT_GRAY, false);
            ph.pdfAddTable(document, tableHeader);
            ph.pdfAddPara(document, "ESTO ES UN PARRAFO");
        }

        public iTextSharp.text.Document pdfCreateDocument(string docName, string Creator, string Author, string Subject, string Title)
        {
            iTextSharp.text.Document document = new iTextSharp.text.Document();
            try
            {
                PdfWriter.GetInstance(document, new FileStream(docName, FileMode.Create));
                document.AddCreator(Creator);
                document.AddAuthor(Author);
                document.AddSubject(Subject);
                document.AddTitle(Title);
                document.Open();
                return (document);
            }
            catch (DocumentException de)
            {
                MessageBox.Show("Document exception creating PDF document: " + de.ToString());
                return (null);
            }
            catch (IOException ioe)
            {
                MessageBox.Show("I/O exception creating PDF document: " + ioe.ToString());
                return (null);
            }
            catch (Exception exc)
            {
                MessageBox.Show("Exception creating PDF document:" + exc.ToString());
                return (null);
            }
        }

        public string BuildReportName(string docName)
        {
            string appPath;
            string reportName;
            appPath = Environment.CurrentDirectory + "\\";
            reportName = appPath + docName;
            return reportName;
        }

        public void ShowDocument(string docName)
        {
            System.Diagnostics.Process myProcess = new System.Diagnostics.Process();
            try
            {
                myProcess.StartInfo.FileName = docName;
                myProcess.Start();
            }
            catch (Exception e)
            {
                MessageBox.Show("Cannot start process: " + e.ToString());
            }
            myProcess.Dispose();
        }

        private void AddTablesToReport(iTextSharp.text.Document document)
        {
            ph.pdfAddPara(document, "Sample of Tables in a Report", "Left");
            ph.pdfAddPara(document, " ");

            // A sample table with 2 columns and 5 rows to demonstrate some iTextSharp features
            iTextSharp.text.pdf.PdfPTable table1 = ph.pdfCreateTable(document, 2);
            ph.pdfCellText(document, table1, "Sample Table 1", 8, false, "Center", 2, iTextSharp.text.BaseColor.LIGHT_GRAY, false);
            ph.pdfCellText(document, table1, "Subject: Example of 5X2 Table", 8, false, "Left", 2, iTextSharp.text.BaseColor.CYAN, false);
            ph.pdfCellText(document, table1, "Catagory: General Information", 8, false, "Left", 1, iTextSharp.text.BaseColor.CYAN, false);
            ph.pdfCellText(document, table1, "Archived: No", 8, false, "Left", 1, iTextSharp.text.BaseColor.CYAN, false);
            ph.pdfCellText(document, table1, "Added: 3/4/2010", 8, false, "Left", 1, iTextSharp.text.BaseColor.CYAN, false);
            ph.pdfCellText(document, table1, "By: KLM", 8, false, "Left", 1, iTextSharp.text.BaseColor.CYAN, false);
            ph.pdfCellText(document, table1, "Updated: 3/4/2010", 8, false, "Left", 1, iTextSharp.text.BaseColor.CYAN, false);
            ph.pdfCellText(document, table1, "By: KLM", 8, false, "Left", 1, iTextSharp.text.BaseColor.CYAN, false);
            ph.pdfAddTable(document, table1);

            ph.pdfAddPara(document, " ");
            ph.pdfAddPara(document, " ");

            // A sample table with 5 columns and 3 rows to demonstrate some iTextSharp features
            iTextSharp.text.pdf.PdfPTable table2 = ph.pdfCreateTable(document, 5);
            ph.pdfCellText(document, table2, "Sample Table 2", 8, false, "Center", 5, iTextSharp.text.BaseColor.LIGHT_GRAY, true);

            ph.pdfCellText(document, table2, "Cell 1/1", 8, false, "Left", 1, true);
            ph.pdfCellText(document, table2, "Cell 1/2", 8, false, "Center", 1, true);
            ph.pdfCellText(document, table2, "Cell 1/3", 8, false, "Right", 1, true);
            ph.pdfCellText(document, table2, "Cell 1/4", 8, false, "Center", 1, true);
            ph.pdfCellText(document, table2, "Cell 1/5", 8, false, "Left", 1, true);

            ph.pdfCellText(document, table2, "Cell 2/1", 8, false, "Left", 1, true);
            ph.pdfCellText(document, table2, "Cell 2/2", 8, false, "Center", 1, true);
            ph.pdfCellText(document, table2, "Cell 2/3", 8, false, "Right", 1, true);
            ph.pdfCellText(document, table2, "Cell 2/4", 8, false, "Center", 1, true);
            ph.pdfCellText(document, table2, "Cell 2/5", 8, false, "Left", 1, true);

            ph.pdfCellText(document, table2, "Cell 3/1", 8, false, "Left", 1, true);
            ph.pdfCellText(document, table2, "Cell 3/2", 8, false, "Center", 1, true);
            ph.pdfCellText(document, table2, "Cell 3/3", 8, false, "Right", 1, true);
            ph.pdfCellText(document, table2, "Cell 3/4", 8, false, "Center", 1, true);
            ph.pdfCellText(document, table2, "Cell 3/5", 8, false, "Left", 1, true);

            ph.pdfAddTable(document, table2);

            ph.pdfAddPara(document, " ");
            ph.pdfAddPara(document, " ");
            ph.pdfAddPara(document, " ");
        }

        

        

        private DataTable CreateSampleTable()
        {

            //System.Globalization.CultureInfo culture = new System.Globalization.CultureInfo("is-IS");
            System.Globalization.CultureInfo culture = new System.Globalization.CultureInfo("en-US");

            // Create table
            DataTable Sample = new DataTable("Sample");
            // add columns to table
            DataColumn cResourceName = new DataColumn("ResourceName", Type.GetType("System.String"));
            Sample.Columns.Add(cResourceName);
            DataColumn cTaskDescription = new DataColumn("TaskDescription", Type.GetType("System.String"));
            Sample.Columns.Add(cTaskDescription);
            DataColumn cStartDate = new DataColumn("StartDate", Type.GetType("System.DateTime"));
            Sample.Columns.Add(cStartDate);
            DataColumn cEndDate = new DataColumn("EndDate", Type.GetType("System.DateTime"));
            Sample.Columns.Add(cEndDate);

            // Populate the rows
            DataRow newRow1;
            newRow1 = Sample.NewRow();
            newRow1[cResourceName] = "Jim Smith";
            newRow1[cTaskDescription] = "Custom Programming";
            newRow1[cStartDate] = Convert.ToDateTime("2010-6-14 08:00:00", culture);
            newRow1[cEndDate] = Convert.ToDateTime("2010-6-14 17:00:00", culture);
            Sample.Rows.Add(newRow1);

            DataRow newRow2;
            newRow2 = Sample.NewRow();
            newRow2[cResourceName] = "Jim Smith";
            newRow2[cTaskDescription] = "Custom Programming";
            newRow2[cStartDate] = Convert.ToDateTime("2010-6-15 08:00:00", culture);
            newRow2[cEndDate] = Convert.ToDateTime("2010-6-15 17:00:00", culture);
            Sample.Rows.Add(newRow2);

            DataRow newRow3;
            newRow3 = Sample.NewRow();
            newRow3[cResourceName] = "Jim Smith";
            newRow3[cTaskDescription] = "Custom Programming";
            newRow3[cStartDate] = Convert.ToDateTime("2010-6-16 08:00:00", culture);
            newRow3[cEndDate] = Convert.ToDateTime("2010-6-16 17:00:00", culture);
            Sample.Rows.Add(newRow3);

            DataRow newRow4;
            newRow4 = Sample.NewRow();
            newRow4[cResourceName] = "Jim Smith";
            newRow4[cTaskDescription] = "Custom Programming";
            newRow4[cStartDate] = Convert.ToDateTime("2010-6-17 08:00:00", culture);
            newRow4[cEndDate] = Convert.ToDateTime("2010-6-17 17:00:00", culture);
            Sample.Rows.Add(newRow4);

            DataRow newRow5;
            newRow5 = Sample.NewRow();
            newRow5[cResourceName] = "Jim Smith";
            newRow5[cTaskDescription] = "Custom Programming";
            newRow5[cStartDate] = Convert.ToDateTime("2010-6-18 08:00:00", culture);
            newRow5[cEndDate] = Convert.ToDateTime("2010-6-18 17:00:00", culture);
            Sample.Rows.Add(newRow5);

            DataRow newRow6;
            newRow6 = Sample.NewRow();
            newRow6[cResourceName] = "Jim Smith";
            newRow6[cTaskDescription] = "Custom Programming";
            newRow6[cStartDate] = Convert.ToDateTime("2010-6-21 08:00:00", culture);
            newRow6[cEndDate] = Convert.ToDateTime("2010-6-21 17:00:00", culture);
            Sample.Rows.Add(newRow6);

            DataRow newRow7;
            newRow7 = Sample.NewRow();
            newRow7[cResourceName] = "Jim Smith";
            newRow7[cTaskDescription] = "Custom Programming";
            newRow7[cStartDate] = Convert.ToDateTime("2010-6-22 08:00:00", culture);
            newRow7[cEndDate] = Convert.ToDateTime("2010-6-22 17:00:00", culture);
            Sample.Rows.Add(newRow7);

            DataRow newRow8;
            newRow8 = Sample.NewRow();
            newRow8[cResourceName] = "Jim Smith";
            newRow8[cTaskDescription] = "Custom Programming";
            newRow8[cStartDate] = Convert.ToDateTime("2010-6-23 08:00:00", culture);
            newRow8[cEndDate] = Convert.ToDateTime("2010-6-23 17:00:00", culture);
            Sample.Rows.Add(newRow8);

            DataRow newRow9;
            newRow9 = Sample.NewRow();
            newRow9[cResourceName] = "Jim Smith";
            newRow9[cTaskDescription] = "Custom Programming";
            newRow9[cStartDate] = Convert.ToDateTime("2010-6-24 08:00:00", culture);
            newRow9[cEndDate] = Convert.ToDateTime("2010-6-24 17:00:00", culture);
            Sample.Rows.Add(newRow9);

            DataRow newRow9a;
            newRow9a = Sample.NewRow();
            newRow9a[cResourceName] = "Bill Wilson";
            newRow9a[cTaskDescription] = "Unit Testing";
            newRow9a[cStartDate] = Convert.ToDateTime("2010-6-24 10:00:00", culture);
            newRow9a[cEndDate] = Convert.ToDateTime("2010-6-24 13:00:00", culture);
            Sample.Rows.Add(newRow9a);

            DataRow newRow10;
            newRow10 = Sample.NewRow();
            newRow10[cResourceName] = "Jim Smith";
            newRow10[cTaskDescription] = "Custom Programming";
            newRow10[cStartDate] = Convert.ToDateTime("2010-6-25 08:00:00", culture);
            newRow10[cEndDate] = Convert.ToDateTime("2010-6-25 17:00:00", culture);
            Sample.Rows.Add(newRow10);

            DataRow newRow10a;
            newRow10a = Sample.NewRow();
            newRow10a[cResourceName] = "Bill Wilson";
            newRow10a[cTaskDescription] = "Unit Testing";
            newRow10a[cStartDate] = Convert.ToDateTime("2010-6-25 10:00:00", culture);
            newRow10a[cEndDate] = Convert.ToDateTime("2010-6-25 13:00:00", culture);
            Sample.Rows.Add(newRow10a);

            DataRow newRow11;
            newRow11 = Sample.NewRow();
            newRow11[cResourceName] = "Jim Smith";
            newRow11[cTaskDescription] = "Custom Programming";
            newRow11[cStartDate] = Convert.ToDateTime("2010-6-28 08:00:00", culture);
            newRow11[cEndDate] = Convert.ToDateTime("2010-6-28 17:00:00", culture);
            Sample.Rows.Add(newRow11);

            DataRow newRow11a;
            newRow11a = Sample.NewRow();
            newRow11a[cResourceName] = "Bill Wilson";
            newRow11a[cTaskDescription] = "Unit Testing";
            newRow11a[cStartDate] = Convert.ToDateTime("2010-6-28 10:00:00", culture);
            newRow11a[cEndDate] = Convert.ToDateTime("2010-6-28 13:00:00", culture);
            Sample.Rows.Add(newRow11a);

            DataRow newRow12;
            newRow12 = Sample.NewRow();
            newRow12[cResourceName] = "Jim Smith";
            newRow12[cTaskDescription] = "Custom Programming";
            newRow12[cStartDate] = Convert.ToDateTime("2010-6-29 08:00:00", culture);
            newRow12[cEndDate] = Convert.ToDateTime("2010-6-29 17:00:00", culture);
            Sample.Rows.Add(newRow12);

            DataRow newRow12a;
            newRow12a = Sample.NewRow();
            newRow12a[cResourceName] = "Bill Wilson";
            newRow12a[cTaskDescription] = "Unit Testing";
            newRow12a[cStartDate] = Convert.ToDateTime("2010-6-29 10:00:00", culture);
            newRow12a[cEndDate] = Convert.ToDateTime("2010-6-29 13:00:00", culture);
            Sample.Rows.Add(newRow12a);

            DataRow newRow13;
            newRow13 = Sample.NewRow();
            newRow13[cResourceName] = "Jim Smith";
            newRow13[cTaskDescription] = "Custom Programming";
            newRow13[cStartDate] = Convert.ToDateTime("2010-6-30 08:00:00", culture);
            newRow13[cEndDate] = Convert.ToDateTime("2010-6-30 17:00:00", culture);
            Sample.Rows.Add(newRow13);

            DataRow newRow13a;
            newRow13a = Sample.NewRow();
            newRow13a[cResourceName] = "Bill Wilson";
            newRow13a[cTaskDescription] = "Unit Testing";
            newRow13a[cStartDate] = Convert.ToDateTime("2010-6-30 10:00:00", culture);
            newRow13a[cEndDate] = Convert.ToDateTime("2010-6-30 13:00:00", culture);
            Sample.Rows.Add(newRow13a);

            DataRow newRow14;
            newRow14 = Sample.NewRow();
            newRow14[cResourceName] = "Jim Smith";
            newRow14[cTaskDescription] = "Custom Programming";
            newRow14[cStartDate] = Convert.ToDateTime("2010-7-1 08:00:00", culture);
            newRow14[cEndDate] = Convert.ToDateTime("2010-7-1 17:00:00", culture);
            Sample.Rows.Add(newRow14);

            DataRow newRow15;
            newRow15 = Sample.NewRow();
            newRow15[cResourceName] = "Jim Smith";
            newRow15[cTaskDescription] = "Custom Programming";
            newRow15[cStartDate] = Convert.ToDateTime("2010-7-2 08:00:00", culture);
            newRow15[cEndDate] = Convert.ToDateTime("2010-7-2 17:00:00", culture);
            Sample.Rows.Add(newRow15);

            DataRow newRow16;
            newRow16 = Sample.NewRow();
            newRow16[cResourceName] = "Jim Smith";
            newRow16[cTaskDescription] = "Custom Programming";
            newRow16[cStartDate] = Convert.ToDateTime("2010-7-6 08:00:00", culture);
            newRow16[cEndDate] = Convert.ToDateTime("2010-7-6 17:00:00", culture);
            Sample.Rows.Add(newRow16);

            DataRow newRow16a;
            newRow16a = Sample.NewRow();
            newRow16a[cResourceName] = "Bill Wilson";
            newRow16a[cTaskDescription] = "Unit Testing";
            newRow16a[cStartDate] = Convert.ToDateTime("2010-7-6 10:00:00", culture);
            newRow16a[cEndDate] = Convert.ToDateTime("2010-7-6 13:00:00", culture);
            Sample.Rows.Add(newRow16a);

            DataRow newRow17;
            newRow17 = Sample.NewRow();
            newRow17[cResourceName] = "Jim Smith";
            newRow17[cTaskDescription] = "Custom Programming";
            newRow17[cStartDate] = Convert.ToDateTime("2010-7-7 08:00:00", culture);
            newRow17[cEndDate] = Convert.ToDateTime("2010-7-7 17:00:00", culture);
            Sample.Rows.Add(newRow17);

            DataRow newRow17a;
            newRow17a = Sample.NewRow();
            newRow17a[cResourceName] = "Bill Wilson";
            newRow17a[cTaskDescription] = "Unit Testing";
            newRow17a[cStartDate] = Convert.ToDateTime("2010-7-7 10:00:00", culture);
            newRow17a[cEndDate] = Convert.ToDateTime("2010-7-7 13:00:00", culture);
            Sample.Rows.Add(newRow17a);

            DataRow newRow18;
            newRow18 = Sample.NewRow();
            newRow18[cResourceName] = "Jim Smith";
            newRow18[cTaskDescription] = "Custom Programming";
            newRow18[cStartDate] = Convert.ToDateTime("2010-7-8 08:00:00", culture);
            newRow18[cEndDate] = Convert.ToDateTime("2010-7-8 17:00:00", culture);
            Sample.Rows.Add(newRow18);

            DataRow newRow18a;
            newRow18a = Sample.NewRow();
            newRow18a[cResourceName] = "Bill Wilson";
            newRow18a[cTaskDescription] = "Unit Testing";
            newRow18a[cStartDate] = Convert.ToDateTime("2010-7-8 10:00:00", culture);
            newRow18a[cEndDate] = Convert.ToDateTime("2010-7-8 13:00:00", culture);
            Sample.Rows.Add(newRow18a);

            DataRow newRow18b;
            newRow18b = Sample.NewRow();
            newRow18b[cResourceName] = "Scott Drew";
            newRow18b[cTaskDescription] = "Documentation";
            newRow18b[cStartDate] = Convert.ToDateTime("2010-7-8 08:00:00", culture);
            newRow18b[cEndDate] = Convert.ToDateTime("2010-7-8 12:00:00", culture);
            Sample.Rows.Add(newRow18b);

            DataRow newRow19;
            newRow19 = Sample.NewRow();
            newRow19[cResourceName] = "Jim Smith";
            newRow19[cTaskDescription] = "Custom Programming";
            newRow19[cStartDate] = Convert.ToDateTime("2010-7-9 08:00:00", culture);
            newRow19[cEndDate] = Convert.ToDateTime("2010-7-9 17:00:00", culture);
            Sample.Rows.Add(newRow19);

            DataRow newRow19a;
            newRow19a = Sample.NewRow();
            newRow19a[cResourceName] = "Bill Wilson";
            newRow19a[cTaskDescription] = "Unit Testing";
            newRow19a[cStartDate] = Convert.ToDateTime("2010-7-9 10:00:00", culture);
            newRow19a[cEndDate] = Convert.ToDateTime("2010-7-9 13:00:00", culture);
            Sample.Rows.Add(newRow19a);

            DataRow newRow19b;
            newRow19b = Sample.NewRow();
            newRow19b[cResourceName] = "Scott Drew";
            newRow19b[cTaskDescription] = "Documentation";
            newRow19b[cStartDate] = Convert.ToDateTime("2010-7-9 08:00:00", culture);
            newRow19b[cEndDate] = Convert.ToDateTime("2010-7-9 12:00:00", culture);
            Sample.Rows.Add(newRow19b);

            DataRow newRow20;
            newRow20 = Sample.NewRow();
            newRow20[cResourceName] = "Jim Smith";
            newRow20[cTaskDescription] = "Custom Programming";
            newRow20[cStartDate] = Convert.ToDateTime("2010-7-12 08:00:00", culture);
            newRow20[cEndDate] = Convert.ToDateTime("2010-7-12 17:00:00", culture);
            Sample.Rows.Add(newRow20);

            DataRow newRow20b;
            newRow20b = Sample.NewRow();
            newRow20b[cResourceName] = "Scott Drew";
            newRow20b[cTaskDescription] = "Documentation";
            newRow20b[cStartDate] = Convert.ToDateTime("2010-7-12 08:00:00", culture);
            newRow20b[cEndDate] = Convert.ToDateTime("2010-7-12 12:00:00", culture);
            Sample.Rows.Add(newRow20b);

            DataRow newRow21;
            newRow21 = Sample.NewRow();
            newRow21[cResourceName] = "Jim Smith";
            newRow21[cTaskDescription] = "Custom Programming";
            newRow21[cStartDate] = Convert.ToDateTime("2010-7-13 08:00:00", culture);
            newRow21[cEndDate] = Convert.ToDateTime("2010-7-13 17:00:00", culture);
            Sample.Rows.Add(newRow21);

            DataRow newRow21b;
            newRow21b = Sample.NewRow();
            newRow21b[cResourceName] = "Scott Drew";
            newRow21b[cTaskDescription] = "Documentation";
            newRow21b[cStartDate] = Convert.ToDateTime("2010-7-13 08:00:00", culture);
            newRow21b[cEndDate] = Convert.ToDateTime("2010-7-13 12:00:00", culture);
            Sample.Rows.Add(newRow21b);

            DataRow newRow22;
            newRow22 = Sample.NewRow();
            newRow22[cResourceName] = "Jim Smith";
            newRow22[cTaskDescription] = "Custom Programming";
            newRow22[cStartDate] = Convert.ToDateTime("2010-7-14 08:00:00", culture);
            newRow22[cEndDate] = Convert.ToDateTime("2010-7-14 17:00:00", culture);
            Sample.Rows.Add(newRow22);

            DataRow newRow23;
            newRow23 = Sample.NewRow();
            newRow23[cResourceName] = "Jim Smith";
            newRow23[cTaskDescription] = "Custom Programming";
            newRow23[cStartDate] = Convert.ToDateTime("2010-7-15 08:00:00", culture);
            newRow23[cEndDate] = Convert.ToDateTime("2010-7-15 17:00:00", culture);
            Sample.Rows.Add(newRow23);

            DataRow newRow24;
            newRow24 = Sample.NewRow();
            newRow24[cResourceName] = "Jim Smith";
            newRow24[cTaskDescription] = "Custom Programming";
            newRow24[cStartDate] = Convert.ToDateTime("2010-7-16 08:00:00", culture);
            newRow24[cEndDate] = Convert.ToDateTime("2010-7-16 17:00:00", culture);
            Sample.Rows.Add(newRow24);

            DataRow newRow25;
            newRow25 = Sample.NewRow();
            newRow25[cResourceName] = "Jim Smith";
            newRow25[cTaskDescription] = "Custom Programming";
            newRow25[cStartDate] = Convert.ToDateTime("2010-7-19 08:00:00", culture);
            newRow25[cEndDate] = Convert.ToDateTime("2010-7-19 17:00:00", culture);
            Sample.Rows.Add(newRow25);

            DataRow newRow26;
            newRow26 = Sample.NewRow();
            newRow26[cResourceName] = "Jim Smith";
            newRow26[cTaskDescription] = "Custom Programming";
            newRow26[cStartDate] = Convert.ToDateTime("2010-7-20 08:00:00", culture);
            newRow26[cEndDate] = Convert.ToDateTime("2010-7-20 17:00:00", culture);
            Sample.Rows.Add(newRow26);

            DataRow newRow27;
            newRow27 = Sample.NewRow();
            newRow27[cResourceName] = "Jim Smith";
            newRow27[cTaskDescription] = "Custom Programming";
            newRow27[cStartDate] = Convert.ToDateTime("2010-7-21 08:00:00", culture);
            newRow27[cEndDate] = Convert.ToDateTime("2010-7-21 17:00:00", culture);
            Sample.Rows.Add(newRow27);

            DataRow newRow28;
            newRow28 = Sample.NewRow();
            newRow28[cResourceName] = "Jim Smith";
            newRow28[cTaskDescription] = "Custom Programming";
            newRow28[cStartDate] = Convert.ToDateTime("2010-7-22 08:00:00", culture);
            newRow28[cEndDate] = Convert.ToDateTime("2010-7-22 17:00:00", culture);
            Sample.Rows.Add(newRow28);

            DataRow newRow29;
            newRow29 = Sample.NewRow();
            newRow29[cResourceName] = "Jim Smith";
            newRow29[cTaskDescription] = "Custom Programming";
            newRow29[cStartDate] = Convert.ToDateTime("2010-7-23 08:00:00", culture);
            newRow29[cEndDate] = Convert.ToDateTime("2010-7-23 17:00:00", culture);
            Sample.Rows.Add(newRow29);

            DataRow newRow30;
            newRow30 = Sample.NewRow();
            newRow30[cResourceName] = "Jim Smith";
            newRow30[cTaskDescription] = "Custom Programming";
            newRow30[cStartDate] = Convert.ToDateTime("2010-7-26 08:00:00", culture);
            newRow30[cEndDate] = Convert.ToDateTime("2010-7-26 17:00:00", culture);
            Sample.Rows.Add(newRow30);

            return Sample;
        }

        private void PrintSampleTable(DataTable Sample, iTextSharp.text.Document document)
        {
            // A table with 4 columns and 2 header rows
            iTextSharp.text.pdf.PdfPTable tableTasks = ph.pdfCreateTable(document, 4, 2);
            ph.pdfCellText(document, tableTasks, "Sample Table for Calendars", 10, false, "Center", 4, iTextSharp.text.BaseColor.YELLOW, true);
            ph.pdfCellText(document, tableTasks, "Resource", 8, false, "Center", 1, iTextSharp.text.BaseColor.LIGHT_GRAY, true);
            ph.pdfCellText(document, tableTasks, "Description", 8, false, "Center", 1, iTextSharp.text.BaseColor.LIGHT_GRAY, true);
            ph.pdfCellText(document, tableTasks, "Start Time", 8, false, "Center", 1, iTextSharp.text.BaseColor.LIGHT_GRAY, true);
            ph.pdfCellText(document, tableTasks, "End Time", 8, false, "Center", 1, iTextSharp.text.BaseColor.LIGHT_GRAY, true);

            foreach (System.Data.DataRow row in Sample.Rows)
            {
                ph.pdfCellText(document, tableTasks, Convert.ToString(row["ResourceName"]), 8, false, "Left", 1, true);
                ph.pdfCellText(document, tableTasks, Convert.ToString(row["TaskDescription"]), 8, false, "Left", 1, true);
                ph.pdfCellText(document, tableTasks, Convert.ToString(row["StartDate"]), 8, false, "Center", 1, true);
                ph.pdfCellText(document, tableTasks, Convert.ToString(row["EndDate"]), 8, false, "Center", 1, true);
            }

            ph.pdfAddTable(document, tableTasks);
            ph.pdfAddPara(document, " ");
            ph.pdfAddPara(document, " ");
            ph.pdfAddPara(document, " ");
        }

        private Dictionary<string, Dictionary<string, List<string>>> aggregateCalender(DataTable table)
        {
            /// <summary>
            /// Aggregates items from a data table into a Dictionary of calendars
            /// </summary>
            /// 
            /// <remarks>
            /// <para>
            /// This method returns a dictionary where:
            /// 
            ///     Key = type string with a value of "yyyy-mm'; a new calendar should be created
            ///           for every entry in the dictionary.
            ///                 
            ///     Value = another dictionary for items to be printed in the calendar:
            ///     
            ///             Key = string date of the items in the format "yyyy/MM/d"
            ///                   
            ///             Value = type List<string> which contains a list of items to print for that day.
            ///             
            ///     Note:   With collections, do not use "Clear()" method since all items in the collections
            ///             (meaning multiple collections) are cleared, and previous collections will also
            ///             be cleared.  This is why a new collection is instantiated when dates change.
            ///             
            ///     Note:   printCalendar expects day as a string without leading zeros.
            ///     
            ///     Note:   The table passed to this routine is expected to be sorted by the start date/time, 
            ///             and that start date/time and end date/time are of the same date.  You will have
            ///             to adjust the routines to handle schedules that span multiple days.
            ///             
            ///     Note:   This routine could be generalized in a class of its own, but you will need to handle
            ///             the specific column names in the table that you want to inspect and manipulate.
            ///             
            /// </para>
            /// </remarks>
            /// 

            Dictionary<string, Dictionary<string, List<string>>> calendars = new Dictionary<string, Dictionary<string, List<string>>>();

            string resourceName = string.Empty;
            string taskDescription = string.Empty;
            DateTime startDate = DateTime.MinValue;
            DateTime endDate = DateTime.MinValue;

            string currMonth = string.Empty;
            Int32 currDay = 0;                          // Day values are used as integers, eventually cast to a string but without leading zeros
            string currYear = string.Empty;
            string currStartHour = string.Empty;
            string currStartMinute = string.Empty;
            string currEndHour = string.Empty;
            string currEndMinute = string.Empty;

            string saveMonth = string.Empty;
            Int32 saveDay = 0;
            string saveYear = string.Empty;

            string itemDescription = string.Empty;

            string calendarKey = string.Empty;

            string dayKey = string.Empty;

            Int32 rowCount = 0;

            Dictionary<string, List<string>> monthItems = new Dictionary<string, List<string>>();
            List<string> items = new List<string>();

            foreach (System.Data.DataRow row in table.Rows)
            {
                resourceName = Convert.ToString(row["ResourceName"]);
                taskDescription = Convert.ToString(row["TaskDescription"]);
                startDate = Convert.ToDateTime(row["StartDate"]);
                endDate = Convert.ToDateTime(row["EndDate"]);

                currMonth = startDate.ToString("MM");
                currDay = Convert.ToInt32(startDate.ToString("dd"));
                currYear = startDate.ToString("yyyy");
                currStartHour = startDate.ToString("HH");
                currStartMinute = startDate.ToString("mm");
                currEndHour = endDate.ToString("HH");
                currEndMinute = endDate.ToString("mm");

                if (rowCount == 0) // First row in table, default save Month, Day, Year
                {
                    saveMonth = currMonth;
                    saveDay = currDay;
                    saveYear = currYear;
                }

                if (currYear != saveYear || currMonth != saveMonth) // Create calendar entry
                {
                    dayKey = saveYear + "/" + saveMonth + "/" + Convert.ToString(saveDay);
                    monthItems.Add(dayKey, items);
                    calendarKey = saveYear + "-" + saveMonth;
                    calendars.Add(calendarKey, monthItems);
                    monthItems = new Dictionary<string, List<string>>();
                    items = new List<string>();
                }

                if (currDay != saveDay) // Create a new day of items for the current day
                {
                    dayKey = saveYear + "/" + saveMonth + "/" + Convert.ToString(saveDay);
                    monthItems.Add(dayKey, items);
                    items = new List<string>();
                }

                // Save the description to print in the calendar
                itemDescription = resourceName + " " + currStartHour + ":" + currStartMinute + " - " + currEndHour + ":" + currEndMinute;
                items.Add(itemDescription);

                // Save the current date for the next iteration
                saveMonth = currMonth;
                saveDay = currDay;
                saveYear = currYear;

                ++rowCount;
            }

            if (rowCount > 0) // Save data from the last pass through the table, unless the table was empty
            {
                dayKey = saveYear + "/" + saveMonth + "/" + Convert.ToString(saveDay);
                monthItems.Add(dayKey, items);
                calendarKey = saveYear + "-" + saveMonth;
                calendars.Add(calendarKey, monthItems);
            }

            return calendars;
        }

        private void btImprimirReporte_Click(object sender, EventArgs e)
        {
            try
            {

                //This is the absolute path to the PDF that we will create
                string outputFile = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.Desktop), "Sample2.pdf");

                //Create a standard .Net FileStream for the file, setting various flags
                using (FileStream fs = new FileStream(outputFile, FileMode.Create, FileAccess.Write, FileShare.None))
                {
                    //Create a new PDF document setting the size to A4
                    using (Document doc = new Document(PageSize.A4))
                    {
                        //Bind the PDF document to the FileStream using an iTextSharp PdfWriter
                        using (PdfWriter w = PdfWriter.GetInstance(doc, fs))
                        {
                            w.PageEvent = new PDFFooter();
                            //Open the document for writing
                            doc.Open();

                            PdfPTable tab = new PdfPTable(3);
                            PdfPCell cell = new PdfPCell(new Phrase("Header"));
                            cell.Colspan = 3;
                            cell.HorizontalAlignment = 1; //0=Left, 1=Centre, 2=Right
                            //Style
                            cell.BorderColor = new BaseColor(System.Drawing.Color.Red);
                            cell.Border = iTextSharp.text.Rectangle.BOTTOM_BORDER;
                            cell.BorderWidthBottom = 3f;
                            tab.AddCell(cell);
                            //row 1
                            tab.AddCell("R1C1");
                            tab.AddCell("R1C2");
                            tab.AddCell("R1C3");
                            //row 2
                            tab.AddCell("R2C1");
                            tab.AddCell("R2C2");
                            tab.AddCell("R2C3");
                            cell = new PdfPCell();
                            cell.Colspan = 3;
                            iTextSharp.text.List pdfList = new List(List.UNORDERED);
                            pdfList.Add(new iTextSharp.text.ListItem(new Phrase("Unorder List 1")));
                            pdfList.Add("Unorder List 2");
                            pdfList.Add("Unorder List 3");
                            pdfList.Add("Unorder List 4");
                            cell.AddElement(pdfList);
                            tab.AddCell(cell);
                            doc.Add(tab);

                            //Close our document
                            doc.Close();
                        }
                    }
                }

                this.Close();
                Process mydoc = new Process();
                mydoc.StartInfo.FileName = outputFile;
                mydoc.Start();
            }
            catch (Exception ex)
            {
                Console.Write(ex.StackTrace);

            }
            
            
            
        }

        private void btItextReport_Click(object sender, EventArgs e)
        {
            try { 
           
            //This is the absolute path to the PDF that we will create
            string outputFile = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.Desktop), "Sample.pdf");

            //Create a standard .Net FileStream for the file, setting various flags
            using (FileStream fs = new FileStream(outputFile, FileMode.Create, FileAccess.Write, FileShare.None))
            {
                //Create a new PDF document setting the size to A4
                using (Document doc = new Document(PageSize.A4))
                {
                    //Bind the PDF document to the FileStream using an iTextSharp PdfWriter
                    using (PdfWriter w = PdfWriter.GetInstance(doc, fs))
                    {
                        //Open the document for writing
                        doc.Open();

                        //Create a table with two columns
                        PdfPTable t = new PdfPTable(2);

                        //Borders are drawn by the individual cells, not the table itself.
                        //Tell the default cell that we do not want a border drawn
                        t.DefaultCell.Border = 0;

                        //Add four cells. Cells are added starting at the top left of the table working left to right first, then down
                        t.AddCell("R1C1");
                        t.AddCell("R1C2");
                        t.AddCell("R2C1");
                        t.AddCell("R2C2");

                        //Add the table to our document
                        doc.Add(t);

                        //Close our document
                        doc.Close();
                    }
                }
            }

            this.Close();
            Process mydoc = new Process();
            mydoc.StartInfo.FileName = outputFile;
            mydoc.Start();
            }
            catch (Exception ex)
            {
                Console.Write(ex.StackTrace);
                   
            }
        }
    }
}
