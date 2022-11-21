namespace Parcial2_Lab3_Linq_Chiofalo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IList<Cliente> clientes = new List<Cliente>() {
                new Cliente() { Id = 1, Nombre = "Juan", Apellido = "Perez", Domicilio = "Salta 314", Telefono = 154356989, Saldo = 20000, Cuit = 20291126587 } ,
                new Cliente() { Id = 2, Nombre = "Pedro", Apellido = "Hernandez", Domicilio = "Chaco 456", Telefono = 151454789, Saldo = 36000, Cuit = 20244126587 } ,
                new Cliente() { Id = 3, Nombre = "Jose", Apellido = "Chatruc", Domicilio = "Lavalle 789", Telefono = 154352589, Saldo = 28000, Cuit = 20291336587 } ,
                new Cliente() { Id = 4, Nombre = "Carlos" , Apellido = "Alonso", Domicilio = "Rioja 14", Telefono = 154354789, Saldo = 45000, Cuit = 20297726587 } ,
                new Cliente() { Id = 5, Nombre = "Claudio" , Apellido = "Ahumada", Domicilio = "Lima 125", Telefono = 154964789, Saldo = 28000, Cuit = 20291125587 } ,
                new Cliente() { Id = 5, Nombre = "Sebastian" , Apellido = "Tobar", Domicilio = "Rawson 123", Telefono = 154357489, Saldo = 22000, Cuit = 20291158447 } ,
                new Cliente() { Id = 5, Nombre = "Javier" , Apellido = "Puebla", Domicilio = "Italia 987", Telefono = 154358589, Saldo = 33000, Cuit = 20301126587 } ,
                new Cliente() { Id = 5, Nombre = "Fabian" , Apellido = "Gilar", Domicilio = "Las Viñas 987", Telefono = 154554789, Saldo = 38000, Cuit = 20311126587 } ,
                new Cliente() { Id = 5, Nombre = "Victor" , Apellido = "Pereira", Domicilio = "25 de Mayo 654", Telefono = 154356589, Saldo = 37000, Cuit = 20321126587 } ,
                new Cliente() { Id = 5, Nombre = "Nelson" , Apellido = "Piquet", Domicilio = "Peru 987", Telefono = 154454789, Saldo = 26000, Cuit = 20331126587 } };

            var query1 = from c in clientes where c.Saldo > 30000 orderby c.Saldo ascending select c;
            mostrar(query1.ToList());
            Console.WriteLine("");

            var query2 = from c in clientes where c.Apellido.StartsWith("P") orderby c.Nombre select c;
            mostrar(query2.ToList());
            Console.WriteLine("");

            var query3 = from c in clientes select c.Saldo;
            Console.WriteLine("Cantidad de saldos: " + query3.Count());
            var cliente = from c in clientes where c.Saldo == query3.Max() select c;
            Console.WriteLine("Cliente con máximo saldo: ");
            mostrar(cliente.ToList());
            Console.WriteLine("Promedio saldos: " + query3.Average());
        }

        static void mostrar(IList<Cliente> clientes)
        {
            foreach (var c in clientes)
            {
                Console.WriteLine(c.Id + " - " + c.Nombre + " - " + c.Apellido + " - " + c.Saldo + " - " + c.Domicilio + " - " + c.Telefono + " - " + c.Cuit);
            }
        }
    }
}