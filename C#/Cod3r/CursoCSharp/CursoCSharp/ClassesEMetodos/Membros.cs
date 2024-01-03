using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class Membros
    {
        public static void Executar()
        {
            Pessoa pessoa = new Pessoa();
            pessoa.Nome = "Fulano";
            pessoa.Idade = 30;

            pessoa.ApresentarNoConsole();

            var pessoa2 = new Pessoa();
            pessoa2.Nome = "Udyr";
            pessoa2.Idade = 31;

            // Atribuído a uma várial o retorno do método
            var apresenta = pessoa2.Apresentar();
            Console.WriteLine(apresenta.Length);
            pessoa2.Limpar();
            apresenta = pessoa2.Apresentar();
            Console.WriteLine(apresenta);
        }
    }
}
