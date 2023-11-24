using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M1A7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int valorA = 10;
            float valorB = valorA;
            float valorC = 10;
            int valorD;
            int valorE;

            // Typecast
            valorD = (int) valorC;

            // Conversão por classe
            valorE = Convert.ToInt16(valorB);

            Console.WriteLine(valorA + " sendo do tipo: " + valorA.GetType());
            Console.WriteLine(valorB + " sendo do tipo " + valorB.GetType());

            

            Console.ReadKey();
        }
    }
}
