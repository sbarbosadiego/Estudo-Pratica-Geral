using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    public class CalculadoraEstatica
    {
        public static int Somar(int a, int b)
        {
            return a + b;
        }

        public int Multiplicar(int a, int b)
        {
            return a * b;
        }
    }

    internal class MetodosEstaticos
    {
        public static void Executar()
        {
            var resultado = CalculadoraEstatica.Somar(5, 5);
            var resultadoDois = new CalculadoraEstatica();

            Console.WriteLine(resultado);
            Console.WriteLine(resultadoDois.Multiplicar(2, 3));
        }
    }
}
