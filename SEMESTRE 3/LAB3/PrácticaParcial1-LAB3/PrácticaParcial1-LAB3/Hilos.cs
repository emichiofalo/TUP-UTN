using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrácticaParcial1_LAB3
{
    internal class Hilos
    {
        static void Main(string[] args)
        {
            Thread t1 = new Thread(EjecutarHiloCincoSeg);       //Genero un hilo y le envío el método que quiero ejecutar en este hilo
            t1.Start();                                         //Lo inicio
            Thread t2 = new Thread(EjecutarHiloDiezSeg);        //Genero otro hilo y le envío el método que quiero ejecutar en este hilo
            t2.Start();                                         //Lo inicio        
        }
        public static void EjecutarHiloCincoSeg()
        {
            do
            {
                Console.WriteLine("HILO EJECUTADO 5");
                Thread.Sleep(TimeSpan.FromSeconds(5));          //Le indico el tiempo que tiene que esperar para que se ejecute el método de nuevo en el hilo
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
