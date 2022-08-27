namespace EjercicioE
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Thread t1 = new Thread(EjecutarHiloCincoSeg);
            t1.Start();
            Thread t2 = new Thread(EjecutarHiloDiezSeg);
            t2.Start();
        }
        public static void EjecutarHiloCincoSeg()
        {
            do
            {
                Console.WriteLine("HILO EJECUTADO 5");
                Thread.Sleep(TimeSpan.FromSeconds(5));
            } while (true);
        }
        public static void EjecutarHiloDiezSeg()
        {
            do
            {
                Console.WriteLine("HILO EJECUTADO 10");
                Thread.Sleep(TimeSpan.FromSeconds(10));
            } while (true);
        }
    }
}