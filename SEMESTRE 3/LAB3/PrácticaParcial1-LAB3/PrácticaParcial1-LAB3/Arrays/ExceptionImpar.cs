using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3
{
    internal class ExceptionImpar : Exception
    {
        public string mensaje { get; set; }

        public ExceptionImpar(string mensaje)
        {
            this.mensaje = mensaje;
        }

        
    }

    //donde tenga que lanzarse la excepción, uso throw new EjemploException("y mando el mensaje que va a largar la excepción")
    //y en el catch (EjemploExcepcion e) muestro el mensaje de la excepción por consola
}
