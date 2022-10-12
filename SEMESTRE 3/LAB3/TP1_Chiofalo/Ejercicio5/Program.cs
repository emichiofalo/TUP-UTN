namespace Ejercicio5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("JORNADA LABORAL");
            int entrada, salida;
            do
            {
                Console.WriteLine("Ingrese su horario de entrada: ");
                int hora = LeerHora();
                int min = LeerMin();
                entrada = hora * 60 + min;

                Console.WriteLine("Ingrese su horario de salida: ");
                hora = LeerHora();
                min = LeerMin();
                salida = hora * 60 + min;

                if (entrada<salida)
                {
                    if (ValidarCantHoras(entrada, salida))
                    {
                        Console.WriteLine("El sueldo a cobrar es de $" + CalcularSueldo(entrada, salida));
                        break;
                    }
                    else
                    {
                        Console.WriteLine("La jornada no puede superar las 8 horas. Ingrese los horarios nuevamente.");
                    }
                }
                else
                {
                    Console.WriteLine("El horario de salida debe ser posterior al de entrada. Ingrese los horarios nuevamente.");
                }
                
            } while (true);
        }

        public static int LeerHora()
        {
            do
            {
                Console.WriteLine("Hora:");
                int hora = Int32.Parse(Console.ReadLine());
                if (!ValidarHora(hora))
                {
                    Console.WriteLine("Ingrese un numero entre 0 y 23.");
                }
                else
                {
                    return hora;
                }
            } while (true);
        }       
        public static int LeerMin()
        {
            do
            {
                Console.WriteLine("Minutos:");
                int min = Int32.Parse(Console.ReadLine());
                if (!ValidarMinutos(min))
                {
                    Console.WriteLine("Ingrese numero entre 0 y 59.");
                }
                else
                {
                    return min;
                }
            } while (true);
        }
        public static Boolean ValidarHora(int hora)
        {
            if (hora < 0 || hora > 23)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        public static Boolean ValidarMinutos(int min)
        {
            if (min < 0 || min > 59)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        public static Boolean ValidarCantHoras(int entrada, int salida)
        {
            if (salida - entrada > 480)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        public static double CalcularSueldo(int entrada, int salida)
        {
            double totalHoras = salida - entrada;
            double hsNocturnas = 0, hsDiurnas = 0;

            if (salida  > 1200)
            {
                hsNocturnas = 1200 - salida;
                hsDiurnas = totalHoras - hsNocturnas;
            }
            else if (entrada < 480)
            {
                hsNocturnas = 480 - entrada;
                hsDiurnas = totalHoras - hsNocturnas;
            }
            else if (entrada > 480 && salida < 1200)
            {
                hsDiurnas = totalHoras;
            }
            Console.WriteLine("Total de horas diurnas: " + hsDiurnas/60);
            Console.WriteLine("Total de horas nocturnas: " + hsNocturnas/60);
            return (hsNocturnas / 60) * 15 + (hsDiurnas / 60) * 10;
        }
    }
}