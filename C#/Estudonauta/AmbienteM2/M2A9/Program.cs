using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M2A9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            bool valorUm = true;
            bool valorDois = false;

            Console.WriteLine($"Sendo p = {valorUm} e q = {valorDois}");
            Console.WriteLine($"NOT p = {!valorUm} \nNOT q = {!valorDois}");
            Console.WriteLine($"{valorUm} AND {valorDois} = {valorUm && valorDois}");
            Console.WriteLine($"{valorUm} OR {valorDois} = {valorUm ||  valorDois}");
            Console.ReadKey();

        }
    }
}
