using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M1A9
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Random gerador = new Random();
            int valorGerado = gerador.Next(100);
            Console.WriteLine($"Valor garado: {valorGerado}");
            Console.ReadKey();

        }
    }
}
