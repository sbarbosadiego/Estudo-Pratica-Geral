using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M1A8c
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.Write("Digite um número: ");
            int valor = Convert.ToInt16(Console.ReadLine());
            int multi = valor * 2;
            Console.Write($"O dobro do valor digitado: {valor} é {multi}");
            Console.ReadKey();


        }
    }
}
