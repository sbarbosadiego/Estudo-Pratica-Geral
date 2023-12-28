using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Fundamentos
{
    internal class Conversoes
    {
        public static void Executar()
        {
            int valorInteiro = 10;

            // Conversão implicita
            double valorDouble = valorInteiro;

            /* Não é ocorre a conversão de um double para inteiro
            valorInteiro = valorDouble;
            */

            // Para isso é preciso converter o valor
            valorInteiro = int.Parse(valorDouble.ToString());

            Console.WriteLine(valorInteiro);
            Console.WriteLine(valorDouble);

            valorDouble = 9.7;
            // Outra forma de fazer a conversão
            valorInteiro = (int) valorDouble;

            Console.WriteLine(valorInteiro);
            Console.WriteLine(valorDouble);

            valorInteiro = Convert.ToInt32((int) valorDouble);
            Console.WriteLine(valorInteiro);



        }
    }
}
