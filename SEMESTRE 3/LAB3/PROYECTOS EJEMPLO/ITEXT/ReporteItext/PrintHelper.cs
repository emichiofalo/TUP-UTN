using System;
using System.IO;
using System.Collections.Generic;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using iTextSharp.text;
using iTextSharp.text.pdf;
using iTextSharp.text.html.simpleparser;

namespace ReporteItext
{
    public class PrintHelper
    {
        
        private StyleSheet styles = new StyleSheet();
        private System.Collections.ArrayList objects;


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


        
       
        public void CloseDocument(iTextSharp.text.Document document)
        {
            document.Close();
            document = null;
        }



        
        public void pdfAddPara(iTextSharp.text.Document document, string paraText)
        {
            document.Add(new iTextSharp.text.Paragraph(paraText));
        }




        public iTextSharp.text.pdf.PdfPTable pdfCreateTable(iTextSharp.text.Document document, int Cols)
        {
            iTextSharp.text.pdf.PdfPTable table = new iTextSharp.text.pdf.PdfPTable(Cols);
            table.SpacingBefore = 5;
            table.SpacingAfter = 5;
            return (table);
        }

        public iTextSharp.text.pdf.PdfPTable pdfCreateTable(iTextSharp.text.Document document, int Cols, int HeaderRows)
        {
            iTextSharp.text.pdf.PdfPTable table = new iTextSharp.text.pdf.PdfPTable(Cols);
            table.SpacingBefore = 5;
            table.SpacingAfter = 5;
            table.HeaderRows = HeaderRows;
            return (table);
        }


        public void pdfCellText(iTextSharp.text.Document document, iTextSharp.text.pdf.PdfPTable table, string Text, int FontSize, bool isBold, string alignText, int colSpan, bool useBorder)
        {
            iTextSharp.text.Font UseFont = FontFactory.GetFont(FontFactory.HELVETICA, FontSize, iTextSharp.text.Font.NORMAL);
            iTextSharp.text.Font UseFontBold = FontFactory.GetFont(FontFactory.HELVETICA, FontSize, iTextSharp.text.Font.BOLD);
            Phrase p;
            if (isBold)
            {
                p = new Phrase(Text, UseFontBold);
            }
            else
            {
                p = new Phrase(Text, UseFont);
            }
            iTextSharp.text.pdf.PdfPCell cell = new PdfPCell(p);
            cell.Colspan = colSpan;
            switch (alignText.ToUpper())
            {
                case "LEFT":
                    cell.HorizontalAlignment = Element.ALIGN_LEFT; break;
                case "CENTER":
                    cell.HorizontalAlignment = Element.ALIGN_CENTER; break;
                case "RIGHT":
                    cell.HorizontalAlignment = Element.ALIGN_RIGHT; break;
                default:
                    cell.HorizontalAlignment = Element.ALIGN_LEFT; break;
            }
            if (useBorder)
            {
                cell.BorderWidth = 1;
            }
            else
            {
                cell.BorderWidth = 0;
            }
            table.AddCell(cell);
            cell = null;
        }

        public void pdfCellText(iTextSharp.text.Document document, iTextSharp.text.pdf.PdfPTable table, string Text, int FontSize, bool isBold, string alignText, int colSpan, iTextSharp.text.BaseColor cellColor, bool useBorder)
        {
            iTextSharp.text.Font UseFont = FontFactory.GetFont(FontFactory.HELVETICA, FontSize, iTextSharp.text.Font.NORMAL);
            iTextSharp.text.Font UseFontBold = FontFactory.GetFont(FontFactory.HELVETICA, FontSize, iTextSharp.text.Font.BOLD);
            Phrase p;
            if (isBold)
            {
                p = new Phrase(Text, UseFontBold);
            }
            else
            {
                p = new Phrase(Text, UseFont);
            }
            iTextSharp.text.pdf.PdfPCell cell = new PdfPCell(p);
            cell.Colspan = colSpan;
            switch (alignText.ToUpper())
            {
                case "LEFT":
                    cell.HorizontalAlignment = Element.ALIGN_LEFT; break;
                case "CENTER":
                    cell.HorizontalAlignment = Element.ALIGN_CENTER; break;
                case "RIGHT":
                    cell.HorizontalAlignment = Element.ALIGN_RIGHT; break;
                default:
                    cell.HorizontalAlignment = Element.ALIGN_LEFT; break;
            }
            cell.BackgroundColor = cellColor;
            if (useBorder)
            {
                cell.BorderWidth = 1;
            }
            else
            {
                cell.BorderWidth = 0;
            }
            table.AddCell(cell);
            cell = null;
        }

       
        public void pdfAddTable(iTextSharp.text.Document document, iTextSharp.text.pdf.PdfPTable table)
        {
            document.Add(table);
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

    }
}
