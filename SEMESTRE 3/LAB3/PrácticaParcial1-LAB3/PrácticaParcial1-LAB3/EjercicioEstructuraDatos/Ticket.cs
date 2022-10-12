using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3.EjercicioEstructuraDatos
{
    internal class Ticket
    {
        static List<ItemArticulo> listaArticulos = new List<ItemArticulo>();
        static string[,] articulos = { { "100", "Gaseosa", "120" }, { "150", "Fideos", "50" }, { "200", "Arroz", "60" },
        { "250", "Harina", "55" }, { "300", "Lavandina", "70" }, { "350", "Café", "200" }, { "400", "Azúcar", "120" },
        { "450", "Yerba", "80" }, { "500", "Té", "90" }, { "550", "Docena de Huevos", "160" } };        
        static void Main(string[] args)
        {
            do
            {
                Console.WriteLine("Ingrese el código del artículo: ");
                string cod = Console.ReadLine();
                BuscarArticulo(cod);
            } while (Continuar());
            ImprimirTicket();
        }

        public static void BuscarArticulo(string cod)
        {
            Boolean found = false;
            for (int i = 0; i < articulos.GetLength(0); i++)
            {
                if (articulos[i,0].Equals(cod))
                {
                    ItemArticulo articulo = new ItemArticulo(Convert.ToInt32(articulos[i, 0]), articulos[i, 1], Convert.ToDouble(articulos[i, 2]));
                    found = true;
                    CantidadArticulo(articulo);
                }
            }
            if (!found)
            {
                Console.WriteLine("El código ingresado no existe, intente nuevamente.");
            }
        }
        public static void CantidadArticulo(ItemArticulo articulo)
        {
            Console.WriteLine("Ingrese la cantidad: ");
            articulo.cantidad = Convert.ToInt32(Console.ReadLine());
            articulo.subtotal = articulo.cantidad * articulo.precio;
            listaArticulos.Add(articulo);
            Console.WriteLine("Articulo cargado exitosamente.");
        }
        public static Boolean Continuar()
        {
            Console.WriteLine("¿Desea cargar un nuevo artículo? Ingrese S para continuar con la carga o presione otra tecla para salir");
            string cont = Console.ReadLine();
            if (cont.ToUpper().Equals("S"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public static void ImprimirTicket()
        {
            double total = 0;
            Console.WriteLine("");
            Console.WriteLine(Utilidades.Espaciar("Codigo") + Utilidades.Espaciar("Articulo") + Utilidades.Espaciar("Precio") + 
                Utilidades.Espaciar("Cantidad") + Utilidades.Espaciar("Subtotal"));
            foreach (ItemArticulo articulo in listaArticulos)
            {
                Console.WriteLine(Utilidades.Espaciar(articulo.codigo.ToString()) + Utilidades.Espaciar(articulo.nombre) + 
                    Utilidades.Espaciar(articulo.precio.ToString()) + Utilidades.Espaciar(articulo.cantidad.ToString()) + 
                    Utilidades.Espaciar(articulo.subtotal.ToString()));
                total += articulo.subtotal;
            }
            Console.WriteLine("");
            Console.WriteLine("TOTAL: " + total.ToString());
        }
    }
}
