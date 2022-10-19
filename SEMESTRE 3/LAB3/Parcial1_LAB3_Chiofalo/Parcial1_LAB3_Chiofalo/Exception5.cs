using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Parcial1_LAB3_Chiofalo
{
    internal class Exception5 : Exception
    {
        public string mensaje { get; set; }

        public Exception5(string mensaje)
        {
            this.mensaje = mensaje;
        }
    }
}
