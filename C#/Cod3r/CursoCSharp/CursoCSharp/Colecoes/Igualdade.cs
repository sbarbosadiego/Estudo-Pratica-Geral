using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static CursoCSharp.ClassesEMetodos.ColecoesList;

namespace CursoCSharp.Colecoes
{
    internal class Igualdade
    {
        public static void Executar()
        {
            var produtoUm = new Produto("Caneta", 1.89);
            var produtoDois = new Produto("Caneta", 1.89);
            var produtoTres = produtoDois;
                
            Console.WriteLine(produtoUm == produtoDois);
            Console.WriteLine(produtoTres == produtoDois);
            Console.WriteLine(produtoUm.Equals(produtoDois));
        }
    }
}
