﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.EstruturaDeControle
{
    internal class EstruturaDoWhile
    {
        public static void Executar()
        {
            string entrada;

            do
            {
                Console.Write("Digite seu nome: ");
                entrada = Console.ReadLine();

                Console.WriteLine($"Bem-vindo {entrada}");
                Console.Write("Deseja continuar? (S/N)");
                entrada = Console.ReadLine();
            } while (entrada.ToLower() == "s");
        }
    }
}
