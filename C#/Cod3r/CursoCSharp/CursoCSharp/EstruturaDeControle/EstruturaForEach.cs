using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.EstruturaDeControle
{
    internal class EstruturaForEach
    {
        public static void Executar()
        {
            string nome = "Roberto";

            foreach (var letra in nome)
            {
                Console.WriteLine(letra);
            }

            var alunos = new string[] { "Ana", "Beatriz", "Zé"};

            foreach (string aluno in alunos)
            {
                Console.WriteLine(aluno);
            }

        }
    }
}
