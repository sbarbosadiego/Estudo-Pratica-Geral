using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M01A05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Ao utilizar var é automaticamente definido um tipo para a variável
            var numeroVar = 0;
            byte numeroByte = 255;

            Console.WriteLine("O valor da variável numero é: " + numeroVar + " e seu tipo é " + numeroVar.GetType());
            Console.WriteLine("O valor da variável numero é: " + numeroByte + " e seu tipo é " + numeroByte.GetType());
            Console.ReadKey();
            
        }
    }
}
