using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.MetodosEFuncoes
{
    internal class UsandoDelegate
    {
        delegate double Soma(double a, double b);
        delegate void ImprimirSoma(double a, double b);

        static double MinhaSoma(double a, double b)
        {
            return a + b;
        }

        static void MeuImprimirSoma(double a, double b)
        {
            Console.WriteLine(a + b);
        }

        public static void Executar()
        {
            Soma operacaoUm = MinhaSoma;
            Console.WriteLine(operacaoUm(2, 3.2));

            ImprimirSoma operacaoDois = MeuImprimirSoma;
            operacaoDois(5, 8);

            Func<double, double, double> operacaoTres = MinhaSoma;
            Console.WriteLine(operacaoTres(2.5, 3));

            Action<double, double> operacaoQuatro = MeuImprimirSoma;
            operacaoQuatro(7.4, 42.2);
        }
    }
}
