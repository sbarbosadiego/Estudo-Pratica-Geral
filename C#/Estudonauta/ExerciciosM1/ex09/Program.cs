using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string produtoUm, produtoDois;
            float valorUm, valorDois;

            Console.Write("Produto 1: ");
            produtoUm = Console.ReadLine().Trim();
            Console.Write("Preço: ");
            float.TryParse(Console.ReadLine(), out valorUm);

            Console.Write("Produto 2: ");
            produtoDois = Console.ReadLine().Trim();
            Console.Write("Preço: ");
            float.TryParse(Console.ReadLine(), out valorDois);

            Console.SetCursorPosition(0, 10);
            Console.ForegroundColor = ConsoleColor.White;
            Console.BackgroundColor = ConsoleColor.DarkBlue;
            Console.WriteLine($" {"Produto", -20}{"Preço", 13} ");
            Console.ResetColor();

            Console.ForegroundColor = ConsoleColor.Black;
            Console.BackgroundColor = ConsoleColor.DarkGray;
            Console.WriteLine($" {produtoUm, -20}{valorUm, 13:C} ");
            Console.WriteLine($" {produtoDois, -20}{valorDois, 13:C} ");


            Console.ReadKey();
        }
    }
}
