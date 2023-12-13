using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int ano;
            int anoAtual = DateTime.Now.Year;
            Console.Write("Em que ano você nasceu: ");
            ano = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine("-------------------------------");
            Console.WriteLine($"Estamos atualmente no ano de {anoAtual}.\n" +
                $"Se você nasceu em {ano}, sua idade atual será de {anoAtual - ano} anos.");
            Console.ReadKey();
        }
    }
}
