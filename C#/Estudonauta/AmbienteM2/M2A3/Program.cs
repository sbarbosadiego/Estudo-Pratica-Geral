using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M2A3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Operadores aritméticos
            int valorUm = 0;
            int valorDois = 0;

            Console.Write("Digite o primeiro valor: ");
            int.TryParse(Console.ReadLine(), out valorUm);
            Console.Write("Digite o segundo valor: ");
            int.TryParse(Console.ReadLine(), out valorDois);

            Console.WriteLine($"A soma de {valorUm} + {valorDois} é {valorUm + valorDois}");
            Console.WriteLine($"A subtração de {valorUm} - {valorDois} é {valorUm - valorDois}");
            Console.WriteLine($"A multiplicação de {valorUm} * {valorDois} é {valorUm * valorDois}");
            Console.WriteLine($"A divisão inteira de {valorUm} / {valorDois} é {valorUm / valorDois}");
            Console.WriteLine($"A divisão real de {valorUm} / {valorDois} é {((float)valorUm / (float)valorDois):F2}");
            Console.WriteLine($"O resto da divisão de {valorUm} / {valorDois} é {valorUm % valorDois}");
            Console.ReadKey();

        }
    }
}
