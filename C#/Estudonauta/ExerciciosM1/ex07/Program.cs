using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ex07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int inicio, resultado;
            int fim = 0;
            Random random = new Random();

            Console.WriteLine($"SORTEADOR DE NÚMERO\n------------------------");
            Console.Write($"Início: ");
            int. TryParse(Console.ReadLine(), out inicio);

            while (fim <= inicio)
            {
                Console.Write($"Fim: ");
                int.TryParse(Console.ReadLine(), out fim);
                Console.WriteLine("------------------------");
            }

            resultado = random.Next(inicio, fim + 1);

            Console.SetCursorPosition(0, 6);
            Console.WriteLine("Sorteando...");
            Thread.Sleep(2000);
            Console.SetCursorPosition(0, 6);
            Console.WriteLine($"O número sorteado foi: {resultado}");

            Console.ReadKey();
        }
    }
}
