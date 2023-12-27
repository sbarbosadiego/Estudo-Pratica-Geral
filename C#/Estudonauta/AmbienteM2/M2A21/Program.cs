using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M2A21
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string nome = null;
            string nomeUm = "null";

            // ? faz aceitar null
            int? numero = null;

            // Coalescência Nula
            // Caso numero seja null é atribuído o valor 0 a numeroDois, também pode ser atribuído outro valor
            int numeroDois = numero ?? 0;


            Console.WriteLine($"A váriavel é nula? {nome is null}");
            Console.WriteLine($"A váriavel é nula? {numero is null}\nEle possui algum valor? {numero.HasValue}");
            
            Console.ReadKey();
        }
    }
}
