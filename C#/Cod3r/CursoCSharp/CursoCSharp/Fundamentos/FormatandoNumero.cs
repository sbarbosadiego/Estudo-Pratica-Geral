using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

namespace CursoCSharp.Fundamentos
{
    internal class FormatandoNumero
    {
        public static void Executar()
        {
            double valor = 14.251;

            // Define a quantidade de casas decimais após a vírgula
            Console.WriteLine(valor.ToString("F1"));

            // Formata para valor currency (monetário)
            Console.WriteLine(valor.ToString("C"));

            // Formata para valor percentual multiplica o valor por 100 e acrescenta o %
            Console.WriteLine(valor.ToString("P"));

            // Outra forma de formatar o valor númerico
            Console.WriteLine(valor.ToString("#.##"));

            // Define o padrão americano, por padrão é utilizado o padrão do computador
            CultureInfo culture = new CultureInfo("en-US");

            Console.WriteLine(valor.ToString("C2", culture));

            int numero = 256;

            // Formata o número para ficar com 10 casas, completando com zeros a esquerda
            Console.WriteLine(numero.ToString("D10"));


        }
    }
}
