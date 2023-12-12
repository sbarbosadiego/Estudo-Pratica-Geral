using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M1A13a
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string nome = "Diego";
            float salario = 1429.298f;
            int idade = 20;

            // Formatação de string interpolada
            Console.WriteLine($"Este é mais um teste {nome, 20}");
            Console.WriteLine($"Este é mais um teste {nome,-20}");
            // Formatar para valor monetário
            Console.WriteLine($"Valor: {salario:C}");
            // valor, 20 casas a direita com três casas decimais
            Console.WriteLine($"Valor: {salario,20:C3}");
            Console.ReadKey();
        }
    }
}
