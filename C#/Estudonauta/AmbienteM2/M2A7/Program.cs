using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M2A7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] valor = { 0, 0};

            Console.Write("Digite o primeiro número: ");
            int.TryParse(Console.ReadLine(), out valor[0]);
            Console.Write("Digite o segundo número: ");
            int.TryParse(Console.ReadLine(), out valor[1]);

            if (valor[0] == valor[1])
            {
                Console.WriteLine($"O número {valor[0]} é igual ao número {valor[1]}");
            }
            else if (valor[0] > valor[1] || valor[1] > valor[0])
            {
                if (valor[0] > valor[1])
                {
                    Console.WriteLine($"O número {valor[0]} é maior que o número {valor[1]}");
                    Console.WriteLine($"A subtração de {valor[0]} - {valor[1]} = {valor[0] - valor[1]}");
                } 
                else if (valor[1] > valor[0])
                {
                    Console.WriteLine($"O número {valor[1]} é maior que o número {valor[0]}");
                    Console.WriteLine($"A subtração de {valor[1]} - {valor[0]} = {valor[1] - valor[0]}");
                }
            }

            Console.WriteLine($"A soma de {valor[0]} + {valor[1]} = {valor[0] + valor[1]}");
            

            Console.ReadKey();
        }
    }
}
