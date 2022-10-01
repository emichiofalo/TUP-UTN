﻿using System;
using System.Collections.Generic;
using System.Text;

namespace ReadWriteJson.Model
{
    public class Domicilio
    {
        public string Calle { get; set; }
        public int NroCalle { get; set; }
        public Ciudad Ciudad { get; set; }


        public string DomicilioCompleto()
        {
            return this.Calle + " " + this.NroCalle + ", " + this.Ciudad.Nombre + ", " + this.Ciudad.Pais.Nombre;
        }
    }
}
