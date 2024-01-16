using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class ParametrosPorReferencia
    {
        public static void AlterarRef(ref int numero)
        {
            numero += 1000;
        }

        public static void AlterarOut(ref int numero)
        {
            numero += 15;
        }

        public static void Executar()
        {
            int a = 3;
            AlterarRef(ref a);
            Console.WriteLine(a);

            int b = 2;
            AlterarOut(ref b);
            Console.WriteLine(b);
        }
    }
}
