using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace M1A11a
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int dia, mes, ano;

            dia = DateTime.Now.Day;
            mes = DateTime.Now.Month;
            ano = DateTime.Now.Year;
            Console.WriteLine($"Hoje é dia {dia}");
            Thread.Sleep(2000);
            Console.WriteLine($"Mês {mes}");
            Thread.Sleep(2000);
            Console.WriteLine($"Do ano de {ano}");
            Console.ReadKey();

        }
    }
}
