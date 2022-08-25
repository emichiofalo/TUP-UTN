using System.Text;

namespace Ejercicio7
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //Length: devuelve la cantidad de caracteres de la cadena.
            Console.WriteLine("Length:");
            string str = "abcdefg";
            Console.WriteLine("1) The length of '{0}' is {1}", str, str.Length);
            Console.WriteLine("2) The length of '{0}' is {1}", "xyz", "xyz".Length);
            Console.WriteLine("");

            //Contains: devuelve un valor buleano indicando si un caracter específico aparece dentro de una cadena.
            Console.WriteLine("Contains:");
            string s1 = "The quick brown fox jumps over the lazy dog";
            string s2 = "fox";
            bool b = s1.Contains(s2);
            Console.WriteLine("'{0}' is in the string '{1}': {2}", s2, s1, b);
            Console.WriteLine("");

            //IndexOf: informa sobre la posición de la primera aparición de un caracter o cadena especificados dentro de una cadena.
            //El método devuelve -1 si el caracter o cadena no fueron encontrados.
            Console.WriteLine("IndexOf: ");
            str = "Now is the time for all good men to come to the aid of their country.";
            int start;
            int at;
            Console.WriteLine(str);
            Console.Write("The letter 't' occurs at position(s): ");
            at = 0;
            start = 0;
            while ((start < str.Length) && (at > -1))
            {
                at = str.IndexOf('t', start);
                if (at == -1) break;
                Console.Write("{0} ", at);
                start = at + 1;
            }
            Console.WriteLine("\n");
            
            //Remove: se utiliza para quitar todos los caracteres de una posición especificada de una cadena. 
            //Si no se especifica la longitud, se quitan todos los caracteres después de la posición especificada. 
            Console.WriteLine("Remove: ");
            string s = "abc---def";
            Console.WriteLine("Index: 012345678");
            Console.WriteLine("1)     {0}", s);
            Console.WriteLine("2)     {0}", s.Remove(3));
            Console.WriteLine("3)     {0}", s.Remove(3, 3));
            Console.WriteLine("");

            //Replace: se utiliza para reemplazar una cadena o todos los caracteres Unicode especificados.
            //Devuelve una nueva cadena modificada. 
            Console.WriteLine("Replace: ");
            str = "Apples and pears";
            Console.WriteLine("OldString : " + str);
            Console.WriteLine("NewString: " + str.Replace('s', 'D'));
            Console.WriteLine("OldString: " + str);
            Console.WriteLine("NewString: " + str.Replace('p', ' '));
            Console.WriteLine("");

            //Substring: extrae una subcadena de una cadena específica. 
            Console.WriteLine("Substring: ");
            str = "ApplesAndPears";
            Console.WriteLine("String    : " + str);
            Console.WriteLine("Sub String1: " + str.Substring(5));
            Console.WriteLine("Sub String2: " + str.Substring(8));
            Console.WriteLine("");

            //Append: Se usa con StringBuilder que es una secuencia de caracteres mutable (a diferencia de los strings).
            //Permite modificar un string sin crear objetos de cadenas nuevos. 
            Console.WriteLine("Append:");
            var builder = new StringBuilder("There");
            builder.Append(" are");
            builder.Append(" two");
            builder.Append(" falcons");
            builder.Append(" in");
            builder.Append(" the");
            builder.Append(" sky");
            Console.WriteLine(builder);
            Console.WriteLine("");

            //ToUpper: convierte todos los caracteres a mayúsculas.
            Console.WriteLine("ToUpper: ");
            string str1 = "ApplesAndPears";
            string upperstr1 = str1.ToUpper();
            Console.WriteLine(upperstr1);
            Console.WriteLine("");

            //ToLower:
            Console.WriteLine("ToLower: ");
            str1 = "ApplesAndPears";
            string lowerstr1 = str1.ToLower();
            Console.WriteLine(lowerstr1);
            Console.WriteLine("");
        }
    }
}