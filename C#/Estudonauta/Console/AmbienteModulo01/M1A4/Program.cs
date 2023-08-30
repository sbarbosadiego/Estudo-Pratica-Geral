using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M1A4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("O valor de byte vai de " + byte.MinValue + " até " + byte.MaxValue +
                              "\nO valor de sbyte vai de " + sbyte.MinValue + " até " + sbyte.MaxValue +
                              "\nO valor de short vai de " + short.MinValue + " até " + short.MaxValue +
                              "\nO valor de ushort vai de " + ushort.MinValue + " até " + ushort.MaxValue +
                              "\nO valor de int vai de " + int.MinValue + " até " + int.MaxValue +
                              "\nO valor de uint vai de " + uint.MinValue + " até " + uint.MaxValue +
                              "\nO valor de long vai de " + long.MinValue + " até " + long.MaxValue +
                              "\nO valor de ulong vai de " + ulong.MinValue + " até " + ulong.MaxValue);
            Console.ReadKey();
        }
    }
}
