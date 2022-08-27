using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjercicioD6
{
    internal class Deposito
    {
        public string nombre { get; set; }
        public string domicilio { get; set; }
        public List<Articulo> articulos { get; set; }

        public List<Articulo> ArticulosBajoStock()
        {
            List<Articulo> artBajoStock = new List<Articulo>();
            foreach (Articulo articulo in this.articulos)
            {
                if (articulo.stockTotal <= articulo.stockMinimo)
                {
                    artBajoStock.Add(articulo);
                }
            }
            return artBajoStock;
        }
    }
}
