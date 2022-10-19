using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3.JSON
{
    public class Pais
    {
        public long id { get; set; }
        public string nombre { get; set; }
        public int poblacion { get; set; }
        public List<Provincia> provincias{ get; set; }

    }
    public class Provincia
    {
        public long id { get; set; }
        public string nombre { get; set; }
        public double superficie { get; set; }
        public List<Departamento> departamentos { get; set; }

    }
    public class Departamento
    {
        public long id { get; set; }
        public string nombre { get; set; }

    }
}
