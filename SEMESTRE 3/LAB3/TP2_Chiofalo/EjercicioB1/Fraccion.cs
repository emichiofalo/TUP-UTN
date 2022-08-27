using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjercicioB1
{
    public class Fraccion
    {
        public int num { get; set; }
        public int den { get; set; }

        public Fraccion() { }

        public Fraccion(int num, int den)
        {
            if (den == 0)
            {
                throw new FraccionException("El denominador no puede ser cero.");
            }
            if (num == 0)
            {
                throw new FraccionException("El numerador no puede ser cero.");
            }
            this.den = den;
            this.num = num;
        }

        public Fraccion Suma(Fraccion f)
        {
            Fraccion aux = new Fraccion();
            aux.num = this.num * f.den + this.den * f.num;
            aux.den = this.den * f.den;
            aux.Simplificar();
            return aux;
        }

        public Fraccion Restar(Fraccion f)
        {
            Fraccion aux = new Fraccion();
            aux.num = this.num * f.den - this.den * f.num;
            aux.den = this.den * f.den;
            aux.Simplificar();
            return aux;
        }

        public Fraccion Multiplicar(Fraccion f)
        {
            Fraccion aux = new Fraccion();
            aux.num = this.num * f.num;
            aux.den = this.den * f.den;
            aux.Simplificar();
            return aux;
        }

        public Fraccion Dividir(Fraccion f)
        {
            Fraccion aux = new Fraccion();
            aux.num = this.num * f.den;
            aux.den = this.den * f.num;
            aux.Simplificar();
            return aux;
        }

        private int Mcd()
        {
            int u = Math.Abs(num);
            int v = Math.Abs(den);
            if (v == 0)
            {
                return u;
            }
            int r;
            while (v != 0)
            {
                r = u % v;
                u = v;
                v = r;
            }
            return u;
        }

        private void Simplificar()
        {
            int n = Mcd();
            this.num = num / n;
            this.den = den / n;
        }

        public override string ToString()
        {
            return this.num + " / " + this.den;
        }
    }
}
