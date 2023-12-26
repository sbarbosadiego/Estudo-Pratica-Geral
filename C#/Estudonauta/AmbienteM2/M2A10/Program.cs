using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M2A10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string nomeAluno;
            float[] nota = {0, 0, 0};
            float media = 0;

            Console.Write("Digite seu nome: ");
            nomeAluno = Console.ReadLine();

            for (int c = 0; c < nota.Length; c++)
            {
                Console.Write($"Digite a {c + 1}ª nota: ");
                float.TryParse(Console.ReadLine(), out nota[c]);
                media += nota[c];
            }

            media = media / nota.Length;

            if (media >= 0 && media < 4)
            {
                Console.WriteLine($"A média foi: {media:F2}\nO aluno {nomeAluno} está REPROVADO");
            } else if (media >= 4 && media < 7)
            {
                Console.WriteLine($"A média foi: {media:F2}\nO aluno {nomeAluno} está de RECUPERAÇÃO");
            } else if (media >= 7 && media <= 10)
            {
                Console.WriteLine($"A média foi: {media:F2}\nO aluno {nomeAluno} está APROVADO");
            }

            Console.ReadKey();

        }
    }
}
