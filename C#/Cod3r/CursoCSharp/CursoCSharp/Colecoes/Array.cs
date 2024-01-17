using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Colecoes
{
    internal class Array
    {
        public static void Executar()
        {
            string[] alunos = new string[5];
            alunos[0] = "Udyr da silva";
            alunos[1] = "Thomas Shelby";
            alunos[2] = "Lair Ribeiro";
            alunos[3] = "Paulo Guina";
            alunos[4] = "Jailson Mendes";

            double[] notas = { 10, 10, 2, 4, 4};
            double total = 0;

            foreach (string nome in alunos)
            {
                Console.WriteLine(nome);
            }

            foreach (double nota in notas)
            {
                total += nota;
            }

            Console.WriteLine(total / notas.Length);

        }
    }
}
