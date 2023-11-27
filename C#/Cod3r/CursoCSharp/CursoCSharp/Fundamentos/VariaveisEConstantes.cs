using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Fundamentos
{
    class VariaveisEConstantes
    {
        public static void Executar()
        {
            // Area de circunfência
            double raio = 4.5;
            const double pi = 3.14;

            raio = 5.5;
            // Ao tentar atribuir um novo valor a uma constante gera erro
            // pi = 3.1415

            double area = pi * raio * raio;
            Console.WriteLine(area);
            Console.WriteLine("A área é " + area);

            bool estaChovendo = true;
            if (estaChovendo)
            {
                Console.WriteLine("Realmente está chovendo");
            }
            else
            {
                Console.WriteLine("Não está chovendo :(");
            }

            int valorGigante = 10_000;
            Console.WriteLine(valorGigante);

            float valorReal = 1299.99F;
        }
    }
}
