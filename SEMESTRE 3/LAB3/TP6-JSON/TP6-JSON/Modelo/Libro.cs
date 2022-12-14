using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TP6_JSON.Modelo
{
    internal class Libro
    {
        public long id { get; set; }
        public string nombre { get; set; }
        public int anioPublicacion { get; set; }
        public string editorial { get; set; }

        public Libro (long id, string nombre, int anioPublicacion, string editorial)
        {
            this.id = id;
            this.nombre = nombre;
            this.anioPublicacion = anioPublicacion;
            this.editorial = editorial;  
        }

        public Libro() { }
    }
}
