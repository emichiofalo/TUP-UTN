using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial2_Lab3
{
    internal class Cliente
    {

        private long id;
        private string nombre;
        private string apellido;
        private double saldo;
        private string domicilio;
        private long telefono;
        private long cuit;
        public long Id { get => id; set => id = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public string Apellido { get => apellido; set => apellido = value; }
        public double Saldo { get => saldo; set => saldo = value; }
        public string Domicilio { get => domicilio; set => domicilio = value; }
        public long Telefono { get => telefono; set => telefono = value; }
        public long Cuit { get => cuit; set => cuit = value; }

    }
}
