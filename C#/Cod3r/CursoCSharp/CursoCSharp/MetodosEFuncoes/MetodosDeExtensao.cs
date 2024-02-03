using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.MetodosEFuncoes
{
    public static class ExtensoesInteiro
    {
        public static int Soma(this int numeroUm, int numeroDois)
        {
            return numeroUm + numeroDois;
        }

        public static int Subtracao(this int numeroUm, int numeroDois)
        {
            return numeroUm - numeroDois;
        }

    }

    internal class MetodosDeExtensao
    {
        public static void Executar()
        {
            int numero = 5;
            Console.WriteLine(numero.Soma(3));
            Console.WriteLine(numero.Subtracao(7));

        }
    }
}
