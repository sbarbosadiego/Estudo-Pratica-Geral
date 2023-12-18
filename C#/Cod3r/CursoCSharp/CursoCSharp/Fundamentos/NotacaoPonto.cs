using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Fundamentos
{
    internal class NotacaoPonto
    {
        public static void Executar()
        {
            var mensagem = "olá".ToUpper().Insert(3, " World!").Replace("World!", "Mundo!");
            Console.WriteLine(mensagem);

            Console.WriteLine("Mensagem".Length);

            string valor = null;
            Console.WriteLine(valor?.Length);

        }
    }
}
