using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjercicioD6
{
    internal class Articulo
    {
        public string codigo { get; set; }
        public double stockTotal { get; set; }
        public double stockMinimo { get; set; }
        public Deposito deposito { get; set; }

    }
}
