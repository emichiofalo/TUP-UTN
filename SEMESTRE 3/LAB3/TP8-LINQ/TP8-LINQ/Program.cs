namespace TP8_LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IList<Empleado> empleados = new List<Empleado>() {
                new Empleado() { Id = 1, Nombre = "Juan", Apellido = "Perez", Domicilio = "Salta 314", Localidad = "Ciudad", Salario = 30000, DiasInasistencia = 0 } ,
                new Empleado() { Id = 2, Nombre = "Pedro", Apellido = "Hernandez", Domicilio = "San Martin 456", Localidad = "Ciudad", Salario = 36000, DiasInasistencia = 1 } ,
                new Empleado() { Id = 3, Nombre = "Jose", Apellido = "Chatruc", Domicilio = "Lavalle 789", Localidad = "Lujan", Salario = 28000, DiasInasistencia = 12 } ,
                new Empleado() { Id = 4, Nombre = "Carlos" , Apellido = "Alonso", Domicilio = "Rioja 14", Localidad = "Guaymallen", Salario = 45000, DiasInasistencia = 5 } ,
                new Empleado() { Id = 5, Nombre = "Claudio" , Apellido = "Ahumada", Domicilio = "Lima 125", Localidad = "Tupungato", Salario = 38000, DiasInasistencia = 0 } ,
                new Empleado() { Id = 5, Nombre = "Sebastian" , Apellido = "Tobar", Domicilio = "Rawson 123", Localidad = "Lujan", Salario = 42000, DiasInasistencia = 2 } ,
                new Empleado() { Id = 5, Nombre = "Javier" , Apellido = "Puebla", Domicilio = "Italia 987", Localidad = "Ciudad", Salario = 33000, DiasInasistencia = 4 } ,
                new Empleado() { Id = 5, Nombre = "Fabian" , Apellido = "Gilar", Domicilio = "Las Viñas 987", Localidad = "Guaymallen", Salario = 38000, DiasInasistencia = 0 } ,
                new Empleado() { Id = 5, Nombre = "Victor" , Apellido = "Pereira", Domicilio = "25 de Mayo 654", Localidad = "Tupungato", Salario = 37000, DiasInasistencia = 8 } ,
                new Empleado() { Id = 5, Nombre = "Nelson" , Apellido = "Piquet", Domicilio = "Peru 987", Localidad = "Ciudad", Salario = 36000, DiasInasistencia = 3 }
            };

            var queryEmpXCiudad = from emp in empleados where emp.Localidad == "Ciudad" select emp;
            //mostrar(queryEmpXCiudad.ToList());

            var queryEmpApellidoA = from emp in empleados where emp.Apellido.StartsWith("A") select emp;
            //mostrar(queryEmpApellidoA.ToList());

            var queryEmpAsistPerf = from emp in empleados where emp.DiasInasistencia == 0 select emp;
            //mostrar(queryEmpAsistPerf.ToList());

            var queryEmpCity35 = from emp in empleados where emp.Localidad == "Ciudad" && emp.Salario > 35000 select emp;
            //mostrar(queryEmpCity35.ToList());

            var queryEmpInasist30 = from emp in empleados where emp.DiasInasistencia > 0 && emp.Salario <= 30000 select emp;
            //mostrar(queryEmpInasist30.ToList());

            var queryEmpNombreN = from emp in empleados where emp.Nombre.EndsWith("n") select emp;
            //mostrar(queryEmpNombreN.ToList());

            var queryEmpSalarioAsc = from emp in empleados orderby emp.Salario ascending select emp;
            //mostrar(queryEmpSalarioAsc.ToList());

            var queryEmpInasistDesc = from emp in empleados orderby emp.DiasInasistencia descending select emp;
            //mostrar(queryEmpInasistDesc.ToList());

            var queryEmpGroupLocalidad = from emp in empleados group emp by emp.Localidad;
            //mostrar(queryEmpGroupLocalidad.ToList());

            var querySalarios = from emp in empleados select emp.Salario;
            int cantSalarios = querySalarios.Count();
            Console.WriteLine(cantSalarios);
            int maxSalario = querySalarios.Max();
            Console.WriteLine(maxSalario);
            double avgSalario = querySalarios.Average();
            Console.WriteLine(avgSalario);
            int primero = querySalarios.First();
            Console.WriteLine(primero);
        }

        static void mostrar(IList<Empleado> empleados)
        {
            foreach (var emp in empleados)
            {
                Console.WriteLine(emp.Nombre + " " + emp.Apellido + " " + emp.Domicilio + " " + emp.Localidad + " " + emp.Salario + " " + emp.DiasInasistencia);
            }
        }

        static void mostrar<T>(IEnumerable<T> emp)
        {
            foreach (IGrouping<string, Empleado> customGroup in emp)
            {
                Console.WriteLine(customGroup.Key);
                foreach (Empleado e in customGroup)
                {
                    Console.WriteLine(e.Nombre + " " + e.Apellido + " " + e.Domicilio + " " + e.Localidad + " " + e.Salario + " " + e.DiasInasistencia);
                }
            }
        }
    }
}