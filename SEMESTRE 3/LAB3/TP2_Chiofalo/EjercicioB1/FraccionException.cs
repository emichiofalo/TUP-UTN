using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjercicioB1
{
    internal class FraccionException : Exception
    {
        public string mensaje { get; set; }

        public FraccionException(string mensaje)
        {
            this.mensaje = mensaje;
        }

    }
}
