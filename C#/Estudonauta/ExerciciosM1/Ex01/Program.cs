using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Ex01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Descola 20 caracteres a direita e pula 5 linhas
            Console.SetCursorPosition(20, 5);

            // Faz o ajuste na cor de fundo e da letra no console
            Console.ForegroundColor = ConsoleColor.White;
            Console.BackgroundColor = ConsoleColor.Blue;
            // Seta o timing para ser exibido a mensagem
            Thread.Sleep(1000);
            Console.Write($" MEU ");

            Console.ForegroundColor = ConsoleColor.Green;
            Console.BackgroundColor = ConsoleColor.Yellow;
            Thread.Sleep(1000);
            Console.Write($" BRASIL ");

            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.BackgroundColor = ConsoleColor.Green;
            Thread.Sleep(1000);
            Console.Write($" BRASILEIRO");

            Console.ReadKey();
    
        }
    }
}
