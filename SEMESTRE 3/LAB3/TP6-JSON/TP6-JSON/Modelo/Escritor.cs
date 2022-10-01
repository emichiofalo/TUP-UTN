using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TP6_JSON.Modelo
{
    internal class Escritor
    {
        public long id { get; set; }
        public string apellido { get; set; }
        public string nombre { get; set; }
        public int dni { get; set; }
        public List<Libro> libros { get; set; }

        public Escritor(long id, string apellido, string nombre, int dni)
        {
            this.id = id;
            this.apellido = apellido;
            this.nombre = nombre;
            this.dni = dni;
        }   

        public Escritor() { }
    }
}
