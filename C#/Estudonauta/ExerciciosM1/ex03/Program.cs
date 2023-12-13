using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float valor = 0;

            Console.Write("Digite um número: ");
            float.TryParse(Console.ReadLine(), out valor);
            Console.WriteLine("----------------------------------");
            Console.WriteLine($"Você digitou: {valor:N1}");
            Console.WriteLine($"A parte inteira do valor é: {(int)valor}");
            Console.WriteLine($"Arredondando, o valor será: {Convert.ToInt16(valor)}");

            Console.ReadKey();
        }
    }
}
