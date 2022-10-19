using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3.JSON
{
    public class Instrumento
    {
        public string id { get; set; }
        public string instrumento { get; set; }
        public string marca { get; set; }
        public string modelo { get; set; }
        public string imagen { get; set; }
        public string precio { get; set; }
        public string costoEnvio { get; set; }
        public string cantidadVendida { get; set; }
        public string descripcion { get; set; }
    }

    public class Root
    {
        public List<Instrumento> instrumentos { get; set; }
    }

}
