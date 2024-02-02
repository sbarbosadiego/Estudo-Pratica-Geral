using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.MetodosEFuncoes
{
    
    delegate double Operacao(double x, double y);

    internal class LambdaDelegate
    {
        public static void Executar()
        {
            Operacao soma = (x, y) => x + y;
            Operacao subtracao = (x, y) => x - y;
            Operacao multiplicacao = (x, y) => x * y;

            Console.WriteLine(soma(5, 5));
            Console.WriteLine(subtracao(5, 5));
            Console.WriteLine(multiplicacao(5, 5));

        }
    }
}
