using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.EstruturaDeControle
{
    internal class EstruturaIf
    {
        public static void Executar()
        {
            string nomeAluno;
            int[] nota = { 0, 0, 0};
            float media = 0;

            Console.Write("Digite seu nome: ");
            nomeAluno = Console.ReadLine().ToLower();

            for (int c = 0; c < nota.Length; c++)
            {
                Console.Write($"Digite a {nota[c]+1}ª nota: ");
                int.TryParse(Console.ReadLine(), out nota[c]);
                media += nota[c];
            }

            media /= nota.Length;
            Console.WriteLine("==========================================================");
            Console.WriteLine($"Primeira nota: {nota[0]} | Segunda nota: {nota[1]} | Terceira nota: {nota[2]}");
            if (media >= 0 && media < 4)
            {
                Console.WriteLine($"Aluno: {nomeAluno} | Média: {media:F2} | Status: REPROVADO");
            } else if (media >=4 && media < 7)
            {
                Console.WriteLine($"Aluno: {nomeAluno} | Média: {media:F2} | Status: RECUPERAÇÃO");
            } else if (media >= 7 && media <= 10) {
                Console.WriteLine($"Aluno: {nomeAluno} | Média: {media:F2} | Status: APROVADO");
            } else
            {   
                Console.ForegroundColor = ConsoleColor.White;
                Console.BackgroundColor = ConsoleColor.Red;
                Console.WriteLine($"Execute o programa novamente informando os valores corretamente de 0 a 10.");
            }



        }
    }
}
