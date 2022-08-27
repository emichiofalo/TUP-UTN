namespace EjercicioD7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Figura> figuras = new List<Figura>();
            figuras.Add(new Rectangulo());
            figuras.Add(new Figura());
            figuras.Add(new Triangulo());
            figuras.Add(new Circulo());
            figuras.Add(new Figura());
            figuras.Add(new Circulo());
            figuras.Add(new Rectangulo());

            foreach (Figura figura in figuras)
            {
                figura.Dibujar();
            }
        }
    }
}