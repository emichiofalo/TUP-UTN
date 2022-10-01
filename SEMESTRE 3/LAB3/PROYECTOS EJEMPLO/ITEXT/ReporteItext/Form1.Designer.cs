namespace ReporteItext
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben eliminar; false en caso contrario, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.btImprimir = new System.Windows.Forms.Button();
            this.btImprimirReporte = new System.Windows.Forms.Button();
            this.btItextReport = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btImprimir
            // 
            this.btImprimir.Location = new System.Drawing.Point(195, 176);
            this.btImprimir.Name = "btImprimir";
            this.btImprimir.Size = new System.Drawing.Size(135, 23);
            this.btImprimir.TabIndex = 0;
            this.btImprimir.Text = "Imprimir 3";
            this.btImprimir.UseVisualStyleBackColor = true;
            this.btImprimir.Click += new System.EventHandler(this.btImprimir_Click);
            // 
            // btImprimirReporte
            // 
            this.btImprimirReporte.Location = new System.Drawing.Point(195, 147);
            this.btImprimirReporte.Name = "btImprimirReporte";
            this.btImprimirReporte.Size = new System.Drawing.Size(135, 23);
            this.btImprimirReporte.TabIndex = 1;
            this.btImprimirReporte.Text = "Imprimir 2";
            this.btImprimirReporte.UseVisualStyleBackColor = true;
            this.btImprimirReporte.Click += new System.EventHandler(this.btImprimirReporte_Click);
            // 
            // btItextReport
            // 
            this.btItextReport.Location = new System.Drawing.Point(195, 118);
            this.btItextReport.Name = "btItextReport";
            this.btItextReport.Size = new System.Drawing.Size(135, 23);
            this.btItextReport.TabIndex = 2;
            this.btItextReport.Text = "Imprimir 1";
            this.btItextReport.UseVisualStyleBackColor = true;
            this.btItextReport.Click += new System.EventHandler(this.btItextReport_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(481, 262);
            this.Controls.Add(this.btItextReport);
            this.Controls.Add(this.btImprimirReporte);
            this.Controls.Add(this.btImprimir);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btImprimir;
        private System.Windows.Forms.Button btImprimirReporte;
        private System.Windows.Forms.Button btItextReport;
    }
}

