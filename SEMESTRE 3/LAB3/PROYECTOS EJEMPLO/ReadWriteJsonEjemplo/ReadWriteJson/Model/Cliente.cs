using System;
using System.Collections.Generic;
using System.Text;

namespace ReadWriteJson.Model
{
    public class Cliente
    {
        public string RazonSocial { get; set; }
        public long Documento { get; set; }
        public Domicilio Domicilio { get; set; }
        public List<Comprobante> Comprobantes { get; set; }
        public DateTime FechaAlta { get; set; }

        
    }
}
