using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M2A4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numeroUm = 5;
            int numeroDois = 2;

            Console.Write("Digite o primeiro valor: ");
            int.TryParse(Console.ReadLine(), out numeroUm);
            Console.Write("Digite o segundo valor: ");
            int.TryParse(Console.ReadLine(), out numeroDois);

            float resultado = (float) numeroUm / (float) numeroDois;

            Console.WriteLine($"O resultado de {numeroUm} / {numeroDois} = {resultado:F2}");
            Console.ReadKey();
        }
    }
}
