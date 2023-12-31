using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.EstruturaDeControle
{
    internal class EstruturaWhile
    {
        public static void Executar()
        {
            int valor = 0;
            Random random = new Random();

            // Intervalo entre 1 e 10
            int numeroSorteado = random.Next(1 , 10);
            bool numeroEncontrado = false;
            int tentativasRestantes = 5;
            int tentativas = 0;

            while (tentativasRestantes > 0 && !numeroEncontrado) {
                Console.Write("Digite um número: ");
                string entrada = Console.ReadLine();
                int.TryParse(entrada, out valor);

                tentativas++;
                tentativasRestantes--;

                if (numeroSorteado == valor)
                {
                    numeroEncontrado = true;
                    Console.WriteLine($"Acertou em {tentativas} tentativas");
                } else if (valor > numeroSorteado)
                {
                    Console.WriteLine("Informe um valor menor que o digitado");
                    Console.WriteLine($"Tentativas restantes {tentativasRestantes}");
                } else
                {
                    Console.WriteLine("Informe um valor maior");
                    Console.WriteLine($"Tentativas {tentativasRestantes}");
                }

            }
        }
    }
}
