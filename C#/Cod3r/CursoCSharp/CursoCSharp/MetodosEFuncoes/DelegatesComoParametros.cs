using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.MetodosEFuncoes
{
    internal class DelegatesComoParametros
    {
        public delegate int Operacao(int a, int y);

        public static int Soma(int a, int b)
        {
            return a + b;
        }

        public static string Calculadora(Operacao operacao, int a, int b)
        {
            var resultado = operacao(a, b);
            return resultado.ToString();
        }

        public static void Executar()
        {
            Operacao subtracao = (int a, int b) => a - b;
            Console.WriteLine(Calculadora(subtracao, 3, 2));
            Console.WriteLine(Calculadora(Soma, 3, 2));

        }
    }
}
