namespace PrácticaParcial2_Lab3
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
                new Cliente() { Id = 5, Nombre = "Nelson" , Apellido = "Piquet", Domicilio = "Peru 987", Telefono = 154454789, Saldo = 26000, Cuit = 20331126587 }
            };

            var querySaldoMayor30 = from c in clientes where c.Saldo > 30000 orderby c.Saldo ascending select c;
            Console.WriteLine("Clientes cuyo saldo sea mayor a 30000 ordenados por saldo ascendente:");
            mostrar(querySaldoMayor30.ToList());
            Console.WriteLine("");

            var queryApellidoP = from c in clientes where c.Apellido.StartsWith("P") orderby c.Nombre  select c;
            Console.WriteLine("Clientes cuyo apellido inicien con p ordenados por Nombre:");
            mostrar(queryApellidoP.ToList());
            Console.WriteLine("");

            var querySaldo = from c in clientes select c.Saldo;
            Console.WriteLine("Cantidad de saldos: " + querySaldo.Count());
            var queryClMaxSaldo = from c in clientes where c.Saldo == querySaldo.Max() select c;
            Console.WriteLine("Cliente con el máximo saldo: ");
            mostrar(queryClMaxSaldo.ToList());
            Console.WriteLine("Promedio de saldos: " + querySaldo.Average());
            Console.WriteLine(" ");

            IList<Estudiante> estudiantes = new List<Estudiante>() {
                new Estudiante() { Id = 1, Nombre = "Juan", Edad = 19 } ,
                new Estudiante() { Id = 2, Nombre = "Pedro", Edad = 21 } ,
                new Estudiante() { Id = 3, Nombre = "Jose", Edad = 25 } ,
                new Estudiante() { Id = 4, Nombre = "Carlos" , Edad = 20 } ,
                new Estudiante() { Id = 5, Nombre = "David" , Edad = 23 }
            };

            var queryentre18y20 = from e in estudiantes where e.Edad >= 18 && e.Edad <= 22 orderby e.Nombre select e;
            Console.WriteLine("Estudiantes cuya edad se encuentre entre los 18 y 22 años ordenados por Nombre ASC.");
            mostrar(queryentre18y20.ToList());
            Console.WriteLine(" ");

            var queryconJmenor23 = from e in estudiantes where e.Nombre.StartsWith("J") || e.Edad <= 22 select e;
            Console.WriteLine("Estudiantes cuyo nombre comience con la letra J o cuya edad sea menor o igual a 20.");
            mostrar(queryconJmenor23.ToList());
        }
        static void mostrar(IList<Cliente> clientes)
        {
            foreach (var c in clientes)
            {
                Console.WriteLine(c.Id + " - " + c.Nombre + " - " + c.Apellido + " - " + c.Saldo + " - " + c.Domicilio + " - " + c.Telefono + " - " + c.Cuit);
            }
        }
        static void mostrar(IList<Estudiante> estudiantes)
        {
            foreach (var e in estudiantes)
            {
                Console.WriteLine(e.Id + " - " + e.Nombre + " - " + e.Edad);
            }
        }
    }
}